/**
 * Main Class
 * The Coders 147
 * Bruce Pickett, Kalabe Mulugeta, Nicholas Sukhu, Tanner Yatsko, Zachary Larsen, Jared Smith
 */

import java.util.*;

public class Main {

    public static void main (String[]args) {

        System.out.println("This program creates student or teacher records");

        Scanner input = new Scanner(System.in);

        //Create Data object
        Date date = new Date();

        for (; ; ) {
            System.out.println("\n----------Menu----------");
            System.out.println("0. Quit Program");
            System.out.println("1. Create Student Record");
            System.out.println("2. Create Teacher Record");
            while (!input.hasNextInt()){
                System.out.println("Invalid Option, try again.");
                input.next();
            }
            int choice = input.nextInt();

            switch (choice) {
                case 0:
                    System.out.println("Quiting program...");
                    return;
                case 1:
                    //Create Student object
                    Student newStudent = new Student();

                    //Student Name
                    System.out.print("Enter student first name: ");
                    String studentFirstName = input.next().toUpperCase();
                    System.out.print("Enter student last name: ");
                    String studentLastName = input.next().toUpperCase();
                    String studentName = studentFirstName + " " + studentLastName;
                    newStudent.setName(studentName);

                    //Determine student commuter status
                    System.out.print("Does student commute? Choose Y/N: ");
                    char commute = input.next().toUpperCase().charAt(0);
                    newStudent.setParking(commute);

                    //Student Major
                    System.out.print("Enter student's major: ");
                    String major = input.next().toUpperCase();
                    newStudent.setMajor(major);

                    //Student Credits
                    System.out.print("Enter total number of earned credits: ");
                    while (!input.hasNextInt()){
                        System.out.println("Invalid Option, try again.");
                        input.next();
                    }
                    int credits = input.nextInt();
                    newStudent.setCredits(credits);

                    //Number of student classes
                    System.out.print("Enter number of classes taken this semester: ");
                    while (!input.hasNextInt()){
                        System.out.println("Invalid Option, try again.");
                        input.next();
                    }
                    int classNum = input.nextInt();

                    //Entering grades in three formats
                    System.out.println("\n0. Enter letter grades (EX: A,B):");
                    System.out.println("1. Enter percent grades (EX: 98,73):");
                    System.out.println("2. Enter numeric grades (EX: 4.0, 2.0)");
                    while (!input.hasNextInt()){
                        System.out.println("Invalid Option, try again.");
                        input.next();
                    }
                    int choice2 = input.nextInt();

                    switch(choice2) {
                        case 0:
                            char[] gradeArray1 = new char[classNum];
                            for (int i = 0; i < gradeArray1.length; i++) {
                                System.out.print("Enter class " + (i + 1) + "'s grade: ");
                                char gradeChar = input.next().toUpperCase().charAt(0);
                                gradeArray1[i] = gradeChar;
                            }
                            newStudent.calculateGPA(gradeArray1);
                            break;
                        case 1:
                            int[] gradeArray2 = new int[classNum];
                            for (int i = 0; i < gradeArray2.length; i++) {
                                System.out.print("Enter class " + (i + 1) + "'s grade: ");
                                while (!input.hasNextInt()){
                                    System.out.println("Invalid Option, try again.");
                                    input.next();
                                }
                                int gradeInt = input.nextInt();
                                gradeArray2[i] = gradeInt;
                            }
                            newStudent.calculateGPA(gradeArray2);
                            break;
                        case 2:
                            double[] gradeArray3 = new double[classNum];
                            for (int i = 0; i < gradeArray3.length; i++) {
                                System.out.print("Enter class " + (i + 1) + "'s grade: ");
                                while (!input.hasNextDouble()){
                                    System.out.println("Invalid Option, try again.");
                                    input.next();
                                }
                                double gradeDouble = input.nextDouble();
                                gradeArray3[i] = gradeDouble;
                            }
                            newStudent.calculateGPA(gradeArray3);
                            break;
                        default:
                            System.out.println("Invalid Option");
                            return;
                    }

                    //print student record
                    System.out.println("\n---------------Student Record---------------");
                    System.out.printf("Name: %s       Parking Pass: %s \nID #: %d                 Major: %s \nTotal Credits: %d          GPA: %.2f", newStudent.getName(), newStudent.getParking(),
                            newStudent.generateIdNum(), newStudent.getMajor(), newStudent.getCredits(), newStudent.getGpa());
                    System.out.println("\nRecord created on: " + date.toString());
                    break;
                case 2:
                    //Create Teacher object
                    Teacher newTeacher = new Teacher();

                    //Teacher name
                    System.out.print("Enter teacher first name: ");
                    String teacherFirstName = input.next().toUpperCase();
                    System.out.print("Enter teacher last name: ");
                    String teacherLastName = input.next().toUpperCase();
                    String teacherName = teacherFirstName + " " + teacherLastName;
                    newTeacher.setName(teacherName);

                    //Number of classes taught
                    System.out.print("How many classes do they teach: ");
                    while (!input.hasNextInt()){
                        System.out.println("Invalid Option, try again.");
                        input.next();
                    }
                    int teachClass = input.nextInt();

                    //What classes are
                    String[] classes = new String[teachClass];
                    for (int i = 0; i < classes.length; i++) {
                        System.out.println("Enter class " + ( i+ 1) + "'s name: ");
                        String className = input.next().toUpperCase();
                        classes[i] = className;
                    }
                    newTeacher.setClassName(classes);

                    //Print teacher record
                    System.out.println("\n---------------Teacher Record---------------");
                    System.out.println("Name: " + newTeacher.getName());
                    System.out.println("Parking Status: D");
                    System.out.println("ID #: " + newTeacher.generateIdNum());
                    System.out.print("Classes taught: ");
                    newTeacher.getClassName();
                    System.out.println("\nRecord created on: " + date.toString());
                    break;
                default:
                    System.out.println("Invalid Option");
                    break;
            }
        }
    }
}
