/**
 * Proyecto: IMSS  - SSDC
 *
 * Archivo: ProcesoCargaDaoImpl.java
 *
 * Creado:  Oct 18, 2011
 *
 * Derechos Reservados de copia (c) - INAP /
 *
 * Instituto Mexicano del Seguro Social - 2011
 */
package mx.gob.imss.cia.ssdc.cdv.integracion.dao.impl;

import mx.gob.imss.cia.ssdc.cdv.integracion.dao.ProcesoCargaDao;
import mx.gob.imss.cia.ssdc.cdv.integracion.entity.ProcesoCargaEntity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

/**
 * @author propietario
 *
 */

@SuppressWarnings("unchecked")
@Repository("procesoCargaDao")
public class ProcesoCargaDaoImpl
extends AbstractPersistenceDaoGenericHibernate<ProcesoCargaEntity, Long>
implements   ProcesoCargaDao{

	@Autowired
	public ProcesoCargaDaoImpl(HibernateTemplate hibernateTemplate) {
		super(hibernateTemplate);
	}

}
