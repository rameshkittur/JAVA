import java.util.*;
import java.util.Collections;
public class arraylist {
    //array list only stores objects
    public static void main(String[] args){
        ArrayList<Integer>arr=new ArrayList<Integer>();
        System.out.println("size");
        Scanner sc=new Scanner(System.in);
        int size =sc.nextInt();
        System.out.println("elements");
        for(int i=0;i<size;i++){
            int ele=sc.nextInt();
            arr.add(ele);
        }
        Collections.sort(arr);
        for(int i:arr){
            System.out.println(i);
        }
    }


}
