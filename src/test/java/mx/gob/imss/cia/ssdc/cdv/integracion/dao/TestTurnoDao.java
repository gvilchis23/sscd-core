/**
 * Proyecto: IMSS  - SSDC
 *
 * Archivo: TestTurnoDao.java
 *
 * Creado:  13/10/2011
 *
 * Derechos Reservados de copia (c) - INAP /
 *
 * Instituto Mexicano del Seguro Social - 2011
 */

package mx.gob.imss.cia.ssdc.cdv.integracion.dao;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import java.util.List;

import mx.gob.imss.cia.ssdc.cdv.integracion.entity.TurnoEntity;
import mx.gob.imss.cia.ssdc.cdv.test.IntegrationTest;
import mx.gob.imss.cia.ssdc.cdv.vo.TurnoVo;
import mx.gob.imss.cia.ssdc.commons.Constantes;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author Gamaliel
 * 
 */

public class TestTurnoDao extends IntegrationTest {

	private static final Long CVE_TURNO = 1L;

	@Autowired
	private TurnoDao turnoDao;

	@Test
	public void debieraExistirTurnoDao() throws Exception {
		assertNotNull(turnoDao);
	}

	@Test
	public void deberiaHeredarDePersistenceDao() {
		assertTrue(turnoDao instanceof PersistenceDao<?, ?>);
	}

	@Test
	public void deberiaCrearUnTurno() throws Exception {
		TurnoEntity turno = new TurnoEntity();
		turno.setStatus(Constantes.ENABLE);

		List<TurnoEntity> todasAcciones = turnoDao.findAll();
		turnoDao.create(turno);
		assertTrue(turnoDao.findAll().size() > todasAcciones.size());
	}

	@Test
	public void deberiaTraerUnTurnoPorClave() throws Exception {
		TurnoEntity turnoPorClave = turnoDao.read(CVE_TURNO);
		assertNotNull(turnoPorClave);
		assertEquals(CVE_TURNO, turnoPorClave.getCveTurno());
	}

	@Test
	public void deberiaActualizarElEstado() throws Exception {
		TurnoEntity turno = turnoDao.read(CVE_TURNO);
		assertEquals(Constantes.ENABLE, turno.getStatus());
		turno.setStatus(Constantes.DISABLE);
		turnoDao.update(turno);
		assertEquals(Constantes.DISABLE, turno.getStatus());
	}

	@Test
	public void deberiaBorrarElTurno() throws Exception {
		TurnoEntity turno = turnoDao.read(CVE_TURNO);
		assertNotNull(turno);
		turnoDao.delete(turno);

		turno = turnoDao.read(1L);
		assertNull(turno);
	}

	@Test
	public void deberiaTraerTodosLosTurno() throws Exception {
		List<TurnoEntity> todosLosTurnos = turnoDao.findAll();
		assertNotNull(todosLosTurnos);
		assertTrue(todosLosTurnos.size() > 0);
	}

	@Test
	public void deberiaFiltrarLosTurnosPorStatus() throws Exception {
		List<TurnoEntity> turnoPorStatus = turnoDao
				.filtrarTurnoPorStatus(Constantes.ENABLE);
		assertNotNull(turnoPorStatus);
		assertTrue(turnoPorStatus.size() > 0);
		for (TurnoEntity turnoEntity : turnoPorStatus) {
			assertEquals(Constantes.ENABLE, turnoEntity.getStatus());
		}
	}

	@Test
	public void deberiaTraerListadoTurnoVo() throws Exception {

		List<TurnoVo> turnoPorStatus = turnoDao
				.obtenerListadoTurnoVo(Constantes.ENABLE);
		assertNotNull(turnoPorStatus);
		assertFalse(turnoPorStatus.isEmpty());

	}

}
