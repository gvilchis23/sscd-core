/**
 * Proyecto: IMSS  - SSDC
 *
 * Archivo: BusquedaService.java
 *
 * Creado:  Oct 27, 2011
 *
 * Derechos Reservados de copia (c) - INAP /
 *
 * Instituto Mexicano del Seguro Social - 2011
 */
package mx.gob.imss.cia.ssdc.cdv.servicios;

import java.util.List;

import mx.gob.imss.cia.ssdc.cdv.vo.AnyoVo;
import mx.gob.imss.cia.ssdc.cdv.vo.DelegacionVo;
import mx.gob.imss.cia.ssdc.cdv.vo.EstatusVo;
import mx.gob.imss.cia.ssdc.cdv.vo.MesVo;
import mx.gob.imss.cia.ssdc.cdv.vo.TipoInformeVo;
import mx.gob.imss.cia.ssdc.cdv.vo.TipoRegistroVo;
import mx.gob.imss.cia.ssdc.cdv.vo.TipoVentanillaVo;
import mx.gob.imss.cia.ssdc.cdv.vo.TurnoVo;
import mx.gob.imss.cia.ssdc.cdv.vo.UnidadVo;

/**
 * @author abySavvy
 * 
 */
public interface BusquedaService {

	/**
	 * Regresa la lista de todas las delegaciones existentes en la BD. En base a
	 * DelegacionVO que tendra unicamente el Id, y el Nombre de la Delegacion a
	 * mostrar en el combo.
	 * 
	 * @return List<DelegacionVO>
	 */
	List<DelegacionVo> obtieneListadoDelegacion();

	/**
	 * Regresa la lista de todas las unidades existentes en la BD. En base a
	 * UnidadVO que tendra unicamente el Id, y el Nombre de la Unidad a mostrar
	 * en el combo.
	 * 
	 * @return List<UnidadVO>
	 */
	List<UnidadVo> obtieneListadoUnidad();

	/**
	 * Regresa la lista de los tipos de registros existentes para el panel
	 * Administrador (CDV y PAAV).
	 * 
	 * @return List<TipoVO>
	 */
	List<TipoRegistroVo> obtieneListadoTipo();

	/**
	 * Regresa la lista de todas los meses en el a&ntilde;o para poder filtrar
	 * los registros.
	 * 
	 * @return List<MesVO>
	 */
	List<MesVo> obtieneListadoMes();

	/**
	 * Regresa la lista de todos los anios de los registros en el sistema para
	 * poder filtrar los registros. conteniendo en la lista,el año del primer
	 * registro hasta el a&ntilde;o actual
	 * 
	 * @return List<AnioVO>
	 */
	List<AnyoVo> obtieneListadoAnyo();

	/**
	 * Regresa la lista de todos los estatus de los registros en el sistema para
	 * poder filtrar los registros. que tendra unicamente el Id, y el Nombre de
	 * los estatus a mostrar en el combo. (Pendiente y Listo) esta tabla
	 * (cdc_estatus_cdv) es un requerimiento nuevo para la base de datos, por
	 * tanto, no existe a&ntilde;o el catalogo
	 * 
	 * @return List<EstatusVO>
	 */
	List<EstatusVo> obtieneListadoEstatus();

	/**
	 * Regresa la lista de todos los turnos del sistema para poder filtrar los
	 * registros. que tendra unicamente el Id, y el Nombre del turno a mostrar
	 * en el combo. (Matutino , Vespertino) esta tabla (CDC_TURNO)
	 * 
	 * @return List<TurnoVO>
	 */
	List<TurnoVo> obtieneListadoTurno();

	/**
	 * Regresa la lista de todos los tipos de ventanilla del sistema para poder
	 * filtrar los registros. que tendra unicamente el Id, y el tipo de
	 * ventanilla a mostrar en el combo. (Farmacia, Afliciacion, etc) esta en la
	 * tabla (cdc_tipo_ventanilla)
	 * 
	 * @return List<TipoVentanillaVO>
	 */
	List<TipoVentanillaVo> obtieneListadoTipoVentanilla();

	/**
	 * Regresa la lista de todos los tipos de informe del sistema para poder
	 * filtrar los registros. que tendra unicamente el Id, y el tipo de informe
	 * a mostrar en el combo. (Ejecutivo, Delegacional, etc) esta tabla no
	 * existe seria un nuevo requerimiento.
	 * 
	 * @return List<TipoVentanillaVO>
	 */
	List<TipoInformeVo> obtieneListadoTipoInforme();

	/**
	 * Regresa la lista de estatus que correspondan a la clave del tipo de
	 * registro para poder filtrar los registros. que tendra unicamente el Id, y
	 * el estatus a mostrar en el combo. (Terminado, En Proceso, etc) esta tabla
	 * no existe seria un nuevo requerimiento.
	 * 
	 * @return List<EstatusVO>
	 */
	List<EstatusVo> obtieneListadoEstatusPorTipoRegistro(Long idTipoRegistro);

}
