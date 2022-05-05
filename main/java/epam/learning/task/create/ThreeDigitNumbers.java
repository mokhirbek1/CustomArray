package epam.learning.task.create;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringJoiner;

public class ThreeDigitNumbers {
    private List<Integer> listNumber = new ArrayList<>();
    private StringJoiner stringJoiner = new StringJoiner(" ");

    public String numbers() {
        int key = 0;
        for (int i = 1; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                for (int k = 0; k < 10; k++) {
                    if (i != j && i != k && j != k) {
                        listNumber.add(i * 100 + j * 10 + k);
                        stringJoiner.add(listNumber.get(key).toString());
                        key++;
                    }
                }
                stringJoiner.add("\n");
            }
        }
        return stringJoiner.toString();
    }
}
