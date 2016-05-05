/**
 * Student Class
 * The Coders 147
 * Bruce Pickett, Kalabe Mulugeta, Nicholas Sukhu, Tanner Yatsko, Zachary Larsen, Jared Smith
 */

public class Student extends Person implements GPA{

    //final static variable/constant
    final static int NUMCREDITS = 3;

    private int credits;
    private String major;
    private double gpa;

    //default constructor
    public Student(){}

    //constructor
    public Student(int credits, String major, double gpa){
        this.credits = credits;
        this.major = major;
        this.gpa = gpa;
    }

    //getter credits
    public int getCredits(){
        return credits;
    }

    //setter credits
    public void setCredits(int credits){
        this.credits = credits;
    }

    //getter gpa
    public double getGpa(){
        return gpa;
    }

    //setter gpa
    public void setGpa(double gpa){
        this.gpa = gpa;
    }

    //getter major
    public String getMajor(){
        return major;
    }

    //setter major
    public void setMajor(String major){
        this.major = major;
    }

    //setter parking, super
    public void setParking(char commute){
        if(commute == 'Y'){
            super.setParking("A");
        }
        else if(commute == 'N'){
            super.setParking("C");
        }
        else{
            super.setParking("No Pass");
        }
    }

    //calculate int gpa
    public double calculateGPA(int[] grade) {
        double sum = 0;
        int holder = 0;
        int[] credit = new int[grade.length];
        double[] newArray1 = new double[grade.length];
        for(int i = 0; i < grade.length; i++){
            if(grade[i] <= 100 && grade[i] >= 90){
                newArray1[i] = 4.0;
                credit[i] = 1;
            }
            else if(grade[i] <= 89 && grade[i] >= 80){
                newArray1[i] = 3.0;
                credit[i] = 1;
            }
            else if(grade[i] <= 79 && grade[i] >= 70){
                newArray1[i] = 2.0;
                credit[i] = 1;
            }
            else if(grade[i] <= 69 && grade[i] >= 60){
                newArray1[i] = 1.0;
            }
            else{
                newArray1[i] = 0.0;
            }
        }
        for(int i = 0; i < credit.length; i++){
            holder += credit[i];
        }
        this.credits = credits + (holder * NUMCREDITS);

        for(int i = 0; i < newArray1.length; i++){
            sum += newArray1[i];
        }
        this.gpa = sum / grade.length;
        return gpa;
    }

    //calculate double gpa
    public double calculateGPA(double[] grade) {
        double sum = 0;
        int holder = 0;
        int[] credit = new int[grade.length];
        for(int i = 0; i < grade.length; i++){
            if(grade[i] > 1.0){
                credit[i] = 1;
            }
            sum += grade[i];
        }
        for(int i = 0; i < credit.length; i++){
            holder += credit[i];
        }
        this.credits = credits + (holder * NUMCREDITS);

        this.gpa = sum / grade.length;
        return gpa;
    }

    //calculate character gpa
    public double calculateGPA(char[] grade) {
        double sum = 0;
        int holder = 0;
        int[] credit = new int[grade.length];
        double[] newArray2 = new double[grade.length];
        for(int i = 0; i < grade.length; i++){
            if(grade[i] == 'A'){
                newArray2[i] = 4.0;
                credit[i] = 1;
            }
            else if(grade[i] == 'B'){
                newArray2[i] = 3.0;
                credit[i] = 1;
            }
            else if(grade[i] == 'C'){
                newArray2[i] = 2.0;
                credit[i] = 1;
            }
            else if(grade[i] == 'D'){
                newArray2[i] = 1.0;
            }
            else{
                newArray2[i] = 0.0;
            }
        }
        for(int i = 0; i < credit.length; i++){
            holder += credit[i];
        }
        this.credits = credits + (holder * NUMCREDITS);

        for(int i = 0; i < newArray2.length; i++){
            sum += newArray2[i];
        }
        this.gpa = sum / newArray2.length;
        return gpa;
    }

}
