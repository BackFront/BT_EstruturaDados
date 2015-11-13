package arvoreCliente;

import arvoreCliente.Arvore;

public class ProgramaArvore {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Cliente clienteA = new Cliente(1, "Gaybriel","Gaybriel@bandtec.com.br");
		Cliente clienteB = new Cliente(2, "Rafael","rafael@esgoto.rt");
		Cliente clienteC = new Cliente(7, "Michelangello","michelangello@esgoto.rt");
		Cliente clienteD = new Cliente(3, "Donatello","donatello@esgoto.rt");
		Cliente clienteE = new Cliente(5, "Leonardo","leonardo@esgoto.rt");
		
		Arvore lifeTree = new Arvore();
		
		lifeTree.inserirNo(clienteA);
		lifeTree.inserirNo(clienteB);
		lifeTree.inserirNo(clienteC);
		lifeTree.inserirNo(clienteD);
		lifeTree.inserirNo(clienteE);
		
		
		System.out.println("O cliente 7 é: "+lifeTree.serchById(7).getNome());
		
		
	}

}
