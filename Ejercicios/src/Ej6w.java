import java.util.Scanner;

public class Ej6w {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		//Declaramos n1 que ser� el numero que el usuario 
		//va a introducir
		int n1;
		System.out.print("Introduce un n�mero: ");
		n1=teclado.nextInt();
		
		//n, es el contador, se inicializa a 1
		//porque contar� a partir de este.
		int n=1;
		while (n<=n1) {
			System.out.print(n + "\n");
			 n++;
		}
		teclado.close();
	}

}
