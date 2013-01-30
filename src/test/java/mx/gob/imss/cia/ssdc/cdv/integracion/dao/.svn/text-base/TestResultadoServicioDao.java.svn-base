/**
 * Proyecto: IMSS  - SSDC
 *
 * Archivo: TestResultadoServicioDao.java
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

import mx.gob.imss.cia.ssdc.cdv.integracion.entity.ResultadoServicioEntity;
import mx.gob.imss.cia.ssdc.cdv.test.IntegrationTest;
import mx.gob.imss.cia.ssdc.commons.Constantes;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author Gamaliel
 * 
 */

public class TestResultadoServicioDao extends IntegrationTest {
	private static final Long CVE_RESULTADO_SERVICIO = 1L;
	@Autowired
	private ResultadoServicioDao resultadoServicioDao;

	@Test
	public void debieraExistirResultadoServicioDao() throws Exception {
		assertNotNull(resultadoServicioDao);
	}

	@Test
	public void deberiaHeredarDePersistenceDao() {
		assertTrue(resultadoServicioDao instanceof PersistenceDao<?, ?>);
	}

	@Test
	public void debieraCrearUnResultadoServicio() throws Exception {
		ResultadoServicioEntity resultadoServ = new ResultadoServicioEntity();
		resultadoServ.setStatus(1);
		resultadoServ.setTipoVentanilla(null);
		resultadoServicioDao.create(resultadoServ);
	}

	@Test
	public void deberiaTraerUnPostPorClave() throws Exception {
		ResultadoServicioEntity tip = resultadoServicioDao
		        .read(CVE_RESULTADO_SERVICIO);
		assertNotNull(tip);
		assertEquals(CVE_RESULTADO_SERVICIO, tip.getCveResultado());
	}

	@Test
	public void deberiaActualizarElStatus() throws Exception {
		ResultadoServicioEntity medios = resultadoServicioDao
		        .read(CVE_RESULTADO_SERVICIO);
		assertEquals(Constantes.ENABLE, medios.getStatus().intValue());
		medios.setStatus(Constantes.DISABLE);
		resultadoServicioDao.update(medios);
		assertEquals(Constantes.DISABLE, medios.getStatus().intValue());
	}

	@Test
	public void deberiaBorrarPosterior() throws Exception {
		ResultadoServicioEntity medios = resultadoServicioDao
		        .read(CVE_RESULTADO_SERVICIO);
		assertNotNull(medios);
		resultadoServicioDao.delete(medios);
		medios = resultadoServicioDao.read(CVE_RESULTADO_SERVICIO);
		assertNull(medios);
	}

	@Test
	public void deberiaTraerTodasPosterior() throws Exception {
		List<ResultadoServicioEntity> todosMedios = resultadoServicioDao
		        .findAll();
		assertNotNull(todosMedios);
		assertTrue(todosMedios.size() > 0);
	}

	@Test
	public void deberiaFiltrarLasVentanillasPosterioresPorVentanillaYStatus()
	        throws Exception {
		List<ResultadoServicioEntity> tipVentanilla = resultadoServicioDao
		        .filtrarResultadoServicioPorVentanillaYStatus(
		                CVE_RESULTADO_SERVICIO, Constantes.ENABLE);
		assertNotNull(tipVentanilla);
		assertTrue(tipVentanilla.size() > 0);
		for (ResultadoServicioEntity posteriorEntity : tipVentanilla) {
			assertEquals(CVE_RESULTADO_SERVICIO,
			        posteriorEntity.getCveResultado());
			assertEquals(Constantes.ENABLE, posteriorEntity.getStatus()
			        .intValue());
		}
	}
}
