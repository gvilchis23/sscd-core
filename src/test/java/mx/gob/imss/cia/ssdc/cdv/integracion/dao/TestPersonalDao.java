/**
 * Proyecto: IMSS  - SSDC
 *
 * Archivo: TestPersonalDao.java
 *
 * Creado:  13/10/2011
 *
 * Derechos Reservados de copia (c) - INAP /
 *
 * Instituto Mexicano del Seguro Social - 2011
 */

package mx.gob.imss.cia.ssdc.cdv.integracion.dao;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import mx.gob.imss.cia.ssdc.cdv.test.IntegrationTest;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author Gamaliel
 *
 */

public class TestPersonalDao extends IntegrationTest {
	@Autowired
	private PersonalDao personalDao;

	@Test
	public void debieraPersonalDao() throws Exception {
		assertNotNull(personalDao);
	}

	@Test
	public void deberiaHeredarDePersistenceDao() {
		assertTrue(personalDao instanceof PersistenceDao<?, ?>);
	}
}
