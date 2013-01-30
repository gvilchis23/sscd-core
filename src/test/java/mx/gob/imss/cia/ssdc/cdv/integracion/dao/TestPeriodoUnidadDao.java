/**
 * Proyecto: IMSS  - SSDC
 *
 * Archivo: TestPeriodoUnidadDao.java
 *
 * Creado: 25/10/2011
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

import java.util.Calendar;
import java.util.List;

import mx.gob.imss.cia.ssdc.cdv.integracion.entity.LlaveCompPeriodoUnidad;
import mx.gob.imss.cia.ssdc.cdv.integracion.entity.PeriodoEntity;
import mx.gob.imss.cia.ssdc.cdv.integracion.entity.PeriodoUnidadEntity;
import mx.gob.imss.cia.ssdc.cdv.integracion.entity.UnidadEntity;
import mx.gob.imss.cia.ssdc.cdv.test.IntegrationTest;
import mx.gob.imss.cia.ssdc.commons.Constantes;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * 
 * @author Equipo de Desarrollo
 * 
 */
public class TestPeriodoUnidadDao extends IntegrationTest {

	private static final Long CVE_UNIDAD_NUEVO = 2L;

	private static final Long CVE_UNIDAD = 1L;

	private static final Long CVE_PERIODO = 1L;

	@Autowired
	private PeriodoUnidadDao periodoUnidadDao;

	private LlaveCompPeriodoUnidad crearLlaveCompuesta(Long cvePeriodo,
	        Long cveUnidad) {
		PeriodoEntity periodo = new PeriodoEntity();
		periodo.setCvePeriodo(cvePeriodo);

		UnidadEntity unidad = new UnidadEntity();
		unidad.setCveUnidad(cveUnidad);
		unidad.setStatus(Constantes.ENABLE);

		LlaveCompPeriodoUnidad id = new LlaveCompPeriodoUnidad();
		id.setPeriodo(periodo);
		id.setUnidad(unidad);

		return id;
	}

	@Test
	public void deberiaCrearUnPeriodoUnidad() throws Exception {
		LlaveCompPeriodoUnidad id = crearLlaveCompuesta(CVE_PERIODO,
		        CVE_UNIDAD_NUEVO);

		PeriodoUnidadEntity periodoUnidad = new PeriodoUnidadEntity();
		periodoUnidad.setLlave(id);

		List<PeriodoUnidadEntity> todasAcciones = periodoUnidadDao.findAll();
		periodoUnidadDao.create(periodoUnidad);
		assertTrue(periodoUnidadDao.findAll().size() > todasAcciones.size());
	}

	@Test
	public void deberiaTraerUnPeriodoUnidadPorClave() throws Exception {
		LlaveCompPeriodoUnidad id = crearLlaveCompuesta(CVE_PERIODO, CVE_UNIDAD);
		PeriodoUnidadEntity cdvPorClave = periodoUnidadDao.read(id);

		assertNotNull(cdvPorClave);

		assertEquals(CVE_PERIODO, cdvPorClave.getLlave().getPeriodo()
		        .getCvePeriodo());

		assertEquals(CVE_UNIDAD, cdvPorClave.getLlave().getUnidad()
		        .getCveUnidad());
	}

	@Test
	public void deberiaActualizarLaFechaInicio() throws Exception {
		LlaveCompPeriodoUnidad id = crearLlaveCompuesta(CVE_PERIODO, CVE_UNIDAD);

		PeriodoUnidadEntity cdvIndicador = periodoUnidadDao.read(id);

		Calendar fechaInicio = Calendar.getInstance();
		fechaInicio.set(2011, Calendar.OCTOBER, 26);
		Calendar fechaInicioBD = Calendar.getInstance();
		fechaInicioBD.setTime(cdvIndicador.getFechaInicio());
		assertEquals(1, fechaInicio.compareTo(fechaInicioBD));
		
		Calendar fechaInicioAct = Calendar.getInstance();
		fechaInicioAct.set(2011, Calendar.OCTOBER, 30);
		cdvIndicador.setFechaInicio(fechaInicio.getTime());
		periodoUnidadDao.update(cdvIndicador);
		Calendar fechaInicioBDAct = Calendar.getInstance();
		fechaInicioBDAct.setTime(cdvIndicador.getFechaInicio());
		
		assertEquals(1, fechaInicioAct.compareTo(fechaInicioBDAct));
	}

	@Test
	public void deberiaBorrarElPeriodoUnidad() throws Exception {
		LlaveCompPeriodoUnidad id = crearLlaveCompuesta(CVE_PERIODO, CVE_UNIDAD);
		PeriodoUnidadEntity cdv = periodoUnidadDao.read(id);
		assertNotNull(cdv);
		periodoUnidadDao.delete(cdv);

		cdv = periodoUnidadDao.read(id);
		assertNull(cdv);
	}

	@Test
	public void deberiaTraerTodasLosPeriodoUnidad() throws Exception {
		List<PeriodoUnidadEntity> todasCdvs = periodoUnidadDao.findAll();
		assertNotNull(todasCdvs);
		assertTrue(todasCdvs.size() > 0);
	}

}
