package class22;

public class Degree {
   /* create a class 'Degree' having a method 'getPrerequisite'
    that prints ""To get a degree you need high school diploma"".
     Class 'Degree' has 2 subclasses namely 'Bachelors' and Masters’.
    In Masters class override method 'getPrerequisite'.
    Call the method by creating an object of each of the three classes */
void getPrerequisite(){
    System.out.println("To get a degree you need high school diploma");
}
}
class Bachelors extends Degree{





}
class Master extends Degree{
    @Override
    void getPrerequisite() {
    System.out.println("To get a  Master degree you need a bachelor first");
}
}
class DegreeTester{
    public static void main(String[] args) {
        Degree degree=new Degree();
        degree.getPrerequisite();
        Bachelors bachelors=new Bachelors();
        bachelors.getPrerequisite();
        Master master=new Master();
        master.getPrerequisite();
    }
}