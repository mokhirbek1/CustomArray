package epam.learning.task.finding;

import epam.learning.task.entity.CustomArray;
import epam.learning.task.exceptions.TaskException;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Min {
    public Integer findMin(CustomArray customArray) {
        Integer min = 0;
        List<Integer> integerList = Arrays.asList(customArray.getArray());
        min = integerList.stream().min(Comparator.comparing(Integer::valueOf)).get();
        return min;
    }
}
