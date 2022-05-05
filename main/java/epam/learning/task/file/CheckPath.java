package epam.learning.task.file;

import epam.learning.task.exceptions.ExceptionOfPath;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CheckPath {
    private List<String> list = new ArrayList<>();
    private Scanner scanner;

    public List<String> getElementFrom(Path path) throws ExceptionOfPath {
        try {
            scanner = new Scanner(path);
            while (scanner.hasNext()){
                list.add(scanner.next());
            }
        } catch (IOException e) {
            throw new ExceptionOfPath("Invalid path to resorce");
        }
        return list;
    }


}
