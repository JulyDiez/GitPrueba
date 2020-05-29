import java.util.Scanner;

public class Ejdw {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		
		//Declaramos n1 que será el numero que el usuario 
		//va a introducir
		int n1;
		System.out.print("Ingrese un número: ");
		n1=teclado.nextInt();
		
		//n, es el contador, se inicializa a 1
		//porque contará a partir de este.
		int n=1;
		do {
			System.out.print(n + "\n");
			n++;
		}while (n<=n1);
		teclado.close();
	}

}
