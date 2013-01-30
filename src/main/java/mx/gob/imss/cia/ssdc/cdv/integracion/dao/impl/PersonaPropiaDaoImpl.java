/**
 * Proyecto: IMSS  - SSDC
 *
 * Archivo: PersonaPropiaDaoImpl.java
 *
 * Creado:  13/10/2011
 *
 * Derechos Reservados de copia (c) - INAP /
 *
 * Instituto Mexicano del Seguro Social - 2011
 */

package mx.gob.imss.cia.ssdc.cdv.integracion.dao.impl;

import java.util.ArrayList;
import java.util.List;

import mx.gob.imss.cia.ssdc.cdv.integracion.dao.PersonaPropiaDao;
import mx.gob.imss.cia.ssdc.cdv.integracion.entity.PersonaPropiaEntity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@SuppressWarnings("unchecked")
@Repository("personaPropiaDao")
public class PersonaPropiaDaoImpl extends
		AbstractPersistenceDaoGenericHibernate<PersonaPropiaEntity, Long>
		implements PersonaPropiaDao {

	@Autowired
	public PersonaPropiaDaoImpl(HibernateTemplate hibernateTemplate) {
		super(hibernateTemplate);
	}
	
	@Override
	@Transactional(readOnly = true)
	public PersonaPropiaEntity llenarPersonaInfo() {
		PersonaPropiaEntity personaE=null;
		List<PersonaPropiaEntity>lista=(ArrayList<PersonaPropiaEntity>)getHibernateTemplate().find("from PersonaPropiaEntity p where p.status=1");
		for(PersonaPropiaEntity persona:lista){
			personaE=persona;
		}
		return personaE;
	}
	
	
}
