/**
 * Proyecto: IMSS  - SSDC
 *
 * Archivo: TestModuloAtencionDao.java
 *
 * Creado:  Oct 19, 2011
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

import mx.gob.imss.cia.ssdc.cdv.integracion.entity.ModuloAtencionEntity;
import mx.gob.imss.cia.ssdc.cdv.test.IntegrationTest;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author propietario
 *
 */
public class TestModuloAtencionDao extends IntegrationTest {
	
	@Autowired
	private ModuloAtencionDao moduloAtencionDao;
	
	@Test
	public void debieraExistirModulo() throws Exception {
		ModuloAtencionEntity modulo = new ModuloAtencionEntity();
		modulo.setCveModuloAtencion(1L);
		modulo.setAccesible(1);
		modulo.setCdv(null);
		modulo.setExisteModulo(1);
		modulo.setPersonalTecnico(1);
		modulo.setPersonasAtendiendo(1);
		modulo.setSenializado(1);
		modulo.setVisible(1);
		moduloAtencionDao.create(modulo);
	}
	
	@Test
	public void deberiaTraerUnModuloClave() throws Exception {
		ModuloAtencionEntity modulo = moduloAtencionDao.read(1L);
		assertNotNull(modulo);
		assertEquals(1, modulo.getCveModuloAtencion().intValue());
	}
	
	@Test
	public void deberiaBorrarModulo() throws Exception {
		ModuloAtencionEntity modulo = moduloAtencionDao.read(1L);
		assertNotNull(modulo);
		moduloAtencionDao.delete(modulo);
		modulo = moduloAtencionDao.read(1L);
		assertNull(modulo);
	}
	
	@Test
	public void deberiaTraerTodasLosMedios() throws Exception {
		List<ModuloAtencionEntity> todosModulo = moduloAtencionDao.findAll();
		assertNotNull(todosModulo);
		assertTrue(todosModulo.size() > 0);
	}


}
