/**
 * Proyecto: IMSS  - SSDC
 *
 * Archivo: TestPeriodoDao.java
 *
 * Creado:  Oct 20, 2011
 *
 * Derechos Reservados de copia (c) - INAP /
 *
 * Instituto Mexicano del Seguro Social - 2011
 */
package mx.gob.imss.cia.ssdc.cdv.integracion.dao;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import java.util.Date;
import java.util.List;

import mx.gob.imss.cia.ssdc.cdv.integracion.entity.PeriodoEntity;
import mx.gob.imss.cia.ssdc.cdv.test.IntegrationTest;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author propietario
 *
 */
public class TestPeriodoDao  extends IntegrationTest {
	

	@Autowired
	private PeriodoDao periodoDao;
	
	
	@Test
	public void debieraExistirPeriodo() throws Exception {
		PeriodoEntity nec = new PeriodoEntity();
		nec.setCvePeriodo(1L);
		nec.setFechaFin(new Date());
		nec.setFechaInicio(new Date());
		nec.setNumeroPeriodo(1);
		nec.setProcesoCarga(null);
		periodoDao.create(nec);
	}
	
	@Test
	public void deberiaTraerUnPeriodoPorClave() throws Exception {
		PeriodoEntity nec = periodoDao.read(1L);
		assertNotNull(nec);
		assertEquals(1, nec.getCvePeriodo().intValue());
	}
	
	@Test
	public void deberiaBorrarPeriodo() throws Exception {
		PeriodoEntity nec = periodoDao.read(1L);
		assertNotNull(nec);
		periodoDao.delete(nec);
		nec = periodoDao.read(1L);
		assertNull(nec);
	}
	
	@Test
	public void deberiaTraerTodosPeriodos() throws Exception {
		List<PeriodoEntity> todosNec = periodoDao.findAll();
		assertNotNull(todosNec);
		assertTrue(todosNec.size() > 0);
	}

}
