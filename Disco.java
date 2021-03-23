package PracticaRecuperacion;

import java.util.LinkedList;

/**Clase Disco, agrupa canciones y tiene nombre y grupo */
public class Disco  extends PlayList implements IDisco
{
	private LinkedList Canciones = new LinkedList<Cancion>();
	private String nombreDisco;
	private String nombreGrupo;

	/**
	 * Constructor vacío*/
	public Disco()
	{

	}
	/**
	 * Constructor no vacío: permite añadir el nombre del disco y del grupo en su instanciación
	 * @param nombreDisco string con el nombre del disco
	 * @param nombreGrupo string con el nombre del grupo*/
	public Disco(String nombreDisco, String nombreGrupo)
	{
		this.nombreDisco = nombreDisco;
		this.nombreGrupo = nombreGrupo;
	}

	/** Método que te permite añadir un nombre de disco o modificar el actual
	 * @param nombreDisco string con el nombre del disco
	 * */
	public void setNombreDisco(String nombreDisco)
	{
		this.nombreDisco = nombreDisco;
	}
	/**Método que te permite obtener el nombre del disco actual
	 *@return devuelve el nombre del disco como string */
	public String getNombreDisco()
	{
		return this.nombreDisco;
	}

	/**Método que te permite añadir un nombre de grupo o modificar el actual
	 * @param nombreGrupo string con el nombre del grupo
	 * */
	public void setNombreGrupo(String nombreGrupo)
	{
		this.nombreGrupo = nombreGrupo;
	}
	/**Método que te permite obtener el nombre del grupo actual
	 * @return devuelve el nombre del grupo como string */
	public String getNombreGrupo()
	{
		return this.nombreGrupo;
	}

}
