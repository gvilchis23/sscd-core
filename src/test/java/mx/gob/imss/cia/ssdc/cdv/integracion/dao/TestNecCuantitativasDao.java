/**
 * Proyecto: IMSS  - SSDC
 *
 * Archivo: TestNecCuantitativasDao.java
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

import mx.gob.imss.cia.ssdc.cdv.integracion.entity.NecCuantitativasEntity;
import mx.gob.imss.cia.ssdc.cdv.test.IntegrationTest;
import mx.gob.imss.cia.ssdc.commons.Constantes;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author propietario
 *
 */
public class TestNecCuantitativasDao extends IntegrationTest {
	
	@Autowired
	private NecCuantitativasDao necCuantitativasDao;
	
	@Test
	public void debieraExistirNec() throws Exception {
		NecCuantitativasEntity nec = new NecCuantitativasEntity();
		nec.setCveNecCuantitativas(1L);
		nec.setNombreNecCuantitativas("prueba");
		nec.setStatus(1);
		necCuantitativasDao.create(nec);
	}
	
	@Test
	public void deberiaTraerUnNecPorClave() throws Exception {
		NecCuantitativasEntity nec = necCuantitativasDao.read(1L);
		assertNotNull(nec);
		assertEquals(1, nec.getCveNecCuantitativas().intValue());
	}
	
	@Test
	public void deberiaActualizarElEstado() throws Exception {
		NecCuantitativasEntity nec = necCuantitativasDao.read(1L);
		assertEquals(Constantes.ENABLE, nec.getStatus());
		nec.setStatus(Constantes.DISABLE);
		necCuantitativasDao.update(nec);
		assertEquals(Constantes.DISABLE, nec.getStatus());
	}
	
	@Test
	public void deberiaBorrarMedio() throws Exception {
		NecCuantitativasEntity nec = necCuantitativasDao.read(1L);
		assertNotNull(nec);
		necCuantitativasDao.delete(nec);
		nec = necCuantitativasDao.read(1L);
		assertNull(nec);
	}
	
	@Test
	public void deberiaTraerTodasLosMedios() throws Exception {
		List<NecCuantitativasEntity> todosNec = necCuantitativasDao.findAll();
		assertNotNull(todosNec);
		assertTrue(todosNec.size() > 0);
	}
	

}
