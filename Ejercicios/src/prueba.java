import java.util.Scanner;

public class prueba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner (System.in);
		
		int a, b, c, d, sum, prod;
		System.out.println("Ingrese cuatro números: ");
		a=teclado.nextInt();
		b=teclado.nextInt();
		c=teclado.nextInt();
		d=teclado.nextInt();
		
		sum=(a+b);
		prod=(c*d);
		System.out.println("La suma de los dos primeros es: " + sum);
		System.out.print("El producto del tercer y segundo es: "+ prod);
		teclado.close();
	}

}
