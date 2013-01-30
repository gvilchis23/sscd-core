/**
 * Proyecto: IMSS  - SSDC
 *
 * Archivo: NecCualitativasDaoImpl.java
 *
 * Creado:  Oct 18, 2011
 *
 * Derechos Reservados de copia (c) - INAP /
 *
 * Instituto Mexicano del Seguro Social - 2011
 */
package mx.gob.imss.cia.ssdc.cdv.integracion.dao.impl;

import mx.gob.imss.cia.ssdc.cdv.integracion.dao.NecCualitativasDao;
import mx.gob.imss.cia.ssdc.cdv.integracion.entity.NecCualitativasEntity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

/**
 * @author propietario
 *
 */
@SuppressWarnings("unchecked")
@Repository("necCualitativasDao")
public class NecCualitativasDaoImpl extends
AbstractPersistenceDaoGenericHibernate<NecCualitativasEntity, Long>
implements  NecCualitativasDao {

	@Autowired
	public NecCualitativasDaoImpl(HibernateTemplate hibernateTemplate) {
		super(hibernateTemplate);
	}

}
