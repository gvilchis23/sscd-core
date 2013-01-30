/**
 * Proyecto: IMSS  - SSDC
 *
 * Archivo: TestEntidadFederativaDao.java
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

import mx.gob.imss.cia.ssdc.cdv.integracion.entity.EntidadFederativaEntity;
import mx.gob.imss.cia.ssdc.cdv.test.IntegrationTest;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author Gamaliel
 * 
 */

public class TestEntidadFederativaDao extends IntegrationTest {

	@Autowired
	private EntidadFederativaDao entidadFederativaDao;

	private static final Long ID = 1L;

	@Test
	public void debieraExistirEntidadFederativaDao() throws Exception {
		assertNotNull(entidadFederativaDao);
	}

	@Test
	public void deberiaHeredarDePersistenceDao() {
		assertTrue(entidadFederativaDao instanceof PersistenceDao<?, ?>);
	}

	@Test
	public void deberiaCrearUnaEntFed() throws Exception {
		EntidadFederativaEntity entidadFed = new EntidadFederativaEntity();
		entidadFed.setNomEntidadFed("Colima");

		List<EntidadFederativaEntity> todasEntFed = entidadFederativaDao
		        .findAll();
		entidadFederativaDao.create(entidadFed);
		assertTrue(entidadFederativaDao.findAll().size() > todasEntFed.size());
	}

	@Test
	public void deberiaTraerUnaEntFedPorClave() throws Exception {
		EntidadFederativaEntity entidadFedPorClave = entidadFederativaDao
		        .read(ID);
		assertNotNull(entidadFedPorClave);
		assertEquals(ID, entidadFedPorClave.getCveEntidadFed());
	}

	@Test
	public void deberiaActualizarNombreDeLaEntFed() throws Exception {
		String razonActualizada = "Colima";
		EntidadFederativaEntity entidadFed = entidadFederativaDao.read(ID);
		assertEquals("Aguascalientes", entidadFed.getNomEntidadFed());
		entidadFed.setNomEntidadFed(razonActualizada);
		entidadFederativaDao.update(entidadFed);
		assertEquals(razonActualizada, entidadFed.getNomEntidadFed());
	}

	@Test
	public void deberiaBorrarLaEntFed() throws Exception {
		EntidadFederativaEntity entidadFed = entidadFederativaDao.read(ID);
		assertNotNull(entidadFed);
		entidadFederativaDao.delete(entidadFed);

		entidadFed = entidadFederativaDao.read(1L);
		assertNull(entidadFed);
	}

	@Test
	public void deberiaTraerTodasLasEntFed() throws Exception {
		List<EntidadFederativaEntity> todasEntidades = entidadFederativaDao
		        .findAll();
		assertNotNull(todasEntidades);
		assertTrue(todasEntidades.size() > 0);
	}
}
