package PracticaRecuperacion;

/**Interfaz IDisco, agrupa canciones y tiene nombre y grupo , y es implementada por Disco */
public interface IDisco {

    /** Método que te permite añadir un nombre de disco o modificar el actual
     * @param nombreDisco string con el nombre del disco
     * */
    public void setNombreDisco(String nombreDisco);

    /**Método que te permite obtener el nombre del disco actual
     *@return devuelve el nombre del disco como string */
    public String getNombreDisco();

    /**Método que te permite añadir un nombre de grupo o modificar el actual
     * @param nombreGrupo string con el nombre del grupo
     * */
    public void setNombreGrupo(String nombreGrupo);

    /**Método que te permite obtener el nombre del grupo actual
     * @return devuelve el nombre del grupo como string */
    public String getNombreGrupo();

}
