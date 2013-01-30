/**
 * Proyecto: IMSS  - SSDC
 *
 * Archivo: TestMediosDifusionDao.java
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

import mx.gob.imss.cia.ssdc.cdv.integracion.entity.MediosDifusionEntity;
import mx.gob.imss.cia.ssdc.cdv.test.IntegrationTest;
import mx.gob.imss.cia.ssdc.commons.Constantes;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author Gamaliel
 * 
 */

public class TestMediosDifusionDao extends IntegrationTest {
	@Autowired
	private MediosDifusionDao mediosDifusionDao;

	@Test
	public void debieraExistirMediosDifusionDao() throws Exception {
		MediosDifusionEntity medios = new MediosDifusionEntity();
		medios.setCveDifusion(1L);
		medios.setNombreDifusion("prueba");
		medios.setStatus(Constantes.ENABLE);
		medios.setTipoVentanilla(null);
		mediosDifusionDao.create(medios);
	}

	@Test
	public void deberiaTraerUnMedioPorClave() throws Exception {
		MediosDifusionEntity medios = mediosDifusionDao.read(1L);
		assertNotNull(medios);
		assertEquals(1, medios.getCveDifusion().intValue());
	}

	@Test
	public void deberiaActualizarElEstado() throws Exception {
		MediosDifusionEntity medios = mediosDifusionDao.read(1L);
		assertEquals(Constantes.ENABLE, medios.getStatus().intValue());
		medios.setStatus(Constantes.DISABLE);
		mediosDifusionDao.update(medios);
		assertEquals(Constantes.DISABLE, medios.getStatus().intValue());
	}

	@Test
	public void deberiaBorrarMedio() throws Exception {
		MediosDifusionEntity medios = mediosDifusionDao.read(1L);
		assertNotNull(medios);
		mediosDifusionDao.delete(medios);
		medios = mediosDifusionDao.read(1L);
		assertNull(medios);
	}

	@Test
	public void deberiaTraerTodasLosMedios() throws Exception {
		List<MediosDifusionEntity> todosMedios = mediosDifusionDao.findAll();
		assertNotNull(todosMedios);
		assertTrue(todosMedios.size() > 0);
	}

	@Test
	public void deberiaFiltrarLosTiposVentallinasPorStatus() throws Exception {
		List<MediosDifusionEntity> todosMedios = mediosDifusionDao
		        .filtrarDifusionPorStatus(Constantes.ENABLE);
		assertNotNull(todosMedios);
		assertTrue(todosMedios.size() > 0);
		for (MediosDifusionEntity mediosDifusionEntity : todosMedios) {
			assertEquals(Constantes.ENABLE, mediosDifusionEntity.getStatus()
			        .intValue());
		}
	}
}
