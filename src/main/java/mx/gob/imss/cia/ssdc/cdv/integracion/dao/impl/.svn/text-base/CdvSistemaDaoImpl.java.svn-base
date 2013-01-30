/**
 * Proyecto: IMSS  - SSDC
 *
 * Archivo: CdvSistemaDaoImpl.java
 *
 * Creado: 19/10/2011
 *
 * Derechos Reservados de copia (c) - INAP /
 *
 * Instituto Mexicano del Seguro Social - 2011
 */

package mx.gob.imss.cia.ssdc.cdv.integracion.dao.impl;

import mx.gob.imss.cia.ssdc.cdv.integracion.dao.CdvSistemaDao;
import mx.gob.imss.cia.ssdc.cdv.integracion.entity.CdvSistemaEntity;
import mx.gob.imss.cia.ssdc.cdv.integracion.entity.LlaveCompCdvSistema;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

/**
 * 
 * @author Equipo de Desarrollo
 * 
 */
@SuppressWarnings("unchecked")
@Repository("cdvSistemaDao")
public class CdvSistemaDaoImpl
        extends
        AbstractPersistenceDaoGenericHibernate<CdvSistemaEntity, LlaveCompCdvSistema>
        implements CdvSistemaDao {

	@Autowired
	public CdvSistemaDaoImpl(HibernateTemplate hibernateTemplate) {
		super(hibernateTemplate);
	}

}
