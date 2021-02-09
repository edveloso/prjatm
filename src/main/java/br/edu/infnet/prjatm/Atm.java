package br.edu.infnet.prjatm;

import java.util.Scanner;

/**
 * 
 * @author veloso
 *
 */

public class Atm {

	public static void main(String[] args) {
		// 8 tipos primitivos boolean, char, float, int, short, double, long, byte
		// Variaveis recebem valor: literal ou referencia

		Scanner scan = new Scanner(System.in);

		// entrada - processamento - saida
		System.out.println("Bem vindo");
		System.out.print("Por favor entre com seu numero conta: ");

		String numeroConta = scan.next();

		System.out.print("Por favor entre com a senha: ");

		int senha = scan.nextInt();

		if (numeroConta.equals("123") && senha == 456) {

			int opcao = 0;
			double saldo = 0;

			while (opcao <= 3) {

				
				// atalho para copiar linhas ctrl + alt + seta pra baixo ou pra cima
				System.out.println(" Menu ");
				System.out.println(" 1- ver o saldo ");
				System.out.println(" 2- Saque ");
				System.out.println(" 3 -Deposito ");
				System.out.println(" 4 - Sair ");
				System.out.println(" Entre com a opcao: ");

				opcao = scan.nextInt();

				switch (opcao) {
				case 1:
					System.out.println("saldo");
					System.out.println(" o saldo é " + saldo );
					break;
				case 2:
					System.out.println("saque");
					System.out.println("Qual valor do saque: ");
					double valorSaque = scan.nextDouble();
					if(valorSaque < saldo) {
						saldo = saldo - valorSaque;
					}else {
						System.out.println("Saldo insuficiente!");
					}
					
					break;
				case 3:
					System.out.println("deposito");
					System.out.print(" Qual o valor a ser depositado: ");
					double valorDepositado = scan.nextDouble();
					saldo = saldo + valorDepositado;
					break;
				case 4:
					System.out.println("sair");
					break;

				default:
					break;
				}

			}

		}

	}

}
