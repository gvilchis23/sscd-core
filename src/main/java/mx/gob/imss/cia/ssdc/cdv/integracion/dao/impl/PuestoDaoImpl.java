/**
 * Proyecto: IMSS  - SSDC
 *
 * Archivo: PuestoDaoImpl.java
 *
 * Creado:  13/10/2011
 *
 * Derechos Reservados de copia (c) - INAP /
 *
 * Instituto Mexicano del Seguro Social - 2011
 */

package mx.gob.imss.cia.ssdc.cdv.integracion.dao.impl;

import mx.gob.imss.cia.ssdc.cdv.integracion.dao.PuestoDao;
import mx.gob.imss.cia.ssdc.cdv.integracion.entity.PuestoEntity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

/**
 * @author Gamaliel
 * 
 */
@SuppressWarnings("unchecked")
@Repository("puestoDao")
public class PuestoDaoImpl extends
		AbstractPersistenceDaoGenericHibernate<PuestoEntity, Long> implements
		PuestoDao {

	@Autowired
	public PuestoDaoImpl(HibernateTemplate hibernateTemplate) {
		super(hibernateTemplate);
	}
	

}
