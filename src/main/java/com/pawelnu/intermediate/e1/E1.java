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
        List<String> list =
                List.of("as", "As", "as as", "As as", "as.as", "As.as", "as,as", "As,as");

        System.out.println(calculateAvgStringLength(list));
        calculateAvgStringLengthStream(list);
    }

    private static Double calculateAvgStringLength(List<String> list) {
        List<Integer> newList = new ArrayList<>();
        for (String string : list) {
            if (!string.contains(" ") && string.compareTo(string.toLowerCase()) == 0) {
                newList.add(E1.calculateStringLength(string));
            }
        }

        return calculateAvg(newList);
    }

    private static void calculateAvgStringLengthStream(List<String> list) {
        list.stream()
                .filter(s -> !s.contains(" "))
                .filter(s -> s.compareTo(s.toLowerCase()) == 0)
                .map(s -> s.replaceAll("\\.", "").replaceAll(",", ""))
                .mapToInt(i -> i.length())
                .average()
                .ifPresentOrElse(
                        r -> System.out.println(r), () -> System.out.println("Nie ma średniej"));
    }

    private static Integer calculateStringLength(String s) {
        return s.replaceAll("\\.", "").replaceAll(",", "").length();
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
