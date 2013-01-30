/**
 * Proyecto: IMSS  - SSDC
 *
 * Archivo: DiasFestivosDaoImpl.java
 *
 * Creado: 19/10/2011
 *
 * Derechos Reservados de copia (c) - INAP /
 *
 * Instituto Mexicano del Seguro Social - 2011
 */

package mx.gob.imss.cia.ssdc.cdv.integracion.dao.impl;

import mx.gob.imss.cia.ssdc.cdv.integracion.dao.DiasFestivosDao;
import mx.gob.imss.cia.ssdc.cdv.integracion.entity.DiasFestivosEntity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

/**
 * 
 * @author Equipo de Desarrollo
 * 
 */
@SuppressWarnings("unchecked")
@Repository("diasFestivosDao")
public class DiasFestivosDaoImpl extends
        AbstractPersistenceDaoGenericHibernate<DiasFestivosEntity, Long>
        implements DiasFestivosDao {

	@Autowired
	public DiasFestivosDaoImpl(HibernateTemplate hibernateTemplate) {
		super(hibernateTemplate);
	}

}
