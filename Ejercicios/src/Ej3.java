import java.util.Scanner;
public class Ej3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		
		int n1, n2, n3, n4, sum, prom;
		System.out.print("Ingrese un n�mero: ");
		n1=teclado.nextInt();
		
		System.out.print("Ingrese un segundo n�mero: ");
		n2=teclado.nextInt();
		
		System.out.print("Ingrese un tercer n�mero: ");
		n3=teclado.nextInt();
		
		System.out.print("Ingrese un cuarto n�mero: ");
		n4=teclado.nextInt();
		sum=(n1+n2+n3+n4);
		prom=(n1+n2+n3+n4)/4;
		
		System.out.print("La suma de los n�meros es: ");
		System.out.print(sum + "\n");
		
		System.out.print("El promedio de los n�meros es: ");
		System.out.print(prom );
		teclado.close();
	}

}
