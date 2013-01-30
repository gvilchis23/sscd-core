/**
 * Proyecto: IMSS  - SSDC
 *
 * Archivo: TestInformacionPersonalDao.java
 *
 * Creado: 20/10/2011
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

import mx.gob.imss.cia.ssdc.cdv.integracion.entity.InformacionPersonalEntity;
import mx.gob.imss.cia.ssdc.cdv.test.IntegrationTest;
import mx.gob.imss.cia.ssdc.commons.Constantes;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * 
 * @author Equipo de Desarrollo
 * 
 */
public class TestInformacionPersonalDao extends IntegrationTest {

	@Autowired
	private InformacionPersonalDao informacionPersonalDao;

	private static final Long ID = 1L;

	@Test
	public void debieraExistirInformacionPersonalDao() throws Exception {
		assertNotNull(informacionPersonalDao);
	}

	@Test
	public void deberiaHeredarDePersistenceDao() {
		assertTrue(informacionPersonalDao instanceof PersistenceDao<?, ?>);
	}

	@Test
	public void deberiaCrearUnInformacionPersonalDao() throws Exception {
		InformacionPersonalEntity informacionPersonal = new InformacionPersonalEntity();
		informacionPersonal.setIncapacidades(10);

		List<InformacionPersonalEntity> todasEntFed = informacionPersonalDao
		        .findAll();
		informacionPersonalDao.create(informacionPersonal);
		assertTrue(informacionPersonalDao.findAll().size() > todasEntFed.size());
	}

	@Test
	public void deberiaTraerUnInformacionPersonalPorClave() throws Exception {
		InformacionPersonalEntity indicadorPorClave = informacionPersonalDao
		        .read(ID);
		assertNotNull(indicadorPorClave);
		assertEquals(ID, indicadorPorClave.getCveInformacionPersonal());
	}

	@Test
	public void deberiaActualizarElNumeroDeIncapacidades() throws Exception {
		InformacionPersonalEntity indicador = informacionPersonalDao.read(ID);
		assertEquals(Constantes.ENABLE, indicador.getIncapacidades().intValue());
		indicador.setIncapacidades(Constantes.DISABLE);
		informacionPersonalDao.update(indicador);
		assertEquals(Constantes.DISABLE, indicador.getIncapacidades()
		        .intValue());
	}

	@Test
	public void deberiaBorrarLaInformacionPersonal() throws Exception {
		InformacionPersonalEntity indicador = informacionPersonalDao.read(ID);
		assertNotNull(indicador);
		informacionPersonalDao.delete(indicador);

		indicador = informacionPersonalDao.read(1L);
		assertNull(indicador);
	}

	@Test
	public void deberiaTraerTodaLaInformacionPersonal() throws Exception {
		List<InformacionPersonalEntity> todaLaInfo = informacionPersonalDao
		        .findAll();
		assertNotNull(todaLaInfo);
		assertTrue(todaLaInfo.size() > 0);
	}

}
