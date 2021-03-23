package PracticaRecuperacion;

/**Excepción diseñada para saltar cuando se intente añadir una playList que ya este incorporada en una playMusic
 * */
public class PlayListRepetida extends Exception {

    private PlayList playList = new PlayList();

    /**Constructor no vacío
     * @param playList objeto playlist que hace saltar la excepción*/
    public PlayListRepetida(PlayList playList)
    {
        this.playList = playList;
    }

    /**Método que te permite obtener el objeto playList que ha hecho saltar la excepción
     * @return devuelve un objeto playList*/
    public PlayList getPlayList()

    {
        return this.playList;
    }

}
