/**
 * @Import
 */
package br.cesed.si.listadeExercicios.p3;
import java.util.Scanner;

/**
 * Principal class
 * @author Diego Kazadi
 *
 */
public class Principal {
	public static void main(String[] args){
				
		/*
		 * Generate of object for all class
		 */
		Banco bb = new Banco(123, "Banco do Brazil", "Brazil");
		Agencia ag = new Agencia(12344, "UFCG");
		ContaCorrente cc = new ContaCorrente(292222, 001, 5000);
		Cliente cl1 = new Cliente("Diego Kazadi", "V65 4553 -K", "017.413.294-85");
		Cliente cl2 = new Cliente("Armiliana", "V99 444","015.323.999-65");
		Endereco end = new Endereco("Pedro II", 1394, "(83)9 9989-5043");
		System.out.println("---Sejam Bem vindo--- \n\n" + bb + ag + cc + cl1+ end);
		// usar cl2
		
		// usando a estrutura if else do while
		
		do{
		
			System.out.println("Deseja efetuar uma operação? \n");
			System.out.println("Tecla [1] Para dépositar :\n");
			System.out.println("Tecle [2] para Sacar\n");
			System.out.println("Tecle [3] para Sair\n");
			
			
			Scanner sc = new Scanner(System.in);
			int opcao ; // inicializando a opção
			opcao = sc.nextInt();
		
			switch(opcao){
				
				case 1: if(opcao != 1 || opcao != 2 || opcao != 3){
					System.out.println("\nInformou número errado \n Digite novamente");
					break;	
					}
				
				case 2: System.out.println("Depositando na Conta.");
					cc.deposita(250);
					break;
				
				case 3:System.out.println("Sacando...");
					cc.setSacar(350);
					break;
							
				case 4: System.out.println("Situação da sua conta : " + cc);
					System.out.println("Fim de Serviçon até logo...");
					System.exit(3);
			}	
		}while (true);
	}
}
