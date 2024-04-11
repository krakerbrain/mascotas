package clases;

public class Perro {
	private String nombre;
	private int edad;
	private String raza;
	private String tamano;
	
	
	/**
	 * 
	 */
	public Perro() {
	}


	/**
	 * @param nombre
	 * @param edad
	 * @param raza
	 * @param tamano
	 */
	public Perro(String nombre, int edad, String raza, String tamano) {
		this.nombre = nombre;
		this.edad = edad;
		this.raza = raza;
		this.tamano = tamano;
	}


	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}


	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	/**
	 * @return the edad
	 */
	public int getEdad() {
		return edad;
	}


	/**
	 * @param edad the edad to set
	 */
	public void setEdad(int edad) {
		this.edad = edad;
	}


	/**
	 * @return the raza
	 */
	public String getRaza() {
		return raza;
	}


	/**
	 * @param raza the raza to set
	 */
	public void setRaza(String raza) {
		this.raza = raza;
	}


	/**
	 * @return the tamano
	 */
	public String getTamano() {
		return tamano;
	}


	/**
	 * @param tamano the tamano to set
	 */
	public void setTamano(String tamano) {
		this.tamano = tamano;
	}
	
	
	
	
}
