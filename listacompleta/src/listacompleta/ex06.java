package listacompleta;
import javax.swing.JOptionPane;
public class ex06 {

	public static void main(String[] args) {
		float altura, peso, imc;
		String strpeso, straltura;
	
		strpeso = JOptionPane.showInputDialog("Digite o seu peso em quilogramas : ");
		peso = Float.parseFloat(strpeso);
		straltura = JOptionPane.showInputDialog("Digite a sua altura em metros : ");
		altura = Float.parseFloat(straltura);
		imc = peso/(altura*altura);
		JOptionPane.showMessageDialog(null,"Seu IMC e : " + imc);
		if(imc < 18.5) {
			JOptionPane.showMessageDialog(null, "Abaixo do peso");
			}else if(imc >= 18.6 && imc <= 24.9) {
				JOptionPane.showMessageDialog(null, "Peso ideal, parabens ");
			}else if(imc >= 25 && imc <= 29.9){
				JOptionPane.showMessageDialog(null, "Levemente acima do peso ");
			}else if(imc >= 30 && imc <= 34.9) {
				JOptionPane.showMessageDialog(null,"Obesidade grau 1 ");
			}else if(imc >= 35 && imc <= 39.9) {
				JOptionPane.showMessageDialog(null,"Obesidade grau 2 (severa)");
				}else {
					JOptionPane.showMessageDialog(null,"Obesidade grau 3(morbida)");
				}
	}
}