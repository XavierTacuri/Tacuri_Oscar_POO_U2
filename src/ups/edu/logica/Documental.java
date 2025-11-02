/**
 * Class Documental
 */
package ups.edu.logica;

// Subclase Documental que extiende de ContenidoAudiovisual
public class Documental extends ContenidoAudiovisual {
    private String area;
    private Investigador investigador;
    
  

	public Documental(String titulo, int duracionEnMinutos, String genero, String area, Investigador investigador) {
		super(titulo, duracionEnMinutos, genero);
		this.area = area;
		this.investigador = investigador;
	}

	
	public Investigador getInvestigador() {
		return investigador;
	}


	public void setInvestigador(Investigador investigador) {
		this.investigador = investigador;
	}


	public String getArea() {
        return area;
    }

    public void setTema(String area) {
        this.area = area;
    }
    
    @Override
    public void mostrarDetalles() {
        System.out.println("Detalles del Documental:");
        System.out.println("ID: " + getId());
        System.out.println("Título: " + getTitulo());
        System.out.println("Duración en minutos: " + getDuracionEnMinutos());
        System.out.println("Género: " + getGenero());
        System.out.println("Area de Estudio: " + this.area);
        System.out.println("Investigador: " + investigador.getNombre() );
        System.out.println();
    }
}