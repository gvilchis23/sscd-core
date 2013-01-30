/**
 * Proyecto: IMSS  - SSDC
 *
 * Archivo: TestUnidadDao.java
 *
 * Creado:  13/10/2011
 *
 * Derechos Reservados de copia (c) - INAP /
 *
 * Instituto Mexicano del Seguro Social - 2011
 */

package mx.gob.imss.cia.ssdc.cdv.integracion.dao;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import java.util.List;

import mx.gob.imss.cia.ssdc.cdv.integracion.entity.UnidadEntity;
import mx.gob.imss.cia.ssdc.cdv.test.IntegrationTest;
import mx.gob.imss.cia.ssdc.cdv.vo.UnidadVo;
import mx.gob.imss.cia.ssdc.commons.Constantes;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author Gamaliel
 * 
 */

public class TestUnidadDao extends IntegrationTest {

	private static final Long CVE_UNIDAD = 1L;

	private static final Long CVE_DELEGACION = 1L;

	@Autowired
	private UnidadDao unidadDao;

	@Test
	public void debieraExistirUnidadDao() throws Exception {
		assertNotNull(unidadDao);
	}

	@Test
	public void deberiaHeredarDePersistenceDao() {
		assertTrue(unidadDao instanceof PersistenceDao<?, ?>);
	}

	@Test
	public void debieraCrearUnidad() throws Exception {
		UnidadEntity unidades = new UnidadEntity();
		unidades.setStatus(Constantes.ENABLE);
		unidadDao.create(unidades);
	}

	@Test
	public void deberiaTraerUnaUnidadPorClave() throws Exception {
		UnidadEntity unidades = unidadDao.read(CVE_UNIDAD);
		assertNotNull(unidades);
		assertEquals(CVE_UNIDAD, unidades.getCveUnidad());
	}

	@Test
	public void deberiaActualizarElStatus() throws Exception {
		UnidadEntity unidades = unidadDao.read(CVE_UNIDAD);
		assertEquals(Constantes.ENABLE, unidades.getStatus());
		unidades.setStatus(Constantes.DISABLE);
		unidadDao.update(unidades);
		assertEquals(Constantes.DISABLE, unidades.getStatus());
	}

	@Test
	public void deberiaBorrarUnidad() throws Exception {
		UnidadEntity unidades = unidadDao.read(CVE_UNIDAD);
		assertNotNull(unidades);
		unidadDao.delete(unidades);
		unidades = unidadDao.read(1L);
		assertNull(unidades);
	}

	@Test
	public void deberiaTraerTodasLasUnidades() throws Exception {
		List<UnidadEntity> unidades = unidadDao.findAll();
		assertNotNull(unidades);
		assertTrue(unidades.size() > 0);
	}

	@Test
	public void deberiaFiltrarLasUnidadesPorStatus() throws Exception {
		List<UnidadEntity> unidades = unidadDao
		        .filtraUnidadesPorStatus(Constantes.ENABLE);
		assertNotNull(unidades);
		assertTrue(unidades.size() > 0);
		for (UnidadEntity unidadEntity : unidades) {
			assertEquals(Constantes.ENABLE, unidadEntity.getStatus());
		}
	}

	@Test
	public void deberiaFiltrarLasUnidadesPorDelegacionYStatus()
	        throws Exception {
		List<UnidadEntity> unidades = unidadDao
		        .filtrarUnidadByDelegacionYStatus(CVE_DELEGACION,
		                Constantes.ENABLE);
		assertNotNull(unidades);
		assertTrue(unidades.size() > 0);
		for (UnidadEntity posteriorEntity : unidades) {
			assertEquals(CVE_DELEGACION, posteriorEntity.getCveUnidad());
			assertEquals(Constantes.ENABLE, posteriorEntity.getStatus());
		}
	}
	
	@Test
	public void deberiaTraerListadoUnidadVo() throws Exception {
		
		List<UnidadVo> listadoUnidadVo = unidadDao.
				obtenerListadoUnidadVo(Constantes.ENABLE);
		
		assertNotNull(listadoUnidadVo);
		assertFalse(listadoUnidadVo.isEmpty());
	}
}
