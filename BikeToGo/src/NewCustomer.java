import java.util.Scanner;

public class NewCustomer {

    static Scanner scanner = new Scanner(System.in);
    private int id;
    private String vorname;
    private String name;
    private String birthDate;
    private char verification;

    public int getId() {

        System.out.println("Bitte neue kundennummer angeben (Beispiel: 001): ");
        id = scanner.nextInt();
        return id;
    }

    public void setId(int id) {

        this.id = id;
    }

    public String getVorname() {

        System.out.println("Bitte Vorname angeben: ");
        vorname = scanner.next();
        return name;
    }

    public void setVorname(String vorname) {

        this.vorname = vorname;
    }

    public String getName() {

        System.out.println("Bitte Nachname angeben: ");
        name = scanner.next();
        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public String getBDate() {

        System.out.println("Bitte den Geburtsdatum angeben (Beispiel: 01/01/2000): ");
        birthDate = scanner.next();
        return birthDate;
    }

    public void setBDate(String birthDate) {

        this.birthDate = birthDate;
    }

    public char getProof() {

        System.out.println("Hat der Kunde ein Nachweis abgegeben[y/n]: ");
        verification = scanner.next().charAt(0);
        return verification;
    }

    public void setProof(char verification) {

        this.verification = verification;
    }


    public String toString() {

        return String
                .format("Customer: [id: %s, vorname: %s, name: %s, birthDate: %s, Verification: %s]",
                        id, vorname, name, birthDate, verification);
    }

}
