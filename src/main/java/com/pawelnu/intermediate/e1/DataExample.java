package com.pawelnu.intermediate.e1;

import java.util.List;

public class DataExample {
    public static List<String> getStringListWithAllCombinations() {
        return List.of("as", "As", "as as", "As as", "as.as", "As.as", "as,as", "As,as");
    }

    public static List<String> getStringListWithEmptyString() {
        return List.of("");
    }

}
