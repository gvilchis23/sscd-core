/**
 * Proyecto: IMSS  - SSDC
 *
 * Archivo: TestAduServiceImpl.java
 *
 * Creado: 04/10/2011
 *
 * Derechos Reservados de copia (c) - INAP /
 *
 * Instituto Mexicano del Seguro Social - 2011
 */
package mx.gob.imss.cia.ssdc.cdv.servicios;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.mockito.Matchers.any;
import static org.mockito.Matchers.anyLong;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import mx.gob.imss.cia.ssdc.cdv.integracion.dao.AdministracionUsuariosDao;
import mx.gob.imss.cia.ssdc.cdv.integracion.dao.CategoriaDao;
import mx.gob.imss.cia.ssdc.cdv.integracion.dao.PerfilPersonalDao;
import mx.gob.imss.cia.ssdc.cdv.integracion.dao.PersonalDao;
import mx.gob.imss.cia.ssdc.cdv.integracion.dao.PuestoDao;
import mx.gob.imss.cia.ssdc.cdv.integracion.entity.CategoriaEntity;
import mx.gob.imss.cia.ssdc.cdv.integracion.entity.LlaveCompuestaUsuarios;
import mx.gob.imss.cia.ssdc.cdv.integracion.entity.PerfilPersonalEntity;
import mx.gob.imss.cia.ssdc.cdv.integracion.entity.PersonalEntity;
import mx.gob.imss.cia.ssdc.cdv.integracion.entity.PersonalRelPerfilEntity;
import mx.gob.imss.cia.ssdc.cdv.integracion.entity.PuestoEntity;
import mx.gob.imss.cia.ssdc.cdv.integracion.entity.TipoUsuarioEntity;
import mx.gob.imss.cia.ssdc.cdv.servicios.impl.AdministracionUsuariosServiceImpl;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

/**
 * 
 * @author Equipo de Desarrolllo
 * 
 */
public class TestAduService {

	@InjectMocks
	private AdministracionUsuariosService administracionUsuariosService = new AdministracionUsuariosServiceImpl();

	@Mock
	private AdministracionUsuariosDao administracionUsuariosDao;

	@Mock
	private PersonalDao personalDao;

	@Mock
	private PerfilPersonalDao perfilPersonalDao;

	@Mock
	private PuestoDao puestoDao;

	@Mock
	private CategoriaDao categoriaDao;

	@Mock
	private PersonalRelPerfilEntity personalRelacion;

	private List<PersonalRelPerfilEntity> personal;

	private static final int ACTIVO = 1;

	private static final int INACTIVO = 0;

	@Before
	public void init() {
		MockitoAnnotations.initMocks(this);
		personal = new ArrayList<PersonalRelPerfilEntity>();
		personal.add(personalRelacion);
	}

	@Test
	public void debieraExistirAduService() throws Exception {
		assertNotNull(new TestAduService());
	}

	@Test
	public void deberiaTraerTodosLosUsuariosActivos() throws Exception {
		when(administracionUsuariosDao.filtraPersonalPorStatus(ACTIVO))
		        .thenReturn(personal);

		List<PersonalRelPerfilEntity> filtraPorStatus = administracionUsuariosService
		        .filtraPorStatus(ACTIVO);

		assertTrue(filtraPorStatus.size() > 0);
		verify(administracionUsuariosDao).filtraPersonalPorStatus(ACTIVO);
	}

	@Test
	public void deberiaCrearUsuarioNivelCentral() throws Exception {
		PersonalEntity personal = creaPersonal();

		administracionUsuariosService.creaUsuarioNivelCentral(personal,
		        anyLong());

		verify(personalDao).create(personal);
		verify(perfilPersonalDao).read(anyLong());
		verify(administracionUsuariosDao, times(1)).create(
		        any(PersonalRelPerfilEntity.class));
	}

	@Test
	public void deberiaCrearUsuarioNivelCentralConDosPerfiles()
	        throws Exception {
		PersonalEntity personal = creaPersonal();

		administracionUsuariosService.creaUsuarioNivelCentral(personal,
		        new Long(1), new Long(2));

		verify(personalDao, times(1)).create(personal);
		verify(perfilPersonalDao, times(2)).read(anyLong());
		verify(administracionUsuariosDao, times(2)).create(
		        any(PersonalRelPerfilEntity.class));
	}

