import java.util.Scanner;

public class EjercicioClase6 {

	public static void main(String[] args) {
	
	Scanner in = new Scanner(System.in);
	
	String saborHelado; //Declararlo
	
	System.out.println("¿Cuál es tu sabor de helado favorito?");
	
	saborHelado = in.nextLine();
	
	System.out.println("Tu sabor elegido fue: " + saborHelado);
	
	double porcentajeComision;
	
	System.out.println("¿Cuál es el porcentaje de comisión en la venta");
	
	porcentajeComision = in.nextDouble();
	
	System.out.println("Tu porcentaje de comision es " + porcentajeComision);
	
	}
	

}