package treinandoOOP;

import javax.swing.JOptionPane;

import metodosTratamento.TratamentoDados;

public class Smartphone extends Produto {

	private String sistemaOperacional;

	public Smartphone(String nome, Double preco, Double potencia) {
		super(nome, preco, potencia);

	}

	public String getSistemaOperacional() {
		return sistemaOperacional;
	}

	public void setSistemaOperacional(String sistemaOperacional) {

		TratamentoDados.tratarStrings(sistemaOperacional);

		this.sistemaOperacional = sistemaOperacional;

	}

	public void mostrarDados() {

		JOptionPane.showMessageDialog(null,
				"DADOS DO SMARTPHONE" + "\nNome do produto:  " + nome + "\nPreço:  "
						+ TratamentoDados.formatarValores(preco) + "\nPotência:  " + potencia
						+ "\nSistema operacional:  " + sistemaOperacional);
	}

}
