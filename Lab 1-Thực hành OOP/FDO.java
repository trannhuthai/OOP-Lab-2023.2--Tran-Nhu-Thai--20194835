import javax.swing.JOptionPane;

public class FDO {
	public static void main(String[] args) {
		String str_a11,str_a12,str_a21,str_a22,str_b1,str_b2;
		double x,y;
		String strOutput1 = "two solution of this equation is: ";
		String strOutput2 = "Infinite solution or no solution";					
		str_a11= JOptionPane.showInputDialog(null,"Please input the number a11: ",JOptionPane.INFORMATION_MESSAGE);
		double a11 = Double.parseDouble(str_a11); 
		
		str_a12= JOptionPane.showInputDialog(null,"Please input the number a12: ",JOptionPane.INFORMATION_MESSAGE);
		double a12 = Double.parseDouble(str_a12); 
		
		str_a21= JOptionPane.showInputDialog(null,"Please input the number a21: ",JOptionPane.INFORMATION_MESSAGE);
		double a21 = Double.parseDouble(str_a21); 
		
		str_a22= JOptionPane.showInputDialog(null,"Please input the number a22: ",JOptionPane.INFORMATION_MESSAGE);
		double a22 = Double.parseDouble(str_a22); 
		
		str_b1=JOptionPane.showInputDialog(null,"Please input the number b1: ",JOptionPane.INFORMATION_MESSAGE);
		double b1 = Double.parseDouble(str_b1);
		
		str_b2=JOptionPane.showInputDialog(null,"Please input the number b2: ",JOptionPane.INFORMATION_MESSAGE);
		double b2 = Double.parseDouble(str_b2);
		
		double det = a11*a22-a12*a21;
		if(det == 0) {
			JOptionPane.showMessageDialog(null,strOutput2,"",JOptionPane.INFORMATION_MESSAGE);
		} else {
			x=(b1*a22-a12*b2)/det;
			String str_x = Double.toString(x);
			strOutput1 += "x= "+ str_x +" and ";
			
			y=(a11*b2-a21*b1)/det;
			String str_y = Double.toString(y);
			strOutput1 += "y= "+str_y;
		
		JOptionPane.showMessageDialog(null,strOutput1,"",JOptionPane.INFORMATION_MESSAGE);
		}
		System.exit(0);
			
	}

}
