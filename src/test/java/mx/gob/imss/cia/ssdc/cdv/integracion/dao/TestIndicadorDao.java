/**
 * Proyecto: IMSS  - SSDC
 *
 * Archivo: TestIndicadorDao.java
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

import mx.gob.imss.cia.ssdc.cdv.integracion.entity.IndicadorEntity;
import mx.gob.imss.cia.ssdc.cdv.test.IntegrationTest;
import mx.gob.imss.cia.ssdc.commons.Constantes;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * 
 * @author Equipo de Desarrollo
 * 
 */
public class TestIndicadorDao extends IntegrationTest {

	@Autowired
	private IndicadorDao indicadorDao;

	private static final Long ID = 1L;

	@Test
	public void debieraExistirIndicadorDaoDao() throws Exception {
		assertNotNull(indicadorDao);
	}

	@Test
	public void deberiaHeredarDePersistenceDao() {
		assertTrue(indicadorDao instanceof PersistenceDao<?, ?>);
	}

	@Test
	public void deberiaCrearUnIndicador() throws Exception {
		IndicadorEntity indicador = new IndicadorEntity();
		indicador.setStatus(Constantes.ENABLE);

		List<IndicadorEntity> todasEntFed = indicadorDao.findAll();
		indicadorDao.create(indicador);
		assertTrue(indicadorDao.findAll().size() > todasEntFed.size());
	}

	@Test
	public void deberiaTraerUnIndicadorPorClave() throws Exception {
		IndicadorEntity indicadorPorClave = indicadorDao.read(ID);
		assertNotNull(indicadorPorClave);
		assertEquals(ID, indicadorPorClave.getCveIndicador());
	}

	@Test
	public void deberiaActualizarElStatusDelIndicador() throws Exception {
		IndicadorEntity indicador = indicadorDao.read(ID);
		assertEquals(Constantes.ENABLE, indicador.getStatus());
		indicador.setStatus(Constantes.DISABLE);
		indicadorDao.update(indicador);
		assertEquals(Constantes.DISABLE, indicador.getStatus());
	}

	@Test
	public void deberiaBorrarElIndicador() throws Exception {
		IndicadorEntity indicador = indicadorDao.read(ID);
		assertNotNull(indicador);
		indicadorDao.delete(indicador);

		indicador = indicadorDao.read(1L);
		assertNull(indicador);
	}

	@Test
	public void deberiaTraerTodosLosIndicadores() throws Exception {
		List<IndicadorEntity> todosLosIndicadores = indicadorDao.findAll();
		assertNotNull(todosLosIndicadores);
		assertTrue(todosLosIndicadores.size() > 0);
	}

}
