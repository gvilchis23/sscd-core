/**
 * Proyecto: IMSS  - SSDC
 *
 * Archivo: TestCategoriaDao.java
 *
 * Creado: fechaDeCreacion con formato 12/10/2011
 *
 * Derechos Reservados de copia (c) - INAP /
 *
 * Instituto Mexicano del Seguro Social - año de creación
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

public class TestCategoriaDao extends IntegrationTest {
	@Autowired
	private CategoriaDao categoriaDao;

	@Test
	public void debieraExistirCategoriaDao() throws Exception {
		assertNotNull(categoriaDao);
	}

	@Test
	public void deberiaHeredarDePersistenceDao() {
		assertTrue(categoriaDao instanceof PersistenceDao<?, ?>);
	}

	@Test
	public void deberiaRegresarListaDeTodasLasEntidades() {

		//List<SelectItem> listaCategoria = categoriaDao.llenarComboCategoria();
		//assertTrue(listaCategoria.size() > 0);

	}

}
