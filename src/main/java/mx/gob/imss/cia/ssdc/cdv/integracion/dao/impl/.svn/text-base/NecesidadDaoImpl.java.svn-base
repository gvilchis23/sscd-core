/**
 * Proyecto: IMSS  - SSDC
 *
 * Archivo: NecesidadDaoImpl.java
 *
 * Creado:  Oct 18, 2011
 *
 * Derechos Reservados de copia (c) - INAP /
 *
 * Instituto Mexicano del Seguro Social - 2011
 */
package mx.gob.imss.cia.ssdc.cdv.integracion.dao.impl;

import mx.gob.imss.cia.ssdc.cdv.integracion.dao.NecesidadDao;
import mx.gob.imss.cia.ssdc.cdv.integracion.entity.NecesidadEntity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

/**
 * @author propietario
 *
 */
@SuppressWarnings("unchecked")
@Repository("necesidadDao")
public class NecesidadDaoImpl extends
AbstractPersistenceDaoGenericHibernate<NecesidadEntity, Long>
implements  NecesidadDao   {

	@Autowired
	public NecesidadDaoImpl(HibernateTemplate hibernateTemplate) {
		super(hibernateTemplate);
	}

}
