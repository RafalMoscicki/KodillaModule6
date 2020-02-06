package com.kodilla.testing.collection;

import org.junit.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionTestSuite {

    private OddNumbersExterminator testee = new OddNumbersExterminator();

    @Before
    public void before() {
        System.out.println("test case: begin");
    }

    @After
    public void after() {
        System.out.println("test case: end");
    }

    @AfterClass
    public static void afterClass() {
        System.out.println("test suite: end");
    }

    @BeforeClass
    public static void beforeClass() {
        System.out.println("test suite: begin");
    }

    @Test
    public void testOddNumbersExterminator() {
        // given
        List<Integer> arrayList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        List<Integer> expected = Arrays.asList(1, 3, 5, 7, 9);

        // when
        ArrayList<Integer> result = testee.exterminate(arrayList);

        // then
        Assert.assertEquals(expected, result);
    }

    @Test
    public void testOddNumbersExterminatorEmptyList() {
        // given
        List<Integer> arrayList = Collections.emptyList();
        List<Integer> expected = Collections.emptyList();

        // when
        ArrayList<Integer> result = testee.exterminate(arrayList);

        // then
        Assert.assertEquals(expected, result);
    }

    @Test
    public void testOddNumbersExterminatorIfNull() {
        // given when
        ArrayList<Integer> result = testee.exterminate(null);

        // then
        Assert.assertNull(result);
    }

}
