package class24;

public class PhoneTester {
    public static void main(String[] args) {
        Phone[]phone={new Samsung(),new Iphone()};
        for (int i = 0; i < phone.length ; i++) {
            Phone phone1=phone[i];
            phone1.unlockPhone();
            phone1.displayPictures();
            phone1.sendText();

        }
    }
}
