package listacompleta;
import javax.swing.JOptionPane;

public class ex12b {
	public static void main(String[] args) {
		int tamanho;
		String stam;
		
		stam = JOptionPane.showInputDialog("Digite o tamanho dos vetores de inteiros : ");
		tamanho = Integer.parseInt(stam);
		int [] vetor1 = new int[tamanho];
		int [] vetor2 = new int[tamanho];
		
		JOptionPane.showMessageDialog(null,"Digite os valores do primeiro vetor : ");
			for(int i = 0; i < tamanho; i++) {
				String valorv1 = JOptionPane.showInputDialog("Posicao " + i + " : ");
				vetor1[i] = Integer.parseInt(valorv1);
			}
			for(int i = 0; i < tamanho; i++) {
				String valorv2 = JOptionPane.showInputDialog("Posicao " + i + " : ");
				vetor2[i] = Integer.parseInt(valorv2);
			}
		int [] somavetor = new int[tamanho];
		for(int i = 0; i < tamanho; i++) {
			somavetor[i] = vetor1[i] + vetor2[i];
		}
		String mensagem = ("Vetor resultante da soma : \n");
			for(int i = 0; i < tamanho; i++) {
				mensagem = mensagem + somavetor[i] + "\n";
			}
		JOptionPane.showMessageDialog(null, mensagem);
	}
}
