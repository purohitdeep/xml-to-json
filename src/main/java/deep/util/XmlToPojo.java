package deep.util;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import deep.util.pojo.Cdsexport;
import deep.util.pojo.ObjectFactory;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.*;
import java.nio.charset.StandardCharsets;

public class XmlToPojo {

    //static String filename = "simple.xml";
   static String fileName = "person-day.xml";

    public static void main(String[] args) throws JsonProcessingException, JAXBException {
        //1. We need to create JAXContext instance
        JAXBContext jaxbContext = JAXBContext.newInstance(ObjectFactory.class);

        //2. Use JAXBContext instance to create the Unmarshaller.
        Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();

        //3. Use the Unmarshaller to unmarshal the XML document to get an instance of JAXBElement.
        Cdsexport xmlPojo = (Cdsexport) unmarshaller.unmarshal(ClassLoader.getSystemResourceAsStream(fileName));

        ObjectMapper mapper = new ObjectMapper();
        String json = mapper.writeValueAsString(xmlPojo);
        writeToAFile(json);
    }

    private static void writeToAFile(String json) {
        try {
            // Creates a FileWriter
            FileWriter output = new FileWriter("src/main/resources/output.json");

            // Writes the string to the file
            output.write(json);

            // Closes the writer
            output.close();
        } catch (Exception e) {

        }
    }

    private static String getXmlString(String fileName) {
        ClassLoader classLoader = XmlToPojo.class.getClassLoader();
        StringBuilder builder = new StringBuilder();
        try (InputStream inputStream = classLoader.getResourceAsStream(fileName);
             InputStreamReader streamReader = new InputStreamReader(inputStream, StandardCharsets.UTF_8);
             BufferedReader reader = new BufferedReader(streamReader)) {

            String line;

            while ((line = reader.readLine()) != null) {
                System.out.println(line);
                builder.append(line);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        return builder.toString();
    }
}
