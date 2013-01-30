/**
 * Proyecto: IMSS  - SSDC
 *
 * Archivo: TestPersonaPropiaDao.java
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

public class TestPersonaPropiaDao extends IntegrationTest {
	@Autowired
	private PersonaPropiaDao personaPropiaDao;

	@Test
	public void debieraExistirPersonaPropiaDao() throws Exception {
		assertNotNull(personaPropiaDao);
	}

	@Test
	public void deberiaHeredarDePersistenceDao() {
		assertTrue(personaPropiaDao instanceof PersistenceDao<?, ?>);
	}
}
