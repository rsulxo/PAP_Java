import java.util.*;

public class UndergraduateStudent extends Student {   // derived from student class

    // two more instance variables added to the Student Class
    int year;           // stores the student's year of study
    String program;     // stores the name of the program of study eg: computer science


    // Constructor to initialise all the instance variables
    UndergraduateStudent(String name, String DoB, String studentID, int[] marks, int year, String program) {

        super(name, DoB, studentID, marks);
        this.year = year;
        this.program = program;
    }

    // a method that returns the student average mark where only the 3 best marks are used
    int getFinalMarkOf3(){

        int totalMark = 0;
        Arrays.sort(marks); // This sorts the array into order

        for (int i = 0; i < marks.length; i++) {
            totalMark += marks[i];
        }
        totalMark /= 3;     // to get average of 3 best subjects: total/3
        return totalMark;
    }


    // a method 'getGrade' which returns the final grade
    String getGrade() {

        if (this.getFinalMarkOf3() >= 40) {
            return "You Passed";
        } else if (this.getFinalMarkOf3() < 40) {
            return "You Failed";
        }
        return null;    // fail safe
    }


    // an updated method to return string values of the following
    public  String toString(){

        return super.toString() + " student year: " + this.year + " program of study: " + this.program;
    }
}
