/**
 * Proyecto: IMSS  - SSDC
 *
 * Archivo: TestUtilidadesDao.java
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

import mx.gob.imss.cia.ssdc.cdv.integracion.entity.UtilidadesEntity;
import mx.gob.imss.cia.ssdc.cdv.test.IntegrationTest;
import mx.gob.imss.cia.ssdc.commons.Constantes;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author propietario
 *
 */
public class TestUtilidadesDao  extends IntegrationTest  {
	
	@Autowired
	private UtilidadesDao utilidadesDao;
	
	@Test
	public void debieraExistirUtilidades() throws Exception {
		UtilidadesEntity tip = new UtilidadesEntity();
		tip.setCveUtilidades(1L);
		tip.setNombreUtilidades("prueba");
		tip.setStatus(1);
		tip.setTipoVentanilla(null);
		utilidadesDao.create(tip);
	}

	@Test
	public void deberiaTraerUtilidadesPorClave() throws Exception {
		UtilidadesEntity tip = utilidadesDao.read(1L);
		assertNotNull(tip);
		assertEquals(1, tip.getCveUtilidades().intValue());
	}
	
	@Test
	public void deberiaActualizarElStatus() throws Exception {
		UtilidadesEntity medios = utilidadesDao.read(1L);
		assertEquals(Constantes.ENABLE, medios.getStatus().intValue());
		medios.setStatus(Constantes.DISABLE);
		utilidadesDao.update(medios);
		assertEquals(Constantes.DISABLE, medios.getStatus().intValue());
	}
	
	@Test
	public void deberiaBorrarUtilidades() throws Exception {
		UtilidadesEntity medios = utilidadesDao.read(1L);
		assertNotNull(medios);
		utilidadesDao.delete(medios);
		medios = utilidadesDao.read(1L);
		assertNull(medios);
	}
	
	@Test
	public void deberiaTraerTodasUtilidades() throws Exception {
		List<UtilidadesEntity> todosMedios = 
			utilidadesDao.findAll();
		assertNotNull(todosMedios);
		assertTrue(todosMedios.size() > 0);
	}

}
