package PracticaRecuperacion;

import java.util.LinkedList;

/**Clase PlayList , agrupa canciones y es heredada por Disco*/
public class PlayList implements IPlayList
{

	private LinkedList Canciones = new LinkedList<Cancion>();

	/**
	 * Método para añadir una canción
	 * @throws CancionRepetidaException si ya existe dentro de la playlist la canción a añadir
	 * @param cancion con el objeto cancion que se va a añadir
	 * */
	public void anadirCancion(Cancion cancion) throws CancionRepetidaException
		{
			if(-1 == Canciones.indexOf(cancion))
			{
				Canciones.add(cancion);
			} else
			{
				throw new CancionRepetidaException(cancion);
			}
		}

	/**
	 * Método para eliminar una canciòn
	 * @throws CancionNoIncorporadaException si no existe la canción que se va a eliminar
	 * @param cancion con el objeto cancion que se va a eliminar
	 * */
	public void quitarCancion(Cancion cancion) throws CancionNoIncorporadaException
	{
		if(-1 != Canciones.indexOf(cancion))
		{
			Canciones.remove(cancion);
		} else
		{
			throw new CancionNoIncorporadaException(cancion);
		}
	}

	/** Método que devuelve la lista de canciones en un string
	 * @return devuelve la lista de canciones como un unico string
	 * */
	public String getListaCanciones()
	{
		return Canciones.toString();
	}

	/**Método que devuelve la lista de canciones como una linkedList
	 * @return devuelve la lista de canciones*/
	public LinkedList<Cancion> getCanciones()
	{
		return this.Canciones;
	}

}