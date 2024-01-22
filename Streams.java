import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Streams {
    public static void main(String[] args) {
        List<Integer>li= Arrays.asList(1,53,43,6,3,78,95,2);
        li.stream()
                .filter(n->n%2==0)
                .sorted()
                .map(n->n*2)
                .forEach(n-> System.out.println(n));

    }
}
