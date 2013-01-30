/**
 * Proyecto: IMSS  - SSDC
 *
 * Archivo: PaavDaoImpl.java
 *
 * Creado:  Oct 18, 2011
 *
 * Derechos Reservados de copia (c) - INAP /
 *
 * Instituto Mexicano del Seguro Social - 2011
 */
package mx.gob.imss.cia.ssdc.cdv.integracion.dao.impl;

import mx.gob.imss.cia.ssdc.cdv.integracion.dao.PaavDao;
import mx.gob.imss.cia.ssdc.cdv.integracion.entity.PaavEntity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

/**
 * @author propietario
 * 
 */

@SuppressWarnings("unchecked")
@Repository("paavDao")
public class PaavDaoImpl extends
        AbstractPersistenceDaoGenericHibernate<PaavEntity, Long> implements
        PaavDao {

	@Autowired
	public PaavDaoImpl(HibernateTemplate hibernateTemplate) {
		super(hibernateTemplate);
	}

}
