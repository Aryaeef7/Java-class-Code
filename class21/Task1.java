package class21;

public class Task1 {
    void calculateArea(double length,double width){
        System.out.println("Area of rectangle"+(length*width));
    }
    void calculateArea(double side){
        System.out.println("Area of rectangle is "+(side*side));
    }

    public static void main(String[] args) {
        Task1 area=new Task1();
    }
}
