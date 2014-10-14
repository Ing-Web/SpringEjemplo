package co.edu.udea.iw.dao;

import java.util.List;

import co.edu.udea.iw.dto.Ciudad;
import co.edu.udea.iw.exception.IWDaoException;

/**
 * Interface que provee los metodos que va a proveer el dao de ciudad
 * @throws IWDaoException
 * 
 */
public interface CiudadDAO {

	/**
	 * Entrega la lista de ciudades existentes en la bse de datos
	 * @return lista ciudades
	 * @throws IWDaoEXception ocurre un error con la conexion
	 */

	public List<Ciudad> obtener() throws IWDaoException;

	/**
	 * Entrega los datos de una ciudad dado su codigo
	 * @param codigo codigo de la ciudad a consultar
	 * @return una instancia de los datos de la ciudad obtenida, si no existe
	 * una ciudad con el codigo dado retorna null
	 * @throws IWDaoEXception ocurre un error con la base de datos
	 */
	public Ciudad obtener(Integer codigo) throws IWDaoException;
	
}
