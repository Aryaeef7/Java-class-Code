package class20;

public class Teacher {
    String subject;
    String name;
    void Funny(){
        System.out.println("no jokes at the class");
    }
    void Task(){
        System.out.println("you do a lot of tasks at the class");
    }
    void homework(){
        System.out.println("a lot of homework");
    }
    void explain(){
        System.out.println("best explanation ");
    }

}
class MathTeacher extends Teacher{
    int teacherID;
    void tech(){
        System.out.println("This teacher is teaching Math");
    }

}
class ChemistryTeacher extends Teacher{
    void TeachingSpeed(){
        System.out.println("This teacher moves slow");
    }
}
class PianoTeacher extends Teacher{
    int yearsOfExperience;
    void Play(){
        System.out.println("This teacher plays very good ");
    }
}

