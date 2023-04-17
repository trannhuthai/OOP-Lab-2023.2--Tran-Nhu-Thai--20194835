import javax.swing.JOptionPane;

public class ChoosingOption {
	public static void main(String[] args) {
		int option = JOptionPane.showConfirmDialog(null,"Do you want to change the class ticket?");
		JOptionPane.showMessageDialog(null,"You're choosen: "+ (option == JOptionPane.YES_OPTION?"Yes":"No"));
		System.exit(0);
		
	}
}
