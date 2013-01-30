/**
 * Proyecto: IMSS  - SSDC
 *
 * Archivo: EntidadFederativaDaoImpl.java
 *
 * Creado:  13/10/2011
 *
 * Derechos Reservados de copia (c) - INAP /
 *
 * Instituto Mexicano del Seguro Social - 2011
 */

package mx.gob.imss.cia.ssdc.cdv.integracion.dao.impl;

import mx.gob.imss.cia.ssdc.cdv.integracion.dao.EntidadFederativaDao;
import mx.gob.imss.cia.ssdc.cdv.integracion.entity.EntidadFederativaEntity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

/**
 * @author Gamaliel
 * 
 */
@SuppressWarnings("unchecked")
@Repository("entidadFederativaDao")
public class EntidadFederativaDaoImpl extends
		AbstractPersistenceDaoGenericHibernate<EntidadFederativaEntity, Long>
		implements EntidadFederativaDao {

	@Autowired
	public EntidadFederativaDaoImpl(HibernateTemplate hibernateTemplate) {
		super(hibernateTemplate);
	}

}