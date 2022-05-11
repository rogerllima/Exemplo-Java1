package prateleiraprocura2;

import java.util.Scanner;

public class PrateleiraProcura2 {

    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);
        String opcao[] = {"2", "1", "5", "4", "3", "6", "7", "10", "9", "8"};
        double preco[] = {14.00, 9.05, 5.99, 5.79, 5.59, 9.50, 7.00, 5.50, 20.00, 4.59};
        String escolha;
        int contador;
        String saida = "sair";
        do {
            System.out.println("Coloque o número do alimento para encontrar sua prateleira e saber seu preço: (Digite sair para fechar a busca) ");
            System.out.println("Opções: [1]Feijao  [2]Bandeja de Ovo  [3]Farinha de trigo  [4]Farinha de milho  [5]Macarrao  [6]Oleo"
                    + " [7]Tomate  [8]Cebola  [9]Pão  [10]Arroz ");
            escolha = ler.nextLine();

            for (contador = 0; contador < 10; contador++) {
                if (String.valueOf(escolha).equals(opcao[contador])) {
                    System.out.println("O produto está na prateleira " + (contador + 1));
                    System.out.println("O valor do produto é R$ " + preco[contador]);
                } else if (String.valueOf(escolha).equals("0")) {
                    System.out.println("Produto não encontrado");
                }
            }
            System.out.println("  ");
        } while (!String.valueOf(escolha).equalsIgnoreCase(saida));

        System.out.println("-------------------------------------------------------------------------------------------");
        System.out.println("OBRIGADO PELA PREFERÊCIA. VOLTE SEMPRE <3 <3 !!");
    }
}
