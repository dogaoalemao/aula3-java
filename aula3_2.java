package atividade_aula_3;

public class aula3_2 {
	
public static void main(String[] args) {
		
		double carro, numSoma, numSubt, numDiv, numMult;
		
		carro = 50;
		numSoma = 10;
		numSubt = 10;
		numDiv = 12;
		numMult = 4;
		
		System.out.println(" -> O resultado de uma operação de sua escolha <- ");
		
		System.out.println("Quantos litros tem o tanque de combustível do HB20: " + carro + " litros");
		System.out.println("Quanto gastou 10 litros de combustível para viajar: " + (carro - numSubt) + " litros");
		System.out.println("Tem 12 cada medidor de combustível digital, quanto cada litro: " + (carro / numDiv));
		System.out.println("Fui no posto de combustível, eu pedir colocar 20 litros, meu carro está 20 litro de combustível. Total: " + (numSoma * numMult));
	}

}

