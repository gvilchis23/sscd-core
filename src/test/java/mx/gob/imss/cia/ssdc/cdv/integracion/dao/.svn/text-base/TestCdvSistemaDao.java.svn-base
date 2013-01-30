/**
 * Proyecto: IMSS  - SSDC
 *
 * Archivo: TestCdvSistemaDao.java
 *
 * Creado: 19/10/2011
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

import mx.gob.imss.cia.ssdc.cdv.integracion.entity.CdvEntity;
import mx.gob.imss.cia.ssdc.cdv.integracion.entity.CdvSistemaEntity;
import mx.gob.imss.cia.ssdc.cdv.integracion.entity.LlaveCompCdvSistema;
import mx.gob.imss.cia.ssdc.cdv.integracion.entity.SistemaEntity;
import mx.gob.imss.cia.ssdc.cdv.test.IntegrationTest;
import mx.gob.imss.cia.ssdc.commons.Constantes;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * 
 * @author Equipo de Desarrollo
 * 
 */
public class TestCdvSistemaDao extends IntegrationTest {

	private static final long CVE_SISTEMA = 1L;

	private static final long CVE_CDV_NUEVO = 2L;

	private static final long CVE_CDV = 1L;

	@Autowired
	private CdvSistemaDao cdvSistemaDao;

	public LlaveCompCdvSistema crearLlaveCompuesta(Long cveCdv, Long cveSistema) {
		CdvEntity cdv = new CdvEntity();
		cdv.setCveCdv(cveCdv);

		SistemaEntity sistema = new SistemaEntity();
		sistema.setCveSistema(cveSistema);

		LlaveCompCdvSistema id = new LlaveCompCdvSistema();
		id.setCdv(cdv);
		id.setSistema(sistema);
		return id;
	}

	@Test
	public void deberiaCrearUnCdvSistema() throws Exception {
		LlaveCompCdvSistema id = crearLlaveCompuesta(CVE_CDV_NUEVO, CVE_SISTEMA);

		CdvSistemaEntity cdvSistema = new CdvSistemaEntity();
		cdvSistema.setLlave(id);
		cdvSistema.setFrecuencia(null);
		List<CdvSistemaEntity> todasAcciones = cdvSistemaDao.findAll();
		cdvSistemaDao.create(cdvSistema);
		assertTrue(cdvSistemaDao.findAll().size() > todasAcciones.size());
	}

	@Test
	public void deberiaTraerUnCdvSistemaPorClave() throws Exception {
		LlaveCompCdvSistema id = crearLlaveCompuesta(CVE_CDV, CVE_SISTEMA);

		CdvSistemaEntity cdvSistemaPorClave = cdvSistemaDao.read(id);
		assertNotNull(cdvSistemaPorClave);
		assertEquals(CVE_SISTEMA, cdvSistemaPorClave.getLlave().getSistema()
		        .getCveSistema().intValue());
		assertEquals(CVE_CDV, cdvSistemaPorClave.getLlave().getCdv()
		        .getCveCdv().intValue());
	}

	@Test
	public void deberiaActualizarLaCveFrecuencia() throws Exception {
		LlaveCompCdvSistema id = crearLlaveCompuesta(CVE_CDV, CVE_SISTEMA);

		CdvSistemaEntity cdvServicio = cdvSistemaDao.read(id);
		assertEquals(Constantes.ENABLE, cdvServicio.getFrecuencia()
		        .getCveFrecuenciaUso().intValue());
		cdvServicio.setFrecuencia(null);
		cdvSistemaDao.update(cdvServicio);
		assertNull(cdvServicio.getFrecuencia());
	}

	@Test
	public void deberiaBorrarLaCdvSistema() throws Exception {
		LlaveCompCdvSistema id = crearLlaveCompuesta(CVE_CDV, CVE_SISTEMA);

		CdvSistemaEntity cdvServicio = cdvSistemaDao.read(id);
		assertNotNull(cdvServicio);
		cdvSistemaDao.delete(cdvServicio);

		cdvServicio = cdvSistemaDao.read(id);
		assertNull(cdvServicio);
	}

	@Test
	public void deberiaTraerTodasLasCdvSistema() throws Exception {
		List<CdvSistemaEntity> todosServicios = cdvSistemaDao.findAll();
		assertNotNull(todosServicios);
		assertTrue(todosServicios.size() > 0);
	}

}
