/**
 * Proyecto: IMSS  - SSDC
 *
 * Archivo: TestTipoUsuarioService.java
 *
 * Creado:  13/10/2011
 *
 * Derechos Reservados de copia (c) - INAP /
 *
 * Instituto Mexicano del Seguro Social - 2011
 */

package mx.gob.imss.cia.ssdc.cdv.servicios;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertFalse;

import static org.mockito.Mockito.when;

import java.util.List;

import mx.gob.imss.cia.ssdc.cdv.integracion.dao.TipoUsuarioDao;
import mx.gob.imss.cia.ssdc.cdv.integracion.entity.TipoUsuarioEntity;
import mx.gob.imss.cia.ssdc.cdv.servicios.impl.TipoUsuarioServiceImpl;
import mx.gob.imss.cia.ssdc.cdv.test.ServiceUnitTest;

import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;

public class TestTipoUsuarioService extends ServiceUnitTest {

	@InjectMocks
	private TipoUsuarioService tipoUsuarioService;
	
	@Mock
	private TipoUsuarioDao tipoUsuarioDao;
	
	@Mock
	private List<TipoUsuarioEntity> listadoTipoUsuario;
	
	@Mock
	private TipoUsuarioEntity tipoUsuarioEntity;
	
	public TestTipoUsuarioService() {
		tipoUsuarioService = new TipoUsuarioServiceImpl();
	}

	@Test
	public void deberiaTraerTodosLosTiposDeUsuario() throws Exception {
		
		listadoTipoUsuario.add(tipoUsuarioEntity);
		
		when(tipoUsuarioDao.findAll()).thenReturn(listadoTipoUsuario);
		
		List<TipoUsuarioEntity> tiposDeUsuarios = 
				tipoUsuarioService.obtenerTodos();
		assertNotNull(tiposDeUsuarios);
		assertFalse(tiposDeUsuarios.isEmpty());
	}

}
