package EstruturasDERepetição;
import java.util.Scanner;

public class questão3 {
    public static void main(String[] args) {
            Scanner entrada = new Scanner(System.in);
        float valor, valorVenda;
        valorVenda = 0;
        for(int venda=1;venda<=5;venda++){
            System.out.print("Informe o valor da venda " + venda + ":");
            valor = entrada.nextFloat();
            valorVenda = valor + valorVenda;
            ;
        }
        System.out.println("O faturamento total do dia será de R$" + valorVenda + ".");

    }
}
