package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyClassTest {

    @Test
    void test1() { // 1 -> 2 -> 3 -> 12
        assertEquals(MyClass.median(1, 2, 3), 2);
    }

    @Test
    void test2() { // 1 -> 2- > 4 -> 5 -> 12
        assertEquals(MyClass.median(1, 3, 2), 2);
    }

    @Test
    void test3() { // 1 -> 2 -> 4 -> 6 -> 12
        assertEquals(MyClass.median(3, 3, 2), 3);
    }

    @Test
    void test4() { // 1 -> 7 -> 8 -> 12
        assertEquals(MyClass.median(3, 2, 3), 3);
    }

    @Test
    void test5() { // 1 -> 7 -> 9 -> 10 -> 12
        assertEquals(MyClass.median(4, 2, 3), 3);
    }

    @Test
    void test6() { // 1 -> 7 -> 9 -> 11 -> 12
        assertEquals(MyClass.median(5, 4, 3), 4);
    }
}