import java.io.*;

public class FileManager {

    // путь к файлу
    private String pathToFileBegin;
    private String pathToFileExist;

    private FileReader fileReader;
    private FileWriter fileWriter;
    private BufferedWriter bufferedWriter;
    private BufferedReader bufferedReader;
    // конструктор, который принимает пути
    public FileManager (String pathToFileBegin, String pathToFileExist){
        this.pathToFileBegin = pathToFileBegin;
        this.pathToFileExist = pathToFileExist;
    }

    public String getPathToFileBegin() {
        return pathToFileBegin;
    }

    public void setPathToFileBegin(String pathToFileBegin) {
        this.pathToFileBegin = pathToFileBegin;
    }

    public String getPathToFileExist() {
        return pathToFileExist;
    }

    public void setPathToFileExist(String pathToFileExist) {
        this.pathToFileExist = pathToFileExist;
    }




}
