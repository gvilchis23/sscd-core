/**
 * Proyecto: IMSS  - SSDC
 *
 * Archivo: TestSscTipoNotificacionDao.java
 *
 * Creado:  15/11/2011
 *
 * Derechos Reservados de copia (c) - INAP /
 *
 * Instituto Mexicano del Seguro Social - 2011
 */
package mx.gob.imss.cia.ssdc.cdv.integracion.dao;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import java.util.List;

import mx.gob.imss.cia.ssdc.cdv.integracion.entity.SscTipoNotificacionEntity;
import mx.gob.imss.cia.ssdc.cdv.test.IntegrationTest;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author FABRICIO-INAP
 * 
 */
public class TestSscTipoNotificacionDao extends IntegrationTest {

	@Autowired
	private SscTipoNotificacionDao tipoNotificacionDao;

	@Test
	public void debieraExistirSscTipoNotificacionDao() throws Exception {
		assertNotNull(tipoNotificacionDao);
	}

	@Test
	public void deberiaHeredarDePersistenceDao() {
		assertTrue(tipoNotificacionDao instanceof PersistenceDao);
	}

	@Test
	public void deberiaCrearUnNuevotipoNotificacion() throws Exception {

		SscTipoNotificacionEntity entidad = new SscTipoNotificacionEntity();

		entidad.setNomTipoNotificacion("TIPO_NOTIFICACION_TEST");
		entidad.setNumEstado(1);

		List<SscTipoNotificacionEntity> todasEntidades = tipoNotificacionDao
				.findAll();

		tipoNotificacionDao.create(entidad);

		assertTrue(tipoNotificacionDao.findAll().size() 
				> todasEntidades.size());
	}

	@Test
	public void deberiaTraerUnSscTipoNotificacionEntityPorClave()
			throws Exception {

		final Long claveConsiderada = 1L;

		SscTipoNotificacionEntity entidad = tipoNotificacionDao
				.read(claveConsiderada);

		assertNotNull(entidad);

		assertTrue(claveConsiderada == entidad.getCveTipoNotificacion());

	}

	@Test
	public void deberiaActualizarElNombreTipoNotificacion() throws Exception {

		final Long claveConsiderada = 1L;
		final String estatusPrevio = "TIPO 1";
		final String estatusPosterior = "TIPO TEST";

		SscTipoNotificacionEntity entidad = tipoNotificacionDao
				.read(claveConsiderada);

		assertEquals(estatusPrevio, entidad.getNomTipoNotificacion());

		entidad.setNomTipoNotificacion(estatusPosterior);

		tipoNotificacionDao.update(entidad);

		assertEquals(estatusPosterior,
				tipoNotificacionDao.read(claveConsiderada)
						.getNomTipoNotificacion());
	}

	@Test
	public void deberiaBorrarSscTipoNotificacionEntity() throws Exception {

		final Long claveConsiderada = 1L;

		SscTipoNotificacionEntity cdv = tipoNotificacionDao
				.read(claveConsiderada);

		assertNotNull(cdv);

		tipoNotificacionDao.delete(cdv);

		cdv = tipoNotificacionDao.read(1L);

		assertNull(cdv);
	}

	@Test
	public void deberiaTraerTodasLasSscNotificacion() throws Exception {
		
		List<SscTipoNotificacionEntity> listadoEntidades = 
				tipoNotificacionDao.findAll();
		
		assertNotNull(listadoEntidades);
		
		assertFalse(listadoEntidades.isEmpty());
	}

	@Test
	public void deberiaIncrementarLaSecueciaEnUno() throws Exception {

		List<SscTipoNotificacionEntity> listadoEntidades = tipoNotificacionDao
				.findAll();

		SscTipoNotificacionEntity ultimo = listadoEntidades
				.get(listadoEntidades.size() - 1);

		SscTipoNotificacionEntity nueva = new SscTipoNotificacionEntity();

		tipoNotificacionDao.create(nueva);

		assertTrue(ultimo.getCveTipoNotificacion() < nueva
				.getCveTipoNotificacion());
	}

}
