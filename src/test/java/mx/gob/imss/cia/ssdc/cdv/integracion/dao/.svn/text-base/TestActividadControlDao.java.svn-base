/**
 * Proyecto: IMSS  - SSDC
 *
 * Archivo: TestActividadControlDao.java
 *
 * Creado: 17/10/2011
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

import mx.gob.imss.cia.ssdc.cdv.integracion.entity.ActividadControlEntity;
import mx.gob.imss.cia.ssdc.cdv.test.IntegrationTest;
import mx.gob.imss.cia.ssdc.commons.Constantes;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * 
 * @author Equipo de Desarrollo
 * 
 */
public class TestActividadControlDao extends IntegrationTest {

	@Autowired
	private ActividadControlDao actividadControlDao;

	@Test
	public void deberiaCrearUnaActividad() throws Exception {
		ActividadControlEntity actividad = new ActividadControlEntity();
		actividad.setNombreActControl("accion control");
		actividad.setObjetivoControl(null);
		actividad.setStatus(Constantes.ENABLE);
		actividad.setTipoVentanilla(null);

		List<ActividadControlEntity> todasAcciones = actividadControlDao
				.findAll();
		actividadControlDao.create(actividad);
		assertTrue(actividadControlDao.findAll().size() > todasAcciones.size());
	}

	@Test
	public void deberiaTraerUnaActividadPorClave() throws Exception {
		ActividadControlEntity actividadPorClave = actividadControlDao.read(1L);
		assertNotNull(actividadPorClave);
		assertEquals(1, actividadPorClave.getCveActControl().intValue());
	}

	@Test
	public void deberiaActualizarElEstado() throws Exception {
		ActividadControlEntity actividad = actividadControlDao.read(1L);
		assertEquals(Constantes.ENABLE, actividad.getStatus());

		actividad.setStatus(Constantes.DISABLE);
		actividadControlDao.update(actividad);
		assertEquals(Constantes.DISABLE, actividad.getStatus());
	}

	@Test
	public void deberiaBorrarLaActividad() throws Exception {
		ActividadControlEntity actividad = new ActividadControlEntity();
		actividad.setStatus(Constantes.ENABLE);
		actividadControlDao.create(actividad);
		Long cveActControl = actividad.getCveActControl();
		
		assertNotNull(actividad);
		actividadControlDao.delete(actividad);

		actividad = actividadControlDao.read(cveActControl);
		assertNull(actividad);
	}

	@Test
	public void deberiaTraerTodasLasActividades() throws Exception {
		List<ActividadControlEntity> todasActividades = actividadControlDao
				.findAll();
		assertNotNull(todasActividades);
		assertTrue(todasActividades.size() > 0);
	}
}
