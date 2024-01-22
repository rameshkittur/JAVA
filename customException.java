
import java.util.*;
class newExcp extends Exception{
    @Override
    public String toString() {
        return "To string method called within println";
    }

    @Override
    public String getMessage() {
        return "prints exception message";
    }

}
public class customException {
    public static void main(String[] args) {
     int age;
     Scanner sc=new Scanner(System.in);
        System.out.println("Enter your age");
        age=sc.nextInt();
     if(age<18){
        try{
            throw new newExcp();
        }
        catch(newExcp e){
            System.out.println(e);
            System.out.println(e.toString());
            System.out.println(e.getMessage());
        }
     }
    }
}
