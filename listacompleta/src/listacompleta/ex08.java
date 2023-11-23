package listacompleta;
import javax.swing.JOptionPane;
public class ex08 {

	public static void main(String[] args) {
		float num1, num2;
		String stropcao, stnum1,stnum2;
		int opcao;
		stnum1 = JOptionPane.showInputDialog("Digite o Primeiro Numero : ");
		num1 = Float.parseFloat(stnum1);
		stnum2 = JOptionPane.showInputDialog("Digite o Segundo Numero : ");
		num2 = Float.parseFloat(stnum2);
			stropcao = JOptionPane.showInputDialog("Escolha a operacao que deseja fazer: "
					+ "\n 1 - adicao\n" + 
					" 2 - subtracao\n" + 
					" 3 - multiplicacao\n" + 
					" 4 - divisao\n");
			opcao = Integer.parseInt(stropcao);
			switch(opcao) {
			case 1:
				float soma;
				soma = num1 + num2;
				JOptionPane.showMessageDialog(null,"O resultado e : " + soma);
			break;
			
			case 2:
				float subtracao;
				subtracao = num1 - num2;
				JOptionPane.showMessageDialog(null,"O resultado e : " + subtracao);
			break;
			
			case 3:
				float multiplicacao;
				multiplicacao = num1 * num2;
				JOptionPane.showMessageDialog(null,"O resultado e : " + multiplicacao);
			break;
				
			case 4: 
				float divisao;
				divisao = num1/num2;
				JOptionPane.showMessageDialog(null,"O resultado e : " + divisao);
			break;
			}
	}

}
