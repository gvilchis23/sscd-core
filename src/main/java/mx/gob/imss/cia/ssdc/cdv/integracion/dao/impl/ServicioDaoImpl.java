/**
 * Proyecto: IMSS  - SSDC
 *
 * Archivo: ServicioDaoImpl.java
 *
 * Creado:  13/10/2011
 *
 * Derechos Reservados de copia (c) - INAP /
 *
 * Instituto Mexicano del Seguro Social - 2011
 */

package mx.gob.imss.cia.ssdc.cdv.integracion.dao.impl;

import java.util.List;

import mx.gob.imss.cia.ssdc.cdv.integracion.dao.ServicioDao;
import mx.gob.imss.cia.ssdc.cdv.integracion.entity.ServicioEntity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author Gamaliel
 * 
 */
@SuppressWarnings("unchecked")
@Repository("servicioDao")
public class ServicioDaoImpl extends
        AbstractPersistenceDaoGenericHibernate<ServicioEntity, Long> implements
        ServicioDao {

	@Autowired
	public ServicioDaoImpl(HibernateTemplate hibernateTemplate) {
		super(hibernateTemplate);
	}

	@Override
	@Transactional(readOnly = true)
	public List<ServicioEntity> filtrarServicioPorCategoriaYStatus(
	        Long cveCategoria, int status) {
		return getHibernateTemplate()
		        .find("from ServicioEntity s "
		                + "where s.categoria.cveCategoria = ? and s.status = ?",
		                new Object[] { cveCategoria, status });
	}

}
