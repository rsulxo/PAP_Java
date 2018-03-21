public class Employee {

    private int id;		    // variable for the ID
    private String name;	// variable for the name
    private String sex;		// variable for the sex
    private double salary;	// variable for the salary

    public int houseNo; 	// variable for the house number
    public String street;	// variable for the street
    public String city;		// variable for the city
    public String postCode;	// variable for the post code

    public Employee() { }	// main constructor class

    public Employee(int id, String name, String sex, double salary){
        // initialise each of the variables
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.salary = salary;

    }

    public void employeeAddress( int houseNo, String street, String city, String postCode) {
        //initialise each of the variables
        this.houseNo = houseNo;
        this.street = street;
        this.city = city;
        this.postCode = postCode;
    }

    public void printInfo() {		// method which prints out the employees information
        System.out.println("ID: " + id + " \tName: " + name + " \tSex: " + sex + " \tSalary: " + salary);
    }

    public void printall() {
        printInfo();
        System.out.println("Address: ");
        System.out.println("\tHouse No: " + houseNo);
        System.out.println("\tStreet: " + street);
        System.out.println("\tCity: " + city);
        System.out.println("\tPostCode: " + postCode);
    }

    public class Address extends Employee{	// the address class is an extension of the employee method
        // variables are added to the class here
        int houseNo;
        String street;
        String city;
        String postCode;

        public Address(int houseNo, String street, String city, String postCode) {
            super();		// super bcos inheritance
            //Initialises all the variables
            this.houseNo = houseNo;
            this.street = street;
            this.city = city;
            this.postCode = postCode;
        }
    }
}

// The InnerTest Class has the main method. It could not be bested as the main method is static and code
// can't be started from the inner class since the main method is where code is executed from.

class InnerTest {

    public static void main(String[] args) {
        Employee emp = new Employee(1000, "James G", "M", 3200);	//creating a new employee
        emp.employeeAddress(29, "St James", "London", "SE14 6NW");	//giving the employee an address
        emp.printall();	//printing the employee information
    }
}
