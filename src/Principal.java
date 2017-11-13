import java.util.Scanner;
import java.util.InputMismatchException;

public class Principal {
	
	static Scanner entrada = new Scanner(System.in);

	public static void main(String[] args) {
		String nombre;
		String dni;
		int opcion;
		boolean salir = false;
				
		System.out.println("Bienvenido a RentalCar!\n");
		System.out.println("Introduce tu nombre, por favor: \n");
		nombre = entrada.nextLine();
		System.out.println("Introduce tu dni, por favor: \n");
		dni = entrada.nextLine();
		System.out.println("¿Qué vehiculo quieres alquilar?: \n");
		System.out.println("1. Introduce 1 si quieres alquilar un coche");
		System.out.println("2. Introduce 2 si quieres alquilar una moto");
		System.out.println("3. Introduce 3 si quieres alquilar una bici");
		System.out.println("4. Salir");
        try {
        	System.out.println("Escribe una de las opciones: ");
    		opcion = entrada.nextInt();
	
			switch(opcion){
	        case 1:
	            System.out.println("Has seleccionado alquilar un coche");
	            break;
	        case 2:
	            System.out.println("Has seleccionado alquilar una moto");
	            break;
	         case 3:
	            System.out.println("Has seleccionado alquilar una bici");
	            break;
	         case 4:
	            salir=true;
	            break;
	         default:
	            System.out.println("Solo números entre 1 y 4");
			}
		} catch (InputMismatchException e) {
			System.out.println("Debes insertar un número");
			entrada.next();
		}
	}

}
