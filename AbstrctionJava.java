abstract class animal{
    public abstract void sound();
    public void sleep(){
        System.out.println("Sleeping Zzz ");
    }
}
class pig extends animal{
    public void sound(){
        System.out.println("pig makes sounds like:wee wee...");
    }
}
public class AbstrctionJava {
    //achived through abstract class or interfaces
    //it is not possible to create objects for abstract class
    //Abstrsct class and method used to achive security
 public static void main(String[] args) {
     pig p1 = new pig();
     System.out.println("Pig class inheriting from abstract Animal class");
     p1.sound();
     p1.sleep();
 }

}
