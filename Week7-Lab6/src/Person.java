//import java.util.Date;
//import java.util.Calendar;

public class Person {
    //  two instance variables
    String name;    // stores the name of the person
    String DoB;     // stores the date of birth

    Person(String name, String DoB) {
        //constructor to initialise the variables
        this.name = name;
        this.DoB = DoB;
    }

    int getAge(String Date) {
        // a method 'age' that takes an argument of type date and
        // returns the age of the person
        int yearBorn = Integer.parseInt(DoB, 10);
        int currentYear = Integer.parseInt(Date, 10);
        int currentAge = currentYear -= yearBorn;
        return currentAge;
    }

    public String toString() {
        // a 'toString' method to return the string representation of the object Person
        return "Name: "+this.name+" Date of Birth: "+this.DoB+"Age: ";
    }
}
