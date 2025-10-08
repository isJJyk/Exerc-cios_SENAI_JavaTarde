package ATV13_Atv08;

import java.util.Scanner;

public class Exercício_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o peso das caixas: ");
        double arm = sc.nextDouble();
        if (arm>500) {
            System.out.println("peso excedido.");
        }
        else {
            System.out.println("peso dentro do limite");
        }

    }
}
