/**
 * Proyecto: IMSS  - SSDC
 *
 * Archivo: TestEdcServiciosService.java
 *
 * Creado:  Oct 27, 2011
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

import mx.gob.imss.cia.ssdc.cdv.edc.servicios.EdcServiciosService;
import mx.gob.imss.cia.ssdc.cdv.edc.servicios.impl.EdcServiciosServiceImpl;
import mx.gob.imss.cia.ssdc.cdv.integracion.dao.CdvServicioDao;
import mx.gob.imss.cia.ssdc.cdv.integracion.dao.MediosCdvDao;
import mx.gob.imss.cia.ssdc.cdv.integracion.dao.MediosDifusionDao;
import mx.gob.imss.cia.ssdc.cdv.integracion.dao.RequisitosCdvDao;
import mx.gob.imss.cia.ssdc.cdv.integracion.dao.RequisitosDao;
import mx.gob.imss.cia.ssdc.cdv.integracion.dao.ResultadoServicioDao;
import mx.gob.imss.cia.ssdc.cdv.integracion.dao.ServicioDao;
import mx.gob.imss.cia.ssdc.cdv.integracion.entity.CdvServicioEntity;
import mx.gob.imss.cia.ssdc.cdv.integracion.entity.LlaveCompuestaMediosCdv;
import mx.gob.imss.cia.ssdc.cdv.integracion.entity.LlaveCompuestaRequisitosCdv;
import mx.gob.imss.cia.ssdc.cdv.integracion.entity.MediosCdvEntity;
import mx.gob.imss.cia.ssdc.cdv.integracion.entity.MediosDifusionEntity;
import mx.gob.imss.cia.ssdc.cdv.integracion.entity.RequisitosCdvEntity;
import mx.gob.imss.cia.ssdc.cdv.integracion.entity.RequisitosEntity;
import mx.gob.imss.cia.ssdc.cdv.integracion.entity.ResultadoServicioEntity;
import mx.gob.imss.cia.ssdc.cdv.integracion.entity.ServicioEntity;
import mx.gob.imss.cia.ssdc.cdv.test.ServiceUnitTest;

import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;

/**
 * @author propietario
 * 
 */
public class TestEdcServiciosService extends ServiceUnitTest {

	public static final int ACTIVO = 1;
	public static final int INACTIVO = 0;
	
	@InjectMocks
	private EdcServiciosService edcServiciosService;
	
	@Mock
	private RequisitosDao requisitosDao;
	
	@Mock
	private MediosDifusionDao mediosDifusionDao;
	
	@Mock
	private CdvServicioDao cdvServicioDao;
	
	@Mock
	private RequisitosCdvDao requisitosCdvDao;
	
	@Mock
	private MediosCdvDao mediosCdvDao;
	
	@Mock
	private ServicioDao servicioDao;
	
	@Mock
	private ResultadoServicioDao resultadoServicioDao;
	
	@Mock
	
	private RequisitosEntity requisitos;
	
	@Mock
	private MediosDifusionEntity medios;
	
	@Mock
	private ServicioEntity servicio;
	
	@Mock
	private ResultadoServicioEntity resultado;

	public TestEdcServiciosService() {
		edcServiciosService =new EdcServiciosServiceImpl();
	}

	@Test
	public void deberiaObtenerTodosLosCdvServicios() throws Exception {
		List<RequisitosEntity> servicio = new ArrayList<RequisitosEntity>();
		servicio.add(mock(RequisitosEntity.class));
		when(requisitosDao.filtrarRequisitoPorStatus(ACTIVO)).thenReturn(
				servicio);
		List<RequisitosEntity> servicios = edcServiciosService
				.llenarPickListRequisito(1);
		assertFalse(servicios.isEmpty());
		verify(requisitosDao).filtrarRequisitoPorStatus(1);
	}

	@Test
	public void deberiaRecuperarRequisitosId() throws Exception {
		when(requisitosDao.read(anyLong())).thenReturn(requisitos);
		requisitos = edcServiciosService.recuperarRequisitos(1L);
		verify(requisitosDao).read(anyLong());
		assertNotNull(requisitos);
	}

