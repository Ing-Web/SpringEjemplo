package co.edu.udea.iw.dto;

import java.io.Serializable;
import java.util.Date;

public class Cliente implements Serializable {
	/**
	 * Cedula del cliente
	 */
	private String cedula;

	/**
	 * Nombre del cliente
	 */
	private String nombres;

	/**
	 * Apellidos completos del cliente
	 */
	private String apellidos;

	public Date getFechaModificacion() {
		return fechaModificacion;
	}

	public void setFechaModificacion(Date fechaModificacion) {
		this.fechaModificacion = fechaModificacion;
	}

	/**
	 * Dirección de correo electronico del cliente
	 */
	private String correoelectronico;

	/**
	 * Referencia del usuario del sistema que crea el cliente
	 */
	private Usuario usuarioCrea;

	/**
	 * Fecha de creacion del cliente en el sistema
	 */
	private Date fechaCreacion;

	/**
	 * Referencia del usuario que modifica los datos del cliente en el sistema
	 */

	private Usuario usuarioModifica;

	public Usuario getUsuarioModifica() {
		return usuarioModifica;
	}

	/**
	 * Fecha en la que realiza la ultima modificacion al cliente
	 */
	private Date fechaModificacion;

	/**
	 * Determina si el cliente está o no eliminado en el sistema. No se realiza
	 * borrado fisico, sino logico.
	 */
	private Boolean eliminado;

	/**
	 * Referencia del usuario que elimina los datos del cliente en el sistema
	 */
	private Usuario usuarioElimina;

	/**
	 * Fecha de eliminacion del cliente en el sistema
	 */
	private Date fechaEliminacion;

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getCorreoelectronico() {
		return correoelectronico;
	}

	public void setCorreoelectronico(String correoelectronico) {
		this.correoelectronico = correoelectronico;
	}

	
	public Date getFechaCreacion() {
		return fechaCreacion;
	}

	public void setFechaCreacion(Date fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}

	public Usuario Usuario() {
		return usuarioModifica;
	}

	public void setUsuarioModifica(Usuario usuarioModifica) {
		this.usuarioModifica = usuarioModifica;
	}

	public Date getfechaModificacion() {
		return fechaModificacion;
	}

	public void setfechaModificacion(Date fechaModificacion) {
		this.fechaModificacion = fechaModificacion;
	}

	public Boolean getEliminado() {
		return eliminado;
	}

	public void setEliminado(Boolean eliminado) {
		this.eliminado = eliminado;
	}

	public Usuario getUsuarioCrea() {
		return usuarioCrea;
	}

	public void setUsuarioCrea(Usuario usuarioCrea) {
		this.usuarioCrea = usuarioCrea;
	}

	public Usuario getUsuarioElimina() {
		return usuarioElimina;
	}

	public void setUsuarioElimina(Usuario usuarioElimina) {
		this.usuarioElimina = usuarioElimina;
	}

	public Date getFechaEliminacion() {
		return fechaEliminacion;
	}

	public void setFechaEliminacion(Date fechaEliminacion) {
		this.fechaEliminacion = fechaEliminacion;
	}

}
