/**
 * Proyecto: IMSS  - SSDC
 *
 * Archivo: TestBusquedaService.java
 *
 * Creado:  03/11/2011
 *
 * Derechos Reservados de copia (c) - INAP /
 *
 * Instituto Mexicano del Seguro Social - 2011
 */
package mx.gob.imss.cia.ssdc.cdv.servicios;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import javax.annotation.PostConstruct;

import mx.gob.imss.cia.ssdc.cdv.integracion.dao.DelegacionDao;
import mx.gob.imss.cia.ssdc.cdv.integracion.dao.TipoVentanillaDao;
import mx.gob.imss.cia.ssdc.cdv.integracion.dao.TurnoDao;
import mx.gob.imss.cia.ssdc.cdv.integracion.dao.UnidadDao;
import mx.gob.imss.cia.ssdc.cdv.servicios.impl.BusquedaServiceImpl;
import mx.gob.imss.cia.ssdc.cdv.test.ServiceUnitTest;
import mx.gob.imss.cia.ssdc.cdv.vo.AnyoVo;
import mx.gob.imss.cia.ssdc.cdv.vo.DelegacionVo;
import mx.gob.imss.cia.ssdc.cdv.vo.MesVo;
import mx.gob.imss.cia.ssdc.cdv.vo.TipoVentanillaVo;
import mx.gob.imss.cia.ssdc.cdv.vo.TurnoVo;
import mx.gob.imss.cia.ssdc.cdv.vo.UnidadVo;
import mx.gob.imss.cia.ssdc.commons.Constantes;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

/**
 * @author FABRICIO-INAP
 * 
 */
public class TestBusquedaService extends ServiceUnitTest {

	private static final int CLAVE_ANIO_14 = 14;
	private static final int CLAVE_ANIO_13 = 13;
	private static final int CLAVE_ANIO_12 = 12;
	private static final int CLAVE_ANIO_11 = 11;
	private static final int CLAVE_ANIO_10 = 10;
	private static final int CLAVE_ANIO_09 = 9;
	private static final int CLAVE_ANIO_08 = 8;
	private static final int CLAVE_ANIO_07 = 7;
	private static final int CLAVE_ANIO_06 = 6;
	private static final int CLAVE_ANIO_05 = 5;
	private static final int CLAVE_ANIO_04 = 4;
	private static final int CLAVE_ANIO_03 = 3;
	private static final int CLAVE_ANIO_02 = 2;
	private static final int CLAVE_ANIO_01 = 1;
	private static final int CLAVE_ANIO_00 = 0;
	private static final int CLAVE_MES_11 = 11;
	private static final int CLAVE_MES_10 = 10;
	private static final int CLAVE_MES_09 = 9;
	private static final int CLAVE_MES_08 = 8;
	private static final int CLAVE_MES_07 = 7;
	private static final int CLAVE_MES_06 = 6;
	private static final int CLAVE_MES_05 = 5;
	private static final int CLAVE_MES_04 = 4;
	private static final int CLAVE_MES_03 = 3;
	private static final int CLAVE_MES_02 = 2;
	private static final int CLAVE_MES_01 = 1;
	private static final int CLAVE_MES_00 = 0;

	private static final String MENSAJE_ENERO = "Enero";
	private static final String MENSAJE_FEBRERO = "Febrero";
	private static final String MENSAJE_MARZO = "Marzo";
	private static final String MENSAJE_ABRIL = "Abril";
	private static final String MENSAJE_MAYO = "Mayo";
	private static final String MENSAJE_JUNIO = "Junio";
	private static final String MENSAJE_JULIO = "Julio";
	private static final String MENSAJE_AGOSTO = "Agosto";
	private static final String MENSAJE_SEPTIEMBRE = "Septiembre";
	private static final String MENSAJE_OCTUBRE = "Octubre";
	private static final String MENSAJE_NOVIEMBRE = "Noviembre";
	private static final String MENSAJE_DICIEMBRE = "Diciembre";

	private static final String MENSAJE_ANYO_01 = "2011";
	private static final String MENSAJE_ANYO_02 = "2012";
	private static final String MENSAJE_ANYO_03 = "2013";
	private static final String MENSAJE_ANYO_04 = "2014";
	private static final String MENSAJE_ANYO_05 = "2015";
	private static final String MENSAJE_ANYO_06 = "2016";
	private static final String MENSAJE_ANYO_07 = "2017";
	private static final String MENSAJE_ANYO_08 = "2018";
	private static final String MENSAJE_ANYO_09 = "2019";
	private static final String MENSAJE_ANYO_10 = "2020";
	private static final String MENSAJE_ANYO_11 = "2021";
	private static final String MENSAJE_ANYO_12 = "2022";
	private static final String MENSAJE_ANYO_13 = "2023";
	private static final String MENSAJE_ANYO_14 = "2024";
	private static final String MENSAJE_ANYO_15 = "2025";

