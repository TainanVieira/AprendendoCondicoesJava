import java.util.Scanner;

public class atividade1verificaodeMmioridade
{
    public static void main(String[] args) {

        Integer idade= 0;

        Scanner sc= new Scanner(System.in);
        System.out.println("Digite sua idade: ");
        idade = sc.nextInt();

                if (idade >= 18 ){
                    System.out.println("Você é maior de Idade:");
                } else if (idade < 18) {
                    System.out.println("Você é menor de Idade:");
                }
        System.out.println("Digite sua idade:"+ idade);

    }
}
