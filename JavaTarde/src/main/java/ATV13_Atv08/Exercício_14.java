package ATV13_Atv08;

import java.util.Scanner;

public class Exercício_14 {
    public static void main(String[] args) {
        double p;
        Scanner sc = new Scanner(System.in);
        System.out.println("Qual o numero de peças montadas?");
        p = sc.nextDouble();
        if (p == 0)  {
            System.out.println("Erro verificar robô");
        }
        else {
            System.out.println("Montagem em andamento");
        }
    }
}
