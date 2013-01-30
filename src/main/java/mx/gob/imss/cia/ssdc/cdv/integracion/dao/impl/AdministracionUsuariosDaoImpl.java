/**
 * Proyecto: IMSS  - SSDC
 *
 * Archivo: AdministracionUsuariosDaoImpl.java
 *
 * Creado:  13/10/2011
 *
 * Derechos Reservados de copia (c) - INAP /
 *
 * Instituto Mexicano del Seguro Social - 2011
 */

package mx.gob.imss.cia.ssdc.cdv.integracion.dao.impl;

import java.util.List;

import mx.gob.imss.cia.ssdc.cdv.integracion.dao.AdministracionUsuariosDao;
import mx.gob.imss.cia.ssdc.cdv.integracion.entity.LlaveCompuestaUsuarios;
import mx.gob.imss.cia.ssdc.cdv.integracion.entity.PersonalRelPerfilEntity;
import mx.gob.imss.cia.ssdc.commons.Constantes;

import org.hibernate.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 * 
 * @author Equipo de Desarrolllo
 * 
 */
@SuppressWarnings("unchecked")
@Repository("administracionUsuariosDao")
public class AdministracionUsuariosDaoImpl
		extends
		AbstractPersistenceDaoGenericHibernate<PersonalRelPerfilEntity, LlaveCompuestaUsuarios>
		implements AdministracionUsuariosDao {

	@Autowired
	public AdministracionUsuariosDaoImpl(HibernateTemplate hibernateTemplate) {
		super(hibernateTemplate);
	}

	@Override
	@Transactional(readOnly = true)
	public List<PersonalRelPerfilEntity> filtraPersonalPorTipo(Long tipoUsuario) {
		String sql = "select p from PersonalRelPerfilEntity p where "
				+ "p.llaveCompuesta.perfil.tipoUsuario.cveTipoUsuario = ? "
				+ "and p.status = ?";

		return getHibernateTemplate().find(sql,
				new Object[] { tipoUsuario, Constantes.ENABLE });
	}

	@Override
	@Transactional(readOnly = true)
	public PersonalRelPerfilEntity recuperarRelacionPerfilPersona(Long cvePersonal,
			Long cvePerfil) {

		String sql = "select p from PersonalRelPerfilEntity p where "
		        + "p.llaveCompuesta.personal.cvePersonal = :cvePersonal and "
		        + "p.llaveCompuesta.perfil.cvePerfilPersonal = :cvePerfil";

		Query query = getSession().createQuery(sql);
		query.setLong("cvePersonal", cvePersonal);
		query.setLong("cvePerfil", cvePerfil);

		return (PersonalRelPerfilEntity) query.uniqueResult();
	}

	@Override
	@Transactional(readOnly = true)
	public List<PersonalRelPerfilEntity> filtraPersonalPorStatus(int status) {
		String sql = "from PersonalRelPerfilEntity p where p.status = ?";

		return getHibernateTemplate().find(sql, Integer.valueOf(status));
	}
}
