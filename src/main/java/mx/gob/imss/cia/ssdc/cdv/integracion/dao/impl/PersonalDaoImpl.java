/**
 * Proyecto: IMSS  - SSDC
 *
 * Archivo: PersonalDaoImpl.java
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

import mx.gob.imss.cia.ssdc.cdv.integracion.dao.PersonalDao;
import mx.gob.imss.cia.ssdc.cdv.integracion.entity.PersonalEntity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

/**
 * @author Gamaliel
 * 
 */
@SuppressWarnings("unchecked")
@Repository("personalDao")
public class PersonalDaoImpl extends
		AbstractPersistenceDaoGenericHibernate<PersonalEntity, Long> implements
		PersonalDao {

	@Autowired
	public PersonalDaoImpl(HibernateTemplate hibernateTemplate) {
		super(hibernateTemplate);
	}

	@Override
	public PersonalEntity recuperarUsuario(String usuario) {
		List<PersonalEntity> lista = (ArrayList<PersonalEntity>) getHibernateTemplate()
        .find("from PersonalEntity p where p.nombreUsuario like ?", usuario);
		
		PersonalEntity persona=null;
		for(PersonalEntity p:lista){
			persona=p;
		}
		return persona;
	}

}
