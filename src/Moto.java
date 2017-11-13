
public class Moto {
	private int placa;
	private boolean casco;
	
	Moto( int placa, boolean casco){
		setPlaca(placa);
		setCasco(casco);
	}
	
	/* Métodos Modificadores */
	public void setPlaca(int p) { placa = p; }
	public void setCasco(boolean casc) { casco = casc; }

	/* Métodos Accesores */
	public int getPlaca() { return placa; }
	public boolean getCasco() { return casco; }
	
	public void mostrarMoto() {
		System.out.println("\nPlaca: "+getPlaca()+"\nCasco. "+getCasco());
	}

}
