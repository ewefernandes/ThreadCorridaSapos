package controller;

import java.util.Random;

public class cThreads extends Thread {
	int dMax;
	Random saltos = new Random();
	int somaSaltos;
	static int posicao = 0;
	
	public cThreads (int dMax, int somaSaltos, int posicao){
		this.dMax = dMax;
		this.somaSaltos = somaSaltos;
		cThreads.posicao = posicao;
	}

	public void run() {
		StringBuffer buffer = new StringBuffer();
		Random saltos = new Random();
		
		do {
			int puloX = saltos.nextInt(10);
			somaSaltos = somaSaltos + puloX;
			//System.out.println("Sapo #" +getId()+ " - Salto: " +puloX+ " - Metros percorridos: " +somaSaltos);
			buffer.append("Sapo #" +getId()+ " - Tamanho do salto: " +puloX+ " - Metros percorridos: " +somaSaltos+ "\n");
		} while (somaSaltos < 30);

		posicao = posicao + 1;
		String corrida = buffer.toString();
		System.out.println(corrida);
		System.out.println("Na linha de chegada: Sapo #" +getId()+ " - Metros percorridos: " +somaSaltos+ " - Posicao de chegada: " +posicao+ "\n");
	}
	
	
	
	
}
