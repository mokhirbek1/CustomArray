package epam.learning.task.main;

import epam.learning.task.action.Action;
import epam.learning.task.entity.CustomArray;

public class MainCustomArray {
    public static void main(String[] args) {
        int result = 0;
        CustomArray customArray = new CustomArray(40, 1, 200);
        Action actionCustomArray = new Action(customArray);
        actionCustomArray.createCustomArray();
        actionCustomArray.selectionSorting();
//        result = actionCustomArray.binarySearch(34);
//        System.out.println(result);
//        System.out.println(customArray);
//        System.out.println("Min: "+actionCustomArray.findMin()+"  Max: "+actionCustomArray.findMax());
//        System.out.println("Primer numbers is "+actionCustomArray.findPrimeNumber());
//        System.out.println(actionCustomArray.findFibnNumber());
//        System.out.print(actionCustomArray.findThreeDigitNum());

    }
}
