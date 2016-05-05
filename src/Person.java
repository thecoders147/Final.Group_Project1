/**
 * Person Class
 * The Coders 147
 * Bruce Pickett, Kalabe Mulugeta, Nicholas Sukhu, Tanner Yatsko, Zachary Larsen, Jared Smith
 */

public class Person {

    //private variables
    private String name;
    private String parking;

    //default constructor
    public Person(){}

    //constructor
    public Person(String name, String parking){
        this.name = name;
        this.parking = parking;
    }

    //Math function to generate ID
    public int generateIdNum(){
        return 10000 + (int)(Math.random() * ((100000 - 10000) + 1));
    }

    //getter name
    public String getName(){
        return name;
    }

    //setter name
    public void setName(String name){
        this.name = name;
    }

    //getter parking
    public String getParking(){
        return parking;
    }

    //setter parking
    public void setParking(String parking){
        this.parking = parking;
    }
}
