interface first{
    void firstFunction();
}
interface second{
    void secondFunction();
}

class third implements first,second{
    @Override
    public void firstFunction() {
        System.out.println("Firt function defined ");
    }
    public void secondFunction(){
        System.out.println("Second funtion defined");
    }
    void ownFunc(){
        System.out.println("own funtion defined");
    }
}
public class Interfaces {
    //completely abstract class that is used group related methods with empty body
    //multiple inheritence can be achived using Interfaces
    public static void main(String[] args){
        third interfaceObj =new third();
        interfaceObj.firstFunction();
        interfaceObj.secondFunction();
        interfaceObj.ownFunc();
    }
}
