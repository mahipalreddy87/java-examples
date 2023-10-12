package ae;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {


      /** Please provide the output of the below function**/
        List<Integer> ints = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        ints.stream().filter(e -> e > 5).map(j -> {
            System.out.println(j);
            return String.valueOf(j);
        });

        return;
    }



}
