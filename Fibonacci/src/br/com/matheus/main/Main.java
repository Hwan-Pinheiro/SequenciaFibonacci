package br.com.matheus.main;

import java.util.Scanner;

import br.com.matheus.finbonacci.Fibonacci;


public class Main {

	public static void main(String[] args) {
		  Scanner scanner = new Scanner(System.in);
	        System.out.println("Digite um número: ");
	        int numero = scanner.nextInt();
	        scanner.close();

	        Fibonacci fibonacci = new Fibonacci();
	        if (fibonacci.pertenceFibonacci(numero)) {
	            System.out.println("O número " + numero + " pertence à sequência de Fibonacci.");
	        } else {
	            System.out.println("O número " + numero + " não pertence à sequência de Fibonacci.");
	        }
	    }

	}
