class gen<T1,T2>{
    int d;
    private T1 t1;
    private T2 t2;

    public gen(int d, T1 t1, T2 t2) {
        this.d = d;
        this.t1 = t1;
        this.t2 = t2;
    }

    public T1 getT1() {
        return t1;
    }

    public T2 getT2() {
        return t2;
    }

    public void setT1(T1 t1) {
        this.t1 = t1;
    }

    public void setT2(T2 t2) {
        this.t2 = t2;
    }
}
public class Generics {
    //generics enable types (classes and interfaces) to be parameters when defining classes, interfaces and methods
    //adwantages->1.strong type check at  compile time
    //2.elimination of casting,3.enabling programmer to implement generic algorithms
    public static void main(String[] args) {
        gen<String,Integer> obj=new gen(5,"Rahul",534);
        int rollno=obj.getT2();
        System.out.println("roll number is "+rollno);
    }
}
