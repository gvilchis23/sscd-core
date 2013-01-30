/**
 * Proyecto: IMSS  - SSDC
 *
 * Archivo: TestRequisitosDao.java
 *
 * Creado:  13/10/2011
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

import mx.gob.imss.cia.ssdc.cdv.integracion.entity.RequisitosEntity;
import mx.gob.imss.cia.ssdc.cdv.test.IntegrationTest;
import mx.gob.imss.cia.ssdc.commons.Constantes;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author Gamaliel
 *
 */

public class TestRequisitosDao extends IntegrationTest {
	
	private static final Long CVE_REQUISITO = 1L;
	@Autowired
	private RequisitosDao requisitosDao;

	@Test
	public void debieraExistirRequisitosDao() throws Exception {
		assertNotNull(requisitosDao);
	}

	@Test
	public void deberiaHeredarDePersistenceDao() {
		assertTrue(requisitosDao instanceof PersistenceDao<?, ?>);
	}
	
	@Test
	public void deberiaCrearUnRequisito() throws Exception {
		RequisitosEntity requisito = new RequisitosEntity();
		requisito.setStatus(Constantes.ENABLE);

		List<RequisitosEntity> todasAcciones = requisitosDao.findAll();
		requisitosDao.create(requisito);
		assertTrue(requisitosDao.findAll().size() > todasAcciones.size());
	}

	@Test
	public void deberiaTraerUnRequisitoPorClave() throws Exception {
		RequisitosEntity turnoPorClave = requisitosDao.read(CVE_REQUISITO);
		assertNotNull(turnoPorClave);
		assertEquals(CVE_REQUISITO, turnoPorClave.getCveRequisitos());
	}

	@Test
	public void deberiaActualizarElEstado() throws Exception {
		RequisitosEntity turno = requisitosDao.read(CVE_REQUISITO);
		assertEquals(Constantes.ENABLE, turno.getStatus());
		turno.setStatus(Constantes.DISABLE);
		requisitosDao.update(turno);
		assertEquals(Constantes.DISABLE, turno.getStatus());
	}

	@Test
	public void deberiaBorrarElRequisito() throws Exception {
		RequisitosEntity turno = requisitosDao.read(CVE_REQUISITO);
		assertNotNull(turno);
		requisitosDao.delete(turno);

		turno = requisitosDao.read(CVE_REQUISITO);
		assertNull(turno);
	}

	@Test
	public void deberiaTraerTodosLosRequisitos() throws Exception {
		List<RequisitosEntity> todosLosTurnos = requisitosDao.findAll();
		assertNotNull(todosLosTurnos);
		assertTrue(todosLosTurnos.size() > 0);
	}

	@Test
	public void deberiaFiltrarLosRequisitoPorStatus() throws Exception {
		List<RequisitosEntity> turnoPorStatus = requisitosDao
		        .filtrarRequisitoPorStatus(Constantes.ENABLE);
		assertNotNull(turnoPorStatus);
		assertTrue(turnoPorStatus.size() > 0);
		for (RequisitosEntity RequisitosEntity : turnoPorStatus) {
	        assertEquals(Constantes.ENABLE, RequisitosEntity.getStatus());
        }
	}
}
