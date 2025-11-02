/**
 * Class SerieDeTV
 */
package ups.edu.logica;

import java.util.ArrayList;
import java.util.List;

// Subclase SerieDeTV que extiende de ContenidoAudiovisual
public class SerieDeTV extends ContenidoAudiovisual {
    
	private List<Temporada> listTemporadas; //Creacion de una lista "Temporadas" aplico el concepto de composicion 
    										//Ya que un Serie de TV debe tener por lo minimo 2 capitulos y 1 temporada 							
   
    public SerieDeTV(String titulo, int duracionEnMinutos, String genero) {
		super(titulo, duracionEnMinutos, genero);
		this.listTemporadas = new ArrayList<>();
	}

    public void agregarTemporada(Temporada temporada) {
        listTemporadas.add(temporada);
    }


	@Override
    public void mostrarDetalles() {
        System.out.println("Detalles de la Serie:");
        System.out.println("ID: " + getId());
        System.out.println("Título: " + getTitulo());
        System.out.println("Duración en minutos: " + getDuracionEnMinutos());
        System.out.println("Género: " + getGenero());
        for (Temporada tempo : listTemporadas) {
            System.out.println(" - Temporada: " + tempo.getNumTempo()+ " " + " Capitulos: " + tempo.getNumCapitulos());
        }
        System.out.println();
    }
}