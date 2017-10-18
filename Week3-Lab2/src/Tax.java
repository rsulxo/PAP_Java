public class Tax {
    public static void main(String args[]){
        double salary = 52000;

        if(salary <= 15000){
            salary = salary;
        }
        else if(salary >= 15000 && salary < 30000){
            salary = salary * (1 - 0.05);
        }
        else if(salary >= 30000 && salary < 50000){
            salary = salary * (1 - 0.10);
        }
        else{
            salary = salary * (1 - 0.20);
        }
        System.out.println("Tax to be paid: "+salary);
    }
}