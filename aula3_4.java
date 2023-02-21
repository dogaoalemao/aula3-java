package atividade_aula_3;

import java.util.Scanner;

public class aula3_4 {

	
	public static void main(String[] args) {
		
		int num,result;
		
		System.out.println(" -> Desafio <- ");
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite um número?");
		num = entrada.nextInt();
		result = (num%2);
		if (result == 0) {
			System.out.println("É par: " + num);
		} else {
			System.out.println("É impar: " + num);
		}
	}
}