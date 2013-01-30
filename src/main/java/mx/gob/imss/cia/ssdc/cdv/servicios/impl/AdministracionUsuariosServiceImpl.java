/**
 * Proyecto: IMSS  - SSDC
 *
 * Archivo: AdministracionUsuariosServiceImpl.java
 *
 * Creado:  13/10/2011
 *
 * Derechos Reservados de copia (c) - INAP /
 *
 * Instituto Mexicano del Seguro Social - 2011
 */

package mx.gob.imss.cia.ssdc.cdv.servicios.impl;

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
import mx.gob.imss.cia.ssdc.cdv.servicios.AdministracionUsuariosService;
import mx.gob.imss.cia.ssdc.cdv.servicios.SsdcException;
import mx.gob.imss.cia.ssdc.commons.Constantes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * 
 * @author Equipo de Desarrolllo
 * 
 */
@Transactional
@Service("administracionUsuariosService")
public class AdministracionUsuariosServiceImpl implements
        AdministracionUsuariosService {

	private static final int MIN_NUMERO_PERFILES = 1;

	private static final int MAX_NUMERO_PERFILES = 3;

	@Autowired
	private AdministracionUsuariosDao administracionUsuariosDao;

	@Autowired
	private PersonalDao personalDao;

	@Autowired
	private PerfilPersonalDao perfilPersonalDao;

	@Autowired
	private PuestoDao puestoDao;

	@Autowired
	private CategoriaDao categoriaDao;

	@Override
	@Transactional(readOnly = false, isolation = Isolation.DEFAULT, propagation = Propagation.REQUIRED)
	public void creaUsuarioNivelCentral(PersonalEntity personal,
	        Long... cvePerfiles) throws SsdcException {
		if (cvePerfiles.length < MAX_NUMERO_PERFILES
		        && cvePerfiles.length >= MIN_NUMERO_PERFILES) {
			personalDao.create(personal);

			for (Long cvePerfil : cvePerfiles) {
				PerfilPersonalEntity perfil = perfilPersonalDao.read(cvePerfil);
				PersonalRelPerfilEntity personalRelPerfil = new PersonalRelPerfilEntity();
				personalRelPerfil.setLlaveCompuesta(new LlaveCompuestaUsuarios(
				        personal, perfil));
				personalRelPerfil.setStatus(Constantes.ENABLE);

				administracionUsuariosDao.create(personalRelPerfil);
			}
		} else {
			throw new SsdcException(
			        "N�mero de perfiles no soportado en el usuario de Tipo NC");
		}
	}

	@Override
	@Transactional(readOnly = false, isolation = Isolation.DEFAULT, propagation = Propagation.REQUIRED)
	public void actualizaRelacionPerfilPersona(PersonalRelPerfilEntity personal)
	        throws SsdcException {
		administracionUsuariosDao.update(personal);
	}

	@Override
	@Transactional(readOnly = true, propagation = Propagation.NOT_SUPPORTED)
	public PersonalRelPerfilEntity recuperaRelacionPerfilPersona(
	        Long cvePersonal, Long cvePerfil) throws SsdcException {
		return administracionUsuariosDao.recuperarRelacionPerfilPersona(
		        cvePersonal, cvePerfil);
	}

	@Override
	@Transactional(readOnly = true, propagation = Propagation.NOT_SUPPORTED)
	public List<PersonalRelPerfilEntity> filtraPorStatus(int status)
	        throws SsdcException {
		return administracionUsuariosDao.filtraPersonalPorStatus(status);
	}

	@Override
	@Transactional(readOnly = true, propagation = Propagation.NOT_SUPPORTED)
	public List<PersonalRelPerfilEntity> filtraPersonalPorTipo(Long tipoUsuario)
	        throws SsdcException {
		return administracionUsuariosDao.filtraPersonalPorTipo(tipoUsuario);
	}

	@Override
	@Transactional(readOnly = true, propagation = Propagation.NOT_SUPPORTED)
	public List<CategoriaEntity> obtenerTodasLasCategorias() {
		return categoriaDao.findAll();
	}

	@Override
	@Transactional(readOnly = true, propagation = Propagation.NOT_SUPPORTED)
	public List<PuestoEntity> obtenerTodosLosPuestos() {
		return puestoDao.findAll();
	}
}
