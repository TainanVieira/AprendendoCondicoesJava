import java.util.Scanner;

public class atividade2classificaonotas {
    public static void main(String[] args) {

        System.out.println("Digite Sua Nota: ");
    double notas= 0;
        Scanner sc = new Scanner(System.in);
        notas = sc.nextDouble();

        if(notas >= 9){
            System.out.println("Parabens Exelente Nota!");
        }
         else if (notas >= 7) {
            System.out.println("Parabens Boa Nota!");
        } else if (notas >= 5 ) {
            System.out.println("Parabens Sua nota é sastifatoria!");

        } else if (notas < 5 ) {
            System.out.println("Imfelismente Sua Nota é insastifatoria!");

        }

        System.out.println("Sua Nota é:"+notas);


    }
}
