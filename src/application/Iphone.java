package application;

import java.util.Scanner;

import utils.ReprodutorMusical;

public class Iphone {
	private static ReprodutorMusical repMusical = new ReprodutorMusical();

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		repMusical.adicionarMusica("See You Again");
		repMusical.adicionarMusica("Yonkers");
		repMusical.adicionarMusica("EARFQUAKE");
		repMusical.adicionarMusica("Who Dat Boy");
		repMusical.adicionarMusica("Tamale");
		repMusical.adicionarMusica("IFHY");
		repMusical.adicionarMusica("Run");
		repMusical.adicionarMusica("New Magic Wand");
		int option = 10;
		while (option != 0) {
			System.out.println("Selecione o app desejado ou pressione (0) para desligar.");
			System.out.println("1. Reprodutor Musical");
			System.out.println("2. Aparelho Telefonico");
			System.out.println("3. Navegador de Internet");
			option = sc.nextInt();
			sc.nextLine();
			
			switch (option) {
			case 0:
				System.out.println("Desligando aparelho...");
				break;
			case 1:
				System.out.println("\n".repeat(35));
				System.out.println("=====Reprodutor Musical=====");
				int aux = 10;
				
				while (aux != 0) {
					System.out.println("Escolha uma opcão (0 para sair): ");
					System.out.println("1. Tocar música.");
					System.out.println("2. Pausar música.");
					System.out.println("3. Adicionar à fila. ");
					System.out.println("4. Selecionar música.");
					aux = sc.nextInt();
					sc.nextLine();
					switch (aux) {
					case 0:
						System.out.println("Saindo do Reprodutor Musical...");
						break;
					case 1:
						repMusical.tocar();
						break;
					case 2:
						repMusical.pausar();
						break;
					case 3:
						System.out.print("Digite o nome da música que deseja inserir na fila: ");
						String m = sc.nextLine();
						repMusical.adicionarMusica(m);
						System.out.println(m + " Adicionada.");
						break;
					case 4:
						repMusical.selecionarMusica();
						break;
					default:
						System.out.println("Opcão inválida.");
					}
					
				}
				break;
			default:
				System.out.println("Opcão inválida.");
			}
			
		}
		sc.close();
	}

}
