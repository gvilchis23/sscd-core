/**
 * Proyecto: IMSS  - SSDC
 *
 * Archivo: TestFrecuenciaUsoDao.java
 *
 * Creado: 20/10/2011
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

import mx.gob.imss.cia.ssdc.cdv.integracion.entity.FrecuenciaUsoEntity;
import mx.gob.imss.cia.ssdc.cdv.test.IntegrationTest;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * 
 * @author Equipo de Desarrollo
 * 
 */
public class TestFrecuenciaUsoDao extends IntegrationTest {

	@Autowired
	private FrecuenciaUsoDao frecuenciaUsoDao;

	private static final Long ID = 1L;

	@Test
	public void debieraExistirFrecuenciaUsoDao() throws Exception {
		assertNotNull(frecuenciaUsoDao);
	}

	@Test
	public void deberiaHeredarDePersistenceDao() {
		assertTrue(frecuenciaUsoDao instanceof PersistenceDao<?, ?>);
	}

	@Test
	public void deberiaCrearUnaFrecuenciaDeUso() throws Exception {
		FrecuenciaUsoEntity frecuenciaUso = new FrecuenciaUsoEntity();
		frecuenciaUso.setNombreFrecuenciaUso("frecuente");

		List<FrecuenciaUsoEntity> todasEntFed = frecuenciaUsoDao.findAll();
		frecuenciaUsoDao.create(frecuenciaUso);
		assertTrue(frecuenciaUsoDao.findAll().size() > todasEntFed.size());
	}

	@Test
	public void deberiaTraerUnaFrecuenciaPorClave() throws Exception {
		FrecuenciaUsoEntity frecuenciaUsoPorClave = frecuenciaUsoDao.read(ID);
		assertNotNull(frecuenciaUsoPorClave);
		assertEquals(ID, frecuenciaUsoPorClave.getCveFrecuenciaUso());
	}

	@Test
	public void deberiaActualizarElNombreDeLaFrecuenciaDeUso() throws Exception {
		String frecuenciaUso = "diario";
		FrecuenciaUsoEntity fase = frecuenciaUsoDao.read(ID);
		assertEquals("frecuente", fase.getNombreFrecuenciaUso());
		fase.setNombreFrecuenciaUso(frecuenciaUso);
		frecuenciaUsoDao.update(fase);
		assertEquals(frecuenciaUso, fase.getNombreFrecuenciaUso());
	}

	@Test
	public void deberiaBorrarLaEscolaridad() throws Exception {
		FrecuenciaUsoEntity fase = frecuenciaUsoDao.read(ID);
		assertNotNull(fase);
		frecuenciaUsoDao.delete(fase);

		fase = frecuenciaUsoDao.read(1L);
		assertNull(fase);
	}

	@Test
	public void deberiaTraerTodasLasEscolaridades() throws Exception {
		List<FrecuenciaUsoEntity> todasLasFases = frecuenciaUsoDao.findAll();
		assertNotNull(todasLasFases);
		assertTrue(todasLasFases.size() > 0);
	}

}
