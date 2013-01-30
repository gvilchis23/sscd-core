/**
 * Proyecto: IMSS  - SSDC
 *
 * Archivo: TestPaavDaoImpl.java
 *
 * Creado: 25/10/2011
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

import java.util.ArrayList;
import java.util.List;

import mx.gob.imss.cia.ssdc.cdv.integracion.entity.PaavEntity;
import mx.gob.imss.cia.ssdc.cdv.integracion.entity.PeriodoEntity;
import mx.gob.imss.cia.ssdc.cdv.integracion.entity.SscEstatusEntity;
import mx.gob.imss.cia.ssdc.cdv.integracion.entity.SscTipoRegistroEntity;
import mx.gob.imss.cia.ssdc.cdv.test.IntegrationTest;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * 
 * @author Equipo de Desarrollo
 * 
 */
public class TestPaavDaoImpl extends IntegrationTest {

	private static final Long CVE_PAT_PAAV = 1L;
	@Autowired
	private PaavDao paavDao;

	@Test
	public void debieraExistirPaavDao() throws Exception {
		assertNotNull(paavDao);
	}

	@Test
	public void deberiaHeredarDePersistenceDao() {
		assertTrue(paavDao instanceof PersistenceDao<?, ?>);
	}

	@Test
	public void deberiaCrearUnPaav() throws Exception {
		PaavEntity paav = new PaavEntity();

		PeriodoEntity periodoEntity = new PeriodoEntity();
		List<PeriodoEntity> periodo = new ArrayList<PeriodoEntity>();
		periodo.add(periodoEntity);

		paav.setPeriodo(periodo);

		List<PaavEntity> todasAcciones = paavDao.findAll();
		paavDao.create(paav);
		assertTrue(paavDao.findAll().size() > todasAcciones.size());
	}

	@Test
	public void deberiaTraerUnPaavPorClave() throws Exception {
		PaavEntity paavPorClave = paavDao.read(CVE_PAT_PAAV);
		assertNotNull(paavPorClave);
		assertEquals(CVE_PAT_PAAV, paavPorClave.getCvePatPaav());
	}

	@Test
	public void deberiaActualizarLaClaveDeEstatus() throws Exception {
		PaavEntity paav = paavDao.read(CVE_PAT_PAAV);
		assertEquals(new Long(1L), paav.getEstatus().getCveEstatus());
		SscEstatusEntity estatus = new SscEstatusEntity();
		estatus.setCveEstatus(2L);
		SscTipoRegistroEntity tipoRegistro = new SscTipoRegistroEntity();
		tipoRegistro.setCveTipoRegistro(1L);
		tipoRegistro.setNomTipoRegistro("PAAV");
		tipoRegistro.setNumEstado(1);
		estatus.setTipoRegistro(tipoRegistro);
		paav.setEstatus(estatus);
		paavDao.update(paav);
		assertEquals(estatus.getCveEstatus(), paav.getEstatus()
		        .getCveEstatus());
	}

	@Test
	public void deberiaBorrarElPaav() throws Exception {
		PaavEntity paav = paavDao.read(CVE_PAT_PAAV);
		assertNotNull(paav);
		paavDao.delete(paav);

		paav = paavDao.read(1L);
		assertNull(paav);
	}

	@Test
	public void deberiaTraerTodasLosPaavs() throws Exception {
		List<PaavEntity> todosPaavs = paavDao.findAll();
		assertNotNull(todosPaavs);
		assertTrue(todosPaavs.size() > 0);
	}

}
