package OrientacaoAObjeto._1_CalculadoraSimples;


public class calculadorasimplesfunc {
    public String operacao;
    public int n1;
    public int n2;

    public int calculadora() {
        int resp=0;
        if (operacao.equalsIgnoreCase("somar")) {
            resp = (n1 + n2);

        } else if (operacao.equalsIgnoreCase("subtrair")) {
            resp = (n1 - n2);

        } else if (operacao.equalsIgnoreCase("multiplicar")) {
            resp = (n1 * n2);

        }
        if (operacao.equalsIgnoreCase("dividir")) {
            resp = (n1 / n2);
        }
        return  resp;
    }
}

