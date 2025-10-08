package ATV13_Atv08;

import java.util.Scanner;

public class Exercício_15 {
    public static void main(String[] args) {
        double pa;
        Scanner sc = new Scanner(System.in);
        System.out.println("Qual a porcentagem de peças aprovadas?");
        pa = sc.nextDouble();
        if (pa>=90) {
            System.out.println("Qualidade aceitável");
        }
        else {
            System.out.println("Qualidade abaixo do padrão");
        }
    }
}
