/**
 * Proyecto: IMSS  - SSDC
 *
 * Archivo: SscTipoRegistroDaoImpl.java
 *
 * Creado:  15/11/2011
 *
 * Derechos Reservados de copia (c) - INAP /
 *
 * Instituto Mexicano del Seguro Social - 2011
 */
package mx.gob.imss.cia.ssdc.cdv.integracion.dao.impl;

import mx.gob.imss.cia.ssdc.cdv.integracion.dao.SscTipoRegistroDao;
import mx.gob.imss.cia.ssdc.cdv.integracion.entity.SscTipoRegistroEntity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

/**
 * @author FABRICIO-INAP
 *
 */
@SuppressWarnings("unchecked")
@Repository("sscTipoRegistroDao")
public class SscTipoRegistroDaoImpl extends
		AbstractPersistenceDaoGenericHibernate<SscTipoRegistroEntity, Long>
		implements SscTipoRegistroDao {

	@Autowired
	public SscTipoRegistroDaoImpl(HibernateTemplate hibernateTemplate) {
		super(hibernateTemplate);
	}

	
}
