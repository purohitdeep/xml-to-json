package deep.util.pojo;

public class Base {

    private Person person;

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    @Override
    public String toString() {
        return "ClassPojo [Person = " + person + "]";
    }
}
