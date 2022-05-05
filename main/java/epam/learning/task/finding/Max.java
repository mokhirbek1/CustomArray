package epam.learning.task.finding;

import epam.learning.task.entity.CustomArray;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Max {
    public Integer findMax(CustomArray customArray) {
        Integer max = 0;
        List<Integer> integerList = Arrays.asList(customArray.getArray());
        max = integerList.stream().max(Comparator.comparing(Integer::valueOf)).get();
        return max;
    }
}
