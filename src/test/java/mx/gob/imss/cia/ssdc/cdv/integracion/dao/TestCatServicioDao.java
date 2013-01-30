/**
 * Proyecto: IMSS  - SSDC
 *
 * Archivo: TestCatServicioDao.java
 *
 * Creado: 05/10/2011
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

import mx.gob.imss.cia.ssdc.cdv.integracion.entity.CatServicioEntity;
import mx.gob.imss.cia.ssdc.cdv.test.IntegrationTest;
import mx.gob.imss.cia.ssdc.commons.Constantes;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author Gamaliel
 * 
 */

public class TestCatServicioDao extends IntegrationTest {

	private static final Long CVE_TIPO_VENTANILLA = 1L;

	@Autowired
	private CatServicioDao catServicioDao;

	@Test
	public void debieraExistirCatServicioDao() throws Exception {
		assertNotNull(catServicioDao);
	}

	@Test
	public void deberiaHeredarDePersistenceDao() {
		assertTrue(catServicioDao instanceof PersistenceDao<?, ?>);
	}

	@Test
	public void debieraCrearServicio() throws Exception {
		CatServicioEntity catServicio = new CatServicioEntity();
		catServicio.setStatus(1);
		catServicioDao.create(catServicio);
	}

	@Test
	public void deberiaTraerUnServicioPorClave() throws Exception {
		CatServicioEntity catServicio = catServicioDao
		        .read(CVE_TIPO_VENTANILLA);
		assertNotNull(catServicio);
		assertEquals(1, catServicio.getCveCategoria().intValue());
	}

	@Test
	public void deberiaActualizarElStatus() throws Exception {
		CatServicioEntity catServicio = catServicioDao
		        .read(CVE_TIPO_VENTANILLA);
		assertEquals(Constantes.ENABLE, catServicio.getStatus().intValue());
		catServicio.setStatus(Constantes.DISABLE);
		catServicioDao.update(catServicio);
		assertEquals(Constantes.DISABLE, catServicio.getStatus().intValue());
	}

	@Test
	public void deberiaBorrarServicio() throws Exception {
		CatServicioEntity catServicio = catServicioDao
		        .read(CVE_TIPO_VENTANILLA);
		assertNotNull(catServicio);
		catServicioDao.delete(catServicio);
		catServicio = catServicioDao.read(1L);
		assertNull(catServicio);
	}

	@Test
	public void deberiaTraerTodosLosServicios() throws Exception {
		List<CatServicioEntity> catServicios = catServicioDao.findAll();
		assertNotNull(catServicios);
		assertTrue(catServicios.size() > 0);
	}

	@Test
	public void deberiaFiltrarLosServicioPorCategoriaYStatus() throws Exception {
		List<CatServicioEntity> catServicios = catServicioDao
		        .filtrarCatServiciosPorVentanillaYStatus(CVE_TIPO_VENTANILLA,
		                Constantes.ENABLE);
		assertNotNull(catServicios);
		assertTrue(catServicios.size() > 0);
		for (CatServicioEntity posteriorEntity : catServicios) {
			assertEquals(CVE_TIPO_VENTANILLA, posteriorEntity.getCveCategoria());
			assertEquals(Constantes.ENABLE, posteriorEntity.getStatus()
			        .intValue());
		}
	}

}
