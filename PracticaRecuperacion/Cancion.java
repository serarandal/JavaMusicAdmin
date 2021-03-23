package PracticaRecuperacion;

/**Clase Cancion , da la unidad básica con la que se va a operar en el resto de clases
	*/
public class Cancion implements ICancion
{
	
	private String titulo ;
	private float duracion ;

	/**
	 *Constructor vacío
	 */
	public Cancion()
	{

	}
	/**
	 * Constructor no vacío: permite añadir el título de la canción y la duración en su instanciación
	 * @param titulo es un string con el título de la canción
	 * @param duracion  float es un float en el que se da la duración en minutos,segundos
	 *
	 */
	public Cancion(String titulo, float duracion)
	{
		this.titulo = titulo;
		this.duracion = duracion;
	}

	/**
	 * Método para añadir un título o modificar el actual
	 * @param titulo string con el título de la canción
	 * */
	public void setTitulo(String titulo)
	{
		this.titulo = titulo;
	}
	/**
	 * Método para obtener el título actual
	 * @return devuelve el título actual*/
	public String getTitulo()
	{
		return this.titulo;
	}
	/**
	 * Método para añadir una duración o modificar la actual
	 * @param duracion float con la duración en minutos,segundos*/
	public void setDuracion(float duracion)
	{
		this.duracion = duracion;
	}
	/**Método para obtener la duración actual
	 * @return devuelve un float con la duración en minutos,segundos*/
	public float getDuracion()
	{
		return this.duracion;
	}
}
