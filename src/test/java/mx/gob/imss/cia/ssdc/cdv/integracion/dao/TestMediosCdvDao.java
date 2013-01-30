/**
 * Proyecto: IMSS  - SSDC
 *
 * Archivo: TestMediosCdvDao.java
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

public class TestMediosCdvDao extends IntegrationTest {
	@Autowired
	private MediosCdvDao medioCdvDao;

	@Test
	public void debieraExistirMediosCdvDao() throws Exception {
		assertNotNull(medioCdvDao);
	}

	@Test
	public void deberiaHeredarDePersistenceDao() {
		assertTrue(medioCdvDao instanceof PersistenceDao<?, ?>);
	}
}
