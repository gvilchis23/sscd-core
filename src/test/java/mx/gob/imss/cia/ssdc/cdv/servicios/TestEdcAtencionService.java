/**
 * Proyecto: IMSS  - SSDC
 *
 * Archivo: TestEdcAtencionService.java
 *
 * Creado:  Oct 28, 2011
 *
 * Derechos Reservados de copia (c) - INAP /
 *
 * Instituto Mexicano del Seguro Social - 2011
 */
package mx.gob.imss.cia.ssdc.cdv.servicios;

import static org.mockito.Mockito.verify;
import mx.gob.imss.cia.ssdc.cdv.edc.servicios.EdcAtencionService;
import mx.gob.imss.cia.ssdc.cdv.edc.servicios.impl.EdcAtencionServiceImpl;
import mx.gob.imss.cia.ssdc.cdv.integracion.dao.ModuloAtencionDao;
import mx.gob.imss.cia.ssdc.cdv.integracion.entity.ModuloAtencionEntity;
import mx.gob.imss.cia.ssdc.cdv.test.ServiceUnitTest;

import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;

/**
 * @author propietario
 *
 */
public class TestEdcAtencionService  extends ServiceUnitTest {
	
	@InjectMocks
	private EdcAtencionService edcAtencionService;
	@Mock
	private ModuloAtencionDao moduloAtencionDao;
	
	public TestEdcAtencionService() {
		edcAtencionService = new EdcAtencionServiceImpl();
	}
	
	@Test
	public void deberiaCrearModuloAtencion() throws Exception {
		ModuloAtencionEntity modulo = new ModuloAtencionEntity();
		edcAtencionService.guardarModuloAtencion(modulo);
		verify(moduloAtencionDao).create(modulo);
	}

}
