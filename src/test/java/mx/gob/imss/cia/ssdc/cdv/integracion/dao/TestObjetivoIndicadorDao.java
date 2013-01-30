/**
 * Proyecto: IMSS  - SSDC
 *
 * Archivo: TestObjetivoIndicadorDao.java
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

import mx.gob.imss.cia.ssdc.cdv.integracion.entity.ObjetivoIndicadorEntity;
import mx.gob.imss.cia.ssdc.cdv.test.IntegrationTest;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author propietario
 *
 */
public class TestObjetivoIndicadorDao extends IntegrationTest {
	
	@Autowired
	private ObjetivoIndicadorDao objetivoIndicadorDao;
	
	@Test
	public void debieraExistirIndicador() throws Exception {
		ObjetivoIndicadorEntity obj = new ObjetivoIndicadorEntity();
		obj.setCveObjetivoIndicador(1L);
		obj.setNombreObjetivoIndicador("prueba");
		objetivoIndicadorDao.create(obj);
	}
	
	@Test
	public void deberiaTraerUnObjPorClave() throws Exception {
		ObjetivoIndicadorEntity obj = objetivoIndicadorDao.read(1L);
		assertNotNull(obj);
		assertEquals(1, obj.getCveObjetivoIndicador().intValue());
	}
	
	@Test
	public void deberiaActualizarElNombre() throws Exception {
		ObjetivoIndicadorEntity obj = objetivoIndicadorDao.read(1L);
	    obj.setNombreObjetivoIndicador("cambie");
	    objetivoIndicadorDao.update(obj);
		assertEquals("cambie",obj.getNombreObjetivoIndicador());
	}
	
	@Test
	public void deberiaBorrarObj() throws Exception {
		ObjetivoIndicadorEntity obj = objetivoIndicadorDao.read(1L);
		assertNotNull(obj);
		objetivoIndicadorDao.delete(obj);
		obj = objetivoIndicadorDao.read(1L);
		assertNull(obj);
	}
	
	@Test
	public void deberiaTraerTodasLosObj() throws Exception {
		List<ObjetivoIndicadorEntity> todosObj = objetivoIndicadorDao.findAll();
		assertNotNull(todosObj);
		assertTrue(todosObj.size() > 0);
	}
	

}
