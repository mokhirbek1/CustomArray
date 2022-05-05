package epam.learning.task.sorting;

import epam.learning.task.entity.CustomArray;
import epam.learning.task.exceptions.TaskException;

public class InsertionSort {

    public CustomArray sort(CustomArray customArray) {
        int memory;
        try {
            for (int i = 1; i < customArray.getLength(); i++) {
                memory = customArray.getElement(i);
                int j = i;
                while (j > 0 && customArray.getElement(j - 1) > memory) {
                    int current = customArray.getElement(j - 1);
                    customArray.setElement(j, current);
                    j--;
                }
                customArray.setElement(j, memory);
            }
            customArray.setSorted(true);
        } catch (TaskException e) {
            System.out.println(e);
        }
        return customArray;
    }
}
