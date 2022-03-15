package es.manu;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String textico;
        int numA = 0, numE = 0, numU = 0, numI = 0, numO = 0;
        Scanner entrada = new Scanner(System.in);

        System.out.print("Dame un texto: ");
        textico = entrada.nextLine();

        for (int i = 0; i < textico.length(); i++){
            switch (textico.toLowerCase().charAt(i)) {
                case 'a':
                case 'á':
                    numA++;
                    break;
                case 'e':
                case 'é':
                    numE++;
                    break;
                case 'i':
                case 'í':
                    numI++;
                    break;
                case 'o':
                case 'ó':
                    numO++;
                    break;
                case 'u':
                case 'ú':
                    numU++;
                    break;
            }
        }

        System.out.println("Estadísticas: ");
        System.out.println("- Numero de a: " + numA);
        System.out.println("- Numero de e: " + numE);
        System.out.println("- Numero de u: " + numU);
        System.out.println("- Numero de i: " + numI);
        System.out.println("- Numero de o: " + numO);
    }
}
