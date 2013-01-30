/**
 * Proyecto: IMSS  - SSDC
 *
 * Archivo: TestCdvProblCuantiDao.java
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

import mx.gob.imss.cia.ssdc.cdv.integracion.entity.CdvProblCuantiEntity;
import mx.gob.imss.cia.ssdc.cdv.integracion.entity.LlaveCompProblCuanti;
import mx.gob.imss.cia.ssdc.cdv.integracion.entity.NecCuantitativasEntity;
import mx.gob.imss.cia.ssdc.cdv.integracion.entity.ProblematicaEntity;
import mx.gob.imss.cia.ssdc.cdv.test.IntegrationTest;
import mx.gob.imss.cia.ssdc.commons.Constantes;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * 
 * @author Equipo de Desarrollo
 * 
 */
public class TestCdvProblCuantiDao extends IntegrationTest {

	@Autowired
	private CdvProblCuantiDao cdvProblCuantiDao;

	public LlaveCompProblCuanti crearLlaveCompuesta(Long cveNecesidad,
	        Long cveProblematica) {
		NecCuantitativasEntity necesidades = new NecCuantitativasEntity();
		necesidades.setCveNecCuantitativas(cveNecesidad);
		necesidades.setStatus(Constantes.ENABLE);

		ProblematicaEntity problematica = new ProblematicaEntity();
		problematica.setCveProblematica(cveProblematica);
		problematica.setStatus(Constantes.ENABLE);

		LlaveCompProblCuanti id = new LlaveCompProblCuanti();
		id.setCuantitativas(necesidades);
		id.setProblematica(problematica);
		return id;
	}

	@Test
	public void deberiaCrearUnaProblCuanti() throws Exception {
		LlaveCompProblCuanti id = crearLlaveCompuesta(1L, 2L);

		CdvProblCuantiEntity neceProbl = new CdvProblCuantiEntity();
		neceProbl.setLlave(id);
		neceProbl.setNumeroElementos(Constantes.ENABLE);

		List<CdvProblCuantiEntity> todasAcciones = cdvProblCuantiDao.findAll();
		cdvProblCuantiDao.create(neceProbl);
		assertTrue(cdvProblCuantiDao.findAll().size() > todasAcciones.size());
	}

	@Test
	public void deberiaTraerUnaProblCuantiPorClave() throws Exception {
		LlaveCompProblCuanti id = crearLlaveCompuesta(1L, 1L);
		CdvProblCuantiEntity cdvPorClave = cdvProblCuantiDao.read(id);
		assertNotNull(cdvPorClave);

		assertEquals(id.getCuantitativas().getCveNecCuantitativas().intValue(),
		        cdvPorClave.getLlave().getCuantitativas()
		                .getCveNecCuantitativas().intValue());

		assertEquals(id.getProblematica().getCveProblematica().intValue(),
		        cdvPorClave.getLlave().getProblematica().getCveProblematica()
		                .intValue());
	}

	@Test
	public void deberiaActualizarElNumeroDeElementos() throws Exception {
		LlaveCompProblCuanti id = crearLlaveCompuesta(1L, 1L);

		CdvProblCuantiEntity neceProble = cdvProblCuantiDao.read(id);
		assertEquals(Constantes.ENABLE, neceProble.getNumeroElementos());
		neceProble.setNumeroElementos(Constantes.DISABLE);
		cdvProblCuantiDao.update(neceProble);
		assertEquals(Constantes.DISABLE, neceProble.getNumeroElementos());
	}

	@Test
	public void deberiaBorrarUnaProblCuanti() throws Exception {
		LlaveCompProblCuanti id = crearLlaveCompuesta(1L, 1L);
		CdvProblCuantiEntity cdv = cdvProblCuantiDao.read(id);
		assertNotNull(cdv);
		cdvProblCuantiDao.delete(cdv);

		cdv = cdvProblCuantiDao.read(id);
		assertNull(cdv);
	}

	@Test
	public void deberiaTraerTodasLasProblCuantis() throws Exception {
		List<CdvProblCuantiEntity> todasCdvs = cdvProblCuantiDao.findAll();
		assertNotNull(todasCdvs);
		assertTrue(todasCdvs.size() > 0);
	}
}
