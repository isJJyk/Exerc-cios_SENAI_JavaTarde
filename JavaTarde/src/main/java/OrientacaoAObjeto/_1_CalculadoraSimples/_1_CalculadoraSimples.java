package OrientacaoAObjeto._1_CalculadoraSimples;

import java.util.Scanner;

public class _1_CalculadoraSimples {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        calculadorasimplesfunc func = new calculadorasimplesfunc();
        System.out.println("Digite qual operação deseja:");
        System.out.println("* somar");
        System.out.println("* subtrair");
        System.out.println("* multiplicar");
        System.out.println("* dividir");
        func.operacao = sc.nextLine();
        System.out.print("Digite o primeiro número: ");
        func.n1=sc.nextInt();
        System.out.print("Digite o segundo número: ");

        func.n2 = sc.nextInt();

        System.out.println(func.calculadora());
        sc.close();
    }
}
