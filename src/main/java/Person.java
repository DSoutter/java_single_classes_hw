public class Person {

    private String forename;
    private String surname;
    private int age;
    private double height;

    public Person(String forename, String surname, int age, double height) {
        this.forename = forename;
        this.surname = surname;
        this.age = age;
        this.height = height;
    }

    public String getFullName(){
        return this.forename + " " + this.surname;
    }
}
