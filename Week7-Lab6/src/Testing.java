public class Testing {


    public static void main(String [ ] args)
    {

        //Person class test
        Person rooha = new Person("rooha","14/11/1997");
        System.out.println(rooha.toString());
        System.out.println(rooha.age("27/11/2017"));


        //Student class test
        Student rabia = new Student("rabia","22/03/1995","12345",new int[]{50,20,10,80,90});
        System.out.println(rabia.toString());
        System.out.println(rabia.getFinalMark());
        System.out.println(rabia.getGrade());


        //UndergraduateStudent class test
        UndergraduateStudent zoiya = new UndergraduateStudent("zoiya","22/06/2003","20301",new int[]{40,30,50,30,70},2017,"biology");
        System.out.println(zoiya.toString());
        System.out.println(zoiya.getFinalMark());
        System.out.println(zoiya.getGrade());

    }

}
