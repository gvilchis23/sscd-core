/**
 * Proyecto: IMSS  - SSDC
 *
 * Archivo: TestDiasFestivosDao.java
 *
 * Creado: 19/10/2011
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

import mx.gob.imss.cia.ssdc.cdv.integracion.entity.DiasFestivosEntity;
import mx.gob.imss.cia.ssdc.cdv.test.IntegrationTest;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * 
 * @author Equipo de Desarrollo
 * 
 */
public class TestDiasFestivosDao extends IntegrationTest {

	@Autowired
	private DiasFestivosDao diasFestivosDao;

	private static final Long ID = 1L;

	@Test
	public void debieraExistirDelegacionDao() throws Exception {
		assertNotNull(diasFestivosDao);
	}

	@Test
	public void deberiaHeredarDePersistenceDao() {
		assertTrue(diasFestivosDao instanceof PersistenceDao<?, ?>);
	}

	@Test
	public void deberiaCrearUnDiaFestivo() throws Exception {
		DiasFestivosEntity diasFestivos = new DiasFestivosEntity();
		diasFestivos.setRazon("razon del dia festivo");

		List<DiasFestivosEntity> todasDelegaciones = diasFestivosDao.findAll();
		diasFestivosDao.create(diasFestivos);
		assertTrue(diasFestivosDao.findAll().size() > todasDelegaciones.size());
	}

	@Test
	public void deberiaTraerUnDiaFestivoPorClave() throws Exception {
		DiasFestivosEntity diaFestivoPorClave = diasFestivosDao.read(ID);
		assertNotNull(diaFestivoPorClave);
		assertEquals(ID, diaFestivoPorClave.getCveDiasFestivos());
	}

	@Test
	public void deberiaActualizarNombreDelDiaFestivo() throws Exception {
		String razonActualizada = "Cumpleaños";
		DiasFestivosEntity diaFestivo = diasFestivosDao.read(ID);
		assertEquals("Judgement Day", diaFestivo.getRazon());
		diaFestivo.setRazon(razonActualizada);
		diasFestivosDao.update(diaFestivo);
		assertEquals(razonActualizada, diaFestivo.getRazon());
	}

	@Test
	public void deberiaBorrarElDiaFestivo() throws Exception {
		DiasFestivosEntity diaFestivo = diasFestivosDao.read(ID);
		assertNotNull(diaFestivo);
		diasFestivosDao.delete(diaFestivo);

		diaFestivo = diasFestivosDao.read(1L);
		assertNull(diaFestivo);
	}

	@Test
	public void deberiaTraerTodaLosDiasFestivos() throws Exception {
		List<DiasFestivosEntity> todosDiasFest = diasFestivosDao.findAll();
		assertNotNull(todosDiasFest);
		assertTrue(todosDiasFest.size() > 0);
	}
}
