/**
 * Proyecto: IMSS  - SSDC
 *
 * Archivo: TestTipoUnidadDao.java
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

public class TestTipoUnidadDao extends IntegrationTest {
	@Autowired
	private TipoUnidadDao tipoUnidadDao;

	@Test
	public void debieraExistirTipoUnidadDao() throws Exception {
		assertNotNull(tipoUnidadDao);
	}

	@Test
	public void deberiaHeredarDePersistenceDao() {
		assertTrue(tipoUnidadDao instanceof PersistenceDao<?, ?>);
	}
}
