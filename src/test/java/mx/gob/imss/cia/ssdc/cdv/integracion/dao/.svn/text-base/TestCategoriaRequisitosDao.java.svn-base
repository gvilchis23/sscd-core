/**
 * Proyecto: IMSS  - SSDC
 *
 * Archivo: TestCategoriaRequisitosDao.java
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

import mx.gob.imss.cia.ssdc.cdv.integracion.entity.CategoriaRequisitosEntity;
import mx.gob.imss.cia.ssdc.cdv.test.IntegrationTest;
import mx.gob.imss.cia.ssdc.commons.Constantes;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * 
 * @author Equipo de Desarrollo
 * 
 */
public class TestCategoriaRequisitosDao extends IntegrationTest {

	@Autowired
	private CategoriaRequisitosDao categoriaRequisitosDao;

	@Test
	public void deberiaCrearUnaCategoriaProblematica() throws Exception {
		CategoriaRequisitosEntity catRequisitos = new CategoriaRequisitosEntity();
		catRequisitos.setNombreCategoriaRequisitos("Requisistos");
		catRequisitos.setStatus(Constantes.ENABLE);
		catRequisitos.setTipoVentanilla(null);

		List<CategoriaRequisitosEntity> todasAcciones = categoriaRequisitosDao
		        .findAll();
		categoriaRequisitosDao.create(catRequisitos);
		assertTrue(categoriaRequisitosDao.findAll().size() > todasAcciones
		        .size());
	}

	@Test
	public void deberiaTraerUnaCategoriaProblematicaPorClave() throws Exception {
		CategoriaRequisitosEntity accionPorClave = categoriaRequisitosDao
		        .read(1L);
		assertNotNull(accionPorClave);
		assertEquals(1, accionPorClave.getCveCategoriaRequisitos().intValue());
	}

	@Test
	public void deberiaActualizarElEstado() throws Exception {
		CategoriaRequisitosEntity accion = categoriaRequisitosDao.read(1L);
		assertEquals(Constantes.ENABLE, accion.getStatus());
		accion.setStatus(Constantes.DISABLE);
		categoriaRequisitosDao.update(accion);
		assertEquals(Constantes.DISABLE, accion.getStatus());
	}

	@Test
	public void deberiaBorrarLaCategoriaProblematica() throws Exception {
		CategoriaRequisitosEntity accion = categoriaRequisitosDao.read(1L);
		assertNotNull(accion);
		categoriaRequisitosDao.delete(accion);

		accion = categoriaRequisitosDao.read(1L);
		assertNull(accion);
	}

	@Test
	public void deberiaTraerTodasLasCategoriasProblematicas() throws Exception {
		List<CategoriaRequisitosEntity> todasAcciones = categoriaRequisitosDao
		        .findAll();
		assertNotNull(todasAcciones);
		assertTrue(todasAcciones.size() > 0);
	}

}
