package view;

import java.util.Scanner;

import controller.MultiplicacaoController;

public class Principal {

	public static void main(String[] args) {
		MultiplicacaoController multi = new MultiplicacaoController();
		Scanner input = new Scanner(System.in);
		System.out.println("Insira o primeiro coeficiente da multiplica��o:");
		int numA = input.nextInt();
		System.out.println("Insira o segundo coeficiente da multiplica��o:");
		int numB = input.nextInt();
		System.out.println("Resultado da multiplica��o de " + numA + "x" + numB + ": " + multi.multiplicarComSomas(numA, numB));
		input.close();
		System.exit(0);
	}

}
