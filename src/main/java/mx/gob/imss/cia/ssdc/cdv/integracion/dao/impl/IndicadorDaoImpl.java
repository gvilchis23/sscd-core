/**
 * Proyecto: IMSS  - SSDC
 *
 * Archivo: IndicadorDaoImpl.java
 *
 * Creado: 20/10/2011
 *
 * Derechos Reservados de copia (c) - INAP /
 *
 * Instituto Mexicano del Seguro Social - 2011
 */

package mx.gob.imss.cia.ssdc.cdv.integracion.dao.impl;

import mx.gob.imss.cia.ssdc.cdv.integracion.dao.IndicadorDao;
import mx.gob.imss.cia.ssdc.cdv.integracion.entity.IndicadorEntity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

/**
 * 
 * @author Equipo de Desarrollo
 * 
 */
@SuppressWarnings("unchecked")
@Repository("indicadorDao")
public class IndicadorDaoImpl extends
        AbstractPersistenceDaoGenericHibernate<IndicadorEntity, Long> implements
        IndicadorDao {

	@Autowired
	public IndicadorDaoImpl(HibernateTemplate hibernateTemplate) {
		super(hibernateTemplate);
	}

}
