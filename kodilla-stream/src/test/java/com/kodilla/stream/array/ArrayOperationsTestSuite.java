package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;

public class ArrayOperationsTestSuite {
    @Test
    public void testGetAverage1() {
        // Given
        int [] array = {1,2,3,4,5,6};

        // When
        double actual = ArrayOperations.getAverage(array);

        // Then
        Assert.assertEquals(3.5, actual, 0);
    }

    @Test
    public void testGetAverageWhenEmpty() {
        // Given
        int [] array = {};

        // When
        double actual = ArrayOperations.getAverage(array);

        // Then
        Assert.assertEquals(0, actual, 0);
    }

    @Test
    public void testGetAverageWhenNull() {
        // Given

        // When
        double actual = ArrayOperations.getAverage(null);

        // Then
        Assert.assertEquals(0, actual, 0);
    }
}
