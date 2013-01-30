/**
 * Proyecto: IMSS  - SSDC
 *
 * Archivo: QueriesNombrados.java
 *
 * Creado: 04/11/2011
 *
 * Derechos Reservados de copia (c) - INAP /
 *
 * Instituto Mexicano del Seguro Social - 2011
 */

package mx.gob.imss.cia.ssdc.commons;

/**
 * 
 * @author Equipo de Desarrollo
 * 
 */
public interface QueriesNombrados {

	String DELEGACION_FIND_ALL = "nq1";

	String DELEGACION_FIND_ALL_QUERY = "SELECT new mx.gob.imss.cia.ssdc.cdv.vo.DelegacionVo(d.cveDelegacion, d.nombreDelegacion) FROM DelegacionEntity d where d.status = :status";

	String TURNO_FIND_ALL = "nq2";

	String TURNO_FIND_ALL_QUERY = "SELECT new mx.gob.imss.cia.ssdc.cdv.vo.TurnoVo(e.cveTurno, e.descripcionTurno) FROM TurnoEntity e where e.status = :estatus";

	String UNIDAD_FIND_ALL = "nq3";

	String UNIDAD_FIND_ALL_QUERY = "SELECT new mx.gob.imss.cia.ssdc.cdv.vo.UnidadVo(e.cveUnidad, e.nombreUnidad) FROM UnidadEntity e where e.status = :estatus";
	
	String TIPO_VENTANILLA_FIND_ALL = "nq4";

	String TIPO_VENTANILLA_FIND_ALL_QUERY = "SELECT new mx.gob.imss.cia.ssdc.cdv.vo.TipoVentanillaVo(e.cveTipoVentanilla, e.nombreTipoVentanilla) FROM TipoVentanillaEntity e where e.status = :estatus";

}