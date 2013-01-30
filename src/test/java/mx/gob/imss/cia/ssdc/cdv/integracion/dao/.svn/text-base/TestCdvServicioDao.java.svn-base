/**
 * Proyecto: IMSS  - SSDC
 *
 * Archivo: TestCdvServicioDao.java
 *
 * Creado:  13/10/2011
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
import mx.gob.imss.cia.ssdc.cdv.integracion.entity.CdvServicioEntity;
import mx.gob.imss.cia.ssdc.cdv.integracion.entity.LlaveCompuestaCdv;
import mx.gob.imss.cia.ssdc.cdv.integracion.entity.ServicioEntity;
import mx.gob.imss.cia.ssdc.cdv.test.IntegrationTest;
import mx.gob.imss.cia.ssdc.commons.Constantes;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author Gamaliel
 * 
 */

public class TestCdvServicioDao extends IntegrationTest {

	private static final long CVE_SERVICIO = 1L;

	private static final long CVE_CDV_NUEVO = 2L;

	private static final long CVE_CDV = 1L;

	@Autowired
	private CdvServicioDao cdvServicioDao;

	@Test
	public void debieraExistirCdvServicioDao() throws Exception {
		assertNotNull(cdvServicioDao);
	}

	@Test
	public void deberiaHeredarDePersistenceDao() {
		assertTrue(cdvServicioDao instanceof PersistenceDao<?, ?>);
	}

	public LlaveCompuestaCdv crearLlaveCompuesta(Long cveCdv, Long cveServicio) {
		CdvEntity cdv = new CdvEntity();
		cdv.setCveCdv(cveCdv);

		ServicioEntity servicio = new ServicioEntity();
		servicio.setCveServicio(cveServicio);

		LlaveCompuestaCdv id = new LlaveCompuestaCdv();
		id.setCdv(cdv);
		id.setServicio(servicio);
		return id;
	}

	@Test
	public void deberiaCrearUnCdvServicio() throws Exception {
		LlaveCompuestaCdv id = crearLlaveCompuesta(CVE_CDV_NUEVO, CVE_SERVICIO);

		CdvServicioEntity cdvServicio = new CdvServicioEntity();
		cdvServicio.setLlaveCompuesta(id);
		cdvServicio.setNombreServicio("S");
		List<CdvServicioEntity> todasAcciones = cdvServicioDao.findAll();
		cdvServicioDao.create(cdvServicio);
		assertTrue(cdvServicioDao.findAll().size() > todasAcciones.size());
	}

	@Test
	public void deberiaTraerUnaCdvServicioPorClave() throws Exception {
		LlaveCompuestaCdv id = crearLlaveCompuesta(CVE_CDV, CVE_SERVICIO);

		CdvServicioEntity cdvServicioPorClave = cdvServicioDao.read(id);
		assertNotNull(cdvServicioPorClave);
		assertEquals(1, cdvServicioPorClave.getLlaveCompuesta().getServicio()
		        .getCveServicio().intValue());
		assertEquals(1, cdvServicioPorClave.getLlaveCompuesta().getCdv()
		        .getCveCdv().intValue());
	}

	@Test
	public void deberiaActualizarElNumEspFila() throws Exception {
		LlaveCompuestaCdv id = crearLlaveCompuesta(CVE_CDV, CVE_SERVICIO);

		CdvServicioEntity cdvServicio = cdvServicioDao.read(id);
		assertEquals(Constantes.ENABLE, cdvServicio.getDatoHoraEspera()
		        .intValue());
		cdvServicio.setDatoHoraEspera(Constantes.DISABLE);
		cdvServicioDao.update(cdvServicio);
		assertEquals(Constantes.DISABLE, cdvServicio.getDatoHoraEspera()
		        .intValue());
	}

	@Test
	public void deberiaBorrarLaCdvServicio() throws Exception {
		LlaveCompuestaCdv id = crearLlaveCompuesta(CVE_CDV, CVE_SERVICIO);

		CdvServicioEntity cdvServicio = cdvServicioDao.read(id);
		assertNotNull(cdvServicio);
		cdvServicioDao.delete(cdvServicio);

		cdvServicio = cdvServicioDao.read(id);
		assertNull(cdvServicio);
	}

	@Test
	public void deberiaTraerTodasLasCdvServicios() throws Exception {
		List<CdvServicioEntity> todosServicios = cdvServicioDao.findAll();
		assertNotNull(todosServicios);
		assertTrue(todosServicios.size() > 0);
	}

	@Test
	public void deberiaRecuperarServiciosPorClaveDeCdv() throws Exception {
		List<CdvServicioEntity> servicios = cdvServicioDao
		        .recuperarCdvServicios(CVE_CDV);
		for (CdvServicioEntity cdvServicioEntity : servicios) {
			assertEquals(new Long(CVE_CDV), cdvServicioEntity
			        .getLlaveCompuesta().getServicio().getCveServicio());
		}
	}
}
