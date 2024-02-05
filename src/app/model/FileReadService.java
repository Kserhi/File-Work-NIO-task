package app.model;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileReadService {
    public static String readFromFile(String strPath) {
        try {
            return Files.readString(
                    Path.of(strPath));
        } catch (IOException e) {
            return "Something wrong " + e.getMessage();
        }
    }

}
