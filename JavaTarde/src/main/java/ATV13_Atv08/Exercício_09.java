package ATV13_Atv08;

import java.util.Scanner;

public class Exercício_09 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Digite a quantidade de materiais: ");
        double m = sc.nextDouble();
        if (m>0) {
            System.out.println("impressão iniciada");
        }
        else {
            System.out.println("sem material disponível");
        }
    }
}
