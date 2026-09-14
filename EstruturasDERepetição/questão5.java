package EstruturasDERepetição;

import java.util.Scanner;

public class questão5 {
    public static void main(String[] args) {
            Scanner entrada = new Scanner(System.in);
            int venda;
            float valor, total;
            String resposta;
            venda = 1;
            total = 0;
            System.out.println("A seguir insira o(s) valor(es) de vendas do Supermercado");
        do{
            System.out.print("Informe o valor do produto " + venda + " comprado: R$");
            valor = entrada.nextFloat();
            total = valor + total;
            venda++;
            System.out.println("Deseja informar o valor de mais um produto comprado do supermercado? (S/N)");
            resposta = entrada.next();
        } while (!resposta.equalsIgnoreCase("N"));
        System.out.println("O gasto com produtos do Supermercado será de R$" + total + ".");
    }   
}