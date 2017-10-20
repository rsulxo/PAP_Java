public class Tax {
    public static void main(String args[]){
        double salary = 50000;  //Our given salary

        double band1 = 15000;   //Initial untaxed amount
        double band2;   // 5%
        double band3;   // 10%
        double band4;   // 20%
        double finalSalary;  // Final salary with the tax

        if(salary <= 15000){
            finalSalary = salary;   // Salary stays the same
        }
        else if(salary >= 15000 && salary < 30000){
            band2 = (salary-15000)*0.95;    // 15k takeaway from the salary and times by the % req
            finalSalary = band1+band2;      // Add both bands together for 5% added tax + salary
        }
        else if(salary >= 30000 && salary < 50000){
            band2 = 0.95*15000;             // 15k times by the first %
            band3 = 0.10*(salary-30000);    // 30k takeaway from the salary and times by the % req
            finalSalary = band1+band2+band3; // Add all three bands for the 10% added tax + salary
        }
        else{
            band2 = 0.95*15000;             // 5% of 15k
            band3 = 0.90*20000;             // 10% of 20k
            band4 = 0.80*(salary-50000);    // 20% of the salary takeaway from 50k (the band for anything above 50k)

            finalSalary = band1+band2+band3+band4;  // Final salary will add up all bands that match the initial salary input
        }
        System.out.println("Your gross salary: "+salary);       // The full amount of salary you earned
        System.out.println("Your net salary: "+finalSalary);    // The salary you get minus tax
        System.out.println("Tax paid: "+(salary-finalSalary));  // Amount taxed
    }
}