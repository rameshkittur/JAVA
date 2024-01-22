import java.util.Scanner;
public class packages {
    //built in package and user defined package-java api is library -packages,classes
    //you can import whole package or specific classes
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter user name");
        String name=obj.nextLine();
        System.out.println("User name is :"+name);
    }

}
