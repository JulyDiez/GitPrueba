import java.util.Scanner;

public class Ej6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		
		int n1;
		
		System.out.print("Introduce un número: ");
		n1=teclado.nextInt();
		
		for (int n=1; n<=n1; n++) {
			System.out.print(n + "\n");
		}
		teclado.close();
	}

}
