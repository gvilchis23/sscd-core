/**
 * Proyecto: IMSS  - SSDC
 *
 * Archivo: TestCausaDao.java
 *
 * Creado: 17/10/2011
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

import mx.gob.imss.cia.ssdc.cdv.integracion.entity.CausaEntity;
import mx.gob.imss.cia.ssdc.cdv.test.IntegrationTest;
import mx.gob.imss.cia.ssdc.commons.Constantes;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * 
 * @author Equipo de Desarrollo
 * 
 */
public class TestCausaDao extends IntegrationTest {

	@Autowired
	private CausaDao causaDao;

	@Test
	public void deberiaCrearUnaCausa() throws Exception {
		CausaEntity causa = new CausaEntity();
		causa.setNombreCausa("Causa Requisito");
		causa.setStatus(Constantes.ENABLE);
		causa.setTipoVentanilla(null);

		List<CausaEntity> todasAcciones = causaDao.findAll();
		causaDao.create(causa);
		assertTrue(causaDao.findAll().size() > todasAcciones.size());
	}

	@Test
	public void deberiaTraerUnaCausaPorClave() throws Exception {
		CausaEntity accionPorClave = causaDao.read(1L);
		assertNotNull(accionPorClave);
		assertEquals(1, accionPorClave.getCveCausa().intValue());
	}

	@Test
	public void deberiaActualizarElEstado() throws Exception {
		CausaEntity accion = causaDao.read(1L);
		assertEquals(Constantes.ENABLE, accion.getStatus());
		accion.setStatus(Constantes.DISABLE);
		causaDao.update(accion);
		assertEquals(Constantes.DISABLE, accion.getStatus());
	}

	@Test
	public void deberiaBorrarLaCausa() throws Exception {
		CausaEntity accion = causaDao.read(1L);
		assertNotNull(accion);
		causaDao.delete(accion);

		accion = causaDao.read(1L);
		assertNull(accion);
	}

	@Test
	public void deberiaTraerTodasLasCausas() throws Exception {
		List<CausaEntity> todasAcciones = causaDao.findAll();
		assertNotNull(todasAcciones);
		assertTrue(todasAcciones.size() > 0);
	}

}
