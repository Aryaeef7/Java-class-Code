package class24;

public  abstract class Phone {
    /* create a phone class lets create abstract methods like displayPicture
    unlockPhone, SendText
    2 child classes Iphone Samsung Google and provide specific implementation
    lets write code to achieve runtime polymorphism.
     */
   abstract void displayPictures();
   abstract void unlockPhone();

   abstract void sendText();

   }

class Iphone extends Phone{

     void displayPictures() {
         System.out.println("Brows photo");

     }
    void unlockPhone() {
        System.out.println("Face id unlock");
    }
         void sendText(){
             System.out.println("Imessage");

    }
}
class Samsung extends Phone{
    @Override
    void displayPictures() {
        System.out.println("Samsung can get better pic");
    }
    void unlockPhone(){
        System.out.println("unlock the Samsung");
    }
    void sendText(){
        System.out.println("samsung can send text");
    }
}
