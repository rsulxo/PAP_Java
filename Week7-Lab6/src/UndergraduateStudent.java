import java.util.*;

public class UndergraduateStudent extends Student {     // A UndergraduateStudent class is derived from the Sudent class

    // 2 more instance variables
    int year;           // year of study
    String program;     // name of program which they are studying eg, computer science


    // Constructor to initialise all the instance variables
    UndergraduateStudent(String name, String DoB, String studentID, int[] marks, int year, String program) {
        super(name, DoB, studentID, marks);
        this.year = year;
        this.program = program;
    }

    // a method 'getFinalMark' that returns the student average mark where only only the three best marks are used
    int getFinalMark(){

        int totalMark = 0;
        Arrays.sort(marks); // Sorts the array
        //  best 3 marks will be used here

        for (int i = 1; i < marks.length; i++){
            totalMark += marks[i];
        }        totalMark /= 3; // you get average using 3 subjects: total/3
        return totalMark;
    }

    // method 'getGrade' which returns the students final grade
    String getGrade(){

        int ultimateFinalMark = this.getFinalMark();

        if (ultimateFinalMark >= 40){
            return "Pass";
        }else if (ultimateFinalMark < 40) {
            return "Fail";
        }
        return null; // fail safe
    }

    // update of the method toString
    public  String toString(){
        return super.toString() + " student year: " + this.year + " program of study: " + this.program;
    }
}
