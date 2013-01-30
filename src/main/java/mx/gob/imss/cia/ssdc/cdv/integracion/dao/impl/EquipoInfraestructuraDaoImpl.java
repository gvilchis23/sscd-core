/**
 * Proyecto: IMSS  - SSDC
 *
 * Archivo: EquipoInfraestructuraDaoImpl.java
 *
 * Creado: 19/10/2011
 *
 * Derechos Reservados de copia (c) - INAP /
 *
 * Instituto Mexicano del Seguro Social - 2011
 */

package mx.gob.imss.cia.ssdc.cdv.integracion.dao.impl;

import mx.gob.imss.cia.ssdc.cdv.integracion.dao.EquipoInfraestructuraDao;
import mx.gob.imss.cia.ssdc.cdv.integracion.entity.EquipoInfraestructuraEntity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

/**
 * 
 * @author Equipo de Desarrollo
 * 
 */
@SuppressWarnings("unchecked")
@Repository("equipoInfraestructuraDao")
public class EquipoInfraestructuraDaoImpl
        extends
        AbstractPersistenceDaoGenericHibernate<EquipoInfraestructuraEntity, Long>
        implements EquipoInfraestructuraDao {

	@Autowired
	public EquipoInfraestructuraDaoImpl(HibernateTemplate hibernateTemplate) {
		super(hibernateTemplate);
	}

}
