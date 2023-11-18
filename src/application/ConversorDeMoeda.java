package application;

public class ConversorDeMoeda {

    public static double IOF = 0.06;

    public static double dollarParaReal(double montante ,double precoDollar){
        return montante * precoDollar * (1.0 + IOF);
    }
}
