import java.util.Scanner;

public class ExemploScanner {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String nome = "";
        Integer idade = 0;
        Double peso = 0.0;

        System.out.println("Digite seu nome: ");
        nome = sc.next();

        System.out.println("Imforme sua idade: ");
        idade = sc.nextInt();

        System.out.println("Imforme seu Peso: ");
        peso = sc.nextDouble();

        System.out.println("Seu nome é:" + nome);
        System.out.println("Seu peso é:" + peso);
        System.out.println("Sua Idade é:" + idade);




    }
}
