package com.pawelnu.intermediate.e1;

import java.util.ArrayList;
import java.util.List;

public class E1 {
    /*
    Create a list of strings (any 10 strings) and write a program
     which displays the average length of the strings
     do not contain spaces or capital letters when removed from strings
     dots and commas.
    */
    public static void main(String[] args) {
        List<String> list = DataExample.getStringListWithAllCombinations();
        System.out.println(calculateAvgStringLength(list));
        System.out.println(calculateAvgStringLengthStream(list));

        List<String> list2 = DataExample.getStringListWithEmptyString();
        System.out.println(calculateAvgStringLength(list2));
        System.out.println(calculateAvgStringLengthStream(list2));
    }

    public static Double calculateAvgStringLength(List<String> list) {
        List<Integer> newList = new ArrayList<>();
        for (String string : list) {
            if (!string.contains(" ") && string.compareTo(string.toLowerCase()) == 0) {
                newList.add(E1.replaceAllDotsAndCommas(string).length());
            }
        }

        return calculateAvg(newList);
    }

    public static Double calculateAvgStringLengthStream(List<String> list) {
        return list.stream()
                .filter(s -> !s.contains(" "))
                .filter(s -> s.compareTo(s.toLowerCase()) == 0)
                .map(s -> replaceAllDotsAndCommas(s))
                .mapToInt(i -> i.length())
                .average()
                .orElse(0.0);
    }

    private static String replaceAllDotsAndCommas(String s) {
        return s.replaceAll("\\.", "").replaceAll(",", "");
    }

    private static Double calculateAvg(List<Integer> list) {
        if (list.isEmpty()) {
            return 0.0;
        }

        Integer sum = 0;
        for (Integer value : list) {
            sum += value;
        }

        return ((double) sum) / list.size();
    }
}
