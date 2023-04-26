package class23;

public class FinalKeyword {
   final double gravity=9.8;
    double PI=3.14;
    final double LightSpeed=299792458;

   final void tryChangingGravity(){
        //gravity=1.6; get error case this variable marked final
    }

}
class child extends FinalKeyword{
    //void tryChangingGravity(){

    }

