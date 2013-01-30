/**
 * Proyecto: IMSS  - SSDC
 *
 * Archivo: VentanillaAnteriorDaoImpl.java
 *
 * Creado:  13/10/2011
 *
 * Derechos Reservados de copia (c) - INAP /
 *
 * Instituto Mexicano del Seguro Social - 2011
 */

package mx.gob.imss.cia.ssdc.cdv.integracion.dao.impl;

import java.util.List;

import mx.gob.imss.cia.ssdc.cdv.integracion.dao.VentanillaAnteriorDao;
import mx.gob.imss.cia.ssdc.cdv.integracion.entity.VentanillaAnteriorEntity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@SuppressWarnings("unchecked")
@Repository("ventanillaAnteriorDao")
public class VentanillaAnteriorDaoImpl extends
        AbstractPersistenceDaoGenericHibernate<VentanillaAnteriorEntity, Long>
        implements VentanillaAnteriorDao {

	@Autowired
	public VentanillaAnteriorDaoImpl(HibernateTemplate hibernateTemplate) {
		super(hibernateTemplate);
	}

	@Override
	@Transactional(readOnly = true)
	public List<VentanillaAnteriorEntity> filtrarVentaAnteriorPorTipoYStatus(
	        Long tipoVentanilla, int status) {
		return getHibernateTemplate()
		        .find("from VentanillaAnteriorEntity v where v." +
		        		"tipoVentanilla.cveTipoVentanilla = ? and v.status = ?",
		        		new Object[] { tipoVentanilla, status });
	}

}
