package dataType;

public class Person {

    public String name;
    public String age;
    public String gender;
    public String height;
    public String breed;
    public String color;

    public String introducePerson() {
        return "Hello, my pets name is " + name + "." +
                " He is " + age + " years old " + ". " + "He is " + gender +
                "." + " He is a big dog - " + height + "." + "He is brave " + breed
                + " and his color is " + color + ".";

    }
}


