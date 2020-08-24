package com.lambdas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

/**
 * @author Sophia Klocheva
 * on 8/24/2020
 */
public class PredicateExample
{
    public static void main(String[] args)
    {

        List<String> strings =
                new ArrayList<String>(Arrays.asList("one", "two", "three"));
        //predicate init
        Predicate<String> filter =
                (String s) -> s.startsWith("o");
        //method that invokes predicate method test
        strings.removeIf(filter);

        //consumer init
        Consumer<String> list = (String l) -> System.out.println(l);
        //invokes consumer method accept
        strings.forEach(list);
    }
}
