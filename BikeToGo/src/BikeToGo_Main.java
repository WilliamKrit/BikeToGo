import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;


public class BikeToGo_Main {
    static NewCustomer customer = new NewCustomer();
    static final File filepath = new File("C:\\Users\\William\\Projects\\Ausbildung\\AS\\BikeToGo\\Files");


    public static void main(String[] args) throws IOException {
        // Make sure that the file does not exist
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

        // create the mapper
        ObjectMapper mapper = new ObjectMapper();

        // enable pretty printing
        mapper.enable(SerializationFeature.INDENT_OUTPUT);


        // serialize the object



        
        mapper.writeValue(filepath, customer);
    }
}
