/**
 * Proyecto: IMSS  - SSDC
 *
 * Archivo: TestObjetivoActControlDao.java
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
import mx.gob.imss.cia.ssdc.cdv.integracion.entity.ObjetivoActControlEntity;
import mx.gob.imss.cia.ssdc.cdv.test.IntegrationTest;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author propietario
 *
 */
public class TestObjetivoActControlDao extends IntegrationTest {
	
	@Autowired
	private ObjetivoActControlDao objetivoActControlDao;
	
	@Test
	public void debieraExistirNec() throws Exception {
		ObjetivoActControlEntity obj = new ObjetivoActControlEntity();
		obj.setCveObjActControl(1L);
		obj.setNombreObjActControl("prueba");
		objetivoActControlDao.create(obj);
	}
	
	@Test
	public void deberiaTraerUnObjetivoPorClave() throws Exception {
		ObjetivoActControlEntity obj = objetivoActControlDao.read(1L);
		assertNotNull(obj);
		assertEquals(1, obj.getCveObjActControl().intValue());
	}
	
	@Test
	public void deberiaActualizarElEstado() throws Exception {
		ObjetivoActControlEntity nec = objetivoActControlDao.read(1L);
		nec.setNombreObjActControl("pruebaUpdate");
		objetivoActControlDao.update(nec);
		ObjetivoActControlEntity obj = objetivoActControlDao.read(1L);
		assertEquals("pruebaUpdate", obj.getNombreObjActControl());
	}
	
	@Test
	public void deberiaBorrarObjetivo() throws Exception {
		ObjetivoActControlEntity nec = objetivoActControlDao.read(1L);
		assertNotNull(nec);
		objetivoActControlDao.delete(nec);
		nec = objetivoActControlDao.read(1L);
		assertNull(nec);
	}

}
