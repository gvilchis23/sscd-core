/**
 * Proyecto: IMSS  - SSDC
 *
 * Archivo: PeriodoDaoImpl.java
 *
 * Creado:  Oct 18, 2011
 *
 * Derechos Reservados de copia (c) - INAP /
 *
 * Instituto Mexicano del Seguro Social - 2011
 */
package mx.gob.imss.cia.ssdc.cdv.integracion.dao.impl;

import mx.gob.imss.cia.ssdc.cdv.integracion.dao.PeriodoDao;
import mx.gob.imss.cia.ssdc.cdv.integracion.entity.PeriodoEntity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

/**
 * @author propietario
 *
 */

@SuppressWarnings("unchecked")
@Repository("periodoDao")
public class PeriodoDaoImpl extends
AbstractPersistenceDaoGenericHibernate<PeriodoEntity, Long>
implements  PeriodoDao  {

	@Autowired
	public PeriodoDaoImpl(HibernateTemplate hibernateTemplate) {
		super(hibernateTemplate);
	}

}
