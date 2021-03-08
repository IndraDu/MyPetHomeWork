package dataType;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args){
        Person Zippo = new Person();

        Zippo.name = "Zippo";
        Zippo.age = "11";
        Zippo.gender = "male";
        Zippo.height = "67 cm";
        Zippo.breed = "rottweiler";
        Zippo.color = "black and tan";

        System.out.println(Zippo.introducePerson());

    }

}
