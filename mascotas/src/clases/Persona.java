package clases;

public class Persona {
	// crear nombre. apellido , edad , rut , perro
	
	private String nombre;
	private String apellido;
	private int edad;
	private String rut;
	private Perro perro;
	/**
	 * 
	 */
	public Persona() {
	}
	/**
	 * @param nombre
	 * @param apellido
	 * @param edad
	 * @param rut
	 * @param perro
	 */
	public Persona(String nombre, String apellido, int edad, String rut, Perro perro) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.rut = rut;
		this.perro = perro;
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
	 * @return the apellido
	 */
	public String getApellido() {
		return apellido;
	}
	/**
	 * @param apellido the apellido to set
	 */
	public void setApellido(String apellido) {
		this.apellido = apellido;
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
	 * @return the rut
	 */
	public String getRut() {
		return rut;
	}
	/**
	 * @param rut the rut to set
	 */
	public void setRut(String rut) {
		this.rut = rut;
	}
	/**
	 * @return the perro
	 */
	public Perro getPerro() {
		return perro;
	}
	/**
	 * @param perro the perro to set
	 */
	public void setPerro(Perro perro) {
		this.perro = perro;
	}
	
	
	
}
