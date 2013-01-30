/**
 * Proyecto: IMSS  - SSDC
 *
 * Archivo: TestUsuarioDao.java
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

public class TestUsuarioDao extends IntegrationTest {
	@Autowired
	private UsuarioDao usuarioDao;

	@Test
	public void debieraExistirUsuarioDao() throws Exception {
		assertNotNull(usuarioDao);
	}

	@Test
	public void deberiaHeredarDePersistenceDao() {
		assertTrue(usuarioDao instanceof PersistenceDao<?, ?>);
	}
}
