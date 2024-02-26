package view;

import java.util.Scanner;

import controller.MultiplicacaoController;

public class Principal {

	public static void main(String[] args) {
		MultiplicacaoController multi = new MultiplicacaoController();
		Scanner input = new Scanner(System.in);
		System.out.println("Insira o primeiro coeficiente da multiplicação:");
		int numA = input.nextInt();
		System.out.println("Insira o segundo coeficiente da multiplicação:");
		int numB = input.nextInt();
		System.out.println("Resultado da multiplicação de " + numA + "x" + numB + ": " + multi.multiplicarComSomas(numA, numB));
		input.close();
		System.exit(0);
	}

}
