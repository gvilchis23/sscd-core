/**
 * Proyecto: IMSS  - SSDC
 *
 * Archivo: TestEdcInterService.java
 *
 * Creado:  Oct 28, 2011
 *
 * Derechos Reservados de copia (c) - INAP /
 *
 * Instituto Mexicano del Seguro Social - 2011
 */
package mx.gob.imss.cia.ssdc.cdv.servicios;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.mockito.Matchers.anyLong;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import mx.gob.imss.cia.ssdc.cdv.edc.servicios.EdcInterService;
import mx.gob.imss.cia.ssdc.cdv.edc.servicios.impl.EdcInterServiceImpl;
import mx.gob.imss.cia.ssdc.cdv.integracion.dao.CdvServicioDao;
import mx.gob.imss.cia.ssdc.cdv.integracion.dao.VentanillaAnteriorDao;
import mx.gob.imss.cia.ssdc.cdv.integracion.dao.VentanillaPosteriorDao;
import mx.gob.imss.cia.ssdc.cdv.integracion.entity.CdvServicioEntity;
import mx.gob.imss.cia.ssdc.cdv.integracion.entity.VentanillaAnteriorEntity;
import mx.gob.imss.cia.ssdc.cdv.integracion.entity.VentanillaPosteriorEntity;
import mx.gob.imss.cia.ssdc.cdv.test.ServiceUnitTest;

import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;

/**
 * @author propietario
 * 
 */
public class TestEdcInterService extends ServiceUnitTest {
	
	private static final int ACTIVO = 1;

	@InjectMocks
	private EdcInterService edcInterService;

	@Mock
	private VentanillaAnteriorDao ventanillaAnteriorDao;

	@Mock
	private VentanillaPosteriorDao ventanillaPosteriorDao;

	@Mock
	private CdvServicioDao cdvServicioDao;

	@Mock
	private VentanillaAnteriorEntity anterior;

	@Mock
	private VentanillaPosteriorEntity posterior;

	public TestEdcInterService() {
		edcInterService = new EdcInterServiceImpl();
	}

	@Test
	public void deberiaObtenerTodasLasVentaAnterior() throws Exception {
		List<VentanillaAnteriorEntity> servicio = 
				new ArrayList<VentanillaAnteriorEntity>();
		servicio.add(mock(VentanillaAnteriorEntity.class));
		when(
				ventanillaAnteriorDao.filtrarVentaAnteriorPorTipoYStatus(1L,
						ACTIVO)).thenReturn(servicio);
		List<VentanillaAnteriorEntity> servicios = edcInterService
				.llenarComboVentaAnterior(1L);
		assertFalse(servicios.isEmpty());
		verify(ventanillaAnteriorDao).filtrarVentaAnteriorPorTipoYStatus(1L,
				ACTIVO);
	}

	@Test
	public void deberiaObtenerTodasLasVentaPost() throws Exception {
		List<VentanillaPosteriorEntity> servicio = 
				new ArrayList<VentanillaPosteriorEntity>();
		servicio.add(mock(VentanillaPosteriorEntity.class));
		when(ventanillaPosteriorDao.
				filtrarVentaPostPorTipoYStatus(1L, ACTIVO))
				.thenReturn(servicio);
		List<VentanillaPosteriorEntity> servicios = edcInterService
				.llenarComboVentaPost(1L);
		assertFalse(servicios.isEmpty());
		verify(ventanillaPosteriorDao).filtrarVentaPostPorTipoYStatus(1L,
				ACTIVO);
	}

	@Test
	public void deberiaRecuperarVentaAnteriorId() throws Exception {
		when(ventanillaAnteriorDao.read(anyLong())).thenReturn(anterior);
		anterior = edcInterService.recuperarVentanillaAnterior(1L);
		verify(ventanillaAnteriorDao).read(anyLong());
		assertNotNull(anterior);
	}

	@Test
	public void deberiaRecuperarVentaPosteriorId() throws Exception {
		when(ventanillaPosteriorDao.read(anyLong())).thenReturn(posterior);
		posterior = edcInterService.recuperarVentanillaPosterior(1L);
		verify(ventanillaPosteriorDao).read(anyLong());
		assertNotNull(posterior);
	}

	@Test
	public void deberiaActualizarCdvServicio() throws Exception {
		CdvServicioEntity cdvServicio = new CdvServicioEntity();
		edcInterService.updateCdvServicio(cdvServicio);
		verify(cdvServicioDao).update(cdvServicio);
	}

}
