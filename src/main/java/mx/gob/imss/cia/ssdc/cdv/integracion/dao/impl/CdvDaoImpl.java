/**
 * Proyecto: IMSS  - SSDC
 *
 * Archivo: CdvDaoImpl.java
 *
 * Creado:  13/10/2011
 *
 * Derechos Reservados de copia (c) - INAP /
 *
 * Instituto Mexicano del Seguro Social - 2011
 */

package mx.gob.imss.cia.ssdc.cdv.integracion.dao.impl;

import mx.gob.imss.cia.ssdc.cdv.integracion.dao.CdvDao;
import mx.gob.imss.cia.ssdc.cdv.integracion.entity.CdvEntity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

/**
 * 
 * @author Equipo de desarrollo
 * 
 */
@SuppressWarnings("unchecked")
@Repository("cdvDao")
public class CdvDaoImpl extends
		AbstractPersistenceDaoGenericHibernate<CdvEntity, Long> implements
		CdvDao {

	@Autowired
	public CdvDaoImpl(HibernateTemplate hibernateTemplate) {
		super(hibernateTemplate);
	}

}
