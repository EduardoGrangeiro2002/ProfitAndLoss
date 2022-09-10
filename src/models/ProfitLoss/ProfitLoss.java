package models.ProfitLoss;

import java.util.Arrays;
import java.util.Scanner;

public class ProfitLoss {
    public static void main(String[] args) {
        double[] valueMonths = new double[12];
        double[] valueLossMonths = new double[12];
        String[] months = {"Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};
        int numberMonth = 0;
        Scanner sc = new Scanner(System.in);


        for (int i = 0; i < valueMonths.length; i++) {
            numberMonth++;
            System.out.println("Digite seu faturamento do mes: "  + numberMonth);
            valueMonths[i] = sc.nextDouble();

            System.out.println("Digite seus gastos do mes: " + numberMonth);
            valueLossMonths[i] = sc.nextDouble();
        }

        double[] profiLoss = calcProfitLoss(valueMonths, valueLossMonths);

        getMessageProfitLoss(profiLoss, months);
    }
    public static double[] calcProfitLoss(double[] valueMonths, double[] valueLossMonths) {
        double[] profitLoss = new double[12];

        for (int i = 0; i < profitLoss.length; i++) {
            profitLoss[i] = valueMonths[i] - valueLossMonths[i];
        }
        return profitLoss;
    }


    public static void getMessageProfitLoss(double[] profitLoss, String[] months) {
        for (int i = 0; i < months.length; i++) {
            if(profitLoss[i] < 0) {
                System.out.println("Você obteve um prejuizo em " + months[i] + "\n no valor de: " + profitLoss[i]);
            }

            if(profitLoss[i] > 0) {
                System.out.println("Você obteve um lucro em " + months[i] + "\n no valor de: " + profitLoss[i]);
            }

            if(profitLoss[i] == 0) {
                System.out.println("Você não obteve nem lucro nem prejuizo em " + months[i] + "\n Saldo: " + profitLoss[i]);
            }
        }
    }
}


