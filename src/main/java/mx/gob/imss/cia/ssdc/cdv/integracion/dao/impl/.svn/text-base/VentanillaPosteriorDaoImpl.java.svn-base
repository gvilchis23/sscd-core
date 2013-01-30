/**
 * Proyecto: IMSS  - SSDC
 *
 * Archivo: VentanillaPosteriorDaoImpl.java
 *
 * Creado:  13/10/2011
 *
 * Derechos Reservados de copia (c) - INAP /
 *
 * Instituto Mexicano del Seguro Social - 2011
 */

package mx.gob.imss.cia.ssdc.cdv.integracion.dao.impl;

import java.util.List;

import mx.gob.imss.cia.ssdc.cdv.integracion.dao.VentanillaPosteriorDao;
import mx.gob.imss.cia.ssdc.cdv.integracion.entity.VentanillaPosteriorEntity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author propietario
 * 
 */

@SuppressWarnings("unchecked")
@Repository("ventanillaPosteriorDao")
public class VentanillaPosteriorDaoImpl extends
        AbstractPersistenceDaoGenericHibernate<VentanillaPosteriorEntity, Long>
        implements VentanillaPosteriorDao {

	@Autowired
	public VentanillaPosteriorDaoImpl(HibernateTemplate hibernateTemplate) {
		super(hibernateTemplate);
	}

	@Override
	@Transactional(readOnly = true)
	public List<VentanillaPosteriorEntity> filtrarVentaPostPorTipoYStatus(
	        Long tipoVentanilla, int status) {
		return getHibernateTemplate()
		        .find("from VentanillaPosteriorEntity v where v." +
		        		"tipoVentanilla.cveTipoVentanilla = ? and v.status = ?",
		                new Object[] { tipoVentanilla, status });
	}
}
