import java.util.HashMap;
import java.util.Map;

public class MapUtils {

    public static void displayCountryInformation(String code, Map<String, Country> countries){
        System.out.println(countries.get(code));
    }
}
