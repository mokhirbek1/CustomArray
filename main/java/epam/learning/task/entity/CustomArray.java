package epam.learning.task.entity;

import epam.learning.task.exceptions.TaskException;

import java.util.Arrays;

public class CustomArray {
    private Integer[] array;
    private boolean sorted = false;
    private int rightRange;
    private int leftRange;

    public CustomArray(Integer n, int leftRange, int rightRange) {
        array = new Integer[n];
        this.leftRange = leftRange;
        this.rightRange = rightRange;
    }

    public CustomArray(Integer[] array) {
        this.array = array;
    }

    public Integer[] getArray() {
        return array;
    }

    public int getLength() {
        return array.length;
    }

    public int getElement(int i) throws TaskException {
        if (array.length > i && i >= 0) {
            return array[i];
        } else {
            throw new TaskException("Get invalid index");
        }
    }

    public int getLeftRange() {
        return leftRange;
    }

    public int getRightRange() {
        return rightRange;
    }

    public void setElement(int i, int value) throws TaskException {
        if (checkArray(i)) {
            array[i] = value;
        } else {
            throw new TaskException("invalid length!");
        }
    }

    public boolean isSorted() {
        return sorted;
    }

    public void setSorted(boolean sorted) {
        this.sorted = sorted;
    }


    public boolean checkArray(int i) {
        return array.length > i;
    }

    @Override
    public String toString() {
        final String GAP = " ";
        StringBuilder string = new StringBuilder();
        string.append("Array:\n");
        for (int i = 0; i < array.length; i++) {
            string.append(array[i] + GAP);
        }
        return string.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CustomArray that = (CustomArray) o;
        return Arrays.equals(array, that.array);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(array);
    }
}