/**
 * Proyecto: IMSS  - SSDC
 *
 * Archivo: TestCdtPerfilPersonalDao.java
 *
 * Creado: 18/10/2011
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

import mx.gob.imss.cia.ssdc.cdv.integracion.entity.CdtPerfilPersonalEntity;
import mx.gob.imss.cia.ssdc.cdv.test.IntegrationTest;
import mx.gob.imss.cia.ssdc.commons.Constantes;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * 
 * @author Equipo de Desarrollo
 * 
 */
public class TestCdtPerfilPersonalDao extends IntegrationTest {

	@Autowired
	private CdtPerfilPersonalDao cdtPerfilPersonalDao;

	@Test
	public void deberiaCrearUnaCdtPerfilPersonal() throws Exception {
		CdtPerfilPersonalEntity cdtPerfil = new CdtPerfilPersonalEntity();
		cdtPerfil.setExpAno(1);
		cdtPerfil.setExpMes(1);

		List<CdtPerfilPersonalEntity> todas = cdtPerfilPersonalDao.findAll();
		cdtPerfilPersonalDao.create(cdtPerfil);
		assertTrue(cdtPerfilPersonalDao.findAll().size() > todas.size());
	}

	@Test
	public void deberiaTraerUnaCdtPerfilPersonalPorClave() throws Exception {
		CdtPerfilPersonalEntity cdtPerfilPersonal = cdtPerfilPersonalDao
		        .read(1L);
		assertNotNull(cdtPerfilPersonal);
		assertEquals(1, cdtPerfilPersonal.getCveCdvPerfil().intValue());
	}

	@Test
	public void deberiaActualizarElTiemExpAnio() throws Exception {
		CdtPerfilPersonalEntity accion = cdtPerfilPersonalDao.read(1L);
		assertEquals(Constantes.ENABLE, accion.getExpAno());
		accion.setExpAno(Constantes.DISABLE);
		cdtPerfilPersonalDao.update(accion);
		assertEquals(Constantes.DISABLE, accion.getExpAno());
	}

	@Test
	public void deberiaBorrarLaCausa() throws Exception {
		CdtPerfilPersonalEntity cdv = cdtPerfilPersonalDao.read(1L);
		assertNotNull(cdv);
		cdtPerfilPersonalDao.delete(cdv);

		cdv = cdtPerfilPersonalDao.read(1L);
		assertNull(cdv);
	}

	@Test
	public void deberiaTraerTodasLasCausas() throws Exception {
		List<CdtPerfilPersonalEntity> todasCdvs = cdtPerfilPersonalDao
		        .findAll();
		assertNotNull(todasCdvs);
		assertTrue(todasCdvs.size() > 0);
	}

}
