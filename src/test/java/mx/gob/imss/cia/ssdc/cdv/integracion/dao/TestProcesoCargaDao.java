/**
 * Proyecto: IMSS  - SSDC
 *
 * Archivo: TestProcesoCargaDao.java
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

import mx.gob.imss.cia.ssdc.cdv.integracion.entity.ProcesoCargaEntity;
import mx.gob.imss.cia.ssdc.cdv.test.IntegrationTest;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author propietario
 *
 */
public class TestProcesoCargaDao extends IntegrationTest {
	
	@Autowired
	private ProcesoCargaDao procesoCargaDao;
	
	@Test
	public void debieraExistirProc() throws Exception {
		ProcesoCargaEntity pro = new ProcesoCargaEntity();
		pro.setAno(null);
		pro.setCveProcesoCarga(1L);
		pro.setFechaFin(new Date());
		pro.setFechaInicio(new Date());
		pro.setTipoCarga(null);
		procesoCargaDao.create(pro);
	}
	
	@Test
	public void deberiaTraerUnProcPorClave() throws Exception {
		ProcesoCargaEntity nec = procesoCargaDao.read(1L);
		assertNotNull(nec);
		assertEquals(1, nec.getCveProcesoCarga().intValue());
	}
	
	@Test
	public void deberiaBorrarProc() throws Exception {
		ProcesoCargaEntity nec = procesoCargaDao.read(1L);
		assertNotNull(nec);
		procesoCargaDao.delete(nec);
		nec = procesoCargaDao.read(1L);
		assertNull(nec);
	}
	
	@Test
	public void deberiaTraerTodasLosProc() throws Exception {
		List<ProcesoCargaEntity> todosNec = procesoCargaDao.findAll();
		assertNotNull(todosNec);
		assertTrue(todosNec.size() > 0);
	}

}
