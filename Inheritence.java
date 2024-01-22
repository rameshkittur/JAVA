public class Inheritence {

    public static void main(String[] args) {
     vehicle bike = new vehicle();
     bike.number=1234;
     bike.name="Honda";
     System.out.println(bike.number);
     bike.details();

     bike honda=new bike();
     honda.number=5321;
     honda.name="honda";
     honda.model="H2023";
     honda.details();

    }
}
class vehicle{
    public int number;
    public String name;

    public void details(){
        System.out.println("Number of the vehicle is "+this.number+" Name is "+this.name);
    }
}
class bike extends vehicle{
      String model;

}
