package Arvore;

public class ProgramaArvore {

	public static void main(String[] args) {
		Arvore arvoreX = new Arvore();
		
		System.out.println("É vazia? "+arvoreX.isVazia());
		arvoreX.inserirNo(20);		
		System.out.println("É vazia? "+arvoreX.isVazia());
		arvoreX.inserirNo(25);
		arvoreX.inserirNo(8);
		arvoreX.inserirNo(10);
		arvoreX.inserirNo(22);
		arvoreX.inserirNo(6);
		arvoreX.inserirNo(13);
		arvoreX.inserirNo(30);
		
		System.out.println("Grau da Raiz " + arvoreX.getRaiz().getGrau());
		System.out.println("Altura da Arvore " + arvoreX.getRaiz().getAltura());
	}

}
