package treinandoOOP;

import javax.swing.JOptionPane;

//O pacote contém diversos métodos de tratamentos para valores, números e strings
import metodosTratamento.TratamentoDados;

public class Produto {

	// Atributos do produto
	protected String nome;

	protected Double preco;

	protected Double potencia;

	// Método construtor
	public Produto(String nome, Double preco, Double potencia) {

		this.nome = nome;

		this.preco = preco;

		this.potencia = potencia;
	}

	// Getters e setters
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {

		// Método para acessar o atributo encapsulado, recebe uma string como parametro.
		TratamentoDados.tratarStrings(nome);

		this.nome = nome;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {

		// Método para acessar o atributo encapsulado, recebe um valor como parametro.

		TratamentoDados.formatarValores(preco);

		this.preco = preco;
	}

	public Double getPotencia() {
		return potencia;
	}

	public void setPotencia(Double potencia) {

		// Método para acessar o atributo encapsulado, recebe um valor como parametro.

		TratamentoDados.tratarNumeros(potencia);

		this.potencia = potencia;
	}

	// Método que imprime os dados de um produto
	public void mostrarDados() {

		JOptionPane.showMessageDialog(null,
				"Nome do produto:  " + nome + "\nPreço:  " + preco + "\nPotência:  " + potencia);
	}

}
