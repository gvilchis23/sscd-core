/**
 * Proyecto: IMSS  - SSDC
 *
 * Archivo: OpinionTrabajadorDaoImpl.java
 *
 * Creado:  Oct 18, 2011
 *
 * Derechos Reservados de copia (c) - INAP /
 *
 * Instituto Mexicano del Seguro Social - 2011
 */
package mx.gob.imss.cia.ssdc.cdv.integracion.dao.impl;

import mx.gob.imss.cia.ssdc.cdv.integracion.dao.OpinionTrabajadorDao;
import mx.gob.imss.cia.ssdc.cdv.integracion.entity.OpinionTrabajadorEntity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

/**
 * @author propietario
 *
 */

@SuppressWarnings("unchecked")
@Repository("opinionTrabajadorDao")
public class OpinionTrabajadorDaoImpl extends
AbstractPersistenceDaoGenericHibernate<OpinionTrabajadorEntity, Long>
implements  OpinionTrabajadorDao  {

	@Autowired
	public OpinionTrabajadorDaoImpl(HibernateTemplate hibernateTemplate) {
		super(hibernateTemplate);
	}

}
