/**
 * Proyecto: IMSS  - SSDC
 *
 * Archivo: TipoVentanillaDaoImpl.java
 *
 * Creado:  13/10/2011
 *
 * Derechos Reservados de copia (c) - INAP /
 *
 * Instituto Mexicano del Seguro Social - 2011
 */

package mx.gob.imss.cia.ssdc.cdv.integracion.dao.impl;

import java.util.List;

import mx.gob.imss.cia.ssdc.cdv.integracion.dao.TipoVentanillaDao;
import mx.gob.imss.cia.ssdc.cdv.integracion.entity.TipoVentanillaEntity;
import mx.gob.imss.cia.ssdc.cdv.vo.TipoVentanillaVo;
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
@Repository("tipoVentanillaDao")
public class TipoVentanillaDaoImpl extends
        AbstractPersistenceDaoGenericHibernate<TipoVentanillaEntity, Long>
        implements TipoVentanillaDao {

	@Autowired
	public TipoVentanillaDaoImpl(HibernateTemplate hibernateTemplate) {
		super(hibernateTemplate);
	}

	@Override
	@Transactional(readOnly = true)
	public List<TipoVentanillaEntity> filtrarTipoVentanillaPorStatus(
			int status) {
		return getHibernateTemplate().find(
		        "from TipoVentanillaEntity v where v.status = ?", status);
	}	
	
	@Override
	public List<TipoVentanillaVo> obtenerListadoTipoVentanillaVo(int status) {
		return getSession()
				.getNamedQuery(QueriesNombrados.TIPO_VENTANILLA_FIND_ALL)
				.setInteger("estatus", status).list();
	}
}
