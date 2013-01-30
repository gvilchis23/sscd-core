/**
 * Proyecto: IMSS  - SSDC
 *
 * Archivo: TestVentanillaPosteriorDao.java
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

import mx.gob.imss.cia.ssdc.cdv.integracion.entity.VentanillaPosteriorEntity;
import mx.gob.imss.cia.ssdc.cdv.test.IntegrationTest;
import mx.gob.imss.cia.ssdc.commons.Constantes;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author propietario
 * 
 */
public class TestVentanillaPosteriorDao extends IntegrationTest {

	private static final Long CVE_TIPO_VENTANILLA = 1L;
	@Autowired
	private VentanillaPosteriorDao ventanillaPosteriorDao;

	@Test
	public void debieraCrearVentanillaPost() throws Exception {
		VentanillaPosteriorEntity tip = new VentanillaPosteriorEntity();
		tip.setCveVentanillaPosterior(1L);
		tip.setNombreVentanillaPosterior("prueba");
		tip.setStatus(1);
		tip.setTipoVentanilla(null);
		ventanillaPosteriorDao.create(tip);
	}

	@Test
	public void deberiaTraerUnPostPorClave() throws Exception {
		VentanillaPosteriorEntity tip = ventanillaPosteriorDao.read(1L);
		assertNotNull(tip);
		assertEquals(1, tip.getCveVentanillaPosterior().intValue());
	}

	@Test
	public void deberiaActualizarElStatus() throws Exception {
		VentanillaPosteriorEntity medios = ventanillaPosteriorDao.read(1L);
		assertEquals(Constantes.ENABLE, medios.getStatus().intValue());
		medios.setStatus(Constantes.DISABLE);
		ventanillaPosteriorDao.update(medios);
		assertEquals(Constantes.DISABLE, medios.getStatus().intValue());
	}

	@Test
	public void deberiaBorrarPosterior() throws Exception {
		VentanillaPosteriorEntity medios = ventanillaPosteriorDao.read(1L);
		assertNotNull(medios);
		ventanillaPosteriorDao.delete(medios);
		medios = ventanillaPosteriorDao.read(1L);
		assertNull(medios);
	}

	@Test
	public void deberiaTraerTodasPosterior() throws Exception {
		List<VentanillaPosteriorEntity> todosMedios = ventanillaPosteriorDao
		        .findAll();
		assertNotNull(todosMedios);
		assertTrue(todosMedios.size() > 0);
	}

	@Test
	public void deberiaFiltrarLasVentanillasPosterioresPorVentanillaYStatus()
	        throws Exception {
		List<VentanillaPosteriorEntity> tipVentanilla = ventanillaPosteriorDao
		        .filtrarVentaPostPorTipoYStatus(CVE_TIPO_VENTANILLA,
		                Constantes.ENABLE);
		assertNotNull(tipVentanilla);
		assertTrue(tipVentanilla.size() > 0);
		for (VentanillaPosteriorEntity posteriorEntity : tipVentanilla) {
			assertEquals(CVE_TIPO_VENTANILLA,
			        posteriorEntity.getCveVentanillaPosterior());
			assertEquals(Constantes.ENABLE, posteriorEntity.getStatus()
			        .intValue());
		}
	}

}
