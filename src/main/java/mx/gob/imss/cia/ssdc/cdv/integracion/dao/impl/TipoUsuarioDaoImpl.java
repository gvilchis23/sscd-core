/**
 * Proyecto: IMSS  - SSDC
 *
 * Archivo: TipoUsuarioDaoImpl.java
 *
 * Creado:  13/10/2011
 *
 * Derechos Reservados de copia (c) - INAP /
 *
 * Instituto Mexicano del Seguro Social - 2011
 */

package mx.gob.imss.cia.ssdc.cdv.integracion.dao.impl;

import mx.gob.imss.cia.ssdc.cdv.integracion.dao.TipoUsuarioDao;
import mx.gob.imss.cia.ssdc.cdv.integracion.entity.TipoUsuarioEntity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

/**
 * @author Gamaliel
 * 
 */
@SuppressWarnings("unchecked")
@Repository("tipoUsuarioDao")
public class TipoUsuarioDaoImpl extends
		AbstractPersistenceDaoGenericHibernate<TipoUsuarioEntity, Long>
		implements TipoUsuarioDao {

	@Autowired
	public TipoUsuarioDaoImpl(HibernateTemplate hibernateTemplate) {
		super(hibernateTemplate);
	}

}
