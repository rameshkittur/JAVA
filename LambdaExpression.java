interface lambda{
    int fun1(int a,int b);
//    void fun2();

}
public class LambdaExpression {
    public static void main(String[] args) {
        lambda obj=(a,b)-> {return a+b;};

        System.out.println(obj.fun1(5,6));
    }
}
