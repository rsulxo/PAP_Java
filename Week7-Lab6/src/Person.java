public class Person {

    // two instance variables
    String name;    // stores name of the person
    String  DoB;    // stores the date of birth


    // a constructor to initialise the instance variables
    Person(String name, String DoB){
        //DoB format will be = dd/mm/yyyy
        this.name = name;
        this.DoB = DoB;
    }

    // method 'age' that takes an argument of type Date & returns the age
    int age(String Date){
        //you must enter data in this format dd/mm/yyyy - 10 characters in DoB - example 14/11/1997

        int startIndex = 6;  // I need indexes for the parseInt methods
        int endIndex = 10;  // it wont work otherwise

        int bornYear; // index contains the year because the input dd/mm/yyyy
        bornYear = Integer.parseInt(DoB, startIndex,endIndex,10);

        int currentYear; // index contains the year because the input dd/mm/yyyy
        currentYear = Integer.parseInt(Date, startIndex,endIndex,10);

        int currentAge = 0;
        currentAge = currentYear -= bornYear; //this is an effective way to find out the age
        return  currentAge;
    }

    // method to return the string representation of the object Person
    public String toString(){
        return "name: " + this.name + " DoB: " + this.DoB;
    }
}
