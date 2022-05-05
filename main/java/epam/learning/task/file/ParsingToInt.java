package epam.learning.task.file;

import epam.learning.task.exceptions.ExceptionOfPath;

import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class ParsingToInt {
    private CheckPath checkPath = new CheckPath();
    private List<String> elementList = new ArrayList<>();
    private List<Integer> elementsOfArray = new ArrayList<>();
    private int memory = 0;
    private String sumCharElements;

    public List<Integer> parseArrayToInteger() {
        Path path = Path.of("C:\\Users\\Moxirbek\\IdeaProjects\\task\\src\\main\\java\\epam\\learning\\task\\file\\resource\\numbers");
        try {
            elementList = checkPath.getElementFrom(path);
            for (String value : elementList) {
                char[] charElement = value.toCharArray();
                sumCharElements = "";
                for (int i = 0; i < charElement.length; i++) {
                    memory = charElement[i];
                    if (memory >= 48 && charElement[i] <= 57) {
                        sumCharElements += charElement[i];
                    }
                }
                if (!sumCharElements.isEmpty()) {
                    elementsOfArray.add(Integer.valueOf(sumCharElements));
                }
            }
        } catch (ExceptionOfPath e) {
            e.printStackTrace();
        }
        return elementsOfArray;
    }
}
