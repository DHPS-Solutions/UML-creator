package main;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileHandler {

    private final String DIRECTORY;

    public FileHandler(String DIRECTORY) {
        this.DIRECTORY = DIRECTORY;
    }

    public String[] findFiles() {
        // basically a file that contains all files in given directory?
        File dir = new File(DIRECTORY);

        return dir.list(); // contains the names (String) of all files in dir
    }

    public String readFile(String filename) {
        // could convert to StringBuilder, not sure what the benefits would be
        String text = "";
        try {
            File f = new File(DIRECTORY + "\\" + filename);
            Scanner reader = new Scanner(f);

            while (reader.hasNextLine()) {
                text += reader.nextLine();
            }
            reader.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        return text;
    }

}
