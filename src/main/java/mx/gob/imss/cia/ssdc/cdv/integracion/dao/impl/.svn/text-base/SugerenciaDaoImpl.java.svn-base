/**
 * Proyecto: IMSS  - SSDC
 *
 * Archivo: SugerenciaDaoImpl.java
 *
 * Creado:  Oct 18, 2011
 *
 * Derechos Reservados de copia (c) - INAP /
 *
 * Instituto Mexicano del Seguro Social - 2011
 */
package mx.gob.imss.cia.ssdc.cdv.integracion.dao.impl;

import mx.gob.imss.cia.ssdc.cdv.integracion.dao.SugerenciaDao;
import mx.gob.imss.cia.ssdc.cdv.integracion.entity.SugerenciaEntity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

/**
 * @author propietario
 *
 */

@SuppressWarnings("unchecked")
@Repository("sugerenciaDao")
public class SugerenciaDaoImpl extends
AbstractPersistenceDaoGenericHibernate<SugerenciaEntity, Long>
implements  SugerenciaDao  {

	@Autowired
	public SugerenciaDaoImpl(HibernateTemplate hibernateTemplate) {
		super(hibernateTemplate);
	}

}
