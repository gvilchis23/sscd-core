/**
 * Proyecto: IMSS  - SSDC
 *
 * Archivo: TipoProcesoCargaDaoImpl.java
 *
 * Creado:  Oct 18, 2011
 *
 * Derechos Reservados de copia (c) - INAP /
 *
 * Instituto Mexicano del Seguro Social - 2011
 */
package mx.gob.imss.cia.ssdc.cdv.integracion.dao.impl;

import mx.gob.imss.cia.ssdc.cdv.integracion.dao.TipoProcesoCargaDao;
import mx.gob.imss.cia.ssdc.cdv.integracion.entity.TipoProcesoCargaEntity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

/**
 * @author propietario
 *
 */

@SuppressWarnings("unchecked")
@Repository("tipoProcesoCargaDao")
public class TipoProcesoCargaDaoImpl  extends
AbstractPersistenceDaoGenericHibernate<TipoProcesoCargaEntity, Long>
implements  TipoProcesoCargaDao {

	@Autowired
	public TipoProcesoCargaDaoImpl(HibernateTemplate hibernateTemplate) {
		super(hibernateTemplate);
	}

}
