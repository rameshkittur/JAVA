public class JavaModifiers {
    //like abstract class and final keyword
    public static void main(String[] args){
       student s1=new student();
       s1.name="Rahul";
//       s1.age=15;
       s1.standard=10;
       s1.details();

    }
}
abstract class Induvidual{
    String name;
    int age;

    abstract void details();

}
class student extends Induvidual{
    int standard;
    void details(){
        System.out.println("Name: "+this.name+" age: "+this.age+" std: "+standard);
    }
}
