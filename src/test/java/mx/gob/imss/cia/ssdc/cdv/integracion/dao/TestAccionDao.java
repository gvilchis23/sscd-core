/**
 * Proyecto: IMSS  - SSDC
 *
 * Archivo: TestAccionDaoImpl.java
 *
 * Creado: 14/10/2011
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

import mx.gob.imss.cia.ssdc.cdv.integracion.entity.AccionEntity;
import mx.gob.imss.cia.ssdc.cdv.test.IntegrationTest;
import mx.gob.imss.cia.ssdc.commons.Constantes;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * 
 * @author Equipo de Desarrollo
 * 
 */
public class TestAccionDao extends IntegrationTest {

	@Autowired
	private AccionDao accionDao;

	@Test
	public void deberiaCrearUnaAccion() throws Exception {
		AccionEntity accion = new AccionEntity();
		accion.setNombreAccion("accion");
		accion.setStatus(Constantes.ENABLE);
		accion.setTipoVentanilla(null);

		List<AccionEntity> todasAcciones = accionDao.findAll();
		accionDao.create(accion);
		assertTrue(accionDao.findAll().size() > todasAcciones.size());
	}

	@Test
	public void deberiaTraerUnaAccionPorClave() throws Exception {
		AccionEntity accionPorClave = accionDao.read(1L);
		assertNotNull(accionPorClave);
		assertEquals(1, accionPorClave.getCveAccion().intValue());
	}

	@Test
	public void deberiaActualizarElEstado() throws Exception {
		AccionEntity accion = accionDao.read(1L);
		assertEquals(Constantes.ENABLE, accion.getStatus());
		accion.setStatus(Constantes.DISABLE);
		accionDao.update(accion);
		assertEquals(Constantes.DISABLE, accion.getStatus());
	}

	@Test
	public void deberiaBorrarLaAccion() throws Exception {
		AccionEntity accion = accionDao.read(1L);
		assertNotNull(accion);
		accionDao.delete(accion);

		accion = accionDao.read(1L);
		assertNull(accion);
	}

	@Test
	public void deberiaTraerTodasLasAcciones() throws Exception {
		List<AccionEntity> todasAcciones = accionDao.findAll();
		assertNotNull(todasAcciones);
		assertTrue(todasAcciones.size() > 0);
	}

}
