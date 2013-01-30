/**
 * Proyecto: IMSS  - SSDC
 *
 * Archivo: TestProblematicaDao.java
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

import mx.gob.imss.cia.ssdc.cdv.integracion.entity.ProblematicaEntity;
import mx.gob.imss.cia.ssdc.cdv.test.IntegrationTest;
import mx.gob.imss.cia.ssdc.commons.Constantes;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author propietario
 *
 */
public class TestProblematicaDao  extends IntegrationTest  {
	
	@Autowired
	private ProblematicaDao problematicaDao;
	
	@Test
	public void debieraExistirProbl() throws Exception {
		ProblematicaEntity nec = new ProblematicaEntity();
		nec.setCveProblematica(1L);
		nec.setNecCualitativas(null);
		nec.setNecesidad(null);
		nec.setNombreProblematica("prueba");
		nec.setStatus(1);
		nec.setSubProblematica(null);
		nec.setTipoVentanilla(null);
		problematicaDao.create(nec);
	}
	
	@Test
	public void deberiaTraerUnProbPorClave() throws Exception {
		ProblematicaEntity nec = problematicaDao.read(1L);
		assertNotNull(nec);
		assertEquals(1, nec.getCveProblematica().intValue());
	}
	
	@Test
	public void deberiaActualizarElEstado() throws Exception {
		ProblematicaEntity nec = problematicaDao.read(1L);
		assertEquals(Constantes.ENABLE, nec.getStatus().intValue());
		nec.setStatus(Constantes.DISABLE);
		problematicaDao.update(nec);
		assertEquals(Constantes.DISABLE, nec.getStatus().intValue());
	}
	
	@Test
	public void deberiaBorrarProbl() throws Exception {
		ProblematicaEntity nec = problematicaDao.read(1L);
		assertNotNull(nec);
		problematicaDao.delete(nec);
		nec = problematicaDao.read(1L);
		assertNull(nec);
	}
	
	@Test
	public void deberiaTraerTodasLosMedios() throws Exception {
		List<ProblematicaEntity> todosNec = problematicaDao.findAll();
		assertNotNull(todosNec);
		assertTrue(todosNec.size() > 0);
	}

}
