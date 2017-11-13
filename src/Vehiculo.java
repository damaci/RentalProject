public class Vehiculo {
	private int id, kms;
	private String marca, modelo;
	
	Vehiculo( String marca, String modelo, int id, int kilometraje){
		setMarca(marca);
		setModelo(modelo);
		setId(id);
		setKms(kms);
	}
	
	/* Métodos modificadores*/
	public void setMarca(String a) { marca = a; }
	public void setModelo(String o) { modelo = o; }
	public void setId(int d) { id = d; }
	public void setKms(int e) { kms = e; }
	
	/* Métodos Accesores  */
	public String getMarca() { return marca; }
	public String getModelo() { return modelo; }
	public int getId() { return id; }
	public int getKms() { return kms; }
	
	public void mostrarVehiculo() {
		System.out.println("\nMarca " +getMarca()+"\nModelo"+getModelo()+"\nId: "+getId()+
							"\nkms: "+getKms());
	}
}
