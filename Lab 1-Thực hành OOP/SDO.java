import javax.swing.JOptionPane;
import java.lang.Math;

public class SDO {
	public static void main(String[] args) {
		String str_a,str_b,str_c,str_x1,str_x2;
		double x,x1,x2,delta;
		String strOutput1 = "two solution of this equation is: ";
		String strOutput2 = "no solution";
		String strOutput3 = "The equation has only solution: x= ";
		str_a= JOptionPane.showInputDialog(null,"Please input the number a: ",JOptionPane.INFORMATION_MESSAGE);
		double a = Double.parseDouble(str_a); 
		
		str_b= JOptionPane.showInputDialog(null,"Please input the number b: ",JOptionPane.INFORMATION_MESSAGE);
		double b = Double.parseDouble(str_b); 
		
		str_c= JOptionPane.showInputDialog(null,"Please input the number c: ",JOptionPane.INFORMATION_MESSAGE);
		double c = Double.parseDouble(str_c); 
		
		delta = b*b-4*a*c;
		if(a == 0) {
			x=(-c)/b;
			String str_x = Double.toString(x);
			strOutput3 += str_x;
			
			JOptionPane.showMessageDialog(null,strOutput3,"",JOptionPane.INFORMATION_MESSAGE);
		} else {
			if (delta < 0) {
				JOptionPane.showMessageDialog(null,strOutput2,"",JOptionPane.INFORMATION_MESSAGE);
			}
			else {
				x1= (-b+Math.sqrt(delta))/2*a;
				str_x1 = Double.toString(x1);
				strOutput1 += "x1= "+ str_x1 + " and ";
				
				x2=(-b-Math.sqrt(delta))/2*a;
				str_x2 = Double.toString(x2);
				strOutput1 += "x2= "+ str_x2;
				
				JOptionPane.showMessageDialog(null,strOutput1,"",JOptionPane.INFORMATION_MESSAGE);
			}
		}
		System.exit(0);
			
	}

}
