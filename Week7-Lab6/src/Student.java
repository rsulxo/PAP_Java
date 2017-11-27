public class Student extends Person {   //  Student class is derived from the Person class

    String studentID;           // store the studentId
    int [] marks = new int[5];  // hold the exam marks for 5 different subjects

    // constructor to initialise all the instance variables
    Student(String name, String DoB, String studentID, int [] marks) {
        super(name, DoB);   //super refers to the constructors from the person.java class
        this.studentID = studentID;
        this.marks = marks;

    }

    // method 'getFinalMark' which works out and returns the average mark
    int getFinalMark(){
        int totalMark = 00;

        for (int i =0; i < marks.length; i++){
            totalMark += marks[i]; // sums all the marks & stores them
        }
        return totalMark /= 5; // since there are 5 subjects, to get average: total/5
    }

    // method 'getGrade' which returns the students grade
    String getGrade(){
        int finalMark = this.getFinalMark(); // stores result in finalMark

        if (finalMark < 50){        // anything less than 50 a F
            return "F";
        }else if (finalMark >= 50  && finalMark < 60  ){    //D between 50 and 60
            return "D";
        }else if ( finalMark >= 60  && finalMark < 70 ) {   //B between 60 and 70
            return "B";
        }else {
            return "A";     //anything else, above 70, is an A
        }
    }

    // update of the method toString to return the studentid and finalmark
    public  String toString(){
        return super.toString() + " studentId: " + this.studentID + " final mark: " + this.getFinalMark();
    }





}
