/**
 * Proyecto: IMSS  - SSDC
 *
 * Archivo: UsuarioDaoImpl.java
 *
 * Creado:  13/10/2011
 *
 * Derechos Reservados de copia (c) - INAP /
 *
 * Instituto Mexicano del Seguro Social - 2011
 */

package mx.gob.imss.cia.ssdc.cdv.integracion.dao.impl;

import mx.gob.imss.cia.ssdc.cdv.integracion.dao.UsuarioDao;
import mx.gob.imss.cia.ssdc.cdv.integracion.entity.UserEntity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

/**
 * @author Gamaliel
 * 
 */

@SuppressWarnings("unchecked")
@Repository("usuarioDao")
public class UsuarioDaoImpl extends
		AbstractPersistenceDaoGenericHibernate<UserEntity, Long> implements
		UsuarioDao {

	@Autowired
	public UsuarioDaoImpl(HibernateTemplate hibernateTemplate) {
		super(hibernateTemplate);
		// TODO Auto-generated constructor stub
	}

}
