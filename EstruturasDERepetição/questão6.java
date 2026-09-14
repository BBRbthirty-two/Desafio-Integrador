package EstruturasDERepetição;

import java.util.Scanner;

public class questão6 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int produto = 1; 
        String resposta;
        do {
            System.out.println("Registre o produto " + produto + ":");
            System.out.println("Produto " + produto + " foi registrado.");
            
            produto++; 
            System.out.println("Deseja informar o valor de mais uma venda? (S/N)");
            resposta = entrada.next();
        } while (!resposta.equalsIgnoreCase("N"));
    }
}

