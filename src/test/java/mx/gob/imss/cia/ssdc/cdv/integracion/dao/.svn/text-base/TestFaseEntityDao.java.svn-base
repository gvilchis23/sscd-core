/**
 * Proyecto: IMSS  - SSDC
 *
 * Archivo: TestFaseEntityDao.java
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

import mx.gob.imss.cia.ssdc.cdv.integracion.entity.FaseEntity;
import mx.gob.imss.cia.ssdc.cdv.test.IntegrationTest;
import mx.gob.imss.cia.ssdc.commons.Constantes;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * 
 * @author Equipo de Desarrollo
 * 
 */
public class TestFaseEntityDao extends IntegrationTest {

	@Autowired
	private FaseEntityDao faseEntityDao;

	private static final Long ID = 1L;

	@Test
	public void debieraExistirFaseEntityDao() throws Exception {
		assertNotNull(faseEntityDao);
	}

	@Test
	public void deberiaHeredarDePersistenceDao() {
		assertTrue(faseEntityDao instanceof PersistenceDao<?, ?>);
	}

	@Test
	public void deberiaCrearUnaFase() throws Exception {
		FaseEntity faseEntity = new FaseEntity();
		faseEntity.setNombreFase("FaseEntity");
		faseEntity.setStatus(Constantes.ENABLE);

		List<FaseEntity> todasEntFed = faseEntityDao.findAll();
		faseEntityDao.create(faseEntity);
		assertTrue(faseEntityDao.findAll().size() > todasEntFed.size());
	}

	@Test
	public void deberiaTraerUnaFasePorClave() throws Exception {
		FaseEntity faseEntityPorClave = faseEntityDao.read(ID);
		assertNotNull(faseEntityPorClave);
		assertEquals(ID, faseEntityPorClave.getCveFase());
	}

	@Test
	public void deberiaActualizarElStatusDeLaFase() throws Exception {
		FaseEntity fase = faseEntityDao.read(ID);
		assertEquals(Constantes.ENABLE, fase.getStatus());
		fase.setStatus(Constantes.DISABLE);
		faseEntityDao.update(fase);
		assertEquals(Constantes.DISABLE, fase.getStatus());
	}

	@Test
	public void deberiaBorrarLaEscolaridad() throws Exception {
		FaseEntity fase = faseEntityDao.read(ID);
		assertNotNull(fase);
		faseEntityDao.delete(fase);

		fase = faseEntityDao.read(1L);
		assertNull(fase);
	}

	@Test
	public void deberiaTraerTodasLasEscolaridades() throws Exception {
		List<FaseEntity> todasLasFases = faseEntityDao.findAll();
		assertNotNull(todasLasFases);
		assertTrue(todasLasFases.size() > 0);
	}

}
