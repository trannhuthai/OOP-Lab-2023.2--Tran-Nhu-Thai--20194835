
import javax.swing.JOptionPane;

public class Calculate {
		public static void main(String[] args) {
			String strNum1,strNum2;
			String strOutput = "the sum,difference,product,quotient of two number is: ";
			double sum,difference,product,quotient;
						
			strNum1= JOptionPane.showInputDialog(null,"Please input the first number: ",JOptionPane.INFORMATION_MESSAGE);
			double Num1 = Double.parseDouble(strNum1); 
			
			strNum2=JOptionPane.showInputDialog(null,"Please input the second number; ",JOptionPane.INFORMATION_MESSAGE);
			double Num2 = Double.parseDouble(strNum2);
			
			sum = Num1 + Num2;
			String strSum = Double.toString(sum);
			strOutput += strSum +", ";
			
			difference = Num1 - Num2;
			String strDiff = Double.toString(difference);
			strOutput += strDiff +", ";
			
			product = Num1 * Num2;
			String strProduct = Double.toString(product);
			strOutput += strProduct +", ";
			
			quotient = Num1/ Num2;
			String strQuotient = Double.toString(quotient);
			strOutput += strQuotient +".";
			
			JOptionPane.showMessageDialog(null,strOutput,"",JOptionPane.INFORMATION_MESSAGE);
			System.exit(0);
			
			
			
		}
}
