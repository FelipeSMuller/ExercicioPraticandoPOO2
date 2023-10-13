package metodosTratamento;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class TratamentoDados {

	// Método para formatar os valores.

	public static String formatarValores(Double valor) {

		String valorFormatado;

		if (valor <= 0) {

			JOptionPane.showMessageDialog(null, "Não é possível inserir um valor negativo ou igual a zero", null,
					JOptionPane.ERROR_MESSAGE);

		}

		else {

			DecimalFormat df = new DecimalFormat("R$ ####.##");

			valorFormatado = df.format(valor);

			return valorFormatado;

		}

		return " ";
	}

	// Método para verificação de campos com strings, se o campo estiver vazio gera
	// uma mensagem de alerta.
	public static void tratarStrings(String frase) {

		if (frase.isEmpty()) {

			JOptionPane.showMessageDialog(null, "O campo precisa ser preenchido, no momento está vazio", null,
					JOptionPane.WARNING_MESSAGE);
		}

	}

	public static void tratarNumeros(Double numero) {

		if (numero <= 0) {

			JOptionPane.showMessageDialog(null, "Não é possível inserir um valor negativo ou igual a zero", null,
					JOptionPane.ERROR_MESSAGE);

		} else if (numero > 100) {

			JOptionPane.showMessageDialog(null, "Insira valores entre 1 e 99, o valor inserido é inválido", null,
					JOptionPane.WARNING_MESSAGE);
		}
	}

}
