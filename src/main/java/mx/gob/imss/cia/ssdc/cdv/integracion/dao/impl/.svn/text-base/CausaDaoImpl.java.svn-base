/**
 * Proyecto: IMSS  - SSDC
 *
 * Archivo: CausaDaoImpl.java
 *
 * Creado: 17/10/2011
 *
 * Derechos Reservados de copia (c) - INAP /
 *
 * Instituto Mexicano del Seguro Social - 2011
 */

package mx.gob.imss.cia.ssdc.cdv.integracion.dao.impl;

import java.util.List;

import mx.gob.imss.cia.ssdc.cdv.integracion.dao.CausaDao;
import mx.gob.imss.cia.ssdc.cdv.integracion.entity.CausaEntity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

/**
 * 
 * @author Equipo de Desarrollo
 * 
 */

@Repository("causaDao")
@SuppressWarnings("unchecked")
public class CausaDaoImpl extends
        AbstractPersistenceDaoGenericHibernate<CausaEntity, Long> implements
        CausaDao {

	@Autowired
	public CausaDaoImpl(HibernateTemplate hibernateTemplate) {
		super(hibernateTemplate);
	}

	@Override
	public List<CausaEntity> recuperarCausaPorStatus(Integer status) {
		return getHibernateTemplate().find(
		        "from CausaEntity c " + "where c.status=?", status);
	}
}
