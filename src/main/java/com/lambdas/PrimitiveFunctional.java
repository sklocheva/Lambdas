package com.lambdas;

import java.util.function.DoubleToIntFunction;
import java.util.function.IntSupplier;

/**
 * @author Sophia Klocheva
 * on 8/24/2020
 */
public class PrimitiveFunctional
{
    public static void main(String[] args)
    {
        IntSupplier supplier = () -> 10;
        int asInt = supplier.getAsInt();
        System.out.println(asInt);

        DoubleToIntFunction toIntFunction =
                (double value) -> (int) Math.floor(value);
        int pi = toIntFunction.applyAsInt(Math.PI);
        System.out.println(pi);
    }
}
