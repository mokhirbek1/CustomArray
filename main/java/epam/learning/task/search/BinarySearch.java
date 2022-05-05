package epam.learning.task.search;

import epam.learning.task.entity.CustomArray;
import epam.learning.task.exceptions.TaskException;
import java.util.Arrays;
import java.util.Optional;

public class BinarySearch {
    public Integer binarySearch(CustomArray customArray, int searchValue) throws TaskException {
        int result = 0;
        Integer[] array = customArray.getArray();
        if (customArray.isSorted()) {
            result = Arrays.binarySearch(array, searchValue);
            if (result<0){
                result=-1;
                System.out.println("Value didn't found!");
            }
        } else {
            throw new TaskException("Array isn't sorted!");
        }
        return result;
    }

}
