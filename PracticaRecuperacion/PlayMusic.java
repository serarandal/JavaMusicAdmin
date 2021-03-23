package PracticaRecuperacion;

import java.util.LinkedList;

/**Clase PlayMusic , agrupa playLists */
public class PlayMusic implements IPlayMusic
{
	private LinkedList PlayLists = new LinkedList<PlayList>();


	/**
	 * Método para añadir una canción
	 * @throws PlayListRepetida si ya existe dentro de la playMusic la playList a añadir
	 * @param playList con el objeto PlayList que se va a añadir
	 * */
	public void anadirPlayList(PlayList playList) throws PlayListRepetida {
		if(-1 == PlayLists.indexOf(playList))
		{
			PlayLists.add(playList);
		} else
			{
				throw new PlayListRepetida(playList);
			}
	}

	/**
	 * Método para eliminar una cancion
	 * @throws PlayListNoIncorporadaException si no existe la PlayList que se va a eliminar
	 * @param playList con el objeto PlayList que se va a eliminar
	 * */
	public void quitarPlayList(PlayList playList) throws PlayListNoIncorporadaException
	{
		if(-1!= PlayLists.indexOf(playList))
		{
			PlayLists.remove(playList);
		}  else
			{
				throw new PlayListNoIncorporadaException(playList);
			}
	}

	/** Método que devuelve la lista de playLists en un string
	 * @return devuelve la lista de playLists como un unico string
	 * */
	public String getListaPlayList()
	{
		return PlayLists.toString();
	}

	/**Método que devuelve la lista de playlists como una linkedList
	 * @return devuelve la lista de playlists*/
	public LinkedList<PlayList> getPlayLists()
	{
		return  this.PlayLists;
	}
}