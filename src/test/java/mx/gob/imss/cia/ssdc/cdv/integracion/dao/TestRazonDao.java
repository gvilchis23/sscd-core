/**
 * Proyecto: IMSS  - SSDC
 *
 * Archivo: TestRazonDao.java
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

import mx.gob.imss.cia.ssdc.cdv.integracion.entity.RazonEntity;
import mx.gob.imss.cia.ssdc.cdv.test.IntegrationTest;
import mx.gob.imss.cia.ssdc.commons.Constantes;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author propietario
 *
 */
public class TestRazonDao  extends IntegrationTest {
	
	@Autowired
	private RazonDao razonDao;
	

	@Test
	public void debieraExistirRazon() throws Exception {
		RazonEntity raz = new RazonEntity();
		raz.setCveRazon(1L);
		raz.setGusto(1);
		raz.setGustoTrabajo(1);
		raz.setNombreRazon("prueba");
		raz.setStatus(1);
		raz.setTipoVentanilla(null);
		razonDao.create(raz);
	}
	
	@Test
	public void deberiaTraerRazonPorClave() throws Exception {
		RazonEntity nec = razonDao.read(1L);
		assertNotNull(nec);
		assertEquals(1, nec.getCveRazon().intValue());
	}
	
	@Test
	public void deberiaActualizarElEstado() throws Exception {
		RazonEntity nec = razonDao.read(1L);
		assertEquals(Constantes.ENABLE, nec.getStatus().intValue());
		nec.setStatus(Constantes.DISABLE);
		razonDao.update(nec);
		assertEquals(Constantes.DISABLE, nec.getStatus().intValue());
	}
	
	@Test
	public void deberiaBorrarRazon() throws Exception {
		RazonEntity nec = razonDao.read(1L);
		assertNotNull(nec);
		razonDao.delete(nec);
		nec = razonDao.read(1L);
		assertNull(nec);
	}
	
	@Test
	public void deberiaTraerTodasRazon() throws Exception {
		List<RazonEntity> todosNec = razonDao.findAll();
		assertNotNull(todosNec);
		assertTrue(todosNec.size() > 0);
	}
	

}
