 // esercizio c
import java.io.*;
import java.util.Scanner;

public class stringhe_C 
{
    public static void main() {
        Scanner scanner = new Scanner(System.in);

        // controlla se un numero di telefono e valido
        System.out.println("Inserisci un numero di telefono: ");
        String stringa = scanner.nextLine();

        boolean c = true;

        for (int i = 0; i < stringa.length(); i++) {
            if (!Character.isDigit(stringa.charAt(i))) {
                c = false;
            }
        }

        if (c && stringa.charAt(0) == '3' && stringa.length() == 10)
            System.out.println("Numero di telefono valido");
        else
            System.out.println("Numero di telefono non valido");

        // controlla se un email e valida

        System.out.println("Inserisci un email: ");
        stringa = scanner.nextLine();

        if (stringa.indexOf("@") != -1)
            System.out.println("Email valido");
        else
            System.out.println("Email non valido");

        // controlla se un url e valido
        System.out.println("Inserisci un url: ");
        stringa = scanner.nextLine();

        if (stringa.indexOf("http://") != -1)
            System.out.println("url valido");
        else
            System.out.println("url non valido");

        // controlla se e un indirizzo ip valido
        System.out.println("inserisci un indirizzo ip: ");
        stringa = scanner.nextLine();

        String[] numeri = stringa.split("\\.");
        int[] numeri2 = new int[numeri.length];
        c = true;

        for (int i = 0; i < numeri.length; i++) {
            numeri2[i] = Integer.parseInt(numeri[i]);
            if ((numeri2[i] > 255 && numeri2[1] < 0) || i > 3)
                c = false;
        }

        if (c)
            System.out.println("indirizzo ip valido");
        else
            System.out.println("indirizzo ip non valido");

        // controlla se un codice fiscale e valido
        System.out.println("Inserisci un codice fiscale: ");
        stringa = scanner.nextLine();

        String lettere = stringa.substring(0, 7) + stringa.substring(9, 10) + stringa.substring(12, 13)
                + stringa.substring(16);

        String num = stringa.substring(7, 9) + stringa.substring(10, 12) + stringa.substring(13, 16);

        c = true;

        for (int i = 0; i < lettere.length(); i++)
            if (!Character.isLetter(lettere.charAt(i))) {
                c = false;
            }

        for (int i = 0; i < num.length(); i++)
            if (!Character.isDigit(num.charAt(i))) {
                c = false;
            }

        if (c && stringa.length() == 16)
            System.out.println("codice fiscale valido");
        else
            System.out.println("codice fiscale non valido");

        // controlla se un iban e valido

        System.out.println("Inserisci un iban: ");
        stringa = scanner.nextLine();

        c = true;

        if (stringa.length() != 27)
            c = false;
        if (stringa.substring(0, 3) != "IT")
            c = false;

        if (c)
            System.out.println("iban valido");
        else
            System.out.println("iban non valido");

        // controlla se un codice ISBN-13 e valido
        System.out.println("Inserisci un codice ISBN-13: ");
        stringa = scanner.nextLine();

        c = true;

        for (int i = 0; i < stringa.length(); i++)
            if (!Character.isDigit(stringa.charAt(i))) {
                c = false;
            }

        if (c && stringa.length() == 13)
            System.out.println("codice ISBN-13 valido");
        else
            System.out.println("codice ISBN-13 non valido");

        scanner.close();
   }
}