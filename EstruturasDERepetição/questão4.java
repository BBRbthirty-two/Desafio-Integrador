package EstruturasDERepetição;
import java.util.Scanner;

public class questão4 {
        public static void main(String[] args) {
            Scanner entrada = new Scanner(System.in);
            int avaliacao , clientes = 0;
            while (clientes <= 10) {
                clientes++;
                System.out.println("Cliente " + clientes + ", qual a sua avaliação?");
                avaliacao = entrada.nextInt();
            }
            System.out.println("A quantidade de clientes que respondeu a pesquisa é: " + clientes);
        }
}
