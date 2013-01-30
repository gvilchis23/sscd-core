/**
 * Proyecto: IMSS  - SSDC
 *
 * Archivo: TestSugerenciaDao.java
 *
 * Creado:  Oct 21, 2011
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

import java.util.List;

import mx.gob.imss.cia.ssdc.cdv.integracion.entity.SugerenciaEntity;
import mx.gob.imss.cia.ssdc.cdv.test.IntegrationTest;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author propietario
 *
 */
public class TestSugerenciaDao extends IntegrationTest {

	@Autowired
	private SugerenciaDao sugerenciaDao;
	
	@Test
	public void debieraExistirSugerencia() throws Exception {
		SugerenciaEntity nec = new SugerenciaEntity();
		nec.setCveSugerencia(1L);
		nec.setCdv(null);
		nec.setNombreSugerencia("prueba");
		sugerenciaDao.create(nec);
	}
	
	@Test
	public void deberiaTraerSugPorClave() throws Exception {
		SugerenciaEntity nec = sugerenciaDao.read(1L);
		assertNotNull(nec);
		assertEquals(1, nec.getCveSugerencia().intValue());
	}
	
	@Test
	public void deberiaBorrarSug() throws Exception {
		SugerenciaEntity nec = sugerenciaDao.read(1L);
		assertNotNull(nec);
		sugerenciaDao.delete(nec);
		nec = sugerenciaDao.read(1L);
		assertNull(nec);
	}
	
	@Test
	public void deberiaTraerTodasSug() throws Exception {
		List<SugerenciaEntity> todosNec = sugerenciaDao.findAll();
		assertNotNull(todosNec);
		assertTrue(todosNec.size() > 0);
	}
	
	
}
