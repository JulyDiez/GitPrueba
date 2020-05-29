import java.util.Scanner;

public class Ej2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		
		int a, b, c, d, sum, prod;
		System.out.print("Ingrese un número:");
		a=teclado.nextInt();
		
		System.out.print("Ingrese un segundo número:");
		b=teclado.nextInt();
		sum=a+b;
		
		System.out.print("Ingrese un tercer número:");
		c=teclado.nextInt();
		
		System.out.print("Ingrese un cuarto número:");
		d=teclado.nextInt();
		prod=c*d;
		
		System.out.print("La suma de los dos primeros números es: ");
		System.out.print(sum + "\n");
		
		System.out.print("El producto del tercer y cuarto número es: ");
		System.out.print(prod);
		teclado.close();
	}

}
