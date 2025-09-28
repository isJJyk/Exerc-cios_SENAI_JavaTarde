package _01_estruturaSequencial;

import java.util.Scanner;

public class Exercício_06 {
    public static void main(String[] args) {
        double A, B, C, a, b, c, d, e, pi;
        Scanner sc = new Scanner(System.in);
        System.out.println("Qual o valor da medida A? ");
        A = sc.nextDouble();
        System.out.println();
        System.out.println("Qual o valor da medida B? ");
        B = sc.nextDouble();
        System.out.println();
        System.out.println("Qual o valor da medida C? ");
        C = sc.nextDouble();
        System.out.println();
        pi = 3.14159;
        a = (A*C)/2;
        b = pi*(C*C);
        c = ((A+B)*C)/2;
        d = B*B;
        e = A*B;
        System.out.printf("A área do triângulo é: "+ a);
        System.out.println();
        System.out.printf("A área do círculo é: "+ b);
        System.out.println();
        System.out.printf("A área do trapézio é: "+ c);
        System.out.println();
        System.out.printf("A área do quadrado é: "+ d);
        System.out.println();
        System.out.printf("A área do retângulo é: "+ e);
        System.out.println();
        System.out.println("----------------------------------");
        sc.close();


    }
}
