import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * Created by scott_000 on 10/8/2016.
 */
public class Course implements Cloneable{

    private String courseName;
    String[] students = new String [100];
    String[] newStudentsArray = new String[students.length * 2];
    private int numberOfStudents;
    public java.util.Date whenBuilt;



    public static void copyArray(String[] students, String[] newStudentsArray){
        //copy array to new array
        for (int i = 0; i <= students.length; i++) {
            students[i] = newStudentsArray[i];
        }
    }


    public static void dropStudent(String[] newStudentsArray){
        //find which student should be dropped
        Scanner input = new Scanner(System.in);
        System.out.println("Which student would you like to drop (0 - 100): ");
        int currentStudent = input.nextInt();

        //convert array to list
        List<String> aList = Arrays.asList(newStudentsArray);
        aList.remove(currentStudent);
        aList.toArray(newStudentsArray);

    }

    public static void clearAllStudents(String[] newStudentsArray){
        List<String> aList = Arrays.asList(newStudentsArray);
        aList.clear();
        aList.toArray(newStudentsArray);
    }


    public static void displayStudents(String[] newStudentsArray) {
        //test to see if array is empty
        try {
            for (int i = 0; i <= 2; i++) {
                System.out.println(newStudentsArray[i]);
            }
        }catch(ArrayIndexOutOfBoundsException ex){
                System.out.println("Array out of bounds.");

        }
        System.out.println("Execution continues");
    }



    public Course(String courseName){
        this.courseName = courseName;
    }

    public void addStudent(String student){
        students[numberOfStudents] = student;
        numberOfStudents++;
    }

    public String[] getStudents(){
        return students;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    public String getCourseName() {
        return courseName;
    }

    public void dropStudent(String student){

    }

    public static void  clearStudents(){

    }

    @Override
    public Object clone() {
        try {
            String[] studentClone = (String[]) super.clone();
            return studentClone;
        }
        catch (CloneNotSupportedException ex) {
            return null;
        }
    }



}

