
public class Bici {
	private boolean marcha;
	private boolean casco;
	
	Bici( boolean marcha, boolean casco){
		setMarcha(marcha);
		setCasco(casco);
	}
	
	/* M�todos Modificadores */
	public void setMarcha(boolean mar) { marcha = mar; }
	public void setCasco(boolean casc) { casco = casc; }

	/* M�todos Accesores */
	public boolean getMarcha() { return marcha; }
	public boolean getCasco() { return casco; }
	
	public void mostrarBici() {
		System.out.println("\nMarcha: "+getMarcha()+"\nCasco. "+getCasco());
	}

}
