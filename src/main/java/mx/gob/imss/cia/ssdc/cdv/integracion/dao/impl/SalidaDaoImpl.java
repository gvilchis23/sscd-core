/**
 * Proyecto: IMSS  - SSDC
 *
 * Archivo: SalidaDaoImpl.java
 *
 * Creado:  Oct 18, 2011
 *
 * Derechos Reservados de copia (c) - INAP /
 *
 * Instituto Mexicano del Seguro Social - 2011
 */
package mx.gob.imss.cia.ssdc.cdv.integracion.dao.impl;

import mx.gob.imss.cia.ssdc.cdv.integracion.dao.SalidaDao;
import mx.gob.imss.cia.ssdc.cdv.integracion.entity.SalidaEntity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

/**
 * @author propietario
 *
 */

@SuppressWarnings("unchecked")
@Repository("salidaDao")
public class SalidaDaoImpl  extends
AbstractPersistenceDaoGenericHibernate<SalidaEntity, Long>
implements  SalidaDao  {

	@Autowired
	public SalidaDaoImpl(HibernateTemplate hibernateTemplate) {
		super(hibernateTemplate);
	}

}
