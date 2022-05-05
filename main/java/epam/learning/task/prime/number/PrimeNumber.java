package epam.learning.task.prime.number;

import epam.learning.task.entity.CustomArray;
import epam.learning.task.exceptions.TaskException;

public class PrimeNumber {

    public Integer[] number(CustomArray customArray) {
        Integer[] primeNumber = new Integer[customArray.getLength()];
        int k = 0;
        try {
            for (int i = 0; i < customArray.getLength(); i++) {
                for (int j = 2; j < 10; j++) {
                    if (customArray.getElement(i) % j != 0) {
                        if (j == 9 && customArray.getElement(i) != 3) {
                            primeNumber[k] = customArray.getElement(i);
                            k++;
                        }
                    } else {
                        break;
                    }
                }
            }
        } catch (TaskException e) {
            System.out.println(e);
        }

        return primeNumber;
    }
}
