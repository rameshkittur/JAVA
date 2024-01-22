class outerClass{
    int num1=10;
    //you can make inner class as private or protectected if you dont want object to use that
    class innerClass{
        int num2=15;
        int num3=num1;
    }
}
//usge of inner static class
class species{
    String type="human";
    static class animal{
        String name="camel";

    }
}
public class Inner_classes {
    public static void main(String[] args){
        //nesting of classes is possible in java

        outerClass obj=new outerClass();
        outerClass.innerClass obj2=obj.new innerClass();
        System.out.println(obj.num1+obj2.num2);
        System.out.println("inner class access outer class attribute is "+obj2.num3);

        species.animal a1=new species.animal();
        System.out.println("The specie animal is "+a1.name);

    }
}
