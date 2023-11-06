import java.io.*;
import java.util.Scanner;

public class lista2 {
    public static void main(String[] args) throws IOException {

        String wartosc;
        int punkt;

        Scanner keyb = new Scanner(System.in);

        System.out.println("Ile pubnktow chcesz dodac do listy?: ");
        punkt = keyb.nextInt();

        keyb.nextLine();

        PrintWriter lista;
        lista = new PrintWriter("Lista.txt");

        for (int i = 1; i <= punkt; i++) {

            System.out.println("Dodaj do listy: " + "nr " + i + ": ");
            wartosc = keyb.nextLine();

            lista.println(wartosc);
        }
        
        lista.close();
        System.out.print("Sprawdz plika");
    }
}