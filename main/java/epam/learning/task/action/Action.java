package epam.learning.task.action;

import epam.learning.task.create.ArrayCreator;
import epam.learning.task.create.ThreeDigitNumbers;
import epam.learning.task.entity.CustomArray;
import epam.learning.task.exceptions.TaskException;
import epam.learning.task.file.FillingArray;
import epam.learning.task.finding.FindFibnFromArray;
import epam.learning.task.finding.Max;
import epam.learning.task.finding.Min;
import epam.learning.task.prime.number.PrimeNumber;
import epam.learning.task.search.BinarySearch;
import epam.learning.task.sorting.BubbleSort;
import epam.learning.task.sorting.InsertionSort;
import epam.learning.task.sorting.SelectionSort;

public class Action {
    private ArrayCreator creator = new ArrayCreator();
    private CustomArray customArray;
    private BubbleSort bubbleSort = new BubbleSort();
    private InsertionSort insertionSort = new InsertionSort();
    private SelectionSort selectionSort = new SelectionSort();
    private BinarySearch search = new BinarySearch();
    private PrimeNumber primeNumber = new PrimeNumber();
    private FindFibnFromArray findFibn = new FindFibnFromArray();
    private FillingArray fillingArray = new FillingArray();
    ThreeDigitNumbers getThreeDigit = new ThreeDigitNumbers();
    private Max max = new Max();
    private Min min = new Min();

    public Action(CustomArray customArray) {
        this.customArray = customArray;
    }

    public CustomArray createCustomArray() {
        return creator.arrayCreator(customArray);
    }

    public CustomArray bubbleSorting() {
        return bubbleSort.sort(customArray);
    }

    public CustomArray insertionSorting() {
        return insertionSort.sort(customArray);
    }

    public CustomArray selectionSorting() {
        return selectionSort.sort(customArray);
    }

    public int binarySearch(int searchValue) {
        int result = 0;
        try {
            result = search.binarySearch(customArray, searchValue);
        } catch (TaskException e) {
            e.printStackTrace();
        }
        return result;
    }

    public Integer findMin() {
        return min.findMin(customArray);
    }

    public Integer findMax() {
        return max.findMax(customArray);
    }

    public List<Integer> findFibnNumber() {
        return findFibn.getFibnNumber(customArray);
    }

    public String findThreeDigitNum() {
        return getThreeDigit.numbers();
    }

    public List<Integer> findPrimeNumber() {
        List<Integer> list = new ArrayList<>();
        for (Integer value : primeNumber.number(customArray)) {
            if (value != null) {
                list.add(value);
            }
        }
        return list;
    }

    public Integer[] arrayFromResource(){
        return fillingArray.fillFromResource();
    }

}
