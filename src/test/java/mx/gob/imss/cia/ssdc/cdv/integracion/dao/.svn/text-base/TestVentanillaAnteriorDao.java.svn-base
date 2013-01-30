/**
 * Proyecto: IMSS  - SSDC
 *
 * Archivo: TestVentanillaAnteriorDao.java
 *
 * Creado:  Oct 21, 2011
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

import mx.gob.imss.cia.ssdc.cdv.integracion.entity.VentanillaAnteriorEntity;
import mx.gob.imss.cia.ssdc.cdv.test.IntegrationTest;
import mx.gob.imss.cia.ssdc.commons.Constantes;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author propietario
 * 
 */
public class TestVentanillaAnteriorDao extends IntegrationTest {

	private static final Long CVE_TIPO_VENTANILLA = 1L;
	@Autowired
	private VentanillaAnteriorDao ventanillaAnteriorDao;

	@Test
	public void debieraExistirVentanillaAnterior() throws Exception {
		VentanillaAnteriorEntity tip = new VentanillaAnteriorEntity();
		tip.setCveVentanillaAnterior(1L);
		tip.setNombreVentanillaAnterior("prueba");
		tip.setStatus(1);
		tip.setTipoVentanilla(null);
		ventanillaAnteriorDao.create(tip);
	}

	@Test
	public void deberiaTraerUnAnteriorPorClave() throws Exception {
		VentanillaAnteriorEntity tip = ventanillaAnteriorDao.read(1L);
		assertNotNull(tip);
		assertEquals(1, tip.getCveVentanillaAnterior().intValue());
	}

	@Test
	public void deberiaActualizarElStatus() throws Exception {
		VentanillaAnteriorEntity medios = ventanillaAnteriorDao.read(1L);
		assertEquals(Constantes.ENABLE, medios.getStatus().intValue());
		medios.setStatus(Constantes.DISABLE);
		ventanillaAnteriorDao.update(medios);
		assertEquals(Constantes.DISABLE, medios.getStatus().intValue());
	}

	@Test
	public void deberiaBorrarAnterior() throws Exception {
		VentanillaAnteriorEntity medios = ventanillaAnteriorDao.read(1L);
		assertNotNull(medios);
		ventanillaAnteriorDao.delete(medios);
		medios = ventanillaAnteriorDao.read(1L);
		assertNull(medios);
	}

	@Test
	public void deberiaTraerTodasAnterior() throws Exception {
		List<VentanillaAnteriorEntity> todosMedios = ventanillaAnteriorDao
		        .findAll();
		assertNotNull(todosMedios);
		assertTrue(todosMedios.size() > 0);
	}

	@Test
	public void deberiaFiltrarLasVentanillasAnterioresPorTipoYStatus()
	        throws Exception {
		List<VentanillaAnteriorEntity> tipVentanilla = ventanillaAnteriorDao
		        .filtrarVentaAnteriorPorTipoYStatus(CVE_TIPO_VENTANILLA,
		                Constantes.ENABLE);
		assertNotNull(tipVentanilla);
		assertTrue(tipVentanilla.size() > 0);
		for (VentanillaAnteriorEntity anteriorEntity : tipVentanilla) {
			assertEquals(CVE_TIPO_VENTANILLA,
			        anteriorEntity.getCveVentanillaAnterior());
			assertEquals(Constantes.ENABLE, anteriorEntity.getStatus()
			        .intValue());
		}
	}

}
