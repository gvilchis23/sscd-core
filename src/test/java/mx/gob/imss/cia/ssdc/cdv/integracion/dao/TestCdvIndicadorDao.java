/**
 * Proyecto: IMSS  - SSDC
 *
 * Archivo: TestCdvIndicadorDao.java
 *
 * Creado: 18/10/2011
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
import mx.gob.imss.cia.ssdc.cdv.integracion.entity.CdvIndicadorEntity;
import mx.gob.imss.cia.ssdc.cdv.integracion.entity.IndicadorEntity;
import mx.gob.imss.cia.ssdc.cdv.integracion.entity.LlaveCompuestaCdvIndicador;
import mx.gob.imss.cia.ssdc.cdv.test.IntegrationTest;
import mx.gob.imss.cia.ssdc.commons.Constantes;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * 
 * @author Equipo de Desarrollo
 * 
 */
public class TestCdvIndicadorDao extends IntegrationTest {

	@Autowired
	private CdvIndicadorDao cdvIndicadorDao;

	private LlaveCompuestaCdvIndicador crearLlaveCompuesta(Long cveCdv,
	        Long cveIndicador) {
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

		IndicadorEntity indicador = new IndicadorEntity();
		indicador.setCveIndicador(cveIndicador);
		indicador.setStatus(Constantes.ENABLE);

		LlaveCompuestaCdvIndicador id = new LlaveCompuestaCdvIndicador();
		id.setCdv(cdv);
		id.setIndicador(indicador);
		return id;
	}

	@Test
	public void deberiaCrearUnCdvIndicador() throws Exception {
		LlaveCompuestaCdvIndicador id = crearLlaveCompuesta(1L, 2L);

		CdvIndicadorEntity cdvIndicador = new CdvIndicadorEntity();
		cdvIndicador.setLlave(id);
		cdvIndicador.setUltimoResultadoMedicion(Constantes.ENABLE);

		List<CdvIndicadorEntity> todasAcciones = cdvIndicadorDao.findAll();
		cdvIndicadorDao.create(cdvIndicador);
		assertTrue(cdvIndicadorDao.findAll().size() > todasAcciones.size());
	}

	@Test
	public void deberiaTraerUnaCdvPorClave() throws Exception {
		LlaveCompuestaCdvIndicador id = crearLlaveCompuesta(1L, 1L);
		CdvIndicadorEntity cdvPorClave = cdvIndicadorDao.read(id);

		assertNotNull(cdvPorClave);

		assertEquals(id.getCdv().getCveCdv().intValue(), cdvPorClave.getLlave()
		        .getCdv().getCveCdv().intValue());

		assertEquals(id.getIndicador().getCveIndicador().intValue(),
		        cdvPorClave.getLlave().getIndicador().getCveIndicador()
		                .intValue());
	}

	@Test
	public void deberiaActualizarElNumeroDeVentanillas() throws Exception {
		LlaveCompuestaCdvIndicador id = crearLlaveCompuesta(1L, 1L);

		CdvIndicadorEntity cdvIndicador = cdvIndicadorDao.read(id);
		assertEquals(Constantes.ENABLE,
		        cdvIndicador.getUltimoResultadoMedicion());
		cdvIndicador.setUltimoResultadoMedicion(Constantes.DISABLE);
		cdvIndicadorDao.update(cdvIndicador);
		assertEquals(Constantes.DISABLE,
		        cdvIndicador.getUltimoResultadoMedicion());
	}

	@Test
	public void deberiaBorrarLaCausa() throws Exception {
		LlaveCompuestaCdvIndicador id = crearLlaveCompuesta(1L, 1L);
		CdvIndicadorEntity cdv = cdvIndicadorDao.read(id);
		assertNotNull(cdv);
		cdvIndicadorDao.delete(cdv);

		cdv = cdvIndicadorDao.read(id);
		assertNull(cdv);
	}

	@Test
	public void deberiaTraerTodasLasCausas() throws Exception {
		List<CdvIndicadorEntity> todasCdvs = cdvIndicadorDao.findAll();
		assertNotNull(todasCdvs);
		assertTrue(todasCdvs.size() > 0);
	}

}