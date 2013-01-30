/**
 * Proyecto: IMSS  - SSDC
 *
 * Archivo: NecCuantitativasDaoImpl.java
 *
 * Creado:  Oct 18, 2011
 *
 * Derechos Reservados de copia (c) - INAP /
 *
 * Instituto Mexicano del Seguro Social - 2011
 */
package mx.gob.imss.cia.ssdc.cdv.integracion.dao.impl;

import mx.gob.imss.cia.ssdc.cdv.integracion.dao.NecCuantitativasDao;
import mx.gob.imss.cia.ssdc.cdv.integracion.entity.NecCuantitativasEntity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

/**
 * @author propietario
 *
 */

@SuppressWarnings("unchecked")
@Repository("necCuantitativasDao")
public class NecCuantitativasDaoImpl  extends
AbstractPersistenceDaoGenericHibernate<NecCuantitativasEntity, Long>
implements  NecCuantitativasDao  {

	@Autowired
	public NecCuantitativasDaoImpl(HibernateTemplate hibernateTemplate) {
		super(hibernateTemplate);
	}

}
