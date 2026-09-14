import java.util.Scanner;
public class DESAFIOINTEGRADOR {
    public static void main(String[] args) {
            Scanner entrada = new Scanner(System.in);
            int venda;
            float valor, total;
            String resposta;
            venda = 1;
            total = 0;
        do{
            System.out.print("Informe o valor da venda " + venda + ": R$");
            valor = entrada.nextFloat();
            total = valor + total;
            venda++;
            System.out.println("Deseja informar o valor de mais uma venda? (S/N)");
            resposta = entrada.next();
        } while (!resposta.equalsIgnoreCase("N"));
        System.out.println("O faturamento total será de R$" + total + ".");
        System.out.println("No total foram " + (venda - 1) + " vendas.");
    }   
}



