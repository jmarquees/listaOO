package listacompleta;
import javax.swing.JOptionPane;

public class ex04 {
	public static void main(String[] args) {
		
		String std1, std2, std3,stp1,stp2,stp3;
		float d1,d2,d3,p1,p2,p3, media;
		std1 = JOptionPane.showInputDialog("Digite a nota da primeira disciplina: ");
		d1 = Float.parseFloat(std1);
        while (d1 < 0 || d1 > 10) {
            std1 = JOptionPane.showInputDialog("Digite uma nota válida (entre 0 e 10) para a primeira disciplina: ");
            d1 = Float.parseFloat(std1);
        }
		std2 = JOptionPane.showInputDialog("Digite a nota da segunda disciplina: ");
		d2 = Float.parseFloat(std2);
        while (d2 < 0 || d2 > 10) {
            std2 = JOptionPane.showInputDialog("Digite uma nota válida (entre 0 e 10) para a segunda disciplina: ");
            d2 = Float.parseFloat(std2);
        }
		std3 = JOptionPane.showInputDialog("Digite a nota da terceira disciplina: ");
		d3 = Float.parseFloat(std3);
        while (d3 < 0 || d3 > 10) {
            std3 = JOptionPane.showInputDialog("Digite uma nota válida (entre 0 e 10) para a terceira disciplina: ");
            d3 = Float.parseFloat(std3);
        }
		stp1 = JOptionPane.showInputDialog("Digite o peso da primeira disciplina: ");
		p1 = Float.parseFloat(stp1);
		stp2 = JOptionPane.showInputDialog("Digite o peso da segunda disciplina: ");
		p2 = Float.parseFloat(stp2);
		stp3 = JOptionPane.showInputDialog("Digite o peso da terceira disciplina: ");
		p3 = Float.parseFloat(stp3);
		
		media = ((d1*p1)+(d2*p2)+(d3*p3))/(p1+p2+p3);
		JOptionPane.showMessageDialog(null, media);
	}
}
