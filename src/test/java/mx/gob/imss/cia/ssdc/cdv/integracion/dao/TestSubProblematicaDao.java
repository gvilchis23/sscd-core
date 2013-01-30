/**
 * Proyecto: IMSS  - SSDC
 *
 * Archivo: TestSubProblematicaDao.java
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

import java.util.List;

import mx.gob.imss.cia.ssdc.cdv.integracion.entity.SubProblematicaEntity;
import mx.gob.imss.cia.ssdc.cdv.test.IntegrationTest;
import mx.gob.imss.cia.ssdc.commons.Constantes;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author propietario
 *
 */
public class TestSubProblematicaDao extends IntegrationTest {
	
	@Autowired
	private SubProblematicaDao subProblematicaDao;
	
	@Test
	public void debieraExistirSub() throws Exception {
		SubProblematicaEntity sub = new SubProblematicaEntity();
		sub.setCategoria(null);
		sub.setCveSubProblematica(1L);
		sub.setNombreCategoria("prueba");
		sub.setStatus(1);
		subProblematicaDao.create(sub);
	}
	
	@Test
	public void deberiaTraerUnSubPorClave() throws Exception {
		SubProblematicaEntity nec = subProblematicaDao.read(1L);
		assertNotNull(nec);
		assertEquals(1, nec.getCveSubProblematica().intValue());
	}
	
	@Test
	public void deberiaActualizarElEstado() throws Exception {
		SubProblematicaEntity nec = subProblematicaDao.read(1L);
		assertEquals(Constantes.ENABLE, nec.getStatus().intValue());
		nec.setStatus(Constantes.DISABLE);
		subProblematicaDao.update(nec);
		assertEquals(Constantes.DISABLE, nec.getStatus().intValue());
	}
	
	@Test
	public void deberiaBorrarSub() throws Exception {
		SubProblematicaEntity nec = subProblematicaDao.read(1L);
		assertNotNull(nec);
		subProblematicaDao.delete(nec);
		nec = subProblematicaDao.read(1L);
		assertNull(nec);
	}
	
	@Test
	public void deberiaTraerTodosSub() throws Exception {
		List<SubProblematicaEntity> todosNec = subProblematicaDao.findAll();
		assertNotNull(todosNec);
		assertTrue(todosNec.size() > 0);
	}
	

}
