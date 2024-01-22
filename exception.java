public class exception {
    //java encounters some errors during runtime is exception
    //runtime errors occurs due to bad unexpected inputs
    //exception disrupts normal flow of execution
    //throw statement allows you to create custom error
    public static void main(String[] args) {
        int a=2563;
        int b=0;
        try {
            int c=a/b;
            System.out.println("the result is "+c);
        }
        catch (Exception e){
            System.out.println("Failed to divide :" +e);
//            System.out.println(e);
        }
        System.out.println("End of code");

    }


}
