/**
 * Proyecto: IMSS  - SSDC
 *
 * Archivo: TestOpinionTrabajadorDao.java
 *
 * Creado:  Oct 20, 2011
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

import mx.gob.imss.cia.ssdc.cdv.integracion.entity.OpinionTrabajadorEntity;
import mx.gob.imss.cia.ssdc.cdv.test.IntegrationTest;
import mx.gob.imss.cia.ssdc.commons.Constantes;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author propietario
 *
 */
public class TestOpinionTrabajadorDao extends IntegrationTest {
	
	@Autowired
	private OpinionTrabajadorDao opinionTrabajadorDao;
	
	@Test
	public void debieraExistirOpinion() throws Exception {
		OpinionTrabajadorEntity opi = new OpinionTrabajadorEntity();
		opi.setCdv(null);
		opi.setCveOpinionTrabajador(1L);
		opi.setGustoTrabajo(1);
		opinionTrabajadorDao.create(opi);
	}
	
	@Test
	public void deberiaTraerOpinionPorClave() throws Exception {
		OpinionTrabajadorEntity opi = opinionTrabajadorDao.read(1L);
		assertNotNull(opi);
		assertEquals(1, opi.getCveOpinionTrabajador().intValue());
	}
	
	@Test
	public void deberiaActualizarElGusto() throws Exception {
		OpinionTrabajadorEntity nec = opinionTrabajadorDao.read(1L);
		assertEquals(Constantes.ENABLE, nec.getGustoTrabajo().intValue());
		nec.setGustoTrabajo(Constantes.DISABLE);
		opinionTrabajadorDao.update(nec);
		assertEquals(Constantes.DISABLE, nec.getGustoTrabajo().intValue());
	}
	
	@Test
	public void deberiaBorrarOpinion() throws Exception {
		OpinionTrabajadorEntity nec = opinionTrabajadorDao.read(1L);
		assertNotNull(nec);
		opinionTrabajadorDao.delete(nec);
		nec = opinionTrabajadorDao.read(1L);
		assertNull(nec);
	}
	
	@Test
	public void deberiaTraerTodasOpinion() throws Exception {
		List<OpinionTrabajadorEntity> todosNec = opinionTrabajadorDao.findAll();
		assertNotNull(todosNec);
		assertTrue(todosNec.size() > 0);
	}

}