	@InjectMocks
	private BusquedaService busquedaService;//= new BusquedaServiceImpl();;

	@Mock
	private DelegacionDao delegacionDao;

	@Mock
	private UnidadDao unidadDao;

	@Mock
	private TurnoDao turnoDao;
	
	@Mock
	private TipoVentanillaDao tipoVentanillaDao;

	@Mock
	private Properties messages;

	@Mock
	private DelegacionVo delegacionVo;

	@Mock
	private UnidadVo unidadVo;

	@Mock
	private TurnoVo turnoVo;
	
	@Mock
	private TipoVentanillaVo tipoVentanillaVo;

	@Autowired
	@Qualifier("messages")
	private Properties messagesReal;

	private List<DelegacionVo> listadoDelegacion;

	private List<UnidadVo> listadoUnidad;

	private List<TurnoVo> listadoTurno;
	
	private List<TipoVentanillaVo> listadoTipoVentanilla;

	@PostConstruct
	public void preparaServicio() {
		busquedaService = new BusquedaServiceImpl();
	}

	@Before
	public void preparaListados() {
		
		listadoDelegacion = new ArrayList<DelegacionVo>();
		listadoDelegacion.add(delegacionVo);

		listadoUnidad = new ArrayList<UnidadVo>();
		listadoUnidad.add(unidadVo);

		listadoTurno = new ArrayList<TurnoVo>();
		listadoTurno.add(turnoVo);
		
		listadoTipoVentanilla = new ArrayList<TipoVentanillaVo>();
		listadoTipoVentanilla.add(tipoVentanillaVo);
	}

	@Before
	public void preparaPropertiesParaAnyos(){
		String anyo01 = "anyo01";
		String anyo02 = "anyo02";
		String anyo03 = "anyo03";
		String anyo04 = "anyo04";
		String anyo05 = "anyo05";
		String anyo06 = "anyo06";
		String anyo07 = "anyo07";
		String anyo08 = "anyo08";
		String anyo09 = "anyo09";
		String anyo10 = "anyo10";
		String anyo11 = "anyo11";
		String anyo12 = "anyo12";
		String anyo13 = "anyo13";
		String anyo14 = "anyo14";
		String anyo15 = "anyo15";
		
		when(messages.getProperty(anyo01)).thenReturn(
				messagesReal.getProperty(anyo01));
		when(messages.getProperty(anyo02)).thenReturn(
				messagesReal.getProperty(anyo02));
		when(messages.getProperty(anyo03)).thenReturn(
				messagesReal.getProperty(anyo03));
		when(messages.getProperty(anyo04)).thenReturn(
				messagesReal.getProperty(anyo04));
		when(messages.getProperty(anyo05)).thenReturn(
				messagesReal.getProperty(anyo05));
		when(messages.getProperty(anyo06)).thenReturn(
				messagesReal.getProperty(anyo06));
		when(messages.getProperty(anyo07)).thenReturn(
				messagesReal.getProperty(anyo07));
		when(messages.getProperty(anyo08)).thenReturn(
				messagesReal.getProperty(anyo08));
		when(messages.getProperty(anyo09)).thenReturn(
				messagesReal.getProperty(anyo09));
		when(messages.getProperty(anyo10)).thenReturn(
				messagesReal.getProperty(anyo10));
		when(messages.getProperty(anyo11)).thenReturn(
				messagesReal.getProperty(anyo11));
		when(messages.getProperty(anyo12)).thenReturn(
				messagesReal.getProperty(anyo12));
		when(messages.getProperty(anyo13)).thenReturn(
				messagesReal.getProperty(anyo13));
		when(messages.getProperty(anyo14)).thenReturn(
				messagesReal.getProperty(anyo14));
		when(messages.getProperty(anyo15)).thenReturn(
				messagesReal.getProperty(anyo15));
	}
	
