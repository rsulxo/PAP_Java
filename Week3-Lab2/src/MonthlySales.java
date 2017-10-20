public class MonthlySales {

    public static void main(String args[]){
        double [] monthlySales= {50000.0 , 40000.1, 55000.0 ,30000.0,                   // Elements in an Array
                250000.2, 600000.2, 450000.0, 36000.0 ,28000.0, 15000.1, 700000.2,
                15000.0};
        double sum = 0;                     // Sum variable
        for (double i : monthlySales){
            sum += i;                       // sum + i
        } System.out.println(sum);          // prints total of array
        int n = 12;                         // 12 months thus n = 12
        double average = 0;
        average = sum / n;                  // to calculate avg you take away the total from the amount of months
        System.out.println(average);        // prints avg
        double smallest = monthlySales[0];  // smallest no. var
        double largest = monthlySales[0];   // largest no. var

        for(int j=1; j< monthlySales.length; j++){  // monthly sales go up by 1 in no. of elements
            if(monthlySales[j] > largest)
                largest = monthlySales[j];
            else if (monthlySales[j] < smallest)
                smallest = monthlySales[j];
        }
        System.out.println("Largest monthly sale is: "+largest);        // prints largest sale
        System.out.println("Smallest monthly sale is: "+smallest);      // prints smallest sale

    }
}
