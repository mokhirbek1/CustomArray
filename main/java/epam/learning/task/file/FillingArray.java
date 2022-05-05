package epam.learning.task.file;

import java.util.ArrayList;
import java.util.List;

public class FillingArray {
    private ParsingToInt parsing = new ParsingToInt();

    public Integer[] fillFromResource() {
        int length = parsing.parseArrayToInteger().size();
        Integer[] array = new Integer[length];
        List<Integer> listFromResource = parsing.parseArrayToInteger();
        for (int i = 0; i < length; i++) {
            array[i] = listFromResource.get(i);
        }
        return array;
    }
}
