/**
 * Proyecto: IMSS  - SSDC
 *
 * Archivo: PeriodoUnidadDaoImpl.java
 *
 * Creado:  Oct 18, 2011
 *
 * Derechos Reservados de copia (c) - INAP /
 *
 * Instituto Mexicano del Seguro Social - 2011
 */
package mx.gob.imss.cia.ssdc.cdv.integracion.dao.impl;

import mx.gob.imss.cia.ssdc.cdv.integracion.dao.PeriodoUnidadDao;
import mx.gob.imss.cia.ssdc.cdv.integracion.entity.LlaveCompPeriodoUnidad;
import mx.gob.imss.cia.ssdc.cdv.integracion.entity.PeriodoUnidadEntity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

/**
 * @author propietario
 * 
 */

@SuppressWarnings("unchecked")
@Repository("periodoUnidadDao")
public class PeriodoUnidadDaoImpl
        extends
        AbstractPersistenceDaoGenericHibernate<PeriodoUnidadEntity, LlaveCompPeriodoUnidad>
        implements PeriodoUnidadDao {

	@Autowired
	public PeriodoUnidadDaoImpl(HibernateTemplate hibernateTemplate) {
		super(hibernateTemplate);
	}

}
