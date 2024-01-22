import java.util.Scanner;
import java.util.ArrayList;
public class userInput {
    public static void main(String[]args){
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the input string");
        String name=obj.nextLine();
        System.out.println("Name is "+name);
        System.out.println("Enter the input Number");
        int usn=obj.nextInt();
        System.out.println("usn is "+usn);
        String[] a={"ramesh","suresh"};
        int[] arr=new int[5];
//        System.out.println(arr.length);
        System.out.println("Enter the array input");

        for(int i=0;i<5;i++){
            int num=obj.nextInt();
            arr[i]=num;
        }


    }

}
