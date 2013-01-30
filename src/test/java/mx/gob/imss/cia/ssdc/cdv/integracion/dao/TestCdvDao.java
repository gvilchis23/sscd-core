/**
 * Proyecto: IMSS  - SSDC
 *
 * Archivo: TestCdvDao.java
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

import java.util.ArrayList;
import java.util.List;

import mx.gob.imss.cia.ssdc.cdv.integracion.entity.CausaEntity;
import mx.gob.imss.cia.ssdc.cdv.integracion.entity.CdvEntity;
import mx.gob.imss.cia.ssdc.cdv.test.IntegrationTest;
import mx.gob.imss.cia.ssdc.commons.Constantes;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author
 * 
 */

public class TestCdvDao extends IntegrationTest {

	@Autowired
	private CdvDao cdvDao;

	@Test
	public void debieraExistirCdvDao() throws Exception {
		assertNotNull(cdvDao);
	}

	@Test
	public void deberiaHeredarDePersistenceDao() {
		assertTrue(cdvDao instanceof PersistenceDao<?, ?>);
	}

	@Test
	public void deberiaCrearUnaCdv() throws Exception {
		CdvEntity cdv = new CdvEntity();
		cdv.setHoraNormalFin(0);
		cdv.setHoraNormalIni(0);
		cdv.setHoraRealFin(0);
		cdv.setHoraRealIni(0);
		cdv.setMinNormalFin(0);
		cdv.setMinNormalIni(0);
		cdv.setMinRealFin(0);
		cdv.setMinRealIni(0);
		cdv.setNumeroVentanillas(0);

		CausaEntity causaEntity = new CausaEntity();
		causaEntity.setNombreCausa("causa");
		causaEntity.setStatus(Constantes.ENABLE);

		List<CausaEntity> causa = new ArrayList<CausaEntity>();
		causa.add(causaEntity);
		cdv.setCausa(causa);

		List<CdvEntity> todasAcciones = cdvDao.findAll();
		cdvDao.create(cdv);
		assertTrue(cdvDao.findAll().size() > todasAcciones.size());
	}

	@Test
	public void deberiaTraerUnaCdvPorClave() throws Exception {
		CdvEntity cdvPorClave = cdvDao.read(1L);
		assertNotNull(cdvPorClave);
		assertEquals(1, cdvPorClave.getCveCdv().intValue());
	}

	@Test
	public void deberiaActualizarElNumeroDeVentanillas() throws Exception {
		CdvEntity accion = cdvDao.read(1L);
		assertEquals(Constantes.ENABLE, accion.getNumeroVentanillas());
		accion.setNumeroVentanillas(Constantes.DISABLE);
		cdvDao.update(accion);
		assertEquals(Constantes.DISABLE, accion.getNumeroVentanillas());
	}

	@Test
	public void deberiaBorrarLaCausa() throws Exception {
		CdvEntity cdv = cdvDao.read(1L);
		assertNotNull(cdv);
		cdvDao.delete(cdv);

		cdv = cdvDao.read(1L);
		assertNull(cdv);
	}

	@Test
	public void deberiaTraerTodasLasCausas() throws Exception {
		List<CdvEntity> todasCdvs = cdvDao.findAll();
		assertNotNull(todasCdvs);
		assertTrue(todasCdvs.size() > 0);
	}

	@Test
	public void deberiaIncrementarLaSecueciaEnUno() throws Exception {

		List<CdvEntity> todasCdvs = cdvDao.findAll();
		
		CdvEntity ultimo = todasCdvs.get(todasCdvs.size()-1);

		CdvEntity nueva = new CdvEntity();		

		cdvDao.create(nueva);
		
		assertTrue(ultimo.getCveCdv() < nueva.getCveCdv());
	}
}
