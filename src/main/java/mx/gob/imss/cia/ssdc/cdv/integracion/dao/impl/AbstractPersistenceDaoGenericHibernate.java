/**
 * Proyecto: IMSS  - SSDC
 *
 * Archivo: AbstractPersistenceDaoGenericHibernate.java
 *
 * Creado:  13/10/2011
 *
 * Derechos Reservados de copia (c) - INAP /
 *
 * Instituto Mexicano del Seguro Social - 2011
 */

package mx.gob.imss.cia.ssdc.cdv.integracion.dao.impl;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.util.List;

import mx.gob.imss.cia.ssdc.cdv.integracion.dao.PersistenceDao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author Equipo de Desarrolllo
 * @param <T>
 * @param <PK>
 *            La implementacion en clase abstracta para todas las operaciones de
 *            los DAO's Con esto permitimos a cualquier DAO que herede de esta
 *            clase que tenga listos los metodos del CRUD (Create, Read, Update
 *            and Delete)
 */
@SuppressWarnings({ "unchecked", "rawtypes" })
@Repository
public class AbstractPersistenceDaoGenericHibernate<T, PK extends Serializable>
		extends HibernateDaoSupport implements PersistenceDao<T, PK> {

	private Class<T> type = null;

	@Autowired
	public AbstractPersistenceDaoGenericHibernate(
			HibernateTemplate hibernateTemplate) {
		super.setHibernateTemplate(hibernateTemplate);
	}

	@Transactional
	public void create(T newInstance) {
		this.getHibernateTemplate().save(newInstance);
	}

	@Transactional
	public void saverOrUpdate(T instance) {
		this.getHibernateTemplate().saveOrUpdate(instance);
	}

	@Transactional
	public void delete(T persistentObject) {
		this.getHibernateTemplate().delete(persistentObject);
	}

	@Transactional(readOnly = true)
	public List findAll() {
		return this.getHibernateTemplate().loadAll(getType());
	}

	/**
	 * Obtiene por reflexion el tipo del DomainObject que usa este DAO
	 * 
	 * @return the type
	 */
	public Class<T> getType() {
		if (type == null) {
			Class clazz = getClass();

			while (!(clazz.getGenericSuperclass() instanceof ParameterizedType)) {
				clazz = clazz.getSuperclass();
			}

			type = (Class<T>) ((ParameterizedType) clazz.getGenericSuperclass())
					.getActualTypeArguments()[0];
		}

		return type;
	}

	@Transactional(readOnly = true)
	public T read(PK id) {
		return (T) this.getHibernateTemplate().get(getType(), id);
	}

	@Transactional
	public void update(T transientObject) {
		this.getHibernateTemplate().update(transientObject);
	}

}