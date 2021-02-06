package interfaces;
interface Movable{
   final static double PI = 3.14;
   static boolean isMovable(Object obj){
       if(obj instanceof Movable) return true;
       return false;
   }
     void start();
     void  stop();
     default void travel(int distance){
         start();
         System.out.println(" I'm moving now");
         stop();
         System.out.println("Radius: "+radius(distance));
     }

 private  double radius(int distance){
         return distance/PI;
 }
}
interface Swimable{
    void start();
    void stop();
}
public interface Amphibian extends Movable, Swimable{


}
class Pt76 implements Amphibian{
private boolean isSwimming;
    @Override
    public void start() {
if(isSwimming){
    System.out.println(" I can swim");
}
else System.out.println(" I can move");
    }

    @Override
    public void stop() {

    }
}
