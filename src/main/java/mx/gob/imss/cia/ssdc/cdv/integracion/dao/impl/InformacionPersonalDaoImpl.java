/**
 * Proyecto: IMSS  - SSDC
 *
 * Archivo: InformacionPersonalDaoImpl.java
 *
 * Creado: 20/10/2011
 *
 * Derechos Reservados de copia (c) - INAP /
 *
 * Instituto Mexicano del Seguro Social - 2011
 */

package mx.gob.imss.cia.ssdc.cdv.integracion.dao.impl;

import mx.gob.imss.cia.ssdc.cdv.integracion.dao.InformacionPersonalDao;
import mx.gob.imss.cia.ssdc.cdv.integracion.entity.InformacionPersonalEntity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

/**
 * 
 * @author Equipo de Desarrollo
 * 
 */
@SuppressWarnings("unchecked")
@Repository("informacionPersonalDao")
public class InformacionPersonalDaoImpl extends
        AbstractPersistenceDaoGenericHibernate<InformacionPersonalEntity, Long>
        implements InformacionPersonalDao {

	@Autowired
	public InformacionPersonalDaoImpl(HibernateTemplate hibernateTemplate) {
		super(hibernateTemplate);
	}

}
