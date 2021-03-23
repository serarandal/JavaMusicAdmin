package PracticaRecuperacion;

/**Excepción diseñada para saltar cuando se intente eliminar una canción que no este incorporada en una playlist
 * */
public class CancionNoIncorporadaException extends Exception {
    private Cancion cancion;

    /**Constructor no vacío
     * @param cancion objeto cancion que hace saltar la excepción*/
    public CancionNoIncorporadaException(Cancion cancion)
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

