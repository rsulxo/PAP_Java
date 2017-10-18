public class MonthlySales {

    public static void main(String args[]){
        double [] monthlySales= {50000.0 , 40000.1, 55000.0 ,30000.0,
                250000.2, 600000.2, 450000.0, 36000.0 ,28000.0, 15000.1, 700000.2,
                15000.0};
        double sum = 0;
        for (double i : monthlySales){
            sum += i;
        } System.out.println(sum);
        int n = 12;
        double average = 0;
        average = sum / n;
        System.out.println(average);
        double smallest = monthlySales[0];
        double largest = monthlySales[0];

        for(int j=1; j< monthlySales.length; j++){
            if(monthlySales[j] > largest)
                largest = monthlySales[j];
            else if (monthlySales[j] < smallest)
                smallest = monthlySales[j];
        }
        System.out.println("Largest monthly sale is: "+largest);
        System.out.println("Smallest monthly sale is: "+smallest);

    }
}
