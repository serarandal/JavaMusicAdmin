package PracticaRecuperacion;

/**Excepción diseñada para saltar cuando se intente añadir una canción que ya esta incorporada en una playlist
 * */
public class CancionRepetidaException extends Exception {

    private Cancion cancion;

    /**Constructor no vacío
     * @param cancion objeto cancion que hace saltar la excepción*/
    public CancionRepetidaException(Cancion cancion)
    {
        this.cancion = cancion;
    }

    /**Método que te permite obtener el objeto cancion que ha hecho saltar la excepción
     * @return devuelve un objeto cancion*/
    public Cancion getCancion()
    {
        return this.cancion;
    }

}
