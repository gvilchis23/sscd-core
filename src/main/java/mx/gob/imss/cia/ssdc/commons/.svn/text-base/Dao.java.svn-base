/**
 * Proyecto: IMSS  - SSDC
 *
 * Archivo: Dao.java
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

/**
 * @author Guillermo Vilchis Gonzalez
 *
 */
public interface Dao {
	
	/**
	 * Obtiene una lista de objetos.
	 * @param clazz Objeto a persistir.
	 * @return lista de objetos.
	 */
	List<Object> getObjects(Class<Object> clazz);
	
	/**
	 * Obtiene un objeto en especifico.
	 * @param clazz Tipo de objeto solicitado.
	 * @param id Identoficador del objeto.
	 * @return Objeto lleno.
	 */
	Object getObject(Class<Object> clazz, Serializable id);
	
	/**
	 * Salva o actualiza un objeto.
	 * @param object Objeto a salvar o actualizar.
	 */
	void saveObject(Object object);
	
	/**
	 * Borra un objeto en espefico.
	 * @param clazz Tipo del objeto a borrar.
	 * @param id Identificador del Objeto.
	 */
	void removeObject(Class<Object> clazz, Serializable id);

}
