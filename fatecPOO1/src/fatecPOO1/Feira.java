package fatecPOO1;

import java.util.ArrayList;
import java.util.List;

public class Feira {

	private String nome;
	private List<Produto> produtos = new ArrayList<Produto>();

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Produto> getProdutos() {
		return produtos;
	}

	public void setProdutos(List<Produto> produtos) {
		this.produtos = produtos;
	}

	public void exibirTotalVendas() {
		Double total = 0.0;
		for(Produto valores: produtos) {
			total += valores.exibirTotalValor();
		}
		System.out.println(total);
	}
	
	@Override
	public String toString() {
		return "Feira: " + nome + ", \nProdutos " + produtos;
	}
}
