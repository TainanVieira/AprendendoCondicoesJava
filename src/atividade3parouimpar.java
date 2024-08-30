import java.util.Scanner;

public class atividade3parouimpar {
    public static void main(String[] args) {
        Scanner nun = new Scanner(System.in);
        int numero = 0;
        System.out.println("Digite um Numero: ");
        numero = nun.nextInt();

        if (numero % 2 == 0) {
            System.out.println("O Numero é Par.");
        }
        else if (numero % 2 != 0){
            System.out.println("O Numero è Impar.");
        }



    }
}
