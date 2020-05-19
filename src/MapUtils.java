import java.util.HashMap;

public class MapUtils {

    public static void displayCountryInformation(String code, HashMap countries){
        System.out.println(countries.get(code));
    }
}
