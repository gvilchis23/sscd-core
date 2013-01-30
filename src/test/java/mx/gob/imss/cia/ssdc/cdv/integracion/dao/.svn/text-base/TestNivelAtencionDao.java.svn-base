/**
 * Proyecto: IMSS  - SSDC
 *
 * Archivo: TestNivelAtencionDao.java
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

import mx.gob.imss.cia.ssdc.cdv.integracion.entity.NivelAtencionEntity;
import mx.gob.imss.cia.ssdc.cdv.test.IntegrationTest;
import mx.gob.imss.cia.ssdc.commons.Constantes;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author propietario
 *
 */
public class TestNivelAtencionDao extends IntegrationTest {
	
	@Autowired
	private NivelAtencionDao nivelAtencionDao;
	
	@Test
	public void debieraExistirNivelAtencion() throws Exception {
		NivelAtencionEntity nivel = new NivelAtencionEntity();
		nivel.setCveNivelAtencion(1L);
		nivel.setNombreNivelAtencion("prueba");
		nivel.setStatus(1);
		nivelAtencionDao.create(nivel);
	}
	
	@Test
	public void deberiaTraerNecesidadPorClave() throws Exception {
		NivelAtencionEntity nec = nivelAtencionDao.read(1L);
		assertNotNull(nec);
		assertEquals(1, nec.getCveNivelAtencion().intValue());
	}
	
	@Test
	public void deberiaActualizarElEstado() throws Exception {
		NivelAtencionEntity nec = nivelAtencionDao.read(1L);
		assertEquals(Constantes.ENABLE, nec.getStatus());
		nec.setStatus(Constantes.DISABLE);
		nivelAtencionDao.update(nec);
		assertEquals(Constantes.DISABLE, nec.getStatus());
	}
	
	@Test
	public void deberiaBorrarNecesidad() throws Exception {
		NivelAtencionEntity nec = nivelAtencionDao.read(1L);
		assertNotNull(nec);
		nivelAtencionDao.delete(nec);
		nec = nivelAtencionDao.read(1L);
		assertNull(nec);
	}
	
	@Test
	public void deberiaTraerTodasNecesidades() throws Exception {
		List<NivelAtencionEntity> todosNec = nivelAtencionDao.findAll();
		assertNotNull(todosNec);
		assertTrue(todosNec.size() > 0);
	}

}
