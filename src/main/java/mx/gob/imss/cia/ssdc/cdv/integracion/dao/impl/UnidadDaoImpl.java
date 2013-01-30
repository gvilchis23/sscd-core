/**
 * Proyecto: IMSS  - SSDC
 *
 * Archivo: UnidadDaoImpl.java
 *
 * Creado:  13/10/2011
 *
 * Derechos Reservados de copia (c) - INAP /
 *
 * Instituto Mexicano del Seguro Social - 2011
 */

package mx.gob.imss.cia.ssdc.cdv.integracion.dao.impl;

import java.util.List;

import mx.gob.imss.cia.ssdc.cdv.integracion.dao.UnidadDao;
import mx.gob.imss.cia.ssdc.cdv.integracion.entity.UnidadEntity;
import mx.gob.imss.cia.ssdc.cdv.vo.UnidadVo;
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
@Repository("unidadDao")
public class UnidadDaoImpl extends
        AbstractPersistenceDaoGenericHibernate<UnidadEntity, Long> implements
        UnidadDao {

	@Autowired
	public UnidadDaoImpl(HibernateTemplate hibernateTemplate) {
		super(hibernateTemplate);
	}

	@Override
	@Transactional(readOnly = true)
	public List<UnidadEntity> filtraUnidadesPorStatus(int status) {
		return getHibernateTemplate().find(
		        "from UnidadEntity u where u.status = ?", status);
	}

	@Override
	@Transactional(readOnly = true)
	public List<UnidadEntity> filtrarUnidadByDelegacionYStatus(
	        Long cveDelegacion, int status) {

		return getHibernateTemplate().find(
		        "from UnidadEntity u where "
		                + "u.delegacion.cveDelegacion = ? and u.status = ?",
		        new Object[] { cveDelegacion, status });
	}
	
	@Override
	public List<UnidadVo> obtenerListadoUnidadVo(final int status) {
		return getSession().getNamedQuery(QueriesNombrados.UNIDAD_FIND_ALL)
		        .setInteger("estatus", status).list();
	}
}
