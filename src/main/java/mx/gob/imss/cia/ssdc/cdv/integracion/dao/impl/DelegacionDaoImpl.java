/**
 * Proyecto: IMSS  - SSDC
 *
 * Archivo: DelegacionDaoImpl.java
 *
 * Creado:  13/10/2011
 *
 * Derechos Reservados de copia (c) - INAP /
 *
 * Instituto Mexicano del Seguro Social - 2011
 */

package mx.gob.imss.cia.ssdc.cdv.integracion.dao.impl;

import java.util.List;

import mx.gob.imss.cia.ssdc.cdv.integracion.dao.DelegacionDao;
import mx.gob.imss.cia.ssdc.cdv.integracion.entity.DelegacionEntity;
import mx.gob.imss.cia.ssdc.cdv.vo.DelegacionVo;
import mx.gob.imss.cia.ssdc.commons.QueriesNombrados;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author Gamaliel
 * 
 */

@SuppressWarnings("unchecked")
@Repository("delegacionDao")
public class DelegacionDaoImpl extends
        AbstractPersistenceDaoGenericHibernate<DelegacionEntity, Long>
        implements DelegacionDao {

	@Autowired
	public DelegacionDaoImpl(HibernateTemplate hibernateTemplate) {
		super(hibernateTemplate);
	}

	@Override
	@Transactional(readOnly = true)
	public List<DelegacionEntity> obtenerListadoDelegacionPorStatus(int status) {
		return getHibernateTemplate().find(
		        "FROM DelegacionEntity d where d.status=?", status);
	}

	@Override
	public List<DelegacionVo> obtenerListadoDelegacionVo(int status) {
		return getSession().getNamedQuery(QueriesNombrados.DELEGACION_FIND_ALL)
		        .setInteger("status", status).list();
	}
}
