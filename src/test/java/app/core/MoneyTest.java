package app.core;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MoneyTest {

    @Test
    void testMultiplication() {
        Dollar five = new Dollar(5);
        Dollar product = five.times(2);
        System.out.println("current product state " +product.amount);
        assertEquals(10, product.amount);
        product=five.times(3);
        System.out.println("current product state " +product.amount);
        assertEquals(15,product.amount);
    }
}
