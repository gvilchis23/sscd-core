/**
 * Proyecto: IMSS  - SSDC
 *
 * Archivo: TestTipoProcesoCargaDao.java
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

import mx.gob.imss.cia.ssdc.cdv.integracion.entity.TipoProcesoCargaEntity;
import mx.gob.imss.cia.ssdc.cdv.test.IntegrationTest;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author propietario
 *
 */
public class TestTipoProcesoCargaDao  extends IntegrationTest  {
	
	@Autowired
	private TipoProcesoCargaDao tipoProcesoCargaDao;
	
	@Test
	public void debieraExistirProcesoCarga() throws Exception {
		TipoProcesoCargaEntity tip = new TipoProcesoCargaEntity();
		tip.setCveTipoCarga(1L);
		tip.setNombreTipoCarga("prueba");
		tipoProcesoCargaDao.create(tip);
	}

	@Test
	public void deberiaTraerUnTipoPorClave() throws Exception {
		TipoProcesoCargaEntity tip = tipoProcesoCargaDao.read(1L);
		assertNotNull(tip);
		assertEquals(1, tip.getCveTipoCarga().intValue());
	}
	
	@Test
	public void deberiaActualizarElNombre() throws Exception {
		TipoProcesoCargaEntity medios = tipoProcesoCargaDao.read(1L);
		assertEquals("prueba", medios.getNombreTipoCarga());
		medios.setNombreTipoCarga("cambio");
		tipoProcesoCargaDao.update(medios);
		assertEquals("cambio", medios.getNombreTipoCarga());
	}
	
	@Test
	public void deberiaBorrarTip() throws Exception {
		TipoProcesoCargaEntity medios = tipoProcesoCargaDao.read(1L);
		assertNotNull(medios);
		tipoProcesoCargaDao.delete(medios);
		medios = tipoProcesoCargaDao.read(1L);
		assertNull(medios);
	}
	
	@Test
	public void deberiaTraerTodasTip() throws Exception {
		List<TipoProcesoCargaEntity> todosMedios = 
			tipoProcesoCargaDao.findAll();
		assertNotNull(todosMedios);
		assertTrue(todosMedios.size() > 0);
	}

}
