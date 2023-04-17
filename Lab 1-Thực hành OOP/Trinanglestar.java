import java.util.Scanner;

public class Trinanglestar {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter a height of n star: ");
		int n = keyboard.nextInt();
		
		for(int i=1; i<=n; i=i+1) {
			for(int j=1; j<n-i+1;j=j+1) {
				System.out.print(" ");
			}
				for(int k=n;k>n-i;k=k-1) {
					System.out.print("* ");
				}
			System.out.print("\n");
		}
				
	}

}
