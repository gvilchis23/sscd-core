/**
 * Proyecto: IMSS  - SSDC
 *
 * Archivo: TestSistemaDao.java
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

import mx.gob.imss.cia.ssdc.cdv.integracion.entity.SistemaEntity;
import mx.gob.imss.cia.ssdc.cdv.test.IntegrationTest;
import mx.gob.imss.cia.ssdc.commons.Constantes;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author propietario
 *
 */
public class TestSistemaDao extends IntegrationTest{
	
	@Autowired
	private SistemaDao sistemaDao;
	
	@Test
	public void debieraExistirSistema() throws Exception {
		SistemaEntity sis = new SistemaEntity();
		sis.setCveSistema(1L);
		sis.setNombreSistema("prueba");
		sis.setStatus(1);
		sis.setTipoVentanilla(null);
		sistemaDao.create(sis);
	}
	
	@Test
	public void deberiaTraerUnsisPorClave() throws Exception {
		SistemaEntity nec = sistemaDao.read(1L);
		assertNotNull(nec);
		assertEquals(1, nec.getCveSistema().intValue());
	}
	
	@Test
	public void deberiaActualizarElEstado() throws Exception {
		SistemaEntity nec = sistemaDao.read(1L);
		assertEquals(Constantes.ENABLE, nec.getStatus());
		nec.setStatus(Constantes.DISABLE);
		sistemaDao.update(nec);
		assertEquals(Constantes.DISABLE, nec.getStatus());
	}
	
	@Test
	public void deberiaBorrarSistema() throws Exception {
		SistemaEntity nec = sistemaDao.read(1L);
		assertNotNull(nec);
		sistemaDao.delete(nec);
		nec = sistemaDao.read(1L);
		assertNull(nec);
	}
	
	@Test
	public void deberiaTraerTodasLosMedios() throws Exception {
		List<SistemaEntity> todosNec = sistemaDao.findAll();
		assertNotNull(todosNec);
		assertTrue(todosNec.size() > 0);
	}

}
