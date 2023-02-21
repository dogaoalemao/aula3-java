package atividade_aula_3;

import java.util.Scanner;

public class aula3_3 {
		
		public static void main(String[] args) {
			
			String escolher, prof;
			
			Scanner entrada = new Scanner(System.in);
			
			System.out.println( " -> Dados Pessoais <- ");

			System.out.println("Qual linguagem de programação escolher?");
			escolher = entrada.nextLine();
			
			System.out.printf("Porque você escolheu a linguagem de programação: %s? \n", escolher);
			entrada.nextLine();
			
			System.out.println("Quem professor ensinou com você?");
			prof = entrada.nextLine();
			
			System.out.println("Você aprendeu com o professor " + prof + ".");
			System.out.println("A linguagem de programção é " + escolher + ".");
			
			entrada.close();
			
		}
	}
