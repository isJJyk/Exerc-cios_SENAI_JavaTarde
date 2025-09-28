package _01_estruturaSequencial;

import java.util.Scanner;

public class Exercício_05 {
    public static void main(String[] args) {
        int x, y, a, b;
        double z, c, k, w, j;
        Scanner sc = new Scanner(System.in);
        System.out.println("Qual o código da peça?");
        System.out.println();
        x = sc.nextInt();
        System.out.println();
        System.out.println("Quantas são?");
        y = sc.nextInt();
        System.out.println();
        System.out.println("Quanto custa uma unidade dessa peça?");
        w = sc.nextDouble();
        System.out.println();
        System.out.println("Qual o código da outra peça?");
        System.out.println();
        a = sc.nextInt();
        System.out.println();
        System.out.println("Quantas são?");
        b = sc.nextInt();
        System.out.println();
        System.out.println("Quanto custa uma unidade dessa peça?");
        System.out.println();
        j = sc.nextDouble();
        z = w * y;
        c = b * j;
        k = z + c;
        System.out.println("O valor total é: " + k);
        System.out.println("-----------------------------------");
        sc.close();


    }
}
