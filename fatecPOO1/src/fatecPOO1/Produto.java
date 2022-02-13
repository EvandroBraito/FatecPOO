package fatecPOO1;

public class Produto {

	private String nome;
	private int totalProd;
	private int validade;
	private double valor;
	
	public Produto(String nome, int totalProd, int validade, double valor) {
		super();
		this.nome = nome;
		this.totalProd = totalProd;
		this.validade = validade;
		this.valor = valor;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getTotalProd() {
		return totalProd;
	}

	public void setTotalProd(int totalProd) {
		this.totalProd = totalProd;
	}
	
	public int getValidade() {
		return validade;
	}

	public void setValidade(int validade) {
		this.validade = validade;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}	
	
	public double exibirTotalValor() {
		return totalProd * valor;
	}

	@Override
	public String toString() {
		return "\nNome = " + nome + ",\nTotal Produtos = " + totalProd + "\nValidade = " + validade + "\nValor = " + valor
				+ "\n";
	}
	
	
}
