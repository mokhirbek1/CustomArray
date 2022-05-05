package epam.learning.task.create;

import epam.learning.task.entity.CustomArray;

import java.util.ArrayList;
import java.util.List;

public class FibonacciCreator {
    private List<Integer> numberFibonacci = new ArrayList<>();

    public List<Integer> creatingFibonacci(CustomArray customArray) {
        int range = customArray.getRightRange();
        int sum = 0;
        numberFibonacci.add(0);
        numberFibonacci.add(1);
        int i = 1;
        while (numberFibonacci.get(i) < range) {
            sum = 0;
            for (int j = i - 1; j <= i; j++) {
                sum += numberFibonacci.get(j);
            }
            numberFibonacci.add(sum);
            i++;
        }
        return numberFibonacci;
    }


}
