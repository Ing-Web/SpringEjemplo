package co.edu.udea.iw.dao;

import java.util.List;

import co.edu.udea.iw.dto.Cliente;
import co.edu.udea.iw.exception.IWDaoException;

/**
 * Interface que describe los metodos que un cliente puede realizar contra
 * la base de datos
 * @author HernánDarío
 *
 */

public interface ClienteDAO {
	
	/**
	 * Crea un nuevo cliente en el sistema
	 * @param cliente instancia del cliente a usar
	 * @return cliente insertado
	 * @throws IWDaoException cuando ocurre cualquier error en la comunicacion con la BD
	 */
	public Cliente insertar(Cliente cliente) throws IWDaoException;
	
	/**
	 * Modifica la información de un cliente el el sistema
	 * @param cliente instancia del cliente a modificar
	 * @return cliente modificado
	 * @throws IWDaoException cuando ocurre cualquier error en la comunicacion con la BD
	 */
	public Cliente modificar(Cliente cliente) throws IWDaoException;
	
	/**
	 * Elimina logicamente un cliente en el sistema
	 * @param cliente instancia del cleitne a eliminar
	 * @throws IWDaoException cuando ocurre cualquier error en la comunicacion con la BD
	 */
	public void iliminar(Cliente cliente) throws IWDaoException;

	/**
	 * Entrega la lista de cliente activos en el sistema
	 * @return lista de clientes
	 * @throws IWDaoException cuando ocurre cualquier error en la comunicacion con la BD
	 */
	public List<Cliente> obtener() throws IWDaoException;
	
	/**
	 * Entrega la informacion de un cliente dada su cedula
	 * @param cedula identificacion del cliente
	 * @return instancia con los datos del cleinte
	 * @throws IWDaoException cuando ocurre cualquier error en la comunicacion con la BD
	 */
	public Cliente obtener(String cedula) throws IWDaoException;

}
