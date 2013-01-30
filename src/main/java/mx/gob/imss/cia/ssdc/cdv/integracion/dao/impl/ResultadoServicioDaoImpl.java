/**
 * Proyecto: IMSS  - SSDC
 *
 * Archivo: ResultadoServicioDaoImpl.java
 *
 * Creado:  13/10/2011
 *
 * Derechos Reservados de copia (c) - INAP /
 *
 * Instituto Mexicano del Seguro Social - 2011
 */

package mx.gob.imss.cia.ssdc.cdv.integracion.dao.impl;

import java.util.List;

import mx.gob.imss.cia.ssdc.cdv.integracion.dao.ResultadoServicioDao;
import mx.gob.imss.cia.ssdc.cdv.integracion.entity.ResultadoServicioEntity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author Gamaliel
 * 
 */
@SuppressWarnings("unchecked")
@Repository("resultadoServicioDao")
public class ResultadoServicioDaoImpl extends
        AbstractPersistenceDaoGenericHibernate<ResultadoServicioEntity, Long>
        implements ResultadoServicioDao {

	@Autowired
	public ResultadoServicioDaoImpl(HibernateTemplate hibernateTemplate) {
		super(hibernateTemplate);
	}

	@Override
	@Transactional(readOnly = true)
	public List<ResultadoServicioEntity> filtrarResultadoServicioPorVentanillaYStatus(
	        Long tipoVentanilla, int status) {
		return getHibernateTemplate()
		        .find("from ResultadoServicioEntity r where r." +
		        		"tipoVentanilla.cveTipoVentanilla = ? and r.status = ?",
		        		new Object[] { tipoVentanilla, status });
	}

}
