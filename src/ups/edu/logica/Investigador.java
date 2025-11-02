package ups.edu.logica;
//Clase nueva creada "Actor
public class Investigador {

	private String nombre;
	private String especialidad;
	
	public Investigador(String nombre, String especialidad) {
		super();
		this.nombre = nombre;
		this.especialidad = especialidad;

	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getEspecialidad() {
		return especialidad;
	}
	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}

	
	
	
}
