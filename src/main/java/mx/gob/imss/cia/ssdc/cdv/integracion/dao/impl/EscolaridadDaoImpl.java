/**
 * Proyecto: IMSS  - SSDC
 *
 * Archivo: EscolaridadDaoImpl.java
 *
 * Creado: 19/10/2011
 *
 * Derechos Reservados de copia (c) - INAP /
 *
 * Instituto Mexicano del Seguro Social - 2011
 */

package mx.gob.imss.cia.ssdc.cdv.integracion.dao.impl;

import mx.gob.imss.cia.ssdc.cdv.integracion.dao.EscolaridadDao;
import mx.gob.imss.cia.ssdc.cdv.integracion.entity.EscolaridadEntity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

/**
 * 
 * @author Equipo de Desarrollo
 * 
 */
@SuppressWarnings("unchecked")
@Repository("escolaridadDao")
public class EscolaridadDaoImpl extends
        AbstractPersistenceDaoGenericHibernate<EscolaridadEntity, Long>
        implements EscolaridadDao {

	@Autowired
	public EscolaridadDaoImpl(HibernateTemplate hibernateTemplate) {
		super(hibernateTemplate);
	}

}
