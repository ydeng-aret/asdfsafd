import java.io.File;
import java.io.IOException;

public class createFile {
    public static void main(String[] args) {
        File file = new File("myReadings.txt");
        try {
            if (file.createNewFile()) {
                System.out.println("Created: " + file.getAbsolutePath());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("Could not create the file.");
        }
    }
}