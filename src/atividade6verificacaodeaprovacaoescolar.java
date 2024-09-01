import java.util.Scanner;

public class atividade6verificacaodeaprovacaoescolar {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu Nome: ");
        String Nome = scanner.next();

        System.out.println("Digite sua Nota: ");
        Double Media = scanner. nextDouble();

        if (Media >= 7) {
            System.out.println(Nome + " Aprovado");
        }
             else if (Media >=5 && Media <7) {
            System.out.println(Nome+ " Recuperação ");
        }
             else if (Media < 5) {
            System.out.println(Nome+" Reprovado");

        }


    }
}
