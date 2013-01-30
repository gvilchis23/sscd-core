/**
 * Proyecto: IMSS  - SSDC
 *
 * Archivo: TestNecesidadDao.java
 *
 * Creado:  Oct 19, 2011
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

import mx.gob.imss.cia.ssdc.cdv.integracion.entity.NecesidadEntity;
import mx.gob.imss.cia.ssdc.cdv.test.IntegrationTest;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author propietario
 *
 */
public class TestNecesidadDao extends IntegrationTest {
	
	@Autowired
	private NecesidadDao necesidadDao;
	
	@Test
	public void debieraExistirNecesidad() throws Exception {
		NecesidadEntity nec = new NecesidadEntity();
		nec.setCveNecesidad(1L);
		nec.setNombreNecesidad("prueba");
		necesidadDao.create(nec);
	}
	
	@Test
	public void deberiaTraerNecesidadPorClave() throws Exception {
		NecesidadEntity nec = necesidadDao.read(1L);
		assertNotNull(nec);
		assertEquals(1, nec.getCveNecesidad().intValue());
	}
	
	@Test
	public void deberiaActualizarNecesidad() throws Exception {
		NecesidadEntity nec = necesidadDao.read(1L);
		nec.setNombreNecesidad("prueba2");
		necesidadDao.update(nec);
		assertEquals(1, nec.getCveNecesidad().intValue());
	}
	
	@Test
	public void deberiaBorrarNecesidad() throws Exception {
		NecesidadEntity nec = necesidadDao.read(1L);
		assertNotNull(nec);
		necesidadDao.delete(nec);
		nec = necesidadDao.read(1L);
		assertNull(nec);
	}
	
	@Test
	public void deberiaTraerTodasNecesidad() throws Exception {
		List<NecesidadEntity> todosNec = necesidadDao.findAll();
		assertNotNull(todosNec);
		assertTrue(todosNec.size() > 0);
	}
	

}
