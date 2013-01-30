/**
 * Proyecto: IMSS  - SSDC
 *
 * Archivo: TestRequisitosCdvDao.java
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
import mx.gob.imss.cia.ssdc.cdv.integracion.entity.LlaveCompuestaRequisitosCdv;
import mx.gob.imss.cia.ssdc.cdv.integracion.entity.RequisitosCdvEntity;
import mx.gob.imss.cia.ssdc.cdv.integracion.entity.RequisitosEntity;
import mx.gob.imss.cia.ssdc.cdv.integracion.entity.ServicioEntity;
import mx.gob.imss.cia.ssdc.cdv.test.IntegrationTest;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author Gamaliel
 * 
 */

public class TestRequisitosCdvDao extends IntegrationTest {

	private static final Long CVE_CDV = 1L;

	private static final Long CVE_REQUISITO = 1L;

	private static final Long CVE_SERVICIO = 1L;

	private static final Long CVE_CDV_NUEVO = 2L;
	@Autowired
	private RequisitosCdvDao requisitosCdvDao;

	@Test
	public void debieraExistirRequisitosCdvDao() throws Exception {
		assertNotNull(requisitosCdvDao);
	}

	@Test
	public void deberiaHeredarDePersistenceDao() {
		assertTrue(requisitosCdvDao instanceof PersistenceDao<?, ?>);
	}

	private LlaveCompuestaRequisitosCdv crearLlaveCompuesta(Long cveCdv,
	        Long cveRequisitos, Long cveServicio) {
		CdvEntity cdv = new CdvEntity();
		cdv.setCveCdv(cveCdv);
		cdv.setHoraNormalFin(0);
		cdv.setHoraNormalIni(0);
		cdv.setHoraRealFin(0);
		cdv.setHoraRealIni(0);
		cdv.setMinNormalFin(0);
		cdv.setMinNormalIni(0);
		cdv.setMinRealFin(0);
		cdv.setMinRealIni(0);
		cdv.setNumeroVentanillas(0);

		RequisitosEntity requisito = new RequisitosEntity();
		requisito.setCveRequisitos(cveRequisitos);

		ServicioEntity servicio = new ServicioEntity();
		servicio.setCveServicio(cveServicio);

		LlaveCompuestaRequisitosCdv id = new LlaveCompuestaRequisitosCdv();
		id.setCdv(cdv);
		id.setRequisito(requisito);
		id.setServicio(servicio);

		return id;
	}

	@Test
	public void deberiaCrearUnRequisitoCdv() throws Exception {
		LlaveCompuestaRequisitosCdv id = crearLlaveCompuesta(CVE_CDV_NUEVO,
		        CVE_REQUISITO, CVE_SERVICIO);

		RequisitosCdvEntity periodoUnidad = new RequisitosCdvEntity();
		periodoUnidad.setLlaveCompuesta(id);

		List<RequisitosCdvEntity> todasAcciones = requisitosCdvDao.findAll();
		requisitosCdvDao.create(periodoUnidad);
		assertTrue(requisitosCdvDao.findAll().size() > todasAcciones.size());
	}

	@Test
	public void deberiaTraerUnRequisitoCdvPorClave() throws Exception {
		LlaveCompuestaRequisitosCdv id = crearLlaveCompuesta(CVE_CDV,
		        CVE_REQUISITO, CVE_SERVICIO);
		RequisitosCdvEntity cdvPorClave = requisitosCdvDao.read(id);

		assertNotNull(cdvPorClave);

		assertEquals(CVE_CDV, cdvPorClave.getLlaveCompuesta().getCdv()
		        .getCveCdv());

		assertEquals(CVE_REQUISITO, cdvPorClave.getLlaveCompuesta()
		        .getRequisito().getCveRequisitos());

		assertEquals(CVE_SERVICIO, cdvPorClave.getLlaveCompuesta()
		        .getServicio().getCveServicio());
	}

	@Test
	public void deberiaActualizarLaDescripcion() throws Exception {
		LlaveCompuestaRequisitosCdv id = crearLlaveCompuesta(CVE_CDV,
		        CVE_REQUISITO, CVE_SERVICIO);

		RequisitosCdvEntity cdvIndicador = requisitosCdvDao.read(id);
		assertEquals("descripcion", cdvIndicador.getDescripcion());
		
		cdvIndicador.setDescripcion("descripcionAct");
		requisitosCdvDao.update(cdvIndicador);
		
		cdvIndicador = requisitosCdvDao.read(id);
		assertEquals("descripcionAct", cdvIndicador.getDescripcion());
	}

	@Test
	public void deberiaBorrarElRequisitoCdv() throws Exception {
		LlaveCompuestaRequisitosCdv id = crearLlaveCompuesta(CVE_CDV,
		        CVE_REQUISITO, CVE_SERVICIO);
		RequisitosCdvEntity cdv = requisitosCdvDao.read(id);
		assertNotNull(cdv);
		requisitosCdvDao.delete(cdv);

		cdv = requisitosCdvDao.read(id);
		assertNull(cdv);
	}

	@Test
	public void deberiaTraerTodasLosRequisitoCdv() throws Exception {
		List<RequisitosCdvEntity> todasCdvs = requisitosCdvDao.findAll();
		assertNotNull(todasCdvs);
		assertTrue(todasCdvs.size() > 0);
	}

}
