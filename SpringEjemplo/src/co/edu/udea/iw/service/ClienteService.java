package co.edu.udea.iw.service;

import java.util.Date;
import java.util.List;

import co.edu.udea.iw.dao.ClienteDAO;
import co.edu.udea.iw.dao.UsuarioDAO;
import co.edu.udea.iw.dto.Cliente;
import co.edu.udea.iw.dto.Usuario;
import co.edu.udea.iw.exception.IWDaoException;
import co.edu.udea.iw.exception.IWServiceException;
import co.edu.udea.iw.util.validations.Validaciones;

public class ClienteService {

	private ClienteDAO clienteDAO;
				
	private UsuarioDAO usuarioDAO;

	public void guardarCliente(String cedula, String nombres, String apellidos,
			String correoElectronico, String usuarioCrea)
			throws IWDaoException, IWServiceException {

		Cliente cliente = null;

		if (Validaciones.isTextoVacio(cedula)) {
			throw new IWServiceException(
					"La cedula del cliente no puede ser nula, ni una cadena de caracteres vacio");
		}

		if (Validaciones.isTextoVacio(nombres)) {
			throw new IWServiceException(
					"El nombre del cliente no puede ser nula, ni una cadena de caracteres vacio");
		}

		if (Validaciones.isTextoVacio(apellidos)) {
			throw new IWServiceException(
					"El apellido del cliente no puede ser nula, ni una cadena de caracteres vacio");
		}

		if (Validaciones.isTextoVacio(correoElectronico)) {
			throw new IWServiceException(
					"El correo electronico del cliente no puede ser nula, ni una cadena de caracteres vacio");
		}

		if (Validaciones.isTextoVacio(usuarioCrea)) {
			throw new IWServiceException(
					"El usuario que crea al clietne no puede ser nula, ni una cadena de caracteres vacio");
		}
		if (!Validaciones.isEmail(correoElectronico)) {
			throw new IWServiceException(
					"El correo electronico del cleinte debe ser valido");
		}

		Usuario usuario = usuarioDAO.obtener(usuarioCrea);
		if (usuario == null) {
			throw new IWServiceException(
					"El usuario que crea el cliente debe ser un usuario de sistema");
		}
		cliente = new Cliente();
		cliente.setCedula(cedula);
		cliente.setNombres(nombres);
		cliente.setApellidos(apellidos);
		cliente.setCorreoelectronico(correoElectronico);
		cliente.setUsuarioCrea(usuario);
		cliente.setFechaCreacion(new Date());
		cliente.setEliminado(Boolean.FALSE);

		clienteDAO.insertar(cliente);
	}

	public List<Cliente> obtener() throws IWDaoException {
		return clienteDAO.obtener();
	}

	public Cliente obtener(String cedula) throws IWServiceException,
			IWDaoException {
		if (cedula == null || "".equals(cedula)) {
			throw new IWServiceException(
					"La cedula del cliente a buscar no puede ser nula, ni una cadena de caracteres vacio");
		}
		return clienteDAO.obtener(cedula);
	}

	public ClienteDAO getClienteDAO() {
		return clienteDAO;
	}

	public void setClienteDAO(ClienteDAO clienteDAO) {
		this.clienteDAO = clienteDAO;
	}

	public UsuarioDAO getUsuarioDAO() {
		return usuarioDAO;
	}

	public void setUsuarioDAO(UsuarioDAO usuarioDAO) {
		this.usuarioDAO = usuarioDAO;
	}
}
