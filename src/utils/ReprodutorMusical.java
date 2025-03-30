package utils;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReprodutorMusical {
	private String musicaAtual;
	private List<String> listaDeMusicas;
	
	public ReprodutorMusical() {
		this.listaDeMusicas = new ArrayList<>();
	}
	
	public void tocar() {
		if (musicaAtual != null && listaDeMusicas.size() > 0) 
			System.out.println("Tocando " + musicaAtual + "...");
		else
			System.out.println("Selecione ou adicione uma música ao aparelho.");
		
	}
	
	public void pausar() {
		System.out.println("Música pausada.");
	}
	public void selecionarMusica() {
		Scanner sc = new Scanner(System.in);
		if (listaDeMusicas.size() > 0) {
			System.out.println("Selecione o numero da musica desejada:");
			int i = 0;
			for (String musica : listaDeMusicas) {
				System.out.println(i + ". " + musica);
				i++;
			}
			int musEscolhida = sc.nextInt();
			sc.nextLine();
			musicaAtual = listaDeMusicas.get(musEscolhida);
		} else {
			System.out.println("Não há nenhuma musica na fila.");
		}
	}
	public void adicionarMusica(String musica) {
		listaDeMusicas.add(musica);
	}
}
