import java.util.Locale;
import java.util.Scanner;

public class PROJETOINTEGRADOR {
    public static void main(String[] args) throws Exception {
    Scanner entrada = new Scanner(System.in).useLocale(Locale.US);
    int idade, filho, tempoMes;
    String nome, veiculo, homeOffice, PLR;
    float salario;

    System.out.print("Informe o seu nome: ");
        nome = entrada.next();

    System.out.print("Informe o sua idade: ");
        idade = entrada.nextInt();

    System.out.print("Informe o seu salário: ");
        salario = entrada.nextFloat();
    
    System.out.print("Qual o seu tempo em meses na empresa? ");
        tempoMes = entrada.nextInt();
    
    System.out.print("Quantos filhos você possui? ");
        filho = entrada.nextInt();

    System.out.print("Sua modalidade de trabalho é HomeOffice?(S/N)");
        homeOffice = entrada.next();

    System.out.print("Utiliza de veículo próprio ao trabalho?(S/N)");
        veiculo = entrada.next();

    System.out.print("Você possui valor empregatício a Empresa?(S/N)");
        PLR = entrada.next();

    System.out.println ("Olá " + nome + "!");
    System.out.println ("Sua idade é " + idade + " anos");  
    System.out.println ("Abaixo estará os benefícios a qual você possui direito:");
    System.out.println (salario <= 4000 ? "Você possui direito de VA" : "Você não possui direito de VA");
    System.out.println (tempoMes > 3 ? "Você possui direito a Plano de Saúde" : "Você não possui direito a Plano de Saúde");
    System.out.println (filho > 0 ? "Você possui direito de auxilio-creche" : "Você não possui direito de auxilio-creche");
    System.out.println (homeOffice.equalsIgnoreCase("S") || homeOffice.equalsIgnoreCase("Sim")? "Você possui direito de auxílio home office" : "Você não possui direito de auxílio home office");
    System.out.println (veiculo.equalsIgnoreCase("S") || veiculo.equalsIgnoreCase("Sim")? "Você possui direito de auxilio-combústivel" : "Você não possui direito de auxilio-combustível");
    System.out.println (PLR.equalsIgnoreCase("S") || PLR.equalsIgnoreCase("Sim")? "Você possui participação na PLR" : "Você não possui participação na PLR");
    System.out.println (salario <= 4000 && tempoMes > 3 ? "Você tem Elegibilidade para bolsa de estudos" : "Você não tem Elegibilidade para bolsa de estudos");
    }
}      