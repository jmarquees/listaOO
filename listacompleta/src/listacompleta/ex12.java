package listacompleta;
import javax.swing.JOptionPane;
public class ex12 {

	public static void main(String[] args) {
		int numero, result;
		String stnum, tabuada;

		stnum = JOptionPane.showInputDialog("Digite um numero para a tabela de multiplicacao : ");
		numero = Integer.parseInt(stnum);
		tabuada = ("Tabela de multiplicacao para " + numero + " : \n");
			for(int i = 1; i <= 10; i++) {
				result = numero * i;
				tabuada = tabuada + numero + " * " + i + " = " + result + "\n";
			}
			JOptionPane.showMessageDialog(null,tabuada);

	}

}
