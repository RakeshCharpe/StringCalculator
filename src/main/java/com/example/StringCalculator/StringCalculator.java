package com.example.StringCalculator;

public class StringCalculator {

    public int Add(String numbers) {
        if (numbers.isEmpty()) return 0;

    if (numbers.contains(",")) {
        String[] parts = numbers.split(",");
        int sum = 0;
        for (String num : parts) {
            sum += Integer.parseInt(num);
        }
        return sum;
    }

    return Integer.parseInt(numbers);
    }
}
