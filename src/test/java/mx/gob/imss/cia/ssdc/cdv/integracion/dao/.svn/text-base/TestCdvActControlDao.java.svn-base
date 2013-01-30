/**
 * Proyecto: IMSS  - SSDC
 *
 * Archivo: TestCdvActControlDao.java
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
import mx.gob.imss.cia.ssdc.cdv.integracion.entity.CdvActControlEntity;
import mx.gob.imss.cia.ssdc.cdv.integracion.entity.CdvEntity;
import mx.gob.imss.cia.ssdc.cdv.integracion.entity.LlaveCompuestaCdvControl;
import mx.gob.imss.cia.ssdc.cdv.integracion.entity.TurnoEntity;
import mx.gob.imss.cia.ssdc.cdv.test.IntegrationTest;
import mx.gob.imss.cia.ssdc.commons.Constantes;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * 
 * @author Equipo de Desarrollo
 * 
 */
public class TestCdvActControlDao extends IntegrationTest {

	@Autowired
	private CdvActControlDao cdvActControlDao;

	public LlaveCompuestaCdvControl crearLlaveCompuesta(Long cveCdv,
	        Long cveActControl) {
		LlaveCompuestaCdvControl id = new LlaveCompuestaCdvControl();

		ActividadControlEntity actividad = new ActividadControlEntity();
		actividad.setCveActControl(cveActControl);
		CdvEntity cdv = new CdvEntity();
		TurnoEntity turno = new TurnoEntity();
		turno.setCveTurno(1L);
		cdv.setCveCdv(cveCdv);
		cdv.setTurno(turno);
		id.setActividad(actividad);
		id.setCdv(cdv);
		return id;
	}

	@Test
	public void deberiaCrearUnCdvActControl() throws Exception {

		LlaveCompuestaCdvControl id = crearLlaveCompuesta(1L, 2L);

		CdvActControlEntity control = new CdvActControlEntity();
		control.setLlave(id);
		control.setCumplioObjetivo(Constantes.ENABLE);
		List<CdvActControlEntity> todasAcciones = cdvActControlDao.findAll();
		cdvActControlDao.create(control);
		assertTrue(cdvActControlDao.findAll().size() > todasAcciones.size());
	}

	@Test
	public void deberiaTraerUnaCdvActControlPorClave() throws Exception {
		LlaveCompuestaCdvControl id = crearLlaveCompuesta(1L, 1L);

		CdvActControlEntity accionPorClave = cdvActControlDao.read(id);
		assertNotNull(accionPorClave);
		assertEquals(1, accionPorClave.getLlave().getActividad()
		        .getCveActControl().intValue());
	}

	@Test
	public void deberiaActualizarElObjetivo() throws Exception {
		LlaveCompuestaCdvControl id = crearLlaveCompuesta(1L, 1L);

		CdvActControlEntity control = cdvActControlDao.read(id);
		assertEquals(Constantes.ENABLE, control.getCumplioObjetivo());
		control.setCumplioObjetivo(Constantes.DISABLE);
		cdvActControlDao.update(control);
		assertEquals(Constantes.DISABLE, control.getCumplioObjetivo());
	}

	@Test
	public void deberiaBorrarLaCdvActControl() throws Exception {
		LlaveCompuestaCdvControl id = crearLlaveCompuesta(1L, 1L);

		CdvActControlEntity accion = cdvActControlDao.read(id);
		assertNotNull(accion);
		cdvActControlDao.delete(accion);

		accion = cdvActControlDao.read(id);
		assertNull(accion);
	}

	@Test
	public void deberiaTraerTodasLasCdvActControl() throws Exception {
		List<CdvActControlEntity> todasAcciones = cdvActControlDao.findAll();
		assertNotNull(todasAcciones);
		assertTrue(todasAcciones.size() > 0);
	}

}
