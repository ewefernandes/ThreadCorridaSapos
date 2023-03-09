package view;
import controller.cThreads;

public class Main {

	public static void main(String[] args) {
		int dMax = 30;
		int somaSaltos = 0;
		int posicao = 0;
		
		for (int i = 0; i < 5; i ++) {
			cThreads t = new cThreads(dMax, somaSaltos, posicao);
			t.start();
		}
	}

}
