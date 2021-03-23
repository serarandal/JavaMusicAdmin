package PracticaRecuperacion;

import java.util.LinkedList;
/**Interfaz IPlayList , agrupa canciones y es implementada por PlayList */
public interface IPlayList {

    /**
     * Método para añadir una canción
     * @throws CancionRepetidaException si ya existe dentro de la playlist la canción a añadir
     * @param cancion con el objeto cancion que se va a añadir
     * */
    public void anadirCancion(Cancion cancion) throws CancionRepetidaException;

    /**
     * Método para eliminar una canción
     * @throws CancionNoIncorporadaException si no existe la canción que se va a eliminar
     * @param cancion con el objeto cancion que se va a eliminar
     * */
    public void quitarCancion(Cancion cancion) throws CancionNoIncorporadaException;

    /** Método que devuelve la lista de canciones en un string
     * @return devuelve la lista de canciones como un unico string
     * */
    public String getListaCanciones();

    /**Método que devuelve la lista de canciones como una linkedList
     * @return devuelve la lista de canciones*/
    public LinkedList<Cancion> getCanciones();
}
