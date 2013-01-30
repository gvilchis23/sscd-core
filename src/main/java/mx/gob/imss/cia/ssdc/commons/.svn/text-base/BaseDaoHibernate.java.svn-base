/**
 * Proyecto: IMSS  - SSDC
 *
 * Archivo: BaseDaoHibernate.java
 *
 * Creado:  13/10/2011
 *
 * Derechos Reservados de copia (c) - INAP /
 *
 * Instituto Mexicano del Seguro Social - 2011
 */

package mx.gob.imss.cia.ssdc.commons;

import java.io.Serializable;
import java.util.List;

import org.springframework.orm.ObjectRetrievalFailureException;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * @author Guillermo Vilchis Gonzalez
 * 
 */
public class BaseDaoHibernate extends HibernateDaoSupport implements Dao {

	/*
	 * (non-Javadoc)
	 * 
	 * @see SSDC.persistence.dao.Dao#getObject(java.lang.Class,
	 * java.io.Serializable)
	 */
	public Object getObject(Class<Object> clazz, Serializable id) {
		Object object = getHibernateTemplate().get(clazz, id);
		if (object == null) {
			throw new ObjectRetrievalFailureException(clazz, id);
		}
		return object;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see SSDC.persistence.dao.Dao#getObjects(java.lang.Class)
	 */
	public List<Object> getObjects(Class<Object> clazz) {
		return getHibernateTemplate().loadAll(clazz);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see SSDC.persistence.dao.Dao#removeObject(java.lang.Class,
	 * java.io.Serializable)
	 */
	public void removeObject(Class clazz, Serializable id) {
		getHibernateTemplate().delete(getObject(clazz, id));

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see SSDC.persistence.dao.Dao#saveObject(java.lang.Object)
	 */
	public void saveObject(Object object) {
		getHibernateTemplate().saveOrUpdate(object);

	}

}
