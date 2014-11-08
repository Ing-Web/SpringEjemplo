package co.edu.udea.iw.service;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import co.edu.udea.iw.dto.Cliente;
import co.edu.udea.iw.exception.IWDaoException;
import co.edu.udea.iw.exception.IWServiceException;

@RunWith(SpringJUnit4ClassRunner.class)
@Transactional
@ContextConfiguration(locations = "classpath:configuracion.xml")
public class ClienteServiceTest {

	@Autowired
	ClienteService clienteService;

	@Test
	@Rollback(false)
	public void testGuardarCliente() {

		try {

			clienteService.guardarCliente("10382302", "Matias", "Velasquez",
					"matias.velasquez@gmail.com", "elver");
			assertTrue(true);
		} catch (IWDaoException | IWServiceException e) {
			e.printStackTrace();
			fail(e.getMessage());

		}
	}

	@Test
	@Rollback(false)
	public void TestObtener() {
		try {
			List<Cliente> clientes = clienteService.obtener();
			assertTrue(true);
			for (Cliente cliente : clientes) {
				System.out.println("La cedula del cliente es : "
						+ cliente.getCedula() + ". el nombre es : "
						+ cliente.getNombres() + ". los apeellidos son: "
						+ cliente.getApellidos() + " y el correo es: "
						+ cliente.getCorreoelectronico());
			}
		} catch (IWDaoException e) {
			System.out.println("Ocurrió un error en testObtener: "
					+ e.getMessage());
			fail(e.getMessage());
		}
	}
}
