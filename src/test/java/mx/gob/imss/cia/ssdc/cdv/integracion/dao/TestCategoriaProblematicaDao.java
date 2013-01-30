/**
 * Proyecto: IMSS  - SSDC
 *
 * Archivo: TestCategoriaProblematicaDao.java
 *
 * Creado: 17/10/2011
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

import mx.gob.imss.cia.ssdc.cdv.integracion.entity.CategoriaProblematicaEntity;
import mx.gob.imss.cia.ssdc.cdv.test.IntegrationTest;
import mx.gob.imss.cia.ssdc.commons.Constantes;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * 
 * @author Equipo de Desarrollo
 * 
 */
public class TestCategoriaProblematicaDao extends IntegrationTest {

	@Autowired
	private CategoriaProblematicaDao categoriaProblematicaDao;

	@Test
	public void deberiaCrearUnaCategoriaProblematica() throws Exception {
		CategoriaProblematicaEntity catProblematica = new CategoriaProblematicaEntity();
		catProblematica.setNombreCategoriaProblematica("problematica");
		catProblematica.setStatus(Constantes.ENABLE);

		List<CategoriaProblematicaEntity> todasAcciones = categoriaProblematicaDao
		        .findAll();
		categoriaProblematicaDao.create(catProblematica);
		assertTrue(categoriaProblematicaDao.findAll().size() > todasAcciones
		        .size());
	}

	@Test
	public void deberiaTraerUnaCategoriaProblematicaPorClave() throws Exception {
		CategoriaProblematicaEntity accionPorClave = categoriaProblematicaDao
		        .read(1L);
		assertNotNull(accionPorClave);
		assertEquals(1, accionPorClave.getCveCategoriaProblematica().intValue());
	}

	@Test
	public void deberiaActualizarElEstado() throws Exception {
		CategoriaProblematicaEntity accion = categoriaProblematicaDao.read(1L);
		assertEquals(Constantes.ENABLE, accion.getStatus());
		accion.setStatus(Constantes.DISABLE);
		categoriaProblematicaDao.update(accion);
		assertEquals(Constantes.DISABLE, accion.getStatus());
	}

	@Test
	public void deberiaBorrarLaCategoriaProblematica() throws Exception {
		CategoriaProblematicaEntity accion = categoriaProblematicaDao.read(1L);
		assertNotNull(accion);
		categoriaProblematicaDao.delete(accion);

		accion = categoriaProblematicaDao.read(1L);
		assertNull(accion);
	}

	@Test
	public void deberiaTraerTodasLasCategoriasProblematicas() throws Exception {
		List<CategoriaProblematicaEntity> todasAcciones = categoriaProblematicaDao
		        .findAll();
		assertNotNull(todasAcciones);
		assertTrue(todasAcciones.size() > 0);
	}
}
