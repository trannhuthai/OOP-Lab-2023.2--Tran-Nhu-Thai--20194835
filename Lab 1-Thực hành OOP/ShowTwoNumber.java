import javax.swing.JOptionPane;
public class ShowTwoNumber {


public static void main(String[] args) {
	String strNum1,strNum2;
	String strNotification ="You'are just entered:";
	
	strNum1 = JOptionPane.showInputDialog(null,"Please input first number",JOptionPane.INFORMATION_MESSAGE);
	strNotification += strNum1+ " and ";
	
	strNum2= JOptionPane.showInputDialog(null,"Plese input second number",JOptionPane.INFORMATION_MESSAGE);
	strNotification +=strNum2;
	
	JOptionPane.showMessageDialog(null,strNotification,"Show two number",JOptionPane.INFORMATION_MESSAGE);
	System.exit(0);
	
}
}
