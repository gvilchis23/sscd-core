/**
 * Proyecto: IMSS  - SSDC
 *
 * Archivo: NivelAtencionDaoImpl.java
 *
 * Creado:  Oct 18, 2011
 *
 * Derechos Reservados de copia (c) - INAP /
 *
 * Instituto Mexicano del Seguro Social - 2011
 */
package mx.gob.imss.cia.ssdc.cdv.integracion.dao.impl;

import mx.gob.imss.cia.ssdc.cdv.integracion.dao.NivelAtencionDao;
import mx.gob.imss.cia.ssdc.cdv.integracion.entity.NivelAtencionEntity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

/**
 * @author propietario
 *
 */

@SuppressWarnings("unchecked")
@Repository("nivelAtencionDao")
public class NivelAtencionDaoImpl  extends
AbstractPersistenceDaoGenericHibernate<NivelAtencionEntity, Long>
implements  NivelAtencionDao   {

	@Autowired
	public NivelAtencionDaoImpl(HibernateTemplate hibernateTemplate) {
		super(hibernateTemplate);
	}

}
