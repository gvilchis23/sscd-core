/**
 * Proyecto: IMSS  - SSDC
 *
 * Archivo: CategoriaProblematicaDaoImpl.java
 *
 * Creado: 17/10/2011
 *
 * Derechos Reservados de copia (c) - INAP /
 *
 * Instituto Mexicano del Seguro Social - 2011
 */

package mx.gob.imss.cia.ssdc.cdv.integracion.dao.impl;

import mx.gob.imss.cia.ssdc.cdv.integracion.dao.CategoriaProblematicaDao;
import mx.gob.imss.cia.ssdc.cdv.integracion.entity.CategoriaProblematicaEntity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

/**
 * 
 * @author Equipo de Desarrollo
 * 
 */
@SuppressWarnings("unchecked")
@Repository("categoriaProblematicaDao")
public class CategoriaProblematicaDaoImpl
		extends
		AbstractPersistenceDaoGenericHibernate<CategoriaProblematicaEntity, Long>
		implements CategoriaProblematicaDao {

	@Autowired
	public CategoriaProblematicaDaoImpl(HibernateTemplate hibernateTemplate) {
		super(hibernateTemplate);
	}

}
