package class23;

public class Student {
   /* Create a Class Student that will have 3 subclasses as SyntaxStudent,
   CollegeStudent, SchoolStudent.
    Define common behavior within parent class and override
     some of the methods in child classes
       Define some methods specific to child classes
       Write example of achieving run time polymorphism
    You do not have permission to send messages in this channel.
    */
  public void Study(){
      System.out.println("Studying");}
    void doHomework(){
        System.out.println("Solving Home work");
    }
    void practice(){
        System.out.println("practice the Skill");
    }
  }
class SyntaxStudent extends Student{

    public void Study() {
        System.out.println("Syntax Student must study programming");
    }
    void doHomework(){
        System.out.println(" Solve home work");
    }
}
class CollegeStudent extends Student{
    void practice(){
        System.out.println("Colloge student mus practice");
    }

}
class SchoolStudent extends Student{

}
