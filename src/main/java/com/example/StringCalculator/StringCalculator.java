package com.example.StringCalculator;

import java.util.ArrayList;
import java.util.List;

public class StringCalculator {

    public int Add(String numbers) {
        if (numbers.isEmpty())
            return 0;
        
            
        String delimiter = "[,\n]";
    if (numbers.startsWith("//")) {
        int delimiterEnd = numbers.indexOf("\n");
        delimiter = numbers.substring(2, delimiterEnd);
        numbers = numbers.substring(delimiterEnd + 1);
    }

    String[] parts = numbers.split(delimiter);
    List<Integer> negatives = new ArrayList<>();
    int sum = 0;

    for (String num : parts) {
        if (num.isEmpty()) continue;
        int n = Integer.parseInt(num);
        if (n < 0) {
            negatives.add(n);
        }
        sum += n;
    }

    if (!negatives.isEmpty()) {
        throw new IllegalArgumentException(
            "negatives not allowed: " + negatives.toString().replaceAll("[\\[\\] ]", "")
        );
    }

    return sum;
    }
}
