import javax.swing.*;
import java.util.Scanner;

public class NewBike {
    static Scanner scanner = new Scanner(System.in);
    private int id;
    private String model;
    private String price;
    private String size;
    private char verification;

    public int getId() {

        System.out.println("Bitte die Seriennummer hinzufügen (Beispiel: 001): ");
        id = scanner.nextInt();
        return id;
    }

    public void setId(int id) {

        this.id = id;
    }

    public String getModel() {

        System.out.println("Bitte die Modell angeben ");
        model = scanner.next();
        return model;
    }

    public void setModel(String vorname) {

        this.model = vorname;
    }

    public String getPrice() {

        System.out.println("Was soll die höhe die stündliche Miete sein? ");
        price = scanner.next();
        return price;
    }

    public void setPreis(String name) {

        this.price = name;
    }

    public String getSize() {

        System.out.println("Welche grüße hat das Fahrrad? ");
        System.out.println("Die Möglichkeiten sind: groß, Medium und klein");
        size = scanner.next();

        return size;

    }

    public void setSize(String birthDate) {

        this.size = birthDate;
    }

    public String toString() {

        return String
                .format("Bike: id: %s, model: %s, price: %s, size: %s]",
                        id, model, price, size);
    }

}
