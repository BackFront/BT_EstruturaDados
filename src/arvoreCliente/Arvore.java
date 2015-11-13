package arvoreCliente;

/**
 * @author Douglas Alves
 */
public class Arvore {
	
	private No raiz;
	
	public boolean isVazia() {
		return raiz == null;
	}
	
	public void inserirNo(Cliente conteudo) {
		if (isVazia()) {
			raiz = new No(conteudo);
		}
		// implementar a inserção nos "nós filhos"
		// caso já exista o "nó raiz"
		else {
			raiz.inserirNo(conteudo);
		}
	}	
	
	public No getRaiz() {
		return raiz;
	}

	public void setRaiz(No raiz) {
		this.raiz = raiz;
	}
	
	public Cliente serchById(Integer id){	
		return this.raiz.existeNo(id);
	}

	public Cliente existeNo(Integer conteudo) {
		// invocar apenas o método de busca na raiz
		// portanto, é preciso criar um método
		// de busca também na classe No
		if (!isVazia()) { 
			// só podemos fazer a busca 
			// se a árvore não for vazia
			return raiz.existeNo(conteudo);
		}
		// se a árvore for vazia, lógico que 
		// o conteúdo não existe na árvore
		return null;
	}
}
