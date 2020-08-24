package com.lambdas;

import com.lambdas.model.User;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

/**
 * @author Sophia Klocheva
 * on 8/24/2020
 */
public class FunctionExample
{
    public static void main(String[] args)
    {
        User sarah = new User("Sarah", 19);
        User james = new User("James", 19);
        User john = new User("John", 19);
        User mary = new User("Mary", 19);

        List<User> users = Arrays.asList(sarah, james, john, mary);
        List<String> names = new ArrayList<>();

        //init function
        Function<User, String> toName =
                (User user) -> user.getName();
        //get all names with apply method from function
        for (User user : users)
        {
            String name = toName.apply(user);
            names.add(name);
        }
        //Consumer
        Consumer<User> printer = (User user) -> System.out.println(user);
        users.forEach(printer);
        //or
        //of type User
        users.forEach((User user) -> System.out.println(user));
        users.forEach(user -> System.out.println(user));

        //of type String
        names.forEach(userName -> System.out.println(userName));
        //same as
        Consumer<String> stringConsumer = (String s) -> System.out.println(s);
        names.forEach(stringConsumer);

    }
}
