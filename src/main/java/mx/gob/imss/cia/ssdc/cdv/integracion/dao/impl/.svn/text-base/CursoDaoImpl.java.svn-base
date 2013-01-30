/**
 * Proyecto: IMSS  - SSDC
 *
 * Archivo: CursoDaoImpl.java
 *
 * Creado: 19/10/2011
 *
 * Derechos Reservados de copia (c) - INAP /
 *
 * Instituto Mexicano del Seguro Social - 2011
 */

package mx.gob.imss.cia.ssdc.cdv.integracion.dao.impl;

import mx.gob.imss.cia.ssdc.cdv.integracion.dao.CursoDao;
import mx.gob.imss.cia.ssdc.cdv.integracion.entity.CursoEntity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

/**
 * 
 * @author Equipo de Desarrollo
 * 
 */
@SuppressWarnings("unchecked")
@Repository("cursoDao")
public class CursoDaoImpl extends
        AbstractPersistenceDaoGenericHibernate<CursoEntity, Long> implements
        CursoDao {

	@Autowired
	public CursoDaoImpl(HibernateTemplate hibernateTemplate) {
		super(hibernateTemplate);
	}

}
