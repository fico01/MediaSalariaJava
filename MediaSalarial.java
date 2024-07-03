import java.util.Scanner;

public class MediaSalarial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        int soma = 0, mediaS, salario, qSalario=4;

        for (int i = 0; i < qSalario; i++){
            System.out.println("Digite o valor do Salario:");
            salario = scan.nextInt();

            soma += salario;
        }
        mediaS = soma/qSalario;

        System.out.println("A média salarial é: " + mediaS + "R$");
    }
}
