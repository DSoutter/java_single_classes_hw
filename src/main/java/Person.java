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

    public int getAge(){
        return this.age;
    }

    public double getHeight(){
        return this.height;
    }

    public void hasBirthday() {
        this.age ++;
        this.height = this.height + 0.1;
    }
}
