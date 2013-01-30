/**
 * Proyecto: IMSS  - SSDC
 *
 * Archivo: TestNecCualitativasDao.java
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

import mx.gob.imss.cia.ssdc.cdv.integracion.entity.NecCualitativasEntity;
import mx.gob.imss.cia.ssdc.cdv.test.IntegrationTest;
import mx.gob.imss.cia.ssdc.commons.Constantes;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author propietario
 *
 */
public class TestNecCualitativasDao extends IntegrationTest {
	
	@Autowired
	private NecCualitativasDao necCualitativasDao;
	
	@Test
	public void debieraExistirNecCualitativa() throws Exception {
		NecCualitativasEntity nec = new NecCualitativasEntity();
		nec.setCveNecCualitativas(1L);
		nec.setNombreNecCualitativas("prueba");
		nec.setProblematica(null);
		nec.setStatus(1);
		necCualitativasDao.create(nec);
	}
	
	@Test
	public void deberiaTraerUnNecPorClave() throws Exception {
		NecCualitativasEntity nec = necCualitativasDao.read(1L);
		assertNotNull(nec);
		assertEquals(1, nec.getCveNecCualitativas().intValue());
	}
	
	@Test
	public void deberiaActualizarElEstado() throws Exception {
		NecCualitativasEntity nec = necCualitativasDao.read(1L);
		assertEquals(Constantes.ENABLE, nec.getStatus());
		nec.setStatus(Constantes.DISABLE);
		necCualitativasDao.update(nec);
		assertEquals(Constantes.DISABLE, nec.getStatus());
	}
	
	@Test
	public void deberiaBorrarMedio() throws Exception {
		NecCualitativasEntity nec = necCualitativasDao.read(1L);
		assertNotNull(nec);
		necCualitativasDao.delete(nec);
		nec = necCualitativasDao.read(1L);
		assertNull(nec);
	}
	
	@Test
	public void deberiaTraerTodasLosMedios() throws Exception {
		List<NecCualitativasEntity> todosNec = necCualitativasDao.findAll();
		assertNotNull(todosNec);
		assertTrue(todosNec.size() > 0);
	}

}
