/**
 * Proyecto: IMSS  - SSDC
 *
 * Archivo: TestAdministracionUsuariosDaoHibernate.java
 *
 * Creado: 05/10/2011
 *
 * Derechos Reservados de copia (c) - INAP /
 *
 * Instituto Mexicano del Seguro Social - 2011
 */
package mx.gob.imss.cia.ssdc.cdv.integracion.dao;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.List;

import mx.gob.imss.cia.ssdc.cdv.integracion.entity.LlaveCompuestaUsuarios;
import mx.gob.imss.cia.ssdc.cdv.integracion.entity.PerfilPersonalEntity;
import mx.gob.imss.cia.ssdc.cdv.integracion.entity.PersonalEntity;
import mx.gob.imss.cia.ssdc.cdv.integracion.entity.PersonalRelPerfilEntity;
import mx.gob.imss.cia.ssdc.cdv.integracion.entity.TipoUsuarioEntity;
import mx.gob.imss.cia.ssdc.cdv.test.IntegrationTest;
import mx.gob.imss.cia.ssdc.commons.Constantes;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * 
 * @author Equipo de Desarrolllo
 * 
 */
public class TestAdministracionUsuariosDao extends IntegrationTest {

	private static final int TIPO_USUARIO = 3;

	private static final Long CLAVE_PERFIL = new Long(1);

	private static final Long CLAVE_PERSONAL = new Long(2);

	private static final int ACTIVO = 1;

	private static final int INACTIVO = 0;

	@Autowired
	private AdministracionUsuariosDao administracionUsuariosDao;

	@Test
	public void deberiaCrearUsuarioNivelCentral() throws Exception {
		PersonalRelPerfilEntity usuario = new PersonalRelPerfilEntity();
		usuario.setLlaveCompuesta(new LlaveCompuestaUsuarios());
		usuario.setDelegacion(null);
		usuario.setUnidad(null);
		usuario.setStatus(Constantes.ENABLE);
		administracionUsuariosDao.create(usuario);
	}

	@Test
	public void deberiaTraerATodosLosUsuarios() throws Exception {
		List<PersonalRelPerfilEntity> personal = administracionUsuariosDao
		        .findAll();
		assertNotNull(personal);
		assertTrue(personal.size() > 0);
	}

	@Test
	public void deberiaActualizarElEstadoDeLaRelacion() throws Exception {
		PersonalRelPerfilEntity relPerfil = administracionUsuariosDao
		        .recuperarRelacionPerfilPersona(CLAVE_PERSONAL, CLAVE_PERFIL);
		assertNotNull(relPerfil);
		assertEquals(INACTIVO, relPerfil.getStatus());

		relPerfil.setStatus(ACTIVO);
		administracionUsuariosDao.update(relPerfil);
		assertEquals(ACTIVO, relPerfil.getStatus());
	}

	@Test
	public void deberiaFiltraUsuariosPorTipo() {
		List<PersonalRelPerfilEntity> filtraPersonalPorTipo = administracionUsuariosDao
		        .filtraPersonalPorTipo(new Long(TIPO_USUARIO));
		assertNotNull(filtraPersonalPorTipo);
		for (PersonalRelPerfilEntity personalRelPerfil : filtraPersonalPorTipo) {
			TipoUsuarioEntity tipoUsuario = personalRelPerfil
			        .getLlaveCompuesta().getPerfil().getTipoUsuario();
			assertEquals(TIPO_USUARIO, tipoUsuario.getCveTipoUsuario(), 0);
		}
	}

	@Test
	public void deberiaRecuperarRelacionPerfilPersona() throws Exception {
		PersonalRelPerfilEntity relPerfil = administracionUsuariosDao
		        .recuperarRelacionPerfilPersona(CLAVE_PERSONAL, CLAVE_PERFIL);
		PersonalEntity personal = relPerfil.getLlaveCompuesta().getPersonal();
		PerfilPersonalEntity perfil = relPerfil.getLlaveCompuesta().getPerfil();

		assertEquals(CLAVE_PERSONAL, personal.getCvePersonal());
		assertEquals(CLAVE_PERFIL, perfil.getCvePerfilPersonal());
	}

	@Test
	public void deberiaObtenerSoloLosUsuariosActivos() throws Exception {
		List<PersonalRelPerfilEntity> personalActivo = administracionUsuariosDao
		        .filtraPersonalPorStatus(Constantes.ENABLE);

		assertNotNull(personalActivo);
		assertTrue(personalActivo.size() > 0);

		for (PersonalRelPerfilEntity relacionPerfil : personalActivo) {
			assertEquals(ACTIVO, relacionPerfil.getStatus());
		}
	}

	@Test
	public void deberiaObtenerLosUsuariosInactivos() throws Exception {
		List<PersonalRelPerfilEntity> personalActivo = administracionUsuariosDao
		        .filtraPersonalPorStatus(Constantes.DISABLE);

		assertNotNull(personalActivo);
		assertTrue(personalActivo.size() > 0);

		for (PersonalRelPerfilEntity relacionPerfil : personalActivo) {
			assertEquals(INACTIVO, relacionPerfil.getStatus());
		}
	}
}