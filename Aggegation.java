class operation{
    int square(int n){
        return n*n;
    }
}
class circle{
    public operation op=new operation();

    double pi=3.14;
    double  area(int r){
//        op=new operation();
        return pi*(op.square(r));
    }
}
public class Aggegation {
    public static void main(String[]args){
      circle c1=new circle();
      System.out.println("area is "+c1.area(5));

    }
}
