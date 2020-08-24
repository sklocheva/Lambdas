package com.lambdas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

/**
 * @author Sophia Klocheva
 * on 8/20/2020
 */
public class FistLambdas
{

    public static void main(String[] args)
    {
        //Suppliers example
        Supplier<String> supplier =
                () -> "Hello!";
        System.out.println(supplier.get());

        //Consumer example
        Consumer<String> consumer =
                (String s) ->
                {
                    System.out.println(s);
                };
        consumer.accept("Bye!");

    }
}
