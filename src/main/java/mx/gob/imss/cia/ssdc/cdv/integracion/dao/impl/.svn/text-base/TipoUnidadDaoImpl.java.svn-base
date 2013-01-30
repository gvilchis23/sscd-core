/**
 * Proyecto: IMSS  - SSDC
 *
 * Archivo: TipoUnidadDaoImpl.java
 *
 * Creado:  13/10/2011
 *
 * Derechos Reservados de copia (c) - INAP /
 *
 * Instituto Mexicano del Seguro Social - 2011
 */

package mx.gob.imss.cia.ssdc.cdv.integracion.dao.impl;

import mx.gob.imss.cia.ssdc.cdv.integracion.dao.TipoUnidadDao;
import mx.gob.imss.cia.ssdc.cdv.integracion.entity.TipoUnidadEntity;

import org.hibernate.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author Gamaliel
 * 
 */

@SuppressWarnings("unchecked")
@Repository("tipoUnidadDao")
public class TipoUnidadDaoImpl extends
        AbstractPersistenceDaoGenericHibernate<TipoUnidadEntity, Long>
        implements TipoUnidadDao {

	@Autowired
	public TipoUnidadDaoImpl(HibernateTemplate hibernateTemplate) {
		super(hibernateTemplate);
	}

	@Override
	@Transactional(readOnly = true)
	public java.util.List<TipoUnidadEntity> filtrarTipoPorStatus(int status) {
		return getHibernateTemplate().find(
		        "from TipoUnidadEntity t where t.status = ?", status);
	};

	@Override
	@Transactional(readOnly = true)
	public TipoUnidadEntity llenarComboTipoUnidadById(Long cveTipoUnidad) {

		String sql = "from TipoUnidadEntity t where "
		        + "t.cveTipoUnidad = :cveTipoUnidad and t.status = 1";

		Query query = getSession().createQuery(sql);
		query.setLong("cveTipoUnidad", cveTipoUnidad);

		return (TipoUnidadEntity) query.uniqueResult();

	}

}
