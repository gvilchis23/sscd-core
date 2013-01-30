/**
 * Proyecto: IMSS  - SSDC
 *
 * Archivo: TestSalidaDao.java
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

import mx.gob.imss.cia.ssdc.cdv.integracion.entity.SalidaEntity;
import mx.gob.imss.cia.ssdc.cdv.test.IntegrationTest;
import mx.gob.imss.cia.ssdc.commons.Constantes;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author propietario
 *
 */
public class TestSalidaDao extends IntegrationTest {
	
	@Autowired
	private SalidaDao salidaDao;
	
	@Test
	public void debieraExistirSalida() throws Exception {
		SalidaEntity sal = new SalidaEntity();
		sal.setCveSalida(1L);
		sal.setNombreSalida("prueba");
		sal.setStatus(1);
		sal.setTipoVentanilla(null);
		salidaDao.create(sal);
	}
	
	@Test
	public void deberiaTraerUnSalidaPorClave() throws Exception {
		SalidaEntity nec = salidaDao.read(1L);
		assertNotNull(nec);
		assertEquals(1, nec.getCveSalida().intValue());
	}
	
	@Test
	public void deberiaActualizarElEstado() throws Exception {
		SalidaEntity nec = salidaDao.read(1L);
		assertEquals(Constantes.ENABLE, nec.getStatus().intValue());
		nec.setStatus(Constantes.DISABLE);
		salidaDao.update(nec);
		assertEquals(Constantes.DISABLE, nec.getStatus().intValue());
	}
	
	@Test
	public void deberiaBorrarSalida() throws Exception {
		SalidaEntity nec = salidaDao.read(1L);
		assertNotNull(nec);
		salidaDao.delete(nec);
		nec = salidaDao.read(1L);
		assertNull(nec);
	}
	
	@Test
	public void deberiaTraerTodasSalidas() throws Exception {
		List<SalidaEntity> todosNec = salidaDao.findAll();
		assertNotNull(todosNec);
		assertTrue(todosNec.size() > 0);
	}

}
