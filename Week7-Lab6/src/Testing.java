public class Testing {
    public static void main(String [ ] args)
    {

        // Person class test
        Person Rooha = new Person("Rooha","14/11/1997");
        System.out.println(Rooha.toString());
        System.out.println(Rooha.getAge("26/11/2017"));


        // Student class test
        Student john = new Student("john","01/04/1999","01041999123",new int[]{60,50,40,70,80});
        System.out.println(john.toString());
        System.out.println(john.getFinalMark());
        System.out.println(john.getGrade());


        // UndergraduateStudent class test
        UndergraduateStudent dave = new UndergraduateStudent("dave","20/06/1998","20061998123",new int[]{50,40,30,20,90},2017,"biology");
        System.out.println(dave.toString());
        System.out.println(dave.getFinalMarkOf3());
        System.out.println(dave.getGrade());





    }
}
