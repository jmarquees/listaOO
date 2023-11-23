package listacompleta;
import javax.swing.JOptionPane;

public class ex05 {

	public static void main(String[] args) {
	String stria;
	int ia,ms,di,hr,min;
	stria = JOptionPane.showInputDialog("Digite a sua idade em anos : ");
		ia = Integer.parseInt(stria);
	ms = ia * 12;
	di = ia * 365;
	hr = di * 24;
	min = hr * 60;
	
	JOptionPane.showMessageDialog(null, "Sua idade em anos: " + ia + "\nEm meses : " + ms + " meses" + "\nEm dias : " + di + " dias" + "\nEm horas : " + hr + " horas" + "\nEm minutos : " + min + " minutos");
	}

}
