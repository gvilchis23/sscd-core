/**
 * Proyecto: IMSS  - SSDC
 *
 * Archivo: TestSscNotificacionDao.java
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

import mx.gob.imss.cia.ssdc.cdv.integracion.entity.SscNotificacionEntity;
import mx.gob.imss.cia.ssdc.cdv.integracion.entity.SscTipoNotificacionEntity;
import mx.gob.imss.cia.ssdc.cdv.test.IntegrationTest;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author FABRICIO-INAP
 * 
 */
public class TestSscNotificacionDao extends IntegrationTest{

	@Autowired
	private SscNotificacionDao sscNotificacionDao;

	@Test
	public void debieraExistirSscNotificacionDao() throws Exception {
		assertNotNull(sscNotificacionDao);
	}

	@Test
	public void deberiaHeredarDePersistenceDao() {
		assertTrue(sscNotificacionDao instanceof PersistenceDao);
	}

	@Test
	public void deberiaCrearUnaNuevaNotificacion() throws Exception {

		SscNotificacionEntity entidad = new SscNotificacionEntity();

		entidad.setNomNotificacion("Nueva notificacion");
		entidad.setTipoNotificacion(new SscTipoNotificacionEntity());

		List<SscNotificacionEntity> todasEntidades = sscNotificacionDao
				.findAll();

		sscNotificacionDao.create(entidad);

		assertTrue(sscNotificacionDao.findAll().size() > todasEntidades.size());
	}

	@Test
	public void deberiaTraerUnSscNotificacionEntityPorClave() throws Exception {
		
		final Long claveConsiderada = 1L;
		
		SscNotificacionEntity entidad = 
				sscNotificacionDao.read(claveConsiderada);
		
		assertNotNull(entidad);
		
		assertTrue(claveConsiderada == entidad.getCveNotificacion());

	}

	@Test
	public void deberiaActualizarElNombreNotificacion() throws Exception {

		final Long claveConsiderada = 1L;
		final String estatusPrevio = "NOTIFICA";
		final String estatusPosterior = "MODIFICADO";

		SscNotificacionEntity entidad = sscNotificacionDao
				.read(claveConsiderada);

		assertEquals(estatusPrevio, entidad.getNomNotificacion());

		entidad.setNomNotificacion(estatusPosterior);

		sscNotificacionDao.update(entidad);

		assertEquals(estatusPosterior, sscNotificacionDao
				.read(claveConsiderada).getNomNotificacion());
	}

	@Test
	public void deberiaBorrarSscNotificacionEntity() throws Exception {

		final Long claveConsiderada = 1L;

		SscNotificacionEntity cdv = sscNotificacionDao.read(claveConsiderada);

		assertNotNull(cdv);

		sscNotificacionDao.delete(cdv);

		cdv = sscNotificacionDao.read(1L);

		assertNull(cdv);
	}

	@Test
	public void deberiaTraerTodasLasSscNotificacion() throws Exception {
		List<SscNotificacionEntity> listadoEntidades = sscNotificacionDao
				.findAll();
		assertNotNull(listadoEntidades);
		assertFalse(listadoEntidades.isEmpty());
	}

	@Test
	public void deberiaIncrementarLaSecueciaEnUno() throws Exception {

		List<SscNotificacionEntity> listadoEntidades = 
				sscNotificacionDao.findAll();

		SscNotificacionEntity ultimo = listadoEntidades
				.get(listadoEntidades.size() - 1);

		SscNotificacionEntity nueva = new SscNotificacionEntity();

		sscNotificacionDao.create(nueva);

		assertTrue(ultimo.getCveNotificacion() < nueva.getCveNotificacion());
	}

}
