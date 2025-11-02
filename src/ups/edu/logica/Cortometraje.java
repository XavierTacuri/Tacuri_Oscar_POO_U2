package ups.edu.logica;

import java.util.ArrayList;
import java.util.List;
//Clase nueva creada "Actor
public class Cortometraje extends ContenidoAudiovisual{
	
	private String paisOr;
	private String idioma;
	private String director;
	private List<Actor> actores;

	
	
	public Cortometraje(String titulo, int duracionEnMinutos, String genero, String paisOr, String idioma,
			String director) {
		super(titulo, duracionEnMinutos, genero);
		this.paisOr = paisOr;
		this.idioma = idioma;
		this.director = director;
		this.actores = new ArrayList<Actor>();
	}

	
	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public String getPaisOr() {
		return paisOr;
	}

	public void setPaisOr(String paisOr) {
		this.paisOr = paisOr;
	}

	public String getIdioma() {
		return idioma;
	}

	public void setIdioma(String idioma) {
		this.idioma = idioma;
	}
	
	public void agregarActor(Actor actor) {
		actores.add(actor);
	}

	@Override
	public void mostrarDetalles() {
		
		 System.out.println("Detalles del Cortometraje:");
	        System.out.println("ID: " + getId());
	        System.out.println("Título: " + getTitulo());
	        System.out.println("Duración en minutos: " + getDuracionEnMinutos());
	        System.out.println("Género: " + getGenero());
	        System.out.println("Director: " + this.getDirector());
	        System.out.println("Pais Origen: " + this.getPaisOr());
	        System.out.println("Idioma: " + this.getIdioma());
	        System.out.println("Reparto: ");
	        for (Actor actor : actores) {
	            System.out.println(" - " + actor.getNombre()+" "+ actor.getNacionalidad() + " Edad:"+ actor.getEdad());
	        }
	        System.out.println();
		
	}
	
	

}
