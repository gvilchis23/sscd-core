/**
 * Proyecto: IMSS  - SSDC
 *
 * Archivo: PersistenceDao.java
 *
 * Creado:  12/10/2011
 *
 * Derechos Reservados de copia (c) - INAP /
 *
 * Instituto Mexicano del Seguro Social - 2011
 */

package mx.gob.imss.cia.ssdc.cdv.integracion.dao;

import java.io.Serializable;
import java.util.List;

/**
 * @author Equipo de Desarrolllo
 * @param <T>
 * @param <PK>
 *            Una interface generica para los DAO's
 */
public interface PersistenceDao<T, PK extends Serializable> {
    /**
     * Persiste una nueva instancia en la base de datos.
     * 
     * @param newInstance
     * @return
     */
    void create(T newInstance);
    
    /**
     * 
     */
    void saverOrUpdate(T newInstance);

    /**
     * Recupera un objeto usando el id indicado como llave primaria.
     * 
     * @param id
     * @return
     */
    T read(PK id);

    /**
     * Guarda los cambios hechos al objeto persistente.
     * 
     * @param transientObject
     */
    void update(T transientObject);

    /**
     * Remueve el objeto de la base de datos.
     * 
     * @param persistentObject
     */
    void delete(T persistentObject);

    /**
     * @return
     */
    List<T> findAll();
}