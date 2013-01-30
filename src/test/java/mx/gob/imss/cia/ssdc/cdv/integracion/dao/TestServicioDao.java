/**
 * Proyecto: IMSS  - SSDC
 *
 * Archivo: TestServicioDao.java
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

import mx.gob.imss.cia.ssdc.cdv.integracion.entity.ServicioEntity;
import mx.gob.imss.cia.ssdc.cdv.test.IntegrationTest;
import mx.gob.imss.cia.ssdc.commons.Constantes;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author Gamaliel
 * 
 */

public class TestServicioDao extends IntegrationTest {
	private static final Long CVE_CATEGORIA = 1L;
	@Autowired
	private ServicioDao servicioDao;

	@Test
	public void debieraExistirServicioDao() throws Exception {
		assertNotNull(servicioDao);
	}

	@Test
	public void deberiaHeredarDePersistenceDao() {
		assertTrue(servicioDao instanceof PersistenceDao<?, ?>);
	}

	@Test
	public void debieraCrearServicio() throws Exception {
		ServicioEntity servicio = new ServicioEntity();
		servicio.setStatus(1);
		servicioDao.create(servicio);
	}

	@Test
	public void deberiaTraerUnServicioPorClave() throws Exception {
		ServicioEntity servicio = servicioDao.read(CVE_CATEGORIA);
		assertNotNull(servicio);
		assertEquals(1, servicio.getCveServicio().intValue());
	}

	@Test
	public void deberiaActualizarElStatus() throws Exception {
		ServicioEntity servicio = servicioDao.read(CVE_CATEGORIA);
		assertEquals(Constantes.ENABLE, servicio.getStatus().intValue());
		servicio.setStatus(Constantes.DISABLE);
		servicioDao.update(servicio);
		assertEquals(Constantes.DISABLE, servicio.getStatus().intValue());
	}

	@Test
	public void deberiaBorrarServicio() throws Exception {
		ServicioEntity servicio = servicioDao.read(CVE_CATEGORIA);
		assertNotNull(servicio);
		servicioDao.delete(servicio);
		servicio = servicioDao.read(1L);
		assertNull(servicio);
	}

	@Test
	public void deberiaTraerTodosLosServicios() throws Exception {
		List<ServicioEntity> servicios = servicioDao.findAll();
		assertNotNull(servicios);
		assertTrue(servicios.size() > 0);
	}

	@Test
	public void deberiaFiltrarLosServicioPorCategoriaYStatus() throws Exception {
		List<ServicioEntity> servicios = servicioDao
		        .filtrarServicioPorCategoriaYStatus(CVE_CATEGORIA,
		                Constantes.ENABLE);
		assertNotNull(servicios);
		assertTrue(servicios.size() > 0);
		for (ServicioEntity posteriorEntity : servicios) {
			assertEquals(CVE_CATEGORIA, posteriorEntity.getCveServicio());
			assertEquals(Constantes.ENABLE, posteriorEntity.getStatus()
			        .intValue());
		}
	}
}
