
public class Cliente {
	private String nombre;
	private String dni;
	
	Cliente( String nombre, String dni){
		setNombre(nombre);
		setDni(dni);
	}
	

	/* M�todos modificadores*/
	public void setNombre(String nom) { nombre = nom; }
	public void setDni(String dn) { dni = dn; }

	/* M�todos Accesores  */
	public String getNombre() { return nombre; }
	public String getDni() { return dni; }
	
	
}
