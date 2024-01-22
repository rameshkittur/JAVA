
class students{
    int rollno;
    String name;
    static String college="Msrit";
    students(int rollno,String name){
        this.rollno=rollno;
        this.name=name;
    }
    //static methods can be called without obj
    //static methods have the acess of only staic variable
    //static block is loaded before the main method is executed
    static void collegename(String clg){
        college=clg;

    }
    void displayDetails(){
        System.out.println("Rollno "+this.rollno+" ,Name "+this.name);
    }

}

public class staticMethods {
    static{
        System.out.println("Code inside static block is executed before main method");
    }
    public static void main(String[] args){
        System.out.println("Code starting in Main method");
      students s1=new students(1,"mahesh");
      s1.displayDetails();
      System.out.println("static college name before calling static method ");
      System.out.println(students.college);
      students.collegename("BMS");
      System.out.println("static college name After calling static method ");
      System.out.println(students.college);
    }
}
