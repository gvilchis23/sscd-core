/**
 * Proyecto: IMSS  - SSDC
 *
 * Archivo: FaseEntityDaoImpl.java
 *
 * Creado: 20/10/2011
 *
 * Derechos Reservados de copia (c) - INAP /
 *
 * Instituto Mexicano del Seguro Social - 2011
 */

package mx.gob.imss.cia.ssdc.cdv.integracion.dao.impl;

import mx.gob.imss.cia.ssdc.cdv.integracion.dao.FaseEntityDao;
import mx.gob.imss.cia.ssdc.cdv.integracion.entity.FaseEntity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

/**
 * 
 * @author Equipo de Desarrollo
 * 
 */
@SuppressWarnings("unchecked")
@Repository("faseEntityDao")
public class FaseEntityDaoImpl extends
        AbstractPersistenceDaoGenericHibernate<FaseEntity, Long> implements
        FaseEntityDao {

	@Autowired
	public FaseEntityDaoImpl(HibernateTemplate hibernateTemplate) {
		super(hibernateTemplate);
	}

}
