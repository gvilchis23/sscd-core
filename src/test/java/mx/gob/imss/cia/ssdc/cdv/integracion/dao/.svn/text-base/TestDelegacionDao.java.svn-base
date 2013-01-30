/**
 * Proyecto: IMSS  - SSDC
 *
 * Archivo: TestDelegacionDao.java
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

import mx.gob.imss.cia.ssdc.cdv.integracion.entity.DelegacionEntity;
import mx.gob.imss.cia.ssdc.cdv.test.IntegrationTest;
import mx.gob.imss.cia.ssdc.cdv.vo.DelegacionVo;
import mx.gob.imss.cia.ssdc.commons.Constantes;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author Gamaliel
 * 
 */

public class TestDelegacionDao extends IntegrationTest {

	private static final Long ID = 1L;
	
	@Autowired
	private DelegacionDao delegacionDao;

	@Test
	public void debieraExistirDelegacionDao() throws Exception {
		assertNotNull(delegacionDao);
	}

	@Test
	public void deberiaHeredarDePersistenceDao() {
		assertTrue(delegacionDao instanceof PersistenceDao<?, ?>);
	}

	@Test
	public void deberiaCrearUnaDelegacion() throws Exception {
		DelegacionEntity delegacion = new DelegacionEntity();
		delegacion.setDomNumero(0);
		delegacion.setStatus(Constantes.ENABLE);

		List<DelegacionEntity> todasDelegaciones = delegacionDao.findAll();
		delegacionDao.create(delegacion);
		assertTrue(delegacionDao.findAll().size() > todasDelegaciones.size());
	}

	@Test
	public void deberiaTraerUnaDelegacionPorClave() throws Exception {
		DelegacionEntity accionPorClave = delegacionDao.read(ID);
		assertNotNull(accionPorClave);
		assertEquals(ID, accionPorClave.getCveDelegacion());
	}

	@Test
	public void deberiaActualizarElEstado() throws Exception {
		DelegacionEntity delegacion = delegacionDao.read(ID);
		assertEquals(Constantes.ENABLE, delegacion.getStatus());
		delegacion.setStatus(Constantes.DISABLE);
		delegacionDao.update(delegacion);
		assertEquals(Constantes.DISABLE, delegacion.getStatus());
	}

	@Test
	public void deberiaBorrarLaDelegacion() throws Exception {
		DelegacionEntity accion = delegacionDao.read(ID);
		assertNotNull(accion);
		delegacionDao.delete(accion);

		accion = delegacionDao.read(1L);
		assertNull(accion);
	}

	@Test
	public void deberiaTraerTodaLasDelegaciones() throws Exception {
		List<DelegacionEntity> todasAcciones = delegacionDao.findAll();
		assertNotNull(todasAcciones);
		assertFalse(todasAcciones.isEmpty());
	}

	@Test
	public void deberiaFiltrarLasDelegacionesPorStatus() throws Exception {
		List<DelegacionEntity> todasAcciones = delegacionDao
		        .obtenerListadoDelegacionPorStatus(Constantes.ENABLE);
		assertNotNull(todasAcciones);
		assertFalse(todasAcciones.isEmpty());

		for (DelegacionEntity delegacionEntity : todasAcciones) {
			assertEquals(Constantes.ENABLE, delegacionEntity.getStatus());
		}
	}

	@Test
	public void deberiaTraerListadoDelegacionVo() throws Exception {
		List<DelegacionVo> vo = delegacionDao.
				obtenerListadoDelegacionVo(Constantes.ENABLE);
		assertNotNull(vo);
		assertFalse(vo.isEmpty());
	}
}
