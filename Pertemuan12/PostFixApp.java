package Pertemuan12;

import java.io.IOException;
import java.util.Scanner;

public class PostFixApp {

    public static void main(String[] args) throws IOException {
        String input;
        int output;

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Masukkan ekspresi postfix (atau kosong untuk keluar): ");
            input = scanner.nextLine();

            if (input.equals("")) break;

            ParsePost aParser = new ParsePost(input); // perbaikan: nama class diawali huruf besar
            output = aParser.doParse(); // perbaikan: 'ouput' diganti menjadi 'output'
            System.out.println("Hasil Operasi: " + output);
        }

        scanner.close();
    }
}
