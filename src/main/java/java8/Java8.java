package java8;

import java.util.*;

public class Java8 {


    public static void main(String[] args) {
        optionalFeature();
        lambdaFeature();
        streamFeature();
    }

    /**
     * A container object which may or may not contain a non-null value. If a value is present,
     * isPresent() returns true.
     * If no value is present, the object is considered empty and isPresent() returns false.
     */
    public static void optionalFeature(){
        System.out.println("Enter a word: ");
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();

        //for test
        if(s == null || s.trim().isEmpty()){
            s= null;
        }

        Optional<String> optional=Optional.ofNullable(s);
        if(optional.isPresent()){
            System.out.println("Line is valid.");
        }else {
            System.out.println("Line is not valid.");
        }
    }

    public static void lambdaFeature(){
        System.out.println("Enter a word: ");
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();

        //for test
        if(s == null || s.trim().isEmpty()){
            s= null;
        }

        Optional<String> optional=Optional.ofNullable(s);
        optional.ifPresentOrElse(s1 -> System.out.println("Line is valid."),
                () -> System.out.println("Line is not valid."));
    }

    public static void streamFeature(){
        ArrayList<Integer> numbers= new ArrayList<>();
        numbers.add(1);
        numbers.add(23);
        numbers.add(41);
        numbers.add(14);
        numbers.add(75);

        //convert to stream
        //numbers.stream();

        //filter method
        List<Integer> numbersLessThan20 = numbers.stream().filter(number -> number < 20).toList();
        System.out.println(Arrays.toString(numbersLessThan20.toArray()));

        //map method
        List<Integer> addFiveToAllNumbers = numbers.stream().map(number -> number + 5).toList();
        System.out.println(Arrays.toString(addFiveToAllNumbers.toArray()));

        //sum method
        Integer sum = numbers.stream().mapToInt(number -> number).sum();
        System.out.println(sum);

        //...

    }
}
