package PracticaRecuperacion;

import java.util.LinkedList;
/**Interfaz PlayMusic , agrupa playLists y es implementada por PlayMusic */
public interface IPlayMusic {

    /**
     * Método para añadir una canción
     * @throws PlayListRepetida si ya existe dentro de la playMusic la playList a añadir
     * @param playList con el objeto PlayList que se va a añadir
     * */
    public void anadirPlayList(PlayList playList) throws PlayListRepetida;

    /**
     * Método para eliminar una canción
     * @throws PlayListNoIncorporadaException si no existe la PlayList que se va a eliminar
     * @param playList con el objeto PlayList que se va a eliminar
     * */
    public void quitarPlayList(PlayList playList) throws PlayListNoIncorporadaException;

    /** Método que devuelve la lista de canciones en un string
     * @return devuelve la lista de canciones como un unico string
     * */
    public String getListaPlayList();

    /**Método que devuelve la lista de canciones como una linkedList
     * @return devuelve la lista de canciones*/
    public LinkedList<PlayList> getPlayLists();
}
