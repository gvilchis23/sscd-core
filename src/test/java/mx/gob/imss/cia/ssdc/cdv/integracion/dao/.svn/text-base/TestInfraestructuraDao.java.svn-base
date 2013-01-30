/**
 * Proyecto: IMSS  - SSDC
 *
 * Archivo: TestInfraestructuraDao.java
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

import mx.gob.imss.cia.ssdc.cdv.integracion.entity.InfraestructuraEntity;
import mx.gob.imss.cia.ssdc.cdv.test.IntegrationTest;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * 
 * @author Equipo de Desarrollo
 * 
 */
public class TestInfraestructuraDao extends IntegrationTest {

	@Autowired
	private InfraestructuraDao infraestructuraDao;

	private static final Long ID = 1L;

	@Test
	public void debieraExistirInfraestructuraDao() throws Exception {
		assertNotNull(infraestructuraDao);
	}

	@Test
	public void deberiaHeredarDePersistenceDao() {
		assertTrue(infraestructuraDao instanceof PersistenceDao<?, ?>);
	}

	@Test
	public void deberiaCrearUnaInfraestructura() throws Exception {
		InfraestructuraEntity infraestructura = new InfraestructuraEntity();

		List<InfraestructuraEntity> todosEqInfra = infraestructuraDao.findAll();
		infraestructuraDao.create(infraestructura);
		assertTrue(infraestructuraDao.findAll().size() > todosEqInfra.size());
	}

	@Test
	public void deberiaTraerUnaInfraestructuraPorClave() throws Exception {
		InfraestructuraEntity eqInfraPorClave = infraestructuraDao.read(ID);
		assertNotNull(eqInfraPorClave);
		assertEquals(ID, eqInfraPorClave.getCveInfraestructura());
	}

	@Test
	public void deberiaActualizarNombreDelEquipo() throws Exception {
		Integer nodosActualizados = 2;
		InfraestructuraEntity eqInfra = infraestructuraDao.read(ID);
		assertEquals(1, eqInfra.getNodos().intValue());
		eqInfra.setNodos(nodosActualizados);
		infraestructuraDao.update(eqInfra);
		assertEquals(nodosActualizados, eqInfra.getNodos());
	}

	@Test
	public void deberiaBorrarLaInfraestructura() throws Exception {
		InfraestructuraEntity infraestructura = infraestructuraDao.read(ID);
		assertNotNull(infraestructura);
		infraestructuraDao.delete(infraestructura);

		infraestructura = infraestructuraDao.read(1L);
		assertNull(infraestructura);
	}

	@Test
	public void deberiaTraerTodasLasInfraestructuras() throws Exception {
		List<InfraestructuraEntity> todasEntidades = infraestructuraDao
		        .findAll();
		assertNotNull(todasEntidades);
		assertTrue(todasEntidades.size() > 0);
	}

}
