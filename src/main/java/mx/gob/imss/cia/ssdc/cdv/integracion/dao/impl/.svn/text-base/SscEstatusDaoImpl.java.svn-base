/**
 * Proyecto: IMSS  - SSDC
 *
 * Archivo: CdvDao.java
 *
 * Creado:  12/10/2011
 *
 * Derechos Reservados de copia (c) - INAP /
 *
 * Instituto Mexicano del Seguro Social - 2011
 */

package mx.gob.imss.cia.ssdc.cdv.integracion.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

import mx.gob.imss.cia.ssdc.cdv.integracion.dao.SscEstatusDao;
import mx.gob.imss.cia.ssdc.cdv.integracion.entity.SscEstatusEntity;

/**
 * 
 * @author FABRICIO-INAP
 *
 */
@SuppressWarnings("unchecked")
@Repository("sscEstatusDao")
public class SscEstatusDaoImpl extends
AbstractPersistenceDaoGenericHibernate<SscEstatusEntity, Long> implements
SscEstatusDao {

	@Autowired
	public SscEstatusDaoImpl(HibernateTemplate hibernateTemplate) {
		super(hibernateTemplate);
	}

}
