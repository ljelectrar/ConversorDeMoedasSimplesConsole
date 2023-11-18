import application.ConversorDeMoeda;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);


        System.out.println("Qual o preço do dollar?");
        double precoDoDollar = sc.nextDouble();
        System.out.println("Quantos dollars você vai comprar?");
        double montante = sc.nextDouble();
        double resultado = ConversorDeMoeda.dollarParaReal(montante, precoDoDollar);
        System.out.printf("Total: %.2f%n", resultado);

        sc.close();

    }
}