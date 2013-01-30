/**
 * Proyecto: IMSS  - SSDC
 *
 * Archivo: SsdcCommon.java
 *
 * Creado: 28/10/2011
 *
 * Derechos Reservados de copia (c) - INAP /
 *
 * Instituto Mexicano del Seguro Social - 2011
 */

package mx.gob.imss.cia.ssdc.commons;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

import mx.gob.imss.cia.ssdc.cdv.integracion.entity.Entidad;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 
 * @author Equipo de Desarrollo
 * 
 */
public class SsdcCommon {

	public static final Logger LOG = LoggerFactory.getLogger(SsdcCommon.class);

	@SuppressWarnings("unchecked")
	public static <T extends Entidad, U extends Comparable<U>> U obtenerValores(
			T entity, Class<U> type) {
		Class<? extends Entidad> clazz = entity.getClass();
		Method[] methods = clazz.getDeclaredMethods();

		for (Method method : methods) {
			if (method.isAnnotationPresent(ResultadoDinamico.class)
					&& method.getGenericReturnType() == type) {
				try {
					return (U) method.invoke(entity);
				} catch (IllegalAccessException e) {
					LOG.error("IllegalAccessException {}", e);
				} catch (InvocationTargetException e) {
					LOG.error("InvocationTargetException {}", e);
				}
			}
		}
		return null;
	}

	public static <T, V> T parseoVO(V objeto, Class<T> classVo) {
		Object objetoVo = null;
		try {
			// parte donde se saca la informacion del Entity
			Field declaredFieldList[] = objeto.getClass().getDeclaredFields();
			List<String> arrayList = new ArrayList<String>();
			for (Field field : declaredFieldList) {
				arrayList.add(field.getName());
			}
			// parte donde se saca la informacion del VO
			objetoVo = classVo.newInstance();
			Field declaredFieldListVo[] = objetoVo.getClass().getDeclaredFields();
			List<String> arrayListVo = new ArrayList<String>();
			for (Field field : declaredFieldListVo) {
				arrayListVo.add(field.getName());
			}
			for (String campoVo : arrayListVo) {
				for (String campo : arrayList) {

					if (campoVo.equals(campo)) {
						String firstCharacter = campo.substring(0, 1)
								.toUpperCase();
						String firstCharacterVo = campoVo.substring(0, 1)
								.toUpperCase();
						String metodo = campo.substring(1);
						String metodoVo = campoVo.substring(1);
						metodo = firstCharacter + metodo;
						metodoVo = firstCharacterVo + metodoVo;
						metodo = "get" + metodo;
						metodoVo = "set" + metodoVo;
						Method mtd = objeto.getClass().getMethod(metodo);
						if (mtd.getReturnType().equals(Long.class)) {
							Long value = (Long) mtd.invoke(
									objeto, (Object[]) null);
							Method mtdVo = classVo.getMethod(metodoVo,
									Long.class);
							mtdVo.invoke(objetoVo, value);
						} else if (mtd.getReturnType().equals(String.class)) {
							String value = (String) mtd.invoke(
									objeto, (Object[]) null);
							Method mtdVo = classVo.getMethod(metodoVo,
									String.class);
							mtdVo.invoke(objetoVo, value);
						}

					}

				}
			}
		} catch (SecurityException e) {
			LOG.error(e.toString());
		} catch (NoSuchMethodException e) {
			LOG.error(e.toString());
		} catch (IllegalArgumentException e) {
			LOG.error(e.toString());
		} catch (InvocationTargetException e) {
			LOG.error(e.toString());
		}catch (InstantiationException e) {
			LOG.error(e.toString());
		} catch (IllegalAccessException e) {
			LOG.error(e.toString());
		}
		return (T) objetoVo;
	}

}
