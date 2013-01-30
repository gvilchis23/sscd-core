/**
 * Proyecto: IMSS  - SSDC
 *
 * Archivo: TestTipoVentanillaDao.java
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

import mx.gob.imss.cia.ssdc.cdv.integracion.entity.TipoVentanillaEntity;
import mx.gob.imss.cia.ssdc.cdv.test.IntegrationTest;
import mx.gob.imss.cia.ssdc.cdv.vo.TipoVentanillaVo;
import mx.gob.imss.cia.ssdc.commons.Constantes;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author Gamaliel
 * 
 */

public class TestTipoVentanillaDao extends IntegrationTest {

	private static final Long CVE_TIP_VENTANILLA = 1l;

	@Autowired
	private TipoVentanillaDao tipoVentanillaDao;

	@Test
	public void debieraExistirTipoVentanillaDao() throws Exception {
		assertNotNull(tipoVentanillaDao);
	}

	@Test
	public void deberiaHeredarDePersistenceDao() {
		assertTrue(tipoVentanillaDao instanceof PersistenceDao<?, ?>);
	}

	@Test
	public void deberiaCrearUnTipoVentallina() throws Exception {
		TipoVentanillaEntity turno = new TipoVentanillaEntity();
		turno.setStatus(Constantes.ENABLE);

		List<TipoVentanillaEntity> todasAcciones = tipoVentanillaDao.findAll();
		tipoVentanillaDao.create(turno);
		assertTrue(tipoVentanillaDao.findAll().size() > todasAcciones.size());
	}

	@Test
	public void deberiaTraerUnTipoVentallinaPorClave() throws Exception {
		TipoVentanillaEntity turnoPorClave = tipoVentanillaDao
		        .read(CVE_TIP_VENTANILLA);
		assertNotNull(turnoPorClave);
		assertEquals(CVE_TIP_VENTANILLA, turnoPorClave.getCveTipoVentanilla());
	}

	@Test
	public void deberiaActualizarElEstado() throws Exception {
		TipoVentanillaEntity tipVentanilla = tipoVentanillaDao
		        .read(CVE_TIP_VENTANILLA);
		assertEquals(Constantes.ENABLE, tipVentanilla.getStatus());
		tipVentanilla.setStatus(Constantes.DISABLE);
		tipoVentanillaDao.update(tipVentanilla);
		assertEquals(Constantes.DISABLE, tipVentanilla.getStatus());
	}

	@Test
	public void deberiaBorrarElTipoVentallina() throws Exception {
		TipoVentanillaEntity tipVentanilla = tipoVentanillaDao
		        .read(CVE_TIP_VENTANILLA);
		assertNotNull(tipVentanilla);
		tipoVentanillaDao.delete(tipVentanilla);

		tipVentanilla = tipoVentanillaDao.read(1L);
		assertNull(tipVentanilla);
	}

	@Test
	public void deberiaTraerTodosLosTiposVentallinas() throws Exception {
		List<TipoVentanillaEntity> todosLosTipVentanilla = tipoVentanillaDao
		        .findAll();
		assertNotNull(todosLosTipVentanilla);
		assertTrue(todosLosTipVentanilla.size() > 0);
	}

	@Test
	public void deberiaFiltrarLosTiposVentallinasPorStatus() throws Exception {
		List<TipoVentanillaEntity> tipVentanillaPorStatus = tipoVentanillaDao
		        .filtrarTipoVentanillaPorStatus(Constantes.ENABLE);
		assertNotNull(tipVentanillaPorStatus);
		assertTrue(tipVentanillaPorStatus.size() > 0);
		for (TipoVentanillaEntity entidad : tipVentanillaPorStatus) {
			assertEquals(Constantes.ENABLE, entidad.getStatus());
		}
	}
	
	@Test
	public void deberiaTraerListadoTipoVentanillaVo() throws Exception {
		List<TipoVentanillaVo> listado = tipoVentanillaDao
				.obtenerListadoTipoVentanillaVo(Constantes.ENABLE);
		assertNotNull(listado);
		assertFalse(listado.isEmpty());
	}
}