	@Test
	public void deberiaObtenerTodosLosMedios() throws Exception {
		List<MediosDifusionEntity> servicio = 
				new ArrayList<MediosDifusionEntity>();
		servicio.add(mock(MediosDifusionEntity.class));
		when(mediosDifusionDao.filtrarDifusionPorStatus(ACTIVO)).thenReturn(
				servicio);
		List<MediosDifusionEntity> servicios = edcServiciosService
				.llenarPickListDifusion(1);
		assertFalse(servicios.isEmpty());
		verify(mediosDifusionDao).filtrarDifusionPorStatus(1);
	}

	@Test
	public void deberiaRecuperarMediosId() throws Exception {
		when(mediosDifusionDao.read(anyLong())).thenReturn(medios);
		medios = edcServiciosService.recuperarMedios(1L);
		verify(mediosDifusionDao).read(anyLong());
		assertNotNull(medios);
	}

	@Test
	public void deberiaCrearCdvServicio() throws Exception {
		CdvServicioEntity cdvServicio = new CdvServicioEntity();
		edcServiciosService.guardadCdvServicio(cdvServicio);
		verify(cdvServicioDao).create(cdvServicio);
	}

	@Test
	public void deberiaCrearRequisitosCdv() throws Exception {
		RequisitosCdvEntity cdvServicio = new RequisitosCdvEntity();
		edcServiciosService.guardadRequisitosCdv(cdvServicio);
		verify(requisitosCdvDao).create(cdvServicio);
	}

	@Test
	public void deberiaCrearMediosCdv() throws Exception {
		MediosCdvEntity cdvServicio = new MediosCdvEntity();
		edcServiciosService.guardadMediosCdv(cdvServicio);
		verify(mediosCdvDao).create(cdvServicio);
	}

	@Test
	public void deberiaRecuperarServicioId() throws Exception {
		when(servicioDao.read(anyLong())).thenReturn(servicio);
		servicio = edcServiciosService.recuperarServicio(1L);
		verify(servicioDao).read(anyLong());
		assertNotNull(servicio);
	}

	@Test
	public void deberiaEliminarMediosCdv() throws Exception {
		CdvServicioEntity cdvServicio = new CdvServicioEntity();
		edcServiciosService.eliminarCdvServicio(cdvServicio);
		verify(cdvServicioDao).delete(cdvServicio);
	}

	@Test
	public void deberiaRecuperarResultadoServicioId() throws Exception {
		when(resultadoServicioDao.read(anyLong())).thenReturn(resultado);
		resultado = edcServiciosService.recuperarResultadoServicio(1L);
		verify(resultadoServicioDao).read(anyLong());
		assertNotNull(resultado);
	}

	@Test
	public void deberiaObtenerTodosLosCdvRequisitos() throws Exception {
		List<RequisitosCdvEntity> servicio = 
				new ArrayList<RequisitosCdvEntity>();
		servicio.add(mock(RequisitosCdvEntity.class));
		LlaveCompuestaRequisitosCdv llave = new LlaveCompuestaRequisitosCdv();
		when(requisitosCdvDao.recuperarRequisitosCdv(llave)).thenReturn(
				servicio);
		List<RequisitosCdvEntity> servicios = edcServiciosService
				.recuperarCdvRequisito(llave);
		assertFalse(servicios.isEmpty());
		verify(requisitosCdvDao).recuperarRequisitosCdv(llave);
	}

	@Test
	public void deberiaObtenerTodosLosCdvMedios() throws Exception {
		List<MediosCdvEntity> servicio = new ArrayList<MediosCdvEntity>();
		servicio.add(mock(MediosCdvEntity.class));
		LlaveCompuestaMediosCdv llave = new LlaveCompuestaMediosCdv();
		when(mediosCdvDao.recuperarMediosCdv(llave)).thenReturn(servicio);
		List<MediosCdvEntity> servicios = edcServiciosService
				.recuperarCdvMedios(llave);
		assertFalse(servicios.isEmpty());
		verify(mediosCdvDao).recuperarMediosCdv(llave);
	}

}
