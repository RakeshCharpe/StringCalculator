package com.example.StringCalculator;

public class StringCalculator {

    public int Add(String numbers) {
        if (numbers.isEmpty()) return 0;

    // Support both comma and newline
    String[] parts = numbers.split("[,\n]");
    int sum = 0;
    for (String num : parts) {
        sum += Integer.parseInt(num);
    }
    return sum;

    }
}
