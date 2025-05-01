package beecrowd;

import java.io.IOException;
import java.util.Scanner;

public class Beecrowd1146 {
        public static void main(String[] args) throws IOException {
 
        /**
         * Escreva a sua solução aqui
         * Code your solution here
         * Escriba su solución aquí
         */
        Scanner scan = new Scanner(System.in);
        int x;
        do {
            x = scan.nextInt();
            String output = "";
            for (int i = 1; i <= x; i++) {
                if (i == 1) {
                    output += i;
                } else {
                    output += " " + i;
                }
            }
            System.out.print(output);
            if(x != 0) {
                System.out.print("\n");
            }
        } while (x != 0);
        scan.close();
    }
}
