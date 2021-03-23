package PracticaRecuperacion;

/**Interfaz ICancion , da la unidad basica con la que se va a operar en el resto de clases y es implementada por Cancion
 */
public interface ICancion {

    /**
     * Método para añadir un título o modificar el actual
     * @param titulo string con el título de la canción
     * */
    public void setTitulo(String titulo);
    /**
     * Método para obtener el título actual
     * @return devuelve el título actual*/
    public String getTitulo();
    /**
     * Método para añadir una duración o modificar la actual
     * @param duracion float con la duración en minutos,segundos*/
    public void setDuracion(float duracion);
    /**Método para obtener la duración actual
     * @return devuelve un float con la duración en minutos,segundos*/
    public float getDuracion();
}