	@Before
	public void preparaPropertiesParaMeses() {

		String enero = MENSAJE_ENERO.toLowerCase();
		String febrero = MENSAJE_FEBRERO.toLowerCase();
		String marzo = MENSAJE_MARZO.toLowerCase();
		String abril = MENSAJE_ABRIL.toLowerCase();
		String mayo = MENSAJE_MAYO.toLowerCase();
		String junio = MENSAJE_JUNIO.toLowerCase();
		String julio = MENSAJE_JULIO.toLowerCase();
		String agosto = MENSAJE_AGOSTO.toLowerCase();
		String septiembre = MENSAJE_SEPTIEMBRE.toLowerCase();
		String octubre = MENSAJE_OCTUBRE.toLowerCase();
		String noviembre = MENSAJE_NOVIEMBRE.toLowerCase();
		String diciembre = MENSAJE_DICIEMBRE.toLowerCase();		

		when(messages.getProperty(enero)).thenReturn(
				messagesReal.getProperty(enero));
		when(messages.getProperty(febrero)).thenReturn(
				messagesReal.getProperty(febrero));
		when(messages.getProperty(marzo)).thenReturn(
				messagesReal.getProperty(marzo));
		when(messages.getProperty(abril)).thenReturn(
				messagesReal.getProperty(abril));
		when(messages.getProperty(mayo)).thenReturn(
				messagesReal.getProperty(mayo));
		when(messages.getProperty(junio)).thenReturn(
				messagesReal.getProperty(junio));
		when(messages.getProperty(junio)).thenReturn(
				messagesReal.getProperty(junio));
		when(messages.getProperty(julio)).thenReturn(
				messagesReal.getProperty(julio));
		when(messages.getProperty(agosto)).thenReturn(
				messagesReal.getProperty(agosto));
		when(messages.getProperty(septiembre)).thenReturn(
				messagesReal.getProperty(septiembre));
		when(messages.getProperty(octubre)).thenReturn(
				messagesReal.getProperty(octubre));
		when(messages.getProperty(noviembre)).thenReturn(
				messagesReal.getProperty(noviembre));
		when(messages.getProperty(diciembre)).thenReturn(
				messagesReal.getProperty(diciembre));
	}

	@Test
	public void debieraExistirImplementacionDeBusquedaService()
			throws Exception {
		assertNotNull(busquedaService);
	}

	@Test
	public void debieraObtenerListadoDeDelegacionVo() throws Exception {

		when(delegacionDao.obtenerListadoDelegacionVo(Constantes.ENABLE))
				.thenReturn(listadoDelegacion);

		List<DelegacionVo> delegacionesLista = busquedaService
				.obtieneListadoDelegacion();

		verify(delegacionDao).obtenerListadoDelegacionVo(
				Constantes.ENABLE);
		
		assertNotNull(delegacionesLista);
	}

	@Test
	public void debieraObtenerListadoUnidadVo() throws Exception {

		when(unidadDao.obtenerListadoUnidadVo(
				Constantes.ENABLE)).thenReturn(listadoUnidad);

		List<UnidadVo> delegacionesLista = busquedaService
				.obtieneListadoUnidad();

		verify(unidadDao).obtenerListadoUnidadVo(Constantes.ENABLE);
		assertNotNull(delegacionesLista);
	}

	@Test
	public void debieraObtenerListadoDeMeses() throws Exception {

		List<MesVo> listadoMes = busquedaService.obtieneListadoMes();

		assertNotNull(listadoMes);

		assertNotNull(listadoMes.get(CLAVE_MES_00));
		assertNotNull(listadoMes.get(CLAVE_MES_01));
		assertNotNull(listadoMes.get(CLAVE_MES_02));
		assertNotNull(listadoMes.get(CLAVE_MES_03));
		assertNotNull(listadoMes.get(CLAVE_MES_04));
		assertNotNull(listadoMes.get(CLAVE_MES_05));
		assertNotNull(listadoMes.get(CLAVE_MES_06));
		assertNotNull(listadoMes.get(CLAVE_MES_07));
		assertNotNull(listadoMes.get(CLAVE_MES_08));
		assertNotNull(listadoMes.get(CLAVE_MES_09));
		assertNotNull(listadoMes.get(CLAVE_MES_10));
		assertNotNull(listadoMes.get(CLAVE_MES_11));

		assertEquals(listadoMes.get(CLAVE_MES_00).getMes(), MENSAJE_ENERO);
		assertEquals(listadoMes.get(CLAVE_MES_01).getMes(), MENSAJE_FEBRERO);
		assertEquals(listadoMes.get(CLAVE_MES_02).getMes(), MENSAJE_MARZO);
		assertEquals(listadoMes.get(CLAVE_MES_03).getMes(), MENSAJE_ABRIL);
		assertEquals(listadoMes.get(CLAVE_MES_04).getMes(), MENSAJE_MAYO);
		assertEquals(listadoMes.get(CLAVE_MES_05).getMes(), MENSAJE_JUNIO);
		assertEquals(listadoMes.get(CLAVE_MES_06).getMes(), MENSAJE_JULIO);
		assertEquals(listadoMes.get(CLAVE_MES_07).getMes(), MENSAJE_AGOSTO);
		assertEquals(listadoMes.get(CLAVE_MES_08).getMes(), MENSAJE_SEPTIEMBRE);
		assertEquals(listadoMes.get(CLAVE_MES_09).getMes(), MENSAJE_OCTUBRE);
		assertEquals(listadoMes.get(CLAVE_MES_10).getMes(), MENSAJE_NOVIEMBRE);
		assertEquals(listadoMes.get(CLAVE_MES_11).getMes(), MENSAJE_DICIEMBRE);

	}

