import java.util.*;
class College
{
    public int aicteid=7207;
    College()
    {
        System.out.println("AICTE ID : "+aicteid);
    }
}
class Department extends College
{
    public int deptid=104;
    Department()
    {
        super();
        //super.display();
        System.out.println("DEPARTMENT ID : "+deptid);
    }
}
class Student extends Department
{
    public String name="Sri Prasanna";
    Student()
    {
        super();
        System.out.println("Name : "+name);
    }
}
public class Main {
    
        public static void main(String []args)
        {
            Student o = new Student();
            //o.display();
        }
}
