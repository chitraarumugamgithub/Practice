

import java.util.*;
import java.util.function.Predicate;
import java.util.function.Consumer;
import java.util.stream.Collectors;

import static java.lang.System.out;

public class EgLambda {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        ArrayList<Integer> dupnumbers = new ArrayList<Integer>();

        numbers.add(5);
        numbers.add(9);
        numbers.add(8);
        numbers.add(1);
        numbers.add(1);

        numbers.forEach( (n) -> { out.println(n); } );
        numbers.add(9);

        List<Integer> uniqueNums = new ArrayList<>();
        numbers.stream().distinct().forEach(uniqueNums :: add);
        System.out.println(uniqueNums);
                Predicate isEmptyString = str -> {
                    if(str.toString().isEmpty()) return true;
                    else return false;
                };

        // Test cases
        String str1 = ""; // empty string
        String str2 = "Java lambda expression!"; // non-empty string

        // Check if the strings are empty using the lambda expression
        System.out.println("String 1:" + str1);
        System.out.println("String 1 is empty: " + isEmptyString.test(str1));
        System.out.println("\nString 2:" + str2);
        System.out.println("String 2 is empty: " + isEmptyString.test(str2));

    }
}