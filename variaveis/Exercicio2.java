/*
1. Crie uma variável que armazena o valor de uma laranja;
2. Crie uma variável que informa o valor de uma uva;
3. Some o valor da laranja com a uva;
*/

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        // Escreva seu código aqui ⬇️
        Scanner sc = new Scanner(System.in);
      
        double uva = sc.nextDouble(); 
        double laranja = sc.nextDouble();

        double soma = (uva + laranja);

        System.out.println(soma);

        //Receber duas idades, fazer a soma delas e imprimir no terminal
        int idade = sc.nextInt();
        int idade2 = sc.nextInt();

        int soma2 = (idade + idade2);

        System.out.println(soma2);

        
    }
}
