/**
 * Proyecto: IMSS  - SSDC
 *
 * Archivo: TestProblemaProcesoDao.java
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

import mx.gob.imss.cia.ssdc.cdv.integracion.entity.ProblemaProcesoEntity;
import mx.gob.imss.cia.ssdc.cdv.test.IntegrationTest;
import mx.gob.imss.cia.ssdc.commons.Constantes;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author propietario
 *
 */
public class TestProblemaProcesoDao  extends IntegrationTest {
	
	@Autowired
	private ProblemaProcesoDao problemaProcesoDao;
	
	@Test
	public void debieraExistirProblema() throws Exception {
		ProblemaProcesoEntity pro = new ProblemaProcesoEntity();
		pro.setCveProblemaProceso(1L);
		pro.setFase(null);
		pro.setNombreProblemaProceso("prueba");
		pro.setStatus(1);
		problemaProcesoDao.create(pro);
	}
	
	@Test
	public void deberiaTraerUnProPorClave() throws Exception {
		ProblemaProcesoEntity nec = problemaProcesoDao.read(1L);
		assertNotNull(nec);
		assertEquals(1, nec.getCveProblemaProceso().intValue());
	}
	
	@Test
	public void deberiaActualizarElEstado() throws Exception {
		ProblemaProcesoEntity nec = problemaProcesoDao.read(1L);
		assertEquals(Constantes.ENABLE, nec.getStatus().intValue());
		nec.setStatus(Constantes.DISABLE);
		problemaProcesoDao.update(nec);
		assertEquals(Constantes.DISABLE, nec.getStatus().intValue());
	}
	
	@Test
	public void deberiaBorrarPro() throws Exception {
		ProblemaProcesoEntity nec = problemaProcesoDao.read(1L);
		assertNotNull(nec);
		problemaProcesoDao.delete(nec);
		nec = problemaProcesoDao.read(1L);
		assertNull(nec);
	}
	
	@Test
	public void deberiaTraerTodosPro() throws Exception {
		List<ProblemaProcesoEntity> todosNec = problemaProcesoDao.findAll();
		assertNotNull(todosNec);
		assertTrue(todosNec.size() > 0);
	}
	

}
