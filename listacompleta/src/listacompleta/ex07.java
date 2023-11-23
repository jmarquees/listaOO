package listacompleta;
import javax.swing.JOptionPane;
public class ex07 {
	
	public static void main(String[] args) {
		int i;
		String strint;
	
		strint = JOptionPane.showInputDialog("Digite um numero inteiro :\n");
		i = Integer.parseInt(strint);
		if(i % 2 == 0){
			JOptionPane.showMessageDialog(null, "O numero " + i + " e par.\n");
		}else {
			JOptionPane.showMessageDialog(null, "O numero " + i + " e impar.\n");
		}
	}
}
