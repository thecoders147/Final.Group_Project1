/**
 * Teacher Class
 * The Coders 147
 * Bruce Pickett, Kalabe Mulugeta, Nicholas Sukhu, Tanner Yatsko, Zachary Larsen, Jared Smith
 */

public class Teacher extends Person {

    private String[] className;

    //default constructor
    public Teacher(){}

    //constructor
    public Teacher(String[] className){
        this.className = className;
    }

    //getter, print array
    public void getClassName(){
        for(int i = 0; i<className.length; i++){
            System.out.print(className[i] + " ");
        }
    }

    //setter
    public void setClassName(String[] className){
        this.className = className;
    }
}
