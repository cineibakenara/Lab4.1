import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.HashSet;
import java.io.File;
import java.io.FileNotFoundException;
public class Main {
    public static void main(String[] args) {
        try {
            File file = new File("D:\\Program Files\\aplicatii\\Java\\Lab4.1\\src\\numePrenume");
            Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] cuvainte=line.split(" ");
                System.out.println(line);

                for(String nume:)

            }

            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
            e.printStackTrace();
        }

    }
}
