package co.edu.udea.iw.service;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import co.edu.udea.iw.exception.IWDaoException;
import co.edu.udea.iw.exception.IWServiceException;

@RunWith(SpringJUnit4ClassRunner.class)
@Transactional
@ContextConfiguration(locations = "classpath:configuracion.xml")
public class ClienteServiceTest {

	@Autowired
	ClienteService clienteService;

	@Test
	//@Rollback(false)
	public void testGuardarCliente() {

		try {
			
			clienteService.guardarCliente("1038232", "Matias", "Velasquez", "matias.velasquez@gmail.com", "juan");
			assertTrue(true);
		} catch (IWDaoException | IWServiceException e) {
			e.printStackTrace();
			fail(e.getMessage());

		}
	}
}
