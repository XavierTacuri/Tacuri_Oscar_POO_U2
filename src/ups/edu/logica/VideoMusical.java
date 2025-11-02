package ups.edu.logica;
//Clase nueva creada "Actor
public class VideoMusical extends ContenidoAudiovisual  {
	
	private String artista;
	private String album;

	public VideoMusical(String titulo, int duracionEnMinutos, String genero, String artista, String album) {
		super(titulo, duracionEnMinutos, genero);
		this.artista = artista;
		this.album = album;
	}

	public String getArtista() {
		return artista;
	}

	public void setArtista(String artista) {
		this.artista = artista;
	}



	public String getAlbum() {
		return album;
	}



	public void setAlbum(String album) {
		this.album = album;
	}



	@Override
	public void mostrarDetalles() {
		System.out.println("Detalles del Video Musical:");
        System.out.println("ID: " + getId());
        System.out.println("Título: " + getTitulo());
        System.out.println("Duración en minutos: " + getDuracionEnMinutos());
        System.out.println("Género: " + getGenero());
        System.out.println("Artista: " + this.getArtista());
        System.out.println("Album: " + this.getAlbum());
        System.out.println();
		
	}
	
	

}
