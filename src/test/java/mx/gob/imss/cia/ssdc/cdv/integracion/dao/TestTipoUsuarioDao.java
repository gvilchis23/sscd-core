/**
 * Proyecto: IMSS  - SSDC
 *
 * Archivo: TestTipoUsuarioDao.java
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

public class TestTipoUsuarioDao extends IntegrationTest {
	@Autowired
	private TipoUsuarioDao tipoUsuarioDao;

	@Test
	public void debieraExistirTipoUsuarioDao() throws Exception {
		assertNotNull(tipoUsuarioDao);
	}

	@Test
	public void deberiaHeredarDePersistenceDao() {
		assertTrue(tipoUsuarioDao instanceof PersistenceDao<?, ?>);
	}
}
