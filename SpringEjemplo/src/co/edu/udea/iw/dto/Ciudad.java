package co.edu.udea.iw.dto;

/**
 * Clase dto para los datos de las ciudades
 * 
 * @author HernánDarío
 * 
 */

public class Ciudad {
	/**
	 * Codigo de la ciudad
	 */
	private Integer codigo;

	/**
	 * Nombre completo de la ciudad
	 */
	private String nombre;

	/**
	 * Codigo de area en la que está ubicada la ciudad
	 */
	private Integer codigoArea;

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getCodigoArea() {
		return codigoArea;
	}

	public void setCodigoArea(Integer codigoArea) {
		this.codigoArea = codigoArea;
	}

}
