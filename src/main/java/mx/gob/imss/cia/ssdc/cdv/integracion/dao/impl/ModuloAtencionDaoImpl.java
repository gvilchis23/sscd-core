/**
 * Proyecto: IMSS  - SSDC
 *
 * Archivo: ModuloAtencionDaoImpl.java
 *
 * Creado:  Oct 18, 2011
 *
 * Derechos Reservados de copia (c) - INAP /
 *
 * Instituto Mexicano del Seguro Social - 2011
 */
package mx.gob.imss.cia.ssdc.cdv.integracion.dao.impl;

import mx.gob.imss.cia.ssdc.cdv.integracion.dao.ModuloAtencionDao;
import mx.gob.imss.cia.ssdc.cdv.integracion.entity.ModuloAtencionEntity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

/**
 * @author propietario
 *
 */
@SuppressWarnings("unchecked")
@Repository("moduloAtencionDao")
public class ModuloAtencionDaoImpl extends
AbstractPersistenceDaoGenericHibernate<ModuloAtencionEntity, Long>
implements  ModuloAtencionDao  {

	@Autowired
	public ModuloAtencionDaoImpl(HibernateTemplate hibernateTemplate) {
		super(hibernateTemplate);
	}

}
