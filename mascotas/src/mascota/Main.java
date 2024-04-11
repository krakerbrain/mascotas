package mascota;

import clases.Perro;
import clases.Persona;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Perro perro1 = new Perro();
		perro1.setNombre("Messi");
		perro1.setEdad(12);
		perro1.setRaza("Pitbull");
		perro1.setTamano("Mediano");
		Persona persona1 = new Persona();
		persona1.setNombre("Mario");
		persona1.setApellido("Flores");
		persona1.setEdad(45);
		persona1.setRut("10770017-k");
		persona1.setPerro(perro1);

//		Perro perro2 = new Perro();
//		perro2.setNombre("Ronaldo");
//		perro2.setEdad(7);
//		perro2.setRaza("Chiguagua");
//		perro2.setTamano("Pequeño");
//		Persona persona2 = new Persona();
//		persona2.setNombre("Andres");
//		persona2.setApellido("Martinez");
//		persona2.setEdad(35);
//		persona2.setRut("13847496-5");
//		persona2.setPerro(perro2);
		
		Perro perro2 = new Perro("Ronaldo", 8, "Chiguagua", "pequeño");
		Persona persona2 = new Persona("Andres", "Martinez", 35, "13847496-1", perro2);
		Perro datosPerro1 = persona1.getPerro();
		Perro datosPerro2 = persona2.getPerro();

		System.out.println("El perro: " + datosPerro1.getNombre() + ", pertenece a : " + persona1.getNombre() + " "
				+ persona1.getApellido());
		System.out.println("El perro: " + datosPerro2.getNombre() + ", pertenece a : " + persona2.getNombre() + " "
				+ persona2.getApellido());
	}

}
