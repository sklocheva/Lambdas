package com.lambdas;

import com.lambdas.model.User;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * @author Sophia Klocheva
 * on 8/24/2020
 */
public class ChainingFunction
{
    public static void main(String[] args)
    {
//        Consumer<String> c1 = s -> System.out.println("c1 " + s);
//        Consumer<String> c2 = s -> System.out.println("c2 " + s);
//        //combines two consumers
//        Consumer<String> c3 = c1.andThen(c2);
//        c3.accept("Hello");
//
//        //*** combines predicates
//        Predicate<String> isNotNull = s -> s != null;
//        System.out.println(isNotNull.test(null));
//
//        Predicate<String> isEmpty = s-> s.isEmpty();
//        System.out.println(isEmpty.test(""));
//
//        Predicate<String> p = isNotNull.negate().and(isEmpty);
//        System.out.println(p.test("Hello"));

        testComparator();
    }

    private static void testComparator()
    {
        User sarah = new User("Sarah", 32);
        User james = new User("James", 24);
        User john = new User("John", 56);
        User john2 = new User("John", 21);
        User mary = new User("Mary",19);

        List<User> users = Arrays.asList(sarah, james, john, john2, mary);

        Comparator<User> cmpName = Comparator.comparing(user -> user.getName());
        Comparator<User> cmpAge = Comparator.comparing(user -> user.getAge());
        Comparator<User> comp = cmpName.thenComparing(cmpAge);
        users.sort(comp);
        users.forEach(u -> System.out.println(u));

    }
}
