package com.example.StringCalculator;

public class StringCalculator {

    public int Add(String numbers) {
        if (numbers.isEmpty()) return 0;
        String delimiter = "[,\n]";
        if (numbers.startsWith("//")) {
            int delimiterEnd = numbers.indexOf("\n");
            delimiter = numbers.substring(2, delimiterEnd);
            numbers = numbers.substring(delimiterEnd + 1);
        }
    
        String[] parts = numbers.split(delimiter);
        int sum = 0;
        for (String num : parts) {
            sum += Integer.parseInt(num);
        }
        return sum;

    }
}
