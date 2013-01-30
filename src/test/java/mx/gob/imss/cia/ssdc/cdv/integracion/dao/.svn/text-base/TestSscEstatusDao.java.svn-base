/**
 * Proyecto: IMSS  - SSDC
 *
 * Archivo: TestSscEstatusDao.java
 *
 * Creado:  14/11/2011
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

import mx.gob.imss.cia.ssdc.cdv.integracion.entity.SscEstatusEntity;
import mx.gob.imss.cia.ssdc.cdv.integracion.entity.SscTipoRegistroEntity;
import mx.gob.imss.cia.ssdc.cdv.test.IntegrationTest;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author FABRICIO-INAP
 *
 */
public class TestSscEstatusDao extends IntegrationTest{
	
	@Autowired
	private SscEstatusDao sscEstatusDao;
	
	@Test
	public void debieraExistirSscEstatusDao() throws Exception {
		assertNotNull(sscEstatusDao);
	}

	@Test
	public void deberiaHeredarDePersistenceDao() {
		assertTrue(sscEstatusDao instanceof PersistenceDao);
	}
	
	@Test
	public void deberiaCrearUnNuevoEstatus() throws Exception {
		
		SscEstatusEntity entidad =  new SscEstatusEntity();
		
		entidad.setNomEstatus("Estatus nuevo");
		entidad.setNumEstado((short) 1);
		entidad.setTipoRegistro(new SscTipoRegistroEntity());
		
		List<SscEstatusEntity> todasEntidades = sscEstatusDao.findAll();
		
		sscEstatusDao.create(entidad);
		
		assertTrue(sscEstatusDao.findAll().size() > todasEntidades.size());
	}
	

	@Test
	public void deberiaTraerUnSscEstatusPorClave() throws Exception {
		final Long claveConsiderada = 1L;
		SscEstatusEntity entidad = sscEstatusDao.read(claveConsiderada);
		assertNotNull(entidad);
		assertTrue(claveConsiderada == entidad.getCveEstatus());
		
	}

	@Test
	public void deberiaActualizarElEstatus() throws Exception {
		
		final Long claveConsiderada = 1L;
		final String estatusPrevio = "PENDIENTE";
		final String estatusPosterior = "MODIFICADO";
		
		SscEstatusEntity entidad = sscEstatusDao.read(claveConsiderada);
		
		assertEquals(estatusPrevio, entidad.getNomEstatus());
		
		entidad.setNomEstatus(estatusPosterior);
		
		sscEstatusDao.update(entidad);
		
		assertEquals(estatusPosterior, 
				sscEstatusDao.read(claveConsiderada).getNomEstatus());
	}

	@Test
	public void deberiaBorrarElSscEstatus() throws Exception {
		
		final Long claveConsiderada = 1L;
		
		SscEstatusEntity cdv = sscEstatusDao.read(claveConsiderada);
		
		assertNotNull(cdv);
		
		sscEstatusDao.delete(cdv);
		
		cdv = sscEstatusDao.read(1L);
		
		assertNull(cdv);
	}

	@Test
	public void deberiaTraerTodasLasCausas() throws Exception {
		List<SscEstatusEntity> listadoEntidades = sscEstatusDao.findAll();
		assertNotNull(listadoEntidades);
		assertFalse(listadoEntidades.isEmpty());
	}

	@Test
	public void deberiaIncrementarLaSecueciaEnUno() throws Exception {

		List<SscEstatusEntity> listadoEntidades = sscEstatusDao.findAll();
		
		SscEstatusEntity ultimo = listadoEntidades
				.get(listadoEntidades.size() - 1);

		SscEstatusEntity nueva = new SscEstatusEntity();		

		sscEstatusDao.create(nueva);
		
		assertTrue(ultimo.getCveEstatus() < nueva.getCveEstatus());
	}
}
