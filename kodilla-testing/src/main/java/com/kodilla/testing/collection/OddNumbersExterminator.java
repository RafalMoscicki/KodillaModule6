package com.kodilla.testing.collection;

import java.util.ArrayList;
import java.util.List;

public class OddNumbersExterminator {

    public ArrayList<Integer> exterminate(List<Integer> numbers) {
        if (numbers == null) {
            return null;
        }
        ArrayList<Integer> newArray = new ArrayList<>();
        int k = 0;
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) % 2 != 0) {
                newArray.add(k, numbers.get(i));
                k++;
            }
        }
        return newArray;
    }
}
