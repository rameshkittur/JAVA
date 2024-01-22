interface Anonymous{
    void method1();
    void method2();
}
//anonymous class enables you to declare and instantiate class at same time
public class AnonymousClass {
    public static void main(String[] args) {
       Anonymous obj=new Anonymous() {
           @Override
           public void method1() {
               System.out.println("Method 1");
           }

           @Override
           public void method2() {
               System.out.println("Method 1");
           }
       };
       obj.method1();
       Anonymous obj2=new Anonymous() {
           @Override
           public void method1() {
               System.out.println("obj2 m1");
           }

           @Override
           public void method2() {
               System.out.println("obj2 m2");
           }
       };
       obj2.method1();
    }
}
