package treinandoOOP;

import javax.swing.JOptionPane;

import metodosTratamento.TratamentoDados;

public class Televisao extends Produto {

	private Double tamanhoTela;

	public Televisao(String nome, Double preco, Double potencia) {
		super(nome, preco, potencia);

	}

	public Double getTamanhoTela() {
		return tamanhoTela;
	}

	// Método para acessar o atributo encapsulado
	public void setTamanhoTela(Double tamanhoTela) {

		TratamentoDados.tratarNumeros(tamanhoTela);

		this.tamanhoTela = tamanhoTela;
	}

	@Override
	public void mostrarDados() {

		JOptionPane.showMessageDialog(null,
				"DADOS DA TELEVISÃO" + "\nNome:  " + nome + "\nPreço:  " + TratamentoDados.formatarValores(preco)

						+ "\nPotência:  " + potencia + "\nTamanho da tela: " + tamanhoTela);
	}

}
