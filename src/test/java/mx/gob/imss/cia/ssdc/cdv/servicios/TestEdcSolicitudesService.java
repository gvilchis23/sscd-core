/**
 * Proyecto: IMSS  - SSDC
 *
 * Archivo: TestEdcSolicitudesService.java
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

import mx.gob.imss.cia.ssdc.cdv.edc.servicios.EdcSolicitudesService;
import mx.gob.imss.cia.ssdc.cdv.edc.servicios.impl.EdcSolicitudesServiceImpl;
import mx.gob.imss.cia.ssdc.cdv.integracion.dao.CausaDao;
import mx.gob.imss.cia.ssdc.cdv.integracion.entity.CausaEntity;
import mx.gob.imss.cia.ssdc.cdv.test.ServiceUnitTest;

import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;

/**
 * @author propietario
 * 
 */
public class TestEdcSolicitudesService extends ServiceUnitTest {

	private static final int ACTIVO = 1;

	@InjectMocks
	private EdcSolicitudesService edcSolicitudesService;

	@Mock
	private CausaDao causaDao;

	@Mock
	private CausaEntity causa;

	public TestEdcSolicitudesService() {
		edcSolicitudesService = new EdcSolicitudesServiceImpl();
	}

	@Test
	public void deberiaObtenerTodosLosCausasEstatus() throws Exception {
		List<CausaEntity> servicio = new ArrayList<CausaEntity>();
		servicio.add(mock(CausaEntity.class));
		when(causaDao.recuperarCausaPorStatus(ACTIVO)).thenReturn(servicio);
		List<CausaEntity> servicios = edcSolicitudesService
				.recuperarCausaPorStatus();
		assertFalse(servicios.isEmpty());
		verify(causaDao).recuperarCausaPorStatus(ACTIVO);
	}

	@Test
	public void deberiaRecuperarCausasId() throws Exception {
		when(causaDao.read(anyLong())).thenReturn(causa);
		causa = edcSolicitudesService.recuperarCausaPorId(1);
		verify(causaDao).read(anyLong());
		assertNotNull(causa);
	}

}
