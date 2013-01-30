/**
 * Proyecto: IMSS  - SSDC
 *
 * Archivo: AccionDaoImpl.java
 *
 * Creado: 14/10/2011
 *
 * Derechos Reservados de copia (c) - INAP /
 *
 * Instituto Mexicano del Seguro Social - 2011
 */

package mx.gob.imss.cia.ssdc.cdv.integracion.dao.impl;

import mx.gob.imss.cia.ssdc.cdv.integracion.dao.AccionDao;
import mx.gob.imss.cia.ssdc.cdv.integracion.entity.AccionEntity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

/**
 * 
 * @author Equipo de Desarrollo
 * 
 */
@SuppressWarnings("unchecked")
@Repository("accionDao")
public class AccionDaoImpl extends
		AbstractPersistenceDaoGenericHibernate<AccionEntity, Long> implements
		AccionDao {

	@Autowired
	public AccionDaoImpl(HibernateTemplate hibernateTemplate) {
		super(hibernateTemplate);
	}
}