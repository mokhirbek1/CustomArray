package epam.learning.task.create;

import epam.learning.task.entity.CustomArray;
import epam.learning.task.exceptions.TaskException;

import java.util.Random;

public class ArrayCreator {

    public CustomArray arrayCreator(CustomArray customArray) {
        int leftRange=customArray.getLeftRange();
        int rightRange=customArray.getRightRange();
        try {
            int value = 0;
            for (int i = 0; i < customArray.getLength(); i++) {
                value = new Random().nextInt(leftRange, rightRange);
                for (int j = 0; j < i; j++) {
                    if (customArray.getElement(j) != value) {
                        continue;
                    } else {
                        value = new Random().nextInt(leftRange, rightRange);
                        j = 0;
                    }
                }
                customArray.setElement(i, value);
            }
        } catch (TaskException e) {
            e.printStackTrace();
        }

        return customArray;
    }

}
