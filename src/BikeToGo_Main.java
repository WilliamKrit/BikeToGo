import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import com.fasterxml.jackson.core.FormatSchema;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectReader;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.module.SimpleModule;


public class BikeToGo_Main {
    static NewCustomer customer = new NewCustomer();
    static NewBike bike = new NewBike();

    static final File filepath2Customer = new File("C:\\Users\\William\\Projects\\Ausbildung\\AS\\BikeToGo\\Files\\Customers.txt");
    static final File filepath2Bike = new File("C:\\Users\\William\\Projects\\Ausbildung\\AS\\BikeToGo\\Files\\Bike.txt");
    static Scanner scanner = new Scanner(System.in);

    // create the mapper
    static ObjectMapper mapper = new ObjectMapper();

    static void usage(){
        System.out.println("Hallo!");
        System.out.println("Willkommen in BikeToGo");
        System.out.println("1. um ein neuer Kunde zu registrieren ");
        System.out.println("2. um ein neues Fahrrad zu registrieren");
        System.out.println("3. um existierende Fahrräder anzuzeigen ");
        System.out.println("4. um existierende Kunde anzuzeigen");
    }

    static File checkFile( File filepath ){
        try {
            if (filepath.createNewFile()) {
                System.out.println("File created: " + filepath.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        return filepath;
    }

    /** static File printJakson(File filepath) throws IOException{
        TypeReference<HashMap<String, String>> typeRef
                = new TypeReference<HashMap<String, String>>() {};
        Map<String, String> map = mapper.readValue(filepath, typeRef);


    } **/


    public static void main(String[] args) throws IOException {
        File filepath = null;

        // enable pretty printing
        mapper.enable(SerializationFeature.INDENT_OUTPUT);
        TypeReference<HashMap<String, String>> typeRef;
        typeRef = new TypeReference<HashMap<String, String>>() {};

        Map<String, String> map;

        usage();
        int input = scanner.nextInt();
        switch (input) {
            case 1:
                // serialize the object
                mapper.writeValue(filepath2Customer, customer);
                break;

            case 2:
                // serialize the object
                mapper.writeValue(filepath2Bike, bike);
                break;

            case 3:
                // get the entries from the jackson file "Customers.txt"
                map = mapper.readValue(filepath2Bike, typeRef);
                System.out.println(map);
                break;

            case 4:
                // get the entries from the jackson file "Bike.txt"
                map = mapper.readValue(filepath2Customer, typeRef);
                System.out.println(map);
                break;

            default:
                System.out.println("Bitte eine gültige Option auswählen");
                usage();

        }
        checkFile(filepath);






    }
}
