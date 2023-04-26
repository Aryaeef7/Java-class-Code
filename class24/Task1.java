package class24;

public class Task1 {
    public static void main(String[] args) {

        // int a=(int)12.5;
        Computer[] computers = {new Apple(), new Hp()};
        for (Computer c : computers) {
            c.playVideo();
            c.browsInternet();
            if (c instanceof Apple) {
                Apple apple = (Apple) c;
            }

        }
    }
}
class Computer{
    int RAM;
    int storage;
    String OS;
    void playVideo(){
        System.out.println("video is playing");
    }
    void browsInternet(){
        System.out.println("Browse the internet");
    }

}
class Apple extends Computer {
    void playVideo() {
        System.out.println("playing the video on quick time player");
    }

    void browsInternet() {
        System.out.println("Browse the internet using safari");

    }
    void editVideo(){
        System.out.println("Editing iMovie");
    }

    void installApp() {
        System.out.println("installing the app from app store");
    }
}
 class Hp extends Computer{
     void browsInternet(){
         System.out.println("Browsing using chrome");
     }
     void playVideo(){
         System.out.println("playing the video using vlc player");
     }

 }
