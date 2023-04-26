package class24;

public class FinalDemo {
    public static void main(String[] args) {
        final int num;
        num=20;
    }
    final void noOneShouldOverrideIt(){
        System.out.println("This method should never be override it");
    }
}
class Nelson extends FinalDemo{
    /*void noOneShouldOverrideIt(){// cant override this method case it declared final
        System.out.println("let me do that");
    } */
}