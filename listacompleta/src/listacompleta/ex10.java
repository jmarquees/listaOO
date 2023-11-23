package listacompleta;
import javax.swing.JOptionPane;
public class ex10 {

	public static void main(String[] args) {
		int numero;
		String stri;
		stri = JOptionPane.showInputDialog("Digite um numero inteiro : ");
		numero = Integer.parseInt(stri);
		for(int i = numero; i >= 0; i--){
			JOptionPane.showMessageDialog(null, i);
		}
	}

}