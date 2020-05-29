import java.util.Scanner;

public class Ej5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		
		//declaramos las variables de tipo entero
		int n1, cuadrado;
		do {
		System.out.print("Ingrese un número: ");
		n1=teclado.nextInt();
		
		//En este if,ordenamos que no pueda calcular
		//los numeros que son negativos
		
		if (n1<0) {
			System.out.print("El número debe ser positivo. \n");
			}else {
				cuadrado=n1*n1;
				System.out.print("El cuadrado de " + n1 + " es: " + cuadrado );
			} 
		}while (n1<0);
		
		teclado.close();
	}

}
