/**
 * Proyecto: IMSS  - SSDC
 *
 * Archivo: InfraestructuraDaoImpl.java
 *
 * Creado: 20/10/2011
 *
 * Derechos Reservados de copia (c) - INAP /
 *
 * Instituto Mexicano del Seguro Social - 2011
 */

package mx.gob.imss.cia.ssdc.cdv.integracion.dao.impl;

import mx.gob.imss.cia.ssdc.cdv.integracion.dao.InfraestructuraDao;
import mx.gob.imss.cia.ssdc.cdv.integracion.entity.InfraestructuraEntity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

/**
 * 
 * @author Equipo de Desarrollo
 * 
 */
@SuppressWarnings("unchecked")
@Repository("infraestructuraDao")
public class InfraestructuraDaoImpl extends
        AbstractPersistenceDaoGenericHibernate<InfraestructuraEntity, Long>
        implements InfraestructuraDao {

	@Autowired
	public InfraestructuraDaoImpl(HibernateTemplate hibernateTemplate) {
		super(hibernateTemplate);
	}

}
