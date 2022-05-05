package epam.learning.task.sorting;

import epam.learning.task.entity.CustomArray;
import epam.learning.task.exceptions.TaskException;

public class BubbleSort {

    public CustomArray sort(CustomArray customArray) {
        int memory;
        try {
            for (int i = customArray.getLength() - 1; i > 0; i--) {
                for (int j = 0; j < i; j++) {
                    if (customArray.getElement(j) > customArray.getElement(j + 1)) {
                        memory = customArray.getElement(j);
                        customArray.setElement(j, customArray.getElement(j + 1));
                        customArray.setElement(j + 1, memory);
                    }
                }
            }
            customArray.setSorted(true);
        } catch (TaskException e) {
            System.out.println(e+"\nBubbleSorting catched Exception!");
        }
        return customArray;
    }
}
