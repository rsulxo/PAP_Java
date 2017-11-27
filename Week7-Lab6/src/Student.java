public class Student extends Person {    // Student class derived from the person class


    // two instance variables
    String studentID;               // stores student ID
    int[] marks = new int[5]; // holds marks for 5 different subjects


    // initialises the instance variables
    Student(String name, String DoB, String studentID, int[] marks) {
        super(name, DoB);
        this.studentID = studentID;
        this.marks = marks;
    }

    // a method 'getFinalMark' to work out & return the average
    double getFinalMark() {
        int totalMark = 0;

        for (int i = 0; i < marks.length; i++) {
            totalMark += marks[i];
        }
        totalMark /= 5;     // to get average you do: total/5
        return totalMark;
    }


    // a method 'getGrade' which returns the students grade
    String getGrade() {
        if (this.getFinalMark() < 50) {
            return "F";
        } else if (this.getFinalMark() >= 50 && this.getFinalMark() < 60) {
            return "D";
        } else if (this.getFinalMark() >= 60 && this.getFinalMark() < 70) {
            return "B";
        } else {
            return "A";
        }
    }

    // an updated method to return the student id & final mark
    public  String toString(){

        return super.toString() + " StudentID: " + this.studentID + " Final Mark: " + this.getFinalMark();
    }
}