	@Test
	public void debieraObtenerListadoDeAnyos() throws Exception {

		List<AnyoVo> listadoAnyo = busquedaService.obtieneListadoAnyo();

		assertNotNull(listadoAnyo);

		assertNotNull(listadoAnyo.get(CLAVE_ANIO_00));
		assertNotNull(listadoAnyo.get(CLAVE_ANIO_01));
		assertNotNull(listadoAnyo.get(CLAVE_ANIO_02));
		assertNotNull(listadoAnyo.get(CLAVE_ANIO_03));
		assertNotNull(listadoAnyo.get(CLAVE_ANIO_04));
		assertNotNull(listadoAnyo.get(CLAVE_ANIO_05));
		assertNotNull(listadoAnyo.get(CLAVE_ANIO_06));
		assertNotNull(listadoAnyo.get(CLAVE_ANIO_07));
		assertNotNull(listadoAnyo.get(CLAVE_ANIO_08));
		assertNotNull(listadoAnyo.get(CLAVE_ANIO_09));
		assertNotNull(listadoAnyo.get(CLAVE_ANIO_10));
		assertNotNull(listadoAnyo.get(CLAVE_ANIO_11));
		assertNotNull(listadoAnyo.get(CLAVE_ANIO_12));
		assertNotNull(listadoAnyo.get(CLAVE_ANIO_13));
		assertNotNull(listadoAnyo.get(CLAVE_ANIO_14));

		assertEquals(listadoAnyo.get(CLAVE_ANIO_00).getAnyo(), MENSAJE_ANYO_01);
		assertEquals(listadoAnyo.get(CLAVE_ANIO_01).getAnyo(), MENSAJE_ANYO_02);
		assertEquals(listadoAnyo.get(CLAVE_ANIO_02).getAnyo(), MENSAJE_ANYO_03);
		assertEquals(listadoAnyo.get(CLAVE_ANIO_03).getAnyo(), MENSAJE_ANYO_04);
		assertEquals(listadoAnyo.get(CLAVE_ANIO_04).getAnyo(), MENSAJE_ANYO_05);
		assertEquals(listadoAnyo.get(CLAVE_ANIO_05).getAnyo(), MENSAJE_ANYO_06);
		assertEquals(listadoAnyo.get(CLAVE_ANIO_06).getAnyo(), MENSAJE_ANYO_07);
		assertEquals(listadoAnyo.get(CLAVE_ANIO_07).getAnyo(), MENSAJE_ANYO_08);
		assertEquals(listadoAnyo.get(CLAVE_ANIO_08).getAnyo(), MENSAJE_ANYO_09);
		assertEquals(listadoAnyo.get(CLAVE_ANIO_09).getAnyo(), MENSAJE_ANYO_10);
		assertEquals(listadoAnyo.get(CLAVE_ANIO_10).getAnyo(), MENSAJE_ANYO_11);
		assertEquals(listadoAnyo.get(CLAVE_ANIO_11).getAnyo(), MENSAJE_ANYO_12);
		assertEquals(listadoAnyo.get(CLAVE_ANIO_12).getAnyo(), MENSAJE_ANYO_13);
		assertEquals(listadoAnyo.get(CLAVE_ANIO_13).getAnyo(), MENSAJE_ANYO_14);
		assertEquals(listadoAnyo.get(CLAVE_ANIO_14).getAnyo(), MENSAJE_ANYO_15);

	}

	@Test
	public void deberiaObtenerListadoTurno() throws Exception {

		when(turnoDao.obtenerListadoTurnoVo(Constantes.ENABLE))
				.thenReturn(listadoTurno);

		List<TurnoVo> turnoLista = busquedaService.obtieneListadoTurno();

		verify(turnoDao).obtenerListadoTurnoVo(Constantes.ENABLE);

		assertNotNull(turnoLista);
		assertFalse(turnoLista.isEmpty());
	}
	
	@Test
	public void deberiaObtenerListadoTipoVentanilla() throws Exception {
		when(
				tipoVentanillaDao
						.obtenerListadoTipoVentanillaVo(Constantes.ENABLE))
				.thenReturn(listadoTipoVentanilla);

		List<TipoVentanillaVo> listadoTipoVentanilla = busquedaService
				.obtieneListadoTipoVentanilla();

		verify(tipoVentanillaDao).obtenerListadoTipoVentanillaVo(
				Constantes.ENABLE);

		assertNotNull(listadoTipoVentanilla);

		assertFalse(listadoTipoVentanilla.isEmpty());
	}

}
