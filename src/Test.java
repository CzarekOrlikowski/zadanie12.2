import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) throws FileNotFoundException, InputMismatchException {

        Map<String, Country> countries = new HashMap<>();
        countries = ReadingUtils.createMap("dane.csv");
        String countryCode = "";

        try (Scanner scan = new Scanner(System.in)) {
            System.out.print("Podaj kod kraju z dostępnych " + countries.keySet() + ": ");
            countryCode = scan.nextLine();
        } catch (InputMismatchException e) {
            System.err.println("Niewłaściwe dane!");
        }
        MapUtils.displayCountryInformation(countryCode, (HashMap) countries);
    }
}
