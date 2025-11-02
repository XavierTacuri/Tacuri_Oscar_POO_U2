package ups.edu.principal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import ups.edu.logica.*;

public class PruebaAudioVisual {
	public static void main(String[] args) {
       

        // Crear instancias de las subclases
        List<ContenidoAudiovisual>  contenidos = new ArrayList<ContenidoAudiovisual>();
        // inicialiazacion de los objetos peliclas y actor
        Actor actor1 = new Actor("Tom Cruise", 61, "EE.UU");
        Actor actor2 = new Actor("Jeremy Renner", 54, "EE.UU");
        Pelicula pelicula = new Pelicula("Misión Imposible: Protocolo Fantasma", 130, "Acción", "WarnerBross");
        pelicula.agregarActor(actor1);
        pelicula.agregarActor(actor2);
        
        contenidos.add(pelicula);
        
        // inicialiazacion de los objetos serieTv y temporada
        Temporada temp1= new Temporada(1, 8);
        SerieDeTV serieTv = new SerieDeTV("The Terminal List", 51, "Accion, Thriller");
        serieTv.agregarTemporada(temp1);
        
        contenidos.add(serieTv);
        //Inicializacion de los objetos Documental y investiador
        Investigador inv1 = new Investigador("Jane Goodall", "Biología");
        Documental doc = new Documental("El mundo de los chimpancés", 90, "Ciencia", "Primates", inv1);
        
        contenidos.add(doc);
        
        //Inicializacion de los objetos videoMusical
        VideoMusical videoMu = new VideoMusical("The Sound of Silince", 5 , "Folk-Rock", "Disturbed", "Immortalized");
        
        contenidos.add(videoMu);
        //Inicializacion de los objetos cortometraje
        Actor actorC1 = new Actor("Rosario Pardo", 65 , "España");
        Actor actorC2 = new Actor("Alicia Fernández", 32, "España");
        Cortometraje corMe= new Cortometraje("El lado más bestia de la vida", 14, "Ficción", "España", "Español", "José Antonio Campos Aguilera");
        corMe.agregarActor(actorC1);
        corMe.agregarActor(actorC2);
        contenidos.add(corMe);
       
        for (ContenidoAudiovisual contAu:contenidos) {
        	contAu.mostrarDetalles();
        }
     
    }
}