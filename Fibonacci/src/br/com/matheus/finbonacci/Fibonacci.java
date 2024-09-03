package br.com.matheus.finbonacci;


public class Fibonacci {
	public boolean pertenceFibonacci(int numero) {
        int a = 0;
        int b = 1;
        int ordem = 1;

        System.out.println("Sequência de Fibonacci:");
        System.out.println("Ordem 1: " + a);
        System.out.println("Ordem 2: " + b);

        if (numero == a || numero == b) {
            System.out.println("O número " + numero + " é o " + (numero == a ? "1º" : "2º") + " número da sequência de Fibonacci.");
            return true;
        }

        while (true) {
            int proximo = a + b;
            ordem++;

            System.out.println("Ordem " + ordem + ": " + proximo + " (calculado como " + a + " + " + b + ")");

            if (proximo == numero) {
                System.out.println("O número " + numero + " é o " + ordem + "º número da sequência de Fibonacci.");
                return true;
            } else if (proximo > numero) {
                System.out.println("O número " + numero + " não pertence à sequência de Fibonacci.");
                return false;
            }
            a = b;
            b = proximo;
        }
    }
}
