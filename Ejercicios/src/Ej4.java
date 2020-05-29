import java.util.Scanner;

public class Ej4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		
		int cantidad ;
		double precio, total;
		
		System.out.print("Ingrese el número de artículos que comprará: ");
		cantidad=teclado.nextInt();
		
		System.out.print("Introduzca el precio del artículo: ");
		precio=teclado.nextDouble();
		total=cantidad*precio;
		
		System.out.print("El total de su compra es de: ");
		System.out.print(total);
		teclado.close();
	}

}
