/**
 * Proyecto: IMSS  - SSDC
 *
 * Archivo: TestEdcService.java
 *
 * Creado:  13/10/2011
 *
 * Derechos Reservados de copia (c) - INAP /
 *
 * Instituto Mexicano del Seguro Social - 2011
 */

package mx.gob.imss.cia.ssdc.cdv.servicios;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.mockito.Matchers.anyLong;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import mx.gob.imss.cia.ssdc.cdv.edc.servicios.EdcService;
import mx.gob.imss.cia.ssdc.cdv.edc.servicios.impl.EdcServiceImpl;
import mx.gob.imss.cia.ssdc.cdv.integracion.dao.CatServicioDao;
import mx.gob.imss.cia.ssdc.cdv.integracion.dao.CdvDao;
import mx.gob.imss.cia.ssdc.cdv.integracion.dao.CdvServicioDao;
import mx.gob.imss.cia.ssdc.cdv.integracion.dao.ResultadoServicioDao;
import mx.gob.imss.cia.ssdc.cdv.integracion.dao.ServicioDao;
import mx.gob.imss.cia.ssdc.cdv.integracion.dao.TipoVentanillaDao;
import mx.gob.imss.cia.ssdc.cdv.integracion.entity.CatServicioEntity;
import mx.gob.imss.cia.ssdc.cdv.integracion.entity.CdvEntity;
import mx.gob.imss.cia.ssdc.cdv.integracion.entity.CdvServicioEntity;
import mx.gob.imss.cia.ssdc.cdv.integracion.entity.ResultadoServicioEntity;
import mx.gob.imss.cia.ssdc.cdv.integracion.entity.ServicioEntity;
import mx.gob.imss.cia.ssdc.cdv.integracion.entity.TipoVentanillaEntity;
import mx.gob.imss.cia.ssdc.cdv.test.ServiceUnitTest;

import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;

public class TestEdcService extends ServiceUnitTest {

	@InjectMocks
	private EdcService edcService;
	@Mock
	private TipoVentanillaDao tipoVentanillaDao;
	@Mock
	private CatServicioDao catServicioDao;
	@Mock
	private ServicioDao servicioDao;
	@Mock
	private ResultadoServicioDao resultadoServicioDao;
	@Mock
	private CdvDao cdvDao;
	@Mock
	private CdvServicioDao cdvServicioDao;
	@Mock
	private TipoVentanillaEntity ventanilla;
	@Mock
	private CdvEntity cdv;

	private static final int ACTIVO = 1;

	private static final int INACTIVO = 0;

	public TestEdcService() {
		edcService= new EdcServiceImpl();
	}

	@Test
	public void debieraExistirEdcService() throws Exception {
		assertNotNull(new TestEdcService());
	}

	@Test
	public void deberiaRecuperarVentanillaById() throws Exception {
		when(tipoVentanillaDao.read(anyLong())).thenReturn(ventanilla);
		ventanilla = edcService.recuperarVentanilla(1L);
		verify(tipoVentanillaDao).read(anyLong());
		assertNotNull(ventanilla);
	}

	@Test
	public void deberiaObtenerTodasLasCategoriasServiciosActivos()
			throws Exception {
		List<CatServicioEntity> categoria = new ArrayList<CatServicioEntity>();
		categoria.add(mock(CatServicioEntity.class));
		when(catServicioDao.filtrarCatServiciosPorVentanillaYStatus(1L, ACTIVO))
				.thenReturn(categoria);
		List<CatServicioEntity> categorias = edcService
				.llenarComboCategoriaServicios(1L);
		assertTrue(categorias.size() > 0);
		verify(catServicioDao).filtrarCatServiciosPorVentanillaYStatus(1L,
				ACTIVO);
	}

	@Test
	public void deberiaObtenerTodosLosServiciosActivos() throws Exception {
		List<ServicioEntity> servicio = new ArrayList<ServicioEntity>();
		servicio.add(mock(ServicioEntity.class));
		when(servicioDao.filtrarServicioPorCategoriaYStatus(1L, ACTIVO))
				.thenReturn(servicio);
		List<ServicioEntity> servicios = edcService.llenarComboServicios(1L);
		assertTrue(servicios.size() > 0);
		verify(servicioDao).filtrarServicioPorCategoriaYStatus(1L, ACTIVO);
	}

	@Test
	public void deberiaObtenerTodosLosResultadosServiciosActivos()
			throws Exception {
		List<ResultadoServicioEntity> servicio = new ArrayList<ResultadoServicioEntity>();
		servicio.add(mock(ResultadoServicioEntity.class));
		when(
				resultadoServicioDao
						.filtrarResultadoServicioPorVentanillaYStatus(1L,
								ACTIVO)).thenReturn(servicio);
		List<ResultadoServicioEntity> servicios = edcService
				.llenarComboResultadoServicios(1L);
		assertTrue(servicios.size() > 0);
		verify(resultadoServicioDao)
				.filtrarResultadoServicioPorVentanillaYStatus(1L, ACTIVO);
	}

	@Test
	public void deberiaRecuperarCdvById() throws Exception {
		when(cdvDao.read(anyLong())).thenReturn(cdv);
		cdv = edcService.recuperarCdv(1L);
		verify(cdvDao).read(anyLong());
		assertNotNull(cdv);
	}

	@Test
	public void deberiaObtenerTodosLosRequisitos() throws Exception {
		List<CdvServicioEntity> servicio = new ArrayList<CdvServicioEntity>();
		servicio.add(mock(CdvServicioEntity.class));
		when(cdvServicioDao.recuperarCdvServicios(1L)).thenReturn(servicio);
		List<CdvServicioEntity> servicios = edcService
				.recuperarCdvServicios(1L);
		assertTrue(servicios.size() > 0);
		verify(cdvServicioDao).recuperarCdvServicios(1L);
	}
}
