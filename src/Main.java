import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        GetMap getMap = new GetMap();
        String countryCode= getMap.userInteraction();
        System.out.println(getMap.getMapFromFile("country.csv").get(countryCode));
    }
}
