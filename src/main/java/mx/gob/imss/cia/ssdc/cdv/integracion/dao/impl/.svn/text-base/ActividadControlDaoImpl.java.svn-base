/**
 * Proyecto: IMSS  - SSDC
 *
 * Archivo: ActividadControlDaoImpl.java
 *
 * Creado: 17/10/2011
 *
 * Derechos Reservados de copia (c) - INAP /
 *
 * Instituto Mexicano del Seguro Social - 2011
 */

package mx.gob.imss.cia.ssdc.cdv.integracion.dao.impl;

import mx.gob.imss.cia.ssdc.cdv.integracion.dao.ActividadControlDao;
import mx.gob.imss.cia.ssdc.cdv.integracion.entity.ActividadControlEntity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

/**
 * 
 * @author Equipo de Desarrollo
 * 
 */
@SuppressWarnings("unchecked")
@Repository("actividadControlDao")
public class ActividadControlDaoImpl extends
		AbstractPersistenceDaoGenericHibernate<ActividadControlEntity, Long>
		implements ActividadControlDao {

	@Autowired
	public ActividadControlDaoImpl(HibernateTemplate hibernateTemplate) {
		super(hibernateTemplate);
	}

}
