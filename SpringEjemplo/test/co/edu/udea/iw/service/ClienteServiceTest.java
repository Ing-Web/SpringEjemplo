package co.edu.udea.iw.service;

import static org.junit.Assert.*;

import org.apache.log4j.varia.FallbackErrorHandler;
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
	@Rollback(false)
	public void testGuardarCliente()  {
		try {
			clienteService.guardarCliente("123", "Matias", "Velasquez", "matiasvelasquez@gmail.com", "juan");
		} catch (IWDaoException | IWServiceException e) {
			e.printStackTrace();
			fail(e.getMessage());
			
		}
	}

}
