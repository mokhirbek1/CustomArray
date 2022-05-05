package epam.learning.task.sorting;

import epam.learning.task.entity.CustomArray;
import epam.learning.task.exceptions.TaskException;

public class SelectionSort {

    public CustomArray sort(CustomArray customArray) {
        int memory;
        try {
            for (int i = 0; i < customArray.getLength(); i++) {
                int minValue = customArray.getElement(i);
                int minIndex = i;
                for (int j = i + 1; j < customArray.getLength(); j++) {
                    if (minValue > customArray.getElement(j)) {
                        minValue = customArray.getElement(j);
                        minIndex = j;
                    }
                }
                if (minIndex != i) {
                    memory = customArray.getElement(i);
                    customArray.setElement(i, minValue);
                    customArray.setElement(minIndex, memory);
                }
            }
            customArray.setSorted(true);
        } catch (TaskException e) {
            System.out.println(e);
        }
        return customArray;
    }
}
