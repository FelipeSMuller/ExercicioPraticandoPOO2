package treinandoOOP;

import javax.swing.JOptionPane;

public class ExercicioPOO {

	public static void main(String[] args) {

		int opcao = 0;

		do {

			try {

				opcao = Integer.parseInt(JOptionPane.showInputDialog(null,
						"CADASTRO DE PRODUTOS ELETRÔNICOS \n1-Cadastrar televisão \n2-Cadastrar smartphone"));

			} catch (NullPointerException | NumberFormatException erro) {

				JOptionPane.showMessageDialog(null,
						"Dados não numéricos foram inseridos ou o programa foi finalizado incorretamente!!!", null,
						JOptionPane.WARNING_MESSAGE);

				break;

			}

			switch (opcao) {

			case 1:

				// Instanciando um novo objeto do tipo Televisão.
				Televisao televisao1 = new Televisao(null, null, 0.0);

				// Acessando os atributos com os métodos públicos getters e setters

				televisao1.setNome("Odyssey");

				televisao1.setPotencia(80.0);

				televisao1.setPreco(5678.2);

				televisao1.setTamanhoTela(40.0);

				televisao1.mostrarDados();

				break;

			case 2:

				// Instanciando um novo objeto do tipo Smartphone

				Smartphone smartphone1 = new Smartphone(null, null, null);

				// Acessando os atributos com os métodos públicos getters e setters

				smartphone1.setNome("J5");

				smartphone1.setPotencia(80.0);

				smartphone1.setPreco(5689.1);

				smartphone1.setSistemaOperacional("Android");

				smartphone1.mostrarDados();

				break;
			}

		} while (opcao > 0);

	}

}
