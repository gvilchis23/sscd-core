/**
 * Proyecto: IMSS  - SSDC
 *
 * Archivo: SscNotificacionDaoImpl.java
 *
 * Creado:  15/11/2011
 *
 * Derechos Reservados de copia (c) - INAP /
 *
 * Instituto Mexicano del Seguro Social - 2011
 */
package mx.gob.imss.cia.ssdc.cdv.integracion.dao.impl;

import mx.gob.imss.cia.ssdc.cdv.integracion.dao.SscNotificacionDao;
import mx.gob.imss.cia.ssdc.cdv.integracion.entity.SscNotificacionEntity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

/**
 * @author FABRICIO-INAP
 * 
 */
@SuppressWarnings("unchecked")
@Repository("sscNotificacionDao")
public class SscNotificacionDaoImpl extends
		AbstractPersistenceDaoGenericHibernate<SscNotificacionEntity, Long>
		implements SscNotificacionDao {

	@Autowired
	public SscNotificacionDaoImpl(HibernateTemplate hibernateTemplate) {
		super(hibernateTemplate);
	}

}
