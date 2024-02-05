package app.model;

import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileWriteService {


     public static String writeToFile(String strPath, String content) {
        try {
            Path path = Path.of(strPath);
            Files.createFile(path);
            Files.writeString(path, content);
        } catch (FileAlreadyExistsException e) {
            return "File already exists!";
        } catch (IOException e) {
            return "Something wrong " + e.getMessage();
        }
         return "Recorded in: " + strPath;
    }
}
