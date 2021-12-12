public class GoodStudentDriver
{
    public static void main (String[] args)
    {
        GoodStudent student1 = new GoodStudent("Alan", "Turing", "191254", 3.56, "Yes");
        GoodStudent student2 = new GoodStudent("Florence", "Nightingale", "182010", 3.89, "No");
        GoodStudent student3 = new GoodStudent("Grace", "Hopper", "190692", 3.99, "Yes");

        System.out.println(student1.toString());
        student2.setIdNum("95366");
        student2.setGPA(3.92);
        System.out.println("Florence's ID: " + student2.getIdNum() + ", Florence's GPA: "+ student2.getGPA());
        System.out.println(student3.getFirstName() + ", " + student3.getCSS());
        System.out.println("Alan Turing's ID: " + student1.CreateID());
        System.out.println("Florence Nightingale's ID: " + student2.CreateID());
        System.out.println("Grace Hopper's ID: " + student3.CreateID());
        System.out.println("Alan Turing's GPA: " + student1.CSGPA());
        System.out.println("Florence Nightingale's GPA: " + student2.CSGPA());
        System.out.println("Grace Hopper's GPA: " + student3.CSGPA());
    }
}