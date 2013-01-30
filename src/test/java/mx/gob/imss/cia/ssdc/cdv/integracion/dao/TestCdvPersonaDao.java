/**
 * Proyecto: IMSS  - SSDC
 *
 * Archivo: TestCdvPersonaDao.java
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
import mx.gob.imss.cia.ssdc.cdv.integracion.entity.CdvPersonaEntity;
import mx.gob.imss.cia.ssdc.cdv.integracion.entity.LlaveCompuestaCdvPersona;
import mx.gob.imss.cia.ssdc.cdv.integracion.entity.PersonaPropiaEntity;
import mx.gob.imss.cia.ssdc.cdv.test.IntegrationTest;
import mx.gob.imss.cia.ssdc.commons.Constantes;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * 
 * @author Equipo de Desarrollo
 * 
 */
public class TestCdvPersonaDao extends IntegrationTest {

	private static final long CVE_CDV = 1L;

	private static final long CVE_PERSONA_PROPIA = 2410L;

	@Autowired
	private CdvPersonaDao cdvPersonaDao;

	@Test
	public void debieraExistirCdvPersonaDao() throws Exception {
		assertNotNull(cdvPersonaDao);
	}

	@Test
	public void deberiaHeredarDePersistenceDao() {
		assertTrue(cdvPersonaDao instanceof PersistenceDao<?, ?>);
	}

	public LlaveCompuestaCdvPersona crearLlaveCompuesta(Long cveCdv,
			Long cvePersonaPropia) {
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

		PersonaPropiaEntity persona = new PersonaPropiaEntity();
		persona.setCvePersona(cvePersonaPropia);
		persona.setStatus(Constantes.ENABLE);

		LlaveCompuestaCdvPersona id = new LlaveCompuestaCdvPersona();
		id.setCdv(cdv);
		id.setPersona(persona);
		return id;
	}

	@Test
	public void deberiaCrearUnCdvPersona() throws Exception {
		long cveNuevaPersonaPropia = 2411L;
		LlaveCompuestaCdvPersona id = crearLlaveCompuesta(CVE_CDV,
				cveNuevaPersonaPropia);

		CdvPersonaEntity control = new CdvPersonaEntity();
		control.setLlaveCompuesta(id);
		control.setStatus(Constantes.ENABLE);
		List<CdvPersonaEntity> todasAcciones = cdvPersonaDao.findAll();
		cdvPersonaDao.create(control);
		assertTrue(cdvPersonaDao.findAll().size() > todasAcciones.size());
	}

	@Test
	public void deberiaTraerUnCdvPersonaPorClave() throws Exception {
		LlaveCompuestaCdvPersona id = crearLlaveCompuesta(CVE_CDV,
				CVE_PERSONA_PROPIA);

		CdvPersonaEntity cdvPersonaPorClave = cdvPersonaDao.read(id);
		assertNotNull(cdvPersonaPorClave);
		assertEquals(CVE_PERSONA_PROPIA, cdvPersonaPorClave.getLlaveCompuesta()
				.getPersona().getCvePersona().intValue());
		assertEquals(CVE_CDV, cdvPersonaPorClave.getLlaveCompuesta().getCdv()
				.getCveCdv().intValue());
	}

	@Test
	public void deberiaActualizarElStatus() throws Exception {
		LlaveCompuestaCdvPersona id = crearLlaveCompuesta(CVE_CDV,
				CVE_PERSONA_PROPIA);

		CdvPersonaEntity control = cdvPersonaDao.read(id);
		assertEquals(Constantes.ENABLE, control.getStatus());
		control.setStatus(Constantes.DISABLE);
		cdvPersonaDao.update(control);
		assertEquals(Constantes.DISABLE, control.getStatus());
	}

	@Test
	public void deberiaBorrarLaCategoriaProblematica() throws Exception {
		LlaveCompuestaCdvPersona id = crearLlaveCompuesta(CVE_CDV,
				CVE_PERSONA_PROPIA);

		CdvPersonaEntity accion = cdvPersonaDao.read(id);
		assertNotNull(accion);
		cdvPersonaDao.delete(accion);

		accion = cdvPersonaDao.read(id);
		assertNull(accion);
	}

	@Test
	public void deberiaTraerTodasLasCategoriasProblematicas() throws Exception {
		List<CdvPersonaEntity> todasAcciones = cdvPersonaDao.findAll();
		assertNotNull(todasAcciones);
		assertTrue(todasAcciones.size() > 0);
	}
}
