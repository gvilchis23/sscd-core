/**
 * Proyecto: IMSS  - SSDC
 *
 * Archivo: SscTipoNotificacionDaoImpl.java
 *
 * Creado:  15/11/2011
 *
 * Derechos Reservados de copia (c) - INAP /
 *
 * Instituto Mexicano del Seguro Social - 2011
 */
package mx.gob.imss.cia.ssdc.cdv.integracion.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

import mx.gob.imss.cia.ssdc.cdv.integracion.dao.SscTipoNotificacionDao;
import mx.gob.imss.cia.ssdc.cdv.integracion.entity.SscTipoNotificacionEntity;

/**
 * @author FABRICIO-INAP
 * 
 */
@SuppressWarnings("unchecked")
@Repository("sscTipoNotificacionDao")
public class SscTipoNotificacionDaoImpl extends
		AbstractPersistenceDaoGenericHibernate<SscTipoNotificacionEntity, Long>
		implements SscTipoNotificacionDao {

	@Autowired
	public SscTipoNotificacionDaoImpl(HibernateTemplate hibernateTemplate) {
		super(hibernateTemplate);
	}

}
