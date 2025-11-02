/**
 * Class Pelicula
 */
package ups.edu.logica;

import java.util.ArrayList;
import java.util.List;

// Subclase Pelicula que extiende de ContenidoAudiovisual
public class Pelicula extends ContenidoAudiovisual {
    private String estudio;
    private List<Actor> actores;

    public Pelicula(String titulo, int duracionEnMinutos, String genero, String estudio) {
		super(titulo, duracionEnMinutos, genero);
		this.estudio = estudio;
		this.actores = new ArrayList<>();
	}

    public void agregarActor(Actor actor) {
        actores.add(actor);
    }
    
	public List<Actor> getActores() {
		return actores;
	}

	public void setActores(List<Actor> actores) {
		this.actores = actores;
	}

	public String getEstudio() {
        return estudio;
    }

    public void setEstudio(String estudio) {
        this.estudio = estudio;
    }
    
    @Override
    public void mostrarDetalles() {
        System.out.println("Detalles de la película:");
        System.out.println("ID: " + getId());
        System.out.println("Título: " + getTitulo());
        System.out.println("Duración en minutos: " + getDuracionEnMinutos());
        System.out.println("Género: " + getGenero());
        System.out.println("Estudio: " + estudio);
        System.out.println("Reparto: ");
        for (Actor actor : actores) {
            System.out.println(" - " + actor.getNombre()+" "+ actor.getNacionalidad() + " Edad:"+ actor.getEdad());
        }
        System.out.println();
    }
}