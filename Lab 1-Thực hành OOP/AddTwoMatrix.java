import java.util.Scanner;

public class AddTwoMatrix {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter the size of 2 matrices: ");
		int n= keyboard.nextInt();
		
		int a[][]=new int[n][n];
		int b[][]=new int[n][n];
		int c[][]=new int[n][n];
		
		for (int i=0;i<n;i=i+1) {
			String str_i=Integer.toString(i+1);
			for (int j=0;j<n;j=j+1) {
				String str_j=Integer.toString(j+1);	
			System.out.print("a["+str_i+"]["+str_j+"]= ");
				a[i][j] = keyboard.nextInt();
			System.out.print("b["+str_i+"]["+str_j+"]= ");
				b[i][j] = keyboard.nextInt();
				c[i][j]=a[i][j]+b[i][j];
			}
		}
		System.out.println("Matix c= ");
		for(int k=0;k<n;k=k+1) {
			for (int p=0;p<n;p=p+1) {
			String str_c = Integer.toString(c[k][p]);
			System.out.print(str_c);
		
			if (p==n-1) {
				System.out.print("\n");
			} else {
				System.out.print("\t");
			}
		}
	}
}
}