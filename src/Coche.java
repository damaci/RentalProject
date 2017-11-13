public class Coche extends Vehiculo {
	private int placa;
	private String color;
	
	Coche(int placa, String color){
		setPlaca(placa);
		setColor(color);
	}	
	/* M�todos Modificadores */
	public void setPlaca(int p) { placa = p; }
	public void setColor(String c) { color = c; }

	/* M�todos Accesores */
	public int getPlaca() { return placa; }
	public String getColor() { return color; }
	
	public void mostrarCoche() {
		System.out.println("\nPlaca: "+getPlaca()+"\nColor. "+getColor());
	}
	
	Coche m = new Coche();

}
