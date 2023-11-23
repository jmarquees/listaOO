package listacompleta;
import javax.swing.JOptionPane;
import java.util.Random;
public class ex11 {

	public static void main(String[] args){
		Random random = new Random();
		int aleatorio = random.nextInt(10)+1;
		int tentativa, numerotentativa = 0;
		boolean acertou = false;
		String strtent;
		JOptionPane.showMessageDialog(null, "Bem vindo(a) ao jogo de adivinhacao !\n Adivinhe o numero entre 1 e 10. ");
			do{
				numerotentativa++;
				strtent = JOptionPane.showInputDialog("Tentativa " + numerotentativa + " : ");
				tentativa = Integer.parseInt(strtent);  
				if(tentativa == aleatorio){
					acertou = true;
					JOptionPane.showMessageDialog(null, "Parabens, vc acerotu o numero " + aleatorio + " em " + numerotentativa + " tentativas ");
				}else if(tentativa < aleatorio) {
					JOptionPane.showMessageDialog(null, "Tente novamente, o numero e maior! ");
				}else {
					JOptionPane.showMessageDialog(null, "Tente novamente, o numero e menor! ");
				}
			}while(acertou != true);
	}
}
