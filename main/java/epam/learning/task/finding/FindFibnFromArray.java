package epam.learning.task.finding;

import epam.learning.task.create.FibonacciCreator;
import epam.learning.task.entity.CustomArray;

import java.util.ArrayList;
import java.util.List;

public class FindFibnFromArray {
    private FibonacciCreator creator = new FibonacciCreator();
    private List<Integer> listFibn = new ArrayList<>();
    private List<Integer> listCustomArray = new ArrayList<>();
    private List<Integer> listFibnArray = new ArrayList<>();

    public List<Integer> getFibnNumber(CustomArray customArray) {
        for (Integer value : customArray.getArray()) {
            listCustomArray.add(value);
        }
        listFibn = creator.creatingFibonacci(customArray);
        for (int i = 0; i < customArray.getLength(); i++) {
            for (int j = 0; j < listFibn.size(); j++) {
                if (listCustomArray.get(i) == listFibn.get(j)) {
                    listFibnArray.add(listFibn.get(j));
                }
            }
        }
        return listFibnArray;
    }
}
