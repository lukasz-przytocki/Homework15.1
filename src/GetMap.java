import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class GetMap {

    Map<String, Country> getMapFromFile(String fileName) throws FileNotFoundException {
        Scanner scan = new Scanner(new File(fileName));
        HashMap<String, Country> countryMap = new HashMap<>();
        String[] line=null;
        while (scan.hasNextLine()) {
            line = scan.nextLine().split(";");
            countryMap.put(countryFiller(line).getCountryCode(), countryFiller(line));
        }
        return countryMap;
    }

    private Country countryFiller(String[] line){
        Country country = new Country(line[0],line[1],Integer.valueOf(line[2]));
        return country;
        }

    String userInteraction(){
        System.out.println("Podaj kod kraju, o którym chcesz zobaczyć informacje: ");
        System.out.println("Do wyboru: PL AF MX FO ZW");
        String userSelection;
        Scanner scanner = new Scanner(System.in);
        userSelection = scanner.nextLine();
        return userSelection;
    }
 }



