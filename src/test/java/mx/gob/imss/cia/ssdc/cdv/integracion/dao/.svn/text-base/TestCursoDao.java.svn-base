/**
 * Proyecto: IMSS  - SSDC
 *
 * Archivo: TestCursoDao.java
 *
 * Creado: 19/10/2011
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

import mx.gob.imss.cia.ssdc.cdv.integracion.entity.CursoEntity;
import mx.gob.imss.cia.ssdc.cdv.test.IntegrationTest;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * 
 * @author Equipo de Desarrollo
 * 
 */
public class TestCursoDao extends IntegrationTest {

	private static final Long ID = 1L;

	@Autowired
	private CursoDao cursoDao;

	@Test
	public void deberiaCrearUnCurso() throws Exception {
		CursoEntity curso = new CursoEntity();
		curso.setNombreCurso("Nuevo curso");

		List<CursoEntity> todasAcciones = cursoDao.findAll();
		cursoDao.create(curso);
		assertTrue(cursoDao.findAll().size() > todasAcciones.size());
	}

	@Test
	public void deberiaTraerUnCursoPorClave() throws Exception {
		CursoEntity cursoPorClave = cursoDao.read(ID);
		assertNotNull(cursoPorClave);
		assertEquals(ID, cursoPorClave.getCveCurso());
	}

	@Test
	public void deberiaActualizarElNombreDelCurso() throws Exception {
		CursoEntity cdvServicio = cursoDao.read(ID);

		assertEquals("curso", cdvServicio.getNombreCurso());
		cdvServicio.setNombreCurso("Hibernate");
		cursoDao.update(cdvServicio);
		assertEquals("Hibernate", cdvServicio.getNombreCurso());
	}

	@Test
	public void deberiaBorrarUnCurso() throws Exception {
		CursoEntity cdvServicio = cursoDao.read(ID);
		assertNotNull(cdvServicio);
		cursoDao.delete(cdvServicio);

		cdvServicio = cursoDao.read(ID);
		assertNull(cdvServicio);
	}

	@Test
	public void deberiaTraerTodosLosCursos() throws Exception {
		List<CursoEntity> todosServicios = cursoDao.findAll();
		assertNotNull(todosServicios);
		assertTrue(todosServicios.size() > 0);
	}
}
