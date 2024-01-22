import java.util.*;
public class hashmap {
    public static void main(String[]args){
       HashMap<String,Integer>mp=new HashMap<String, Integer>();
       mp.put("january",1);
       mp.put("Febrauary",2);
       mp.put("March",3);

       System.out.println(mp);
       for(String s:mp.keySet()){
           System.out.println("key: "+s+",value: "+mp.get(s));
       }
    }
}
