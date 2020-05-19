import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ReadingUtils {

    public static Map createMap(String fileName) throws FileNotFoundException {
        File file = new File(fileName);
        Map <String, Country> countries = new HashMap<>();
        int i = 0;

        try (Scanner scan = new Scanner(file)) {
            while (scan.hasNextLine()) {
                String line = scan.nextLine();
                String[] data = line.split(";");
                String code = data[0];
                String name = data[1];
                int population = Integer.parseInt(data[2]);
                countries.putIfAbsent(code, new Country(code, name, population));
                i++;
            }

        } catch (FileNotFoundException e) {
            System.err.println("Brak pliku!");
        }
        return countries;
    }
}
