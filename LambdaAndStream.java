import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LambdaAndStream {
    // Lambda , Lambda method inference
    // Lambda - way of creating unanimous instance of functional interface
    //Streams,sorting, map, filter, collectors

    public static void main(String[] args) {
        // old way
//        Walkable obj = new WalkFast();
//        obj.walk(4);

//        Walkable obj = new Walkable() {
//            @Override
//            public int walk(int steps) {
//                return 3*steps;
//            }
//        };
//        System.out.println("Walking fast by "+obj.walk(5));

        // using Lambda way
//        Walkable obj = (steps)->{
//            System.out.println("Some logic before returning");
//            return 4*steps;
//        };
//        obj.walk(5);
//
//        Walkable obj2 = steps -> 6*steps;
//        System.out.println("Simplest way , output is "+ obj2.walk(4));

        /*
        Streams
        -once stream is used then we cant use same stream for other operations
         */
        List<String>fruits = List.of("Mango","Apple","Orange","Grapes");

        List<Integer> fruitLengthList = fruits
                .stream()
                .map(fruit -> fruit.length())
                .collect(Collectors.toList());
        System.out.println("Direct usage of stream and collecting it on list");
        System.out.println(fruitLengthList);

        Stream<String> stream = fruits.stream();

        // Stream can have multiple chain functions
        stream
                .filter(fruit->fruit.length()<10)
                .sorted()
                .map(fruit->fruit.length())
                .map(fruitLength->2*fruitLength)
                .forEach(System.out::println);
    }
}
interface Walkable {
    int walk(int steps);
}

class WalkFast implements Walkable {

    @Override
    public int walk(int steps) {
        System.out.println("Walking fast " + steps + " By factor of 2");
        return 2 * steps;
    }
}
