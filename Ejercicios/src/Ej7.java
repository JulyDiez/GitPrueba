import java.util.Scanner;

public class Ej7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		//ARREGLAR
		//Declaramos n1 que ser� el numero que el usuario 
		//va a introducir
		int n1;
		System.out.print("Ingrese un n�mero: ");
		n1=teclado.nextInt();
		
		int resul=1;
		int n=1;
		do {
			resul=n1*n;
			System.out.print(resul + "\n");
			n++;
			
		}while(n==10);
		teclado.close();
	}

}
