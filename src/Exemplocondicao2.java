import java.util.Scanner;

public class Exemplocondicao2 {



    //Quero adicionar um desconto gradativo
    // valor Maior que 1000 - 10%
    // Valaor Maio que 2000- 20%
    // Valor Maior que 3000 - 30%
    // Valor Menor igual a 1000 - 0%

    public static void main(String[] args) {

        double ValorBruto = 3000;
        double desconto = 0d; // Cria uma Variavel de Escopo global. Navega entre os Escopo {}

        //Operadores Logicos
        //&& e: Quando as Duas forem verdades.
        // || ou: Tendo uma só verdade é Verdade.
        Scanner Scanner = new Scanner(System.in);
        System.out.println("Imforme o Valor Bruto: ");
        ValorBruto= Scanner.nextDouble();

        if(ValorBruto > 1000 && ValorBruto <= 2000){
           desconto = ValorBruto * 0.10;
        }
       else if (ValorBruto > 2000 && ValorBruto < 3000){
             desconto = ValorBruto * (20/100);
        }
        else if (ValorBruto >= 3000){
             desconto = ValorBruto * (30. / 100);
        }

        System.out.println("valor Bruto é:"+ValorBruto);
        System.out.println("Valor do desconto é:" +desconto);
        System.out.println("valor Bruto é:"+ (ValorBruto - desconto));






    }

  }
