import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Janela1 extends JFrame {
	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null, "Olá, mundo!");
		JOptionPane.showMessageDialog(null, "PC desligando em 5 segundos!");
		
		int opcao = JOptionPane.showConfirmDialog(null, "Você é legal?");
        if(opcao==0) {
            JOptionPane.showMessageDialog(null,"Parabéns, você é legal!");
        } else {
            JOptionPane.showMessageDialog(null, "Infelizmente você é chato!");
        }
        
		JOptionPane.showInputDialog("Digite o número do seu cartão, a data de validade e os 3 digitos atrás do seu cartão");
		String digitado = JOptionPane.showInputDialog("Digite alguma coisa:");
		if (!digitado.isEmpty()) {
			JOptionPane.showMessageDialog(null, digitado);
		}
	}
}
