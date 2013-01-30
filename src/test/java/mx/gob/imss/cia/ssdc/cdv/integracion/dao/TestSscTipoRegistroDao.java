/**
 * Proyecto: IMSS  - SSDC
 *
 * Archivo: TestSscTipoRegistroDao.java
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

import mx.gob.imss.cia.ssdc.cdv.integracion.entity.SscTipoRegistroEntity;
import mx.gob.imss.cia.ssdc.cdv.test.IntegrationTest;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author FABRICIO-INAP
 *
 */
public class TestSscTipoRegistroDao extends IntegrationTest{

	@Autowired
	private SscTipoRegistroDao sscTipoRegistroDao;
	
	@Test
	public void debieraExistirSscTipoRegistroDao() throws Exception {
		assertNotNull(sscTipoRegistroDao);
	}

	@Test
	public void deberiaHeredarDePersistenceDao() {
		assertTrue(sscTipoRegistroDao instanceof PersistenceDao);
	}
	
	@Test
	public void deberiaCrearUnNuevoEstatus() throws Exception {
		
		SscTipoRegistroEntity entidad =  new SscTipoRegistroEntity();
		
		entidad.setNomTipoRegistro("Tipo registro test");
		entidad.setNumEstado(1);
		
		List<SscTipoRegistroEntity> todasEntidades = 
				sscTipoRegistroDao.findAll();
		
		sscTipoRegistroDao.create(entidad);
		
		assertTrue(sscTipoRegistroDao.findAll().size() > todasEntidades.size());
	}
	

	@Test
	public void deberiaTraerUnSscEstatusPorClave() throws Exception {
		final Long claveConsiderada = 1L;
		SscTipoRegistroEntity entidad = 
				sscTipoRegistroDao.read(claveConsiderada);
		assertNotNull(entidad);
		assertTrue(claveConsiderada == entidad.getCveTipoRegistro());
		
	}

	@Test
	public void deberiaActualizarTIpoRegistro() throws Exception {
		
		final Long claveConsiderada = 1L;
		final String tipoRegistroPrevio = "CDV";
		final String tipoRegistroPosterior = "MODIFICADO";
		
		SscTipoRegistroEntity entidad = sscTipoRegistroDao
				.read(claveConsiderada);
		
		assertEquals(tipoRegistroPrevio, entidad.getNomTipoRegistro());
		
		entidad.setNomTipoRegistro(tipoRegistroPosterior);
		
		sscTipoRegistroDao.update(entidad);
		
		assertEquals(tipoRegistroPosterior, 
				sscTipoRegistroDao.read(claveConsiderada).getNomTipoRegistro());
	}

	@Test
	public void deberiaBorrarElSscTipoRegistro() throws Exception {
		
		final Long claveConsiderada = 1L;
		
		SscTipoRegistroEntity cdv = sscTipoRegistroDao.read(claveConsiderada);
		
		assertNotNull(cdv);
		
		sscTipoRegistroDao.delete(cdv);
		
		cdv = sscTipoRegistroDao.read(1L);
		
		assertNull(cdv);
	}

	@Test
	public void deberiaTraerTodasLasCausas() throws Exception {
		List<SscTipoRegistroEntity> listadoEntidades = sscTipoRegistroDao
				.findAll();
		assertNotNull(listadoEntidades);
		assertFalse(listadoEntidades.isEmpty());
	}

	@Test
	public void deberiaIncrementarLaSecueciaEnUno() throws Exception {

		List<SscTipoRegistroEntity> listadoEntidades = sscTipoRegistroDao
				.findAll();

		SscTipoRegistroEntity ultimo = listadoEntidades.get(listadoEntidades
				.size() - 1);

		SscTipoRegistroEntity nueva = new SscTipoRegistroEntity();

		sscTipoRegistroDao.create(nueva);

		assertTrue(ultimo.getCveTipoRegistro() < nueva.getCveTipoRegistro());
	}

}
