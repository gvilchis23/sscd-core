/**
 * Proyecto: IMSS  - SSDC
 *
 * Archivo: PersonalRelPerfilDaoImpl.java
 *
 * Creado:  Oct 18, 2011
 *
 * Derechos Reservados de copia (c) - INAP /
 *
 * Instituto Mexicano del Seguro Social - 2011
 */
package mx.gob.imss.cia.ssdc.cdv.integracion.dao.impl;

import java.util.ArrayList;
import java.util.List;

import mx.gob.imss.cia.ssdc.cdv.integracion.dao.PersonalRelPerfilDao;
import mx.gob.imss.cia.ssdc.cdv.integracion.entity.LlaveCompuestaUsuarios;
import mx.gob.imss.cia.ssdc.cdv.integracion.entity.PersonalRelPerfilEntity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

/**
 * @author propietario
 *
 */
@SuppressWarnings("unchecked")
@Repository("personalRelPerfilDao")
public class PersonalRelPerfilDaoImpl extends
AbstractPersistenceDaoGenericHibernate<PersonalRelPerfilEntity, LlaveCompuestaUsuarios>
implements  PersonalRelPerfilDao{

	@Autowired
	public PersonalRelPerfilDaoImpl(HibernateTemplate hibernateTemplate) {
		super(hibernateTemplate);
	}

	@Override
	public PersonalRelPerfilEntity recuperarPersonal(Long cvePersonal) {
		List<PersonalRelPerfilEntity> lista = (ArrayList<PersonalRelPerfilEntity>) getHibernateTemplate()
        .find("from PersonalRelPerfilEntity m where m.llaveCompuesta.personal.cvePersonal=?",cvePersonal);
		PersonalRelPerfilEntity persona=null;
		for(PersonalRelPerfilEntity p:lista){
			persona=p;
		}
		return persona;
	}

}
