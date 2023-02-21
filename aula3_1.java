package atividade_aula_3;

public class aula3_1 {

public static void main(String[] args) {
		
		int mes_pri = 40;
		int mes_seg = 30;
		int mes_ter = 70;
		
		float soma = mes_pri + mes_seg + mes_ter;
		
		float media = soma / 3;
		float sobra = soma % 3;
		
		int idade = 10;
		
		System.out.println();
		
		System.out.println("A média de clientes ingressado foi de " + media );
		System.out.println("A sobra da média será: " + sobra);
		
	}
}

