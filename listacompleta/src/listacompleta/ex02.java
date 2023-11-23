package listacompleta;
import javax.swing.JOptionPane;
public class ex02 {

	public static void main(String[] args) {
		String opcao, strf, strc;
		float i, f, c;
		
		opcao = JOptionPane.showInputDialog("Escolha o tipo de conversao :\n " + 
												" 1. Celsius para Fahrenheit\n " +
												" 2. Fahrenheit para Celsius \n ");
		i = Float.parseFloat(opcao);
		if(i == 1) {
			strc = JOptionPane.showInputDialog(" Digite a temperatura em graus Celsius : ");
			c = Float.parseFloat(strc);
			f = (c * 1.8f) + 32;
			JOptionPane.showMessageDialog(null, "O resultado em Fahrenheit e : " + f + "\n" );
		}else if(i == 2) {
			strf = JOptionPane.showInputDialog(" Digite a temperatura em graus Fahrenheit : ");
			f = Float.parseFloat(strf);
			c = (f-32)/1.8f;
			JOptionPane.showMessageDialog(null, "O resultado em Celsius e : " + c + "\n" );
		}else {
			JOptionPane.showMessageDialog(null,"ERRO");
		}

	}
}

