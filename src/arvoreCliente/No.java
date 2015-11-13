package arvoreCliente;

/**
 * Classe que será usada como nó de árvore binária. Seu conteúdo é um número
 * inteiro.
 * 
 * @author Yoshiriro
 */
public class No {

	private Cliente conteudo;
	private No esquerdo;
	private No direito;

	// / crie os gets e sets

	/**
	 * Construtor que recebe o conteúdo do No
	 * 
	 * @param conteudo2
	 */
	public No(Cliente conteudo2) {
		this.conteudo = conteudo2;
	}

	public void inserirNo(Cliente novoConteudo) { /*
												 * O conteúdo que chegou no
												 * argumento...
												 * 
												 * é MENOR que o conteúdo deste
												 * nó? -> SIM: O esquerdo já
												 * existe? -> NÃO: instancie ele
												 * com esse conteúdo -> SIM:
												 * insira esse nó nele
												 * 
												 * é MAIOR que o conteúdo deste
												 * nó? -> SIM: O direito já
												 * existe? -> NÃO: instancie ele
												 * com esse conteúdo -> SIM:
												 * insira esse nó nele
												 * 
												 * se IGUAL, não faz nada.
												 */

		// o novo conteúdo é menor que o deste nó
		if (novoConteudo.getId() < this.conteudo.getId()) {
			if (esquerdo != null) { // o nó esquerdo já existe
				esquerdo.inserirNo(novoConteudo);
			} else { // o nó esquerdo ainda não existe
				esquerdo = new No(novoConteudo);
			}
		}
		// o novo conteúdo é maior que o deste nó
		if (novoConteudo.getId() > this.conteudo.getId()) {
			if (direito != null) { // o nó direito já existe
				direito.inserirNo(novoConteudo);
			} else { // o nó direito ainda não existe
				direito = new No(novoConteudo);
			}
		}
	}

	public Cliente existeNo(Integer id) {
		// o conteúdo que chegou...
		// é igual ao deste nó?
		// SIM -> retorne Verdadeiro
		// NÃO...
		// é MENOR que o conteúdo deste nó?
		// SIM -> o nó esquerdo é vazio?
		// SIM -> retorne Falso
		// NÃO -> retorne o "existeNo()" nele
		// é MAIOR que o conteúdo deste nó?
		// SIM -> o nó direito é vazio?
		// SIM -> retorne Falso
		// NÃO -> retorne o "existeNo()" nele
		if (id == this.conteudo.getId()) {
			return getConteudo();
		}
		if (id < this.conteudo.getId()) {
			if (esquerdo == null) {
				return null;
			} else {
				return esquerdo.existeNo(id);
			}
		}
		if (id > this.conteudo.getId()) {
			if (direito == null) {
				return null;
			} else {
				return direito.existeNo(id);
			}
		}
		return null;
	}

	public Cliente getConteudo() {
		return conteudo;
	}

	public void setConteudo(Cliente conteudo) {
		this.conteudo = conteudo;
	}

	public No getEsquerdo() {
		return esquerdo;
	}

	public void setEsquerdo(No esquerdo) {
		this.esquerdo = esquerdo;
	}

	public No getDireito() {
		return direito;
	}

	public void setDireito(No direito) {
		this.direito = direito;
	}

	public Integer getGrau() {
		Integer grau = 0;

		if (esquerdo != null) {
			grau += 1 + esquerdo.getGrau();
		}

		if (direito != null) {
			grau += 1 + direito.getGrau();
		}
		return grau;
	}

	public Integer getAltura() {
		Integer alturaDireita = 0;
		Integer alturaEsquerdo = 0;

		if (esquerdo != null) {
			alturaEsquerdo += 1 + esquerdo.getAltura();
		} else {
			alturaEsquerdo += 0;
		}
		
		if (direito != null) {
			alturaDireita += 1 + direito.getAltura();
		} else {
			alturaDireita += 0;
		}
		
		return alturaDireita < alturaEsquerdo ? alturaEsquerdo : alturaDireita; 
	}
	
	public Integer getProfundidade() {
		return 1;
	}

}
