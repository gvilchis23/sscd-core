/**
 * Proyecto: IMSS  - SSDC
 *
 * Archivo: TestEscolaridadDao.java
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

import mx.gob.imss.cia.ssdc.cdv.integracion.entity.EscolaridadEntity;
import mx.gob.imss.cia.ssdc.cdv.test.IntegrationTest;
import mx.gob.imss.cia.ssdc.commons.Constantes;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * 
 * @author Equipo de Desarrollo
 * 
 */
public class TestEscolaridadDao extends IntegrationTest {

	@Autowired
	private EscolaridadDao escolaridadDao;

	private static final Long ID = 1L;

	@Test
	public void debieraExistirEscolaridadDao() throws Exception {
		assertNotNull(escolaridadDao);
	}

	@Test
	public void deberiaHeredarDePersistenceDao() {
		assertTrue(escolaridadDao instanceof PersistenceDao<?, ?>);
	}

	@Test
	public void deberiaCrearUnaEscolaridad() throws Exception {
		EscolaridadEntity escolaridad = new EscolaridadEntity();
		escolaridad.setNombreEscolaridad("Primaria");
		escolaridad.setStatus(Constantes.ENABLE);

		List<EscolaridadEntity> todasEntFed = escolaridadDao.findAll();
		escolaridadDao.create(escolaridad);
		assertTrue(escolaridadDao.findAll().size() > todasEntFed.size());
	}

	@Test
	public void deberiaTraerUnaEscolaridadPorClave() throws Exception {
		EscolaridadEntity escolaridadPorClave = escolaridadDao.read(ID);
		assertNotNull(escolaridadPorClave);
		assertEquals(ID, escolaridadPorClave.getCveEscolaridad());
	}

	@Test
	public void deberiaActualizarNombreDeLaEscolaridad() throws Exception {
		String nombreEscolaridadAct = "Secundaria";
		EscolaridadEntity escolaridad = escolaridadDao.read(ID);
		assertEquals("escolaridad", escolaridad.getNombreEscolaridad());
		escolaridad.setNombreEscolaridad(nombreEscolaridadAct);
		escolaridadDao.update(escolaridad);
		assertEquals(nombreEscolaridadAct, escolaridad.getNombreEscolaridad());
	}

	@Test
	public void deberiaBorrarLaEscolaridad() throws Exception {
		EscolaridadEntity escolaridad = escolaridadDao.read(ID);
		assertNotNull(escolaridad);
		escolaridadDao.delete(escolaridad);

		escolaridad = escolaridadDao.read(1L);
		assertNull(escolaridad);
	}

	@Test
	public void deberiaTraerTodasLasEscolaridades() throws Exception {
		List<EscolaridadEntity> todasEscolaridades = escolaridadDao.findAll();
		assertNotNull(todasEscolaridades);
		assertTrue(todasEscolaridades.size() > 0);
	}
}
