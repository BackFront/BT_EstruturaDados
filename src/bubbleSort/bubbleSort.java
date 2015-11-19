package bubbleSort;

import javax.swing.JOptionPane;

public class bubbleSort {
	public static void main(String[] args) {
		Integer tamanho = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade dos nomes: "));
		
		String[] vetorNomes = new String[tamanho];
		for (int i = 0; i < vetorNomes.length; i++) {
			vetorNomes[i] = JOptionPane.showInputDialog("Qual o nome: ");
		}

		bolha(vetorNomes);
		
		for (int i = 0; i < vetorNomes.length; i++) {
			System.out.println("Nome: "+vetorNomes[i]);
		}
	}
	
	public static String[] bolha(String[] meuvetor){
		
		for (int i = meuvetor.length -1; i >=1; i--) {
			for (int j = 0; j < i; j++) {
				if(meuvetor[j].length() > meuvetor[j+1].length()){
					String temp = meuvetor[j];
					meuvetor[j] = meuvetor[j + 1];
					meuvetor[j+1] = temp;
				}
			}
		}
		return meuvetor;
	}
}
