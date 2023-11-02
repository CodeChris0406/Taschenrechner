import java.util.Scanner;

public class Main {

    // Hauptmethode, die beim Start des Programms ausgeführt wird
    public static void main(String[] args) {
        // Erstellen eines Scanner-Objekts zum Einlesen von Benutzereingaben
        Scanner scanner = new Scanner(System.in);

        // Hauptmenü-Schleife
        while (true) {
            // Ausgabe der verfügbaren Optionen
            System.out.println("Optionen:");
            System.out.println("1 - Addieren");
            System.out.println("2 - Subtrahieren");
            System.out.println("3 - Multiplizieren");
            System.out.println("4 - Teilen");
            System.out.println("5 - Beenden");

            // Einlesen der Benutzerauswahl
            int userChoice = scanner.nextInt();

            // Überprüfung, ob der Benutzer das Programm beenden möchte
            if (userChoice == 5) {
                break;
            }

            // Einlesen der beiden Zahlen
            System.out.print("Erste Zahl: ");
            double num1 = scanner.nextDouble();

            System.out.print("Zweite Zahl: ");
            double num2 = scanner.nextDouble();

            // Verarbeitung der Benutzerauswahl mittels switch-case
            switch (userChoice) {
                case 1:
                    System.out.println("Ergebnis: " + add(num1, num2));
                    break;
                case 2:
                    System.out.println("Ergebnis: " + subtract(num1, num2));
                    break;
                case 3:
                    System.out.println("Ergebnis: " + multiply(num1, num2));
                    break;
                case 4:
                    if (num2 != 0) {
                        System.out.println("Ergebnis: " + divide(num1, num2));
                    } else {
                        System.out.println("Teilung durch Null ist nicht erlaubt!");
                    }
                    break;
                default:
                    System.out.println("Ungültige Eingabe.");
            }
        }

        // Schließen des Scanner-Objekts
        scanner.close();
    }

    // Methode zum Addieren von zwei Zahlen
    public static double add(double a, double b) {
        return a + b;
    }

    // Methode zum Subtrahieren von zwei Zahlen
    public static double subtract(double a, double b) {
        return a - b;
    }

    // Methode zum Multiplizieren von zwei Zahlen
    public static double multiply(double a, double b) {
        return a * b;
    }

    // Methode zum Teilen von zwei Zahlen
    public static double divide(double a, double b) {
        return a / b;
    }
}