	@Test
	public void deberiaActualizarRelacionPerfilPersona() throws Exception {
		PersonalRelPerfilEntity recuperada = new PersonalRelPerfilEntity();
		recuperada.setStatus(ACTIVO);
		when(
		        administracionUsuariosDao.recuperarRelacionPerfilPersona(
		                anyLong(), anyLong())).thenReturn(recuperada);

		PersonalRelPerfilEntity relPerfil = administracionUsuariosService
		        .recuperaRelacionPerfilPersona(anyLong(), anyLong());

		assertNotNull(relPerfil);
		assertEquals(ACTIVO, relPerfil.getStatus());

		relPerfil.setStatus(INACTIVO);
		administracionUsuariosService.actualizaRelacionPerfilPersona(relPerfil);
		assertEquals(INACTIVO, relPerfil.getStatus());
	}

	@Test
	public void deberiaFiltrarPersonalPorTipo() throws Exception {
		Long TIPO_USUARIO = new Long("1");

		PersonalRelPerfilEntity filtrado = new PersonalRelPerfilEntity();
		PerfilPersonalEntity perfilEntity = new PerfilPersonalEntity();
		LlaveCompuestaUsuarios relacion = new LlaveCompuestaUsuarios(
		        new PersonalEntity(), perfilEntity);
		TipoUsuarioEntity tipoUsuario = new TipoUsuarioEntity();
		tipoUsuario.setCveTipoUsuario(TIPO_USUARIO);
		perfilEntity.setTipoUsuario(tipoUsuario);
		filtrado.setLlaveCompuesta(relacion);
		filtrado.setDelegacion(null);
		filtrado.setUnidad(null);

		List<PersonalRelPerfilEntity> relacionLista = new ArrayList<PersonalRelPerfilEntity>();
		relacionLista.add(filtrado);

		when(administracionUsuariosDao.filtraPersonalPorTipo(TIPO_USUARIO))
		        .thenReturn(relacionLista);

		List<PersonalRelPerfilEntity> personalPorTipo = administracionUsuariosService
		        .filtraPersonalPorTipo(TIPO_USUARIO);
		assertNotNull(personalPorTipo);
		assertTrue(personalPorTipo.size() > 0);

		for (PersonalRelPerfilEntity relPerfil : personalPorTipo) {
			assertEquals(TIPO_USUARIO, relPerfil.getLlaveCompuesta()
			        .getPerfil().getTipoUsuario().getCveTipoUsuario());
		}
	}

	@Test(expected = SsdcException.class)
	public void deberiaArrojarExcepcionAlIntentarCrearUsuario()
	        throws Exception {
		PersonalEntity personal = creaPersonal();

		Long[] cvePerfiles = new Long[4];
		for (int i = 0; i < cvePerfiles.length; i++) {
			cvePerfiles[i] = new Long(i);
		}

		administracionUsuariosService.creaUsuarioNivelCentral(personal,
		        cvePerfiles);

		verify(personalDao, never()).create(personal);
		verify(perfilPersonalDao, never()).read(anyLong());
		verify(administracionUsuariosDao, never()).create(
		        any(PersonalRelPerfilEntity.class));
	}

	private PersonalEntity creaPersonal() {
		PersonalEntity personal = new PersonalEntity();
		personal.setNombrePersonal("NombreUsuario");
		personal.setApellidoPaterno("ApellidoPUsuario");
		personal.setApellidoMaterno("ApellidoMUsuario");
		return personal;
	}

	@Test
	public void deberiaObtenerTodasLasCategorias() throws Exception {
		List<CategoriaEntity> categoria = new ArrayList<CategoriaEntity>();
		categoria.add(mock(CategoriaEntity.class));
		when(categoriaDao.findAll()).thenReturn(categoria);

		List<CategoriaEntity> categorias = administracionUsuariosService
		        .obtenerTodasLasCategorias();

		assertTrue(categorias.size() > 0);
		verify(categoriaDao).findAll();
	}

	@Test
	public void deberiaObtenerTodosLosPuestos() throws Exception {
		List<PuestoEntity> puesto = new ArrayList<PuestoEntity>();
		puesto.add(mock(PuestoEntity.class));
		when(puestoDao.findAll()).thenReturn(puesto);

		List<PuestoEntity> puestos = administracionUsuariosService
		        .obtenerTodosLosPuestos();

		assertTrue(puestos.size() > 0);
		verify(puestoDao).findAll();
	}
}
