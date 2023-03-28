package meuProjeto;

public class ListaEncadeada {

	private Celula primeiro;
	private Celula ultimo;
	private Celula atual;

	public void adicionar(Cantor nome) {
		Celula novaCelula = new Celula();
		novaCelula.setNome(nome);
		if (primeiro == null && ultimo == null) {
			primeiro = novaCelula;
			ultimo = novaCelula;
		} else {
			ultimo.setProximo(novaCelula);
			ultimo = novaCelula;
		}
	}
	
	public String toString() {
		StringBuffer sb = new StringBuffer(); 
		
		Celula p = primeiro;
		while (p != null) {
			sb.append(p.getValor() + ", ");
			p = p.getProximo(); 
		}
		
		if (sb.length() > 1) {
			sb.delete(sb.length() - 2, sb.length());
		}
		return sb.toString(); 
	}

	private Celula recuperarPenultimo(Celula celula) {
		if (celula.getProximo().equals(ultimo)) {
			return celula;
		}
		return recuperarPenultimo(celula.getProximo());
	}

	public void remover() {
		if (primeiro.getProximo() != null) {
			Celula celula = this.recuperarPenultimo(primeiro);
			ultimo = celula;
			celula.setProximo(null);
		} else {
			primeiro = ultimo = null;
		}
	}

	public boolean temProximo() {
		if(primeiro == null) {
			return false;
		}
		else if (atual == null) {
			atual = primeiro; 
			return true; 
		}else {
			boolean temProximo = atual.getProximo() != null ? true : false;
			atual = atual.getProximo();
			return temProximo;
		}
	}
	
	public Celula getPrimeiro() {
		return primeiro;
	}

	public void setPrimeiro(Celula primeiro) {
		this.primeiro = primeiro;
	}

	public Celula getUltimo() {
		return ultimo;
	}

	public void setUltimo(Celula ultimo) {
		this.ultimo = ultimo;
	}

	public Celula getAtual() {
		return atual;
	}

	public void setAtual(Celula atual) {
		this.atual = atual;
	}
	
	

}
