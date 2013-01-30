/**
 * Proyecto: IMSS  - SSDC
 *
 * Archivo: DlgService.java
 *
 * Creado:  27/10/2011
 *
 * Derechos Reservados de copia (c) - INAP /
 *
 * Instituto Mexicano del Seguro Social - 2011
 */

package mx.gob.imss.cia.ssdc.cdv.servicios;

import java.util.Date;
import java.util.List;

import mx.gob.imss.cia.ssdc.cdv.vo.CdvDatoGeneralVo;
import mx.gob.imss.cia.ssdc.cdv.vo.RegistroCdvPaavVo;

public interface DlgService extends PanelService {

	/**
	 * Obtiene la informacion elemental de la CDV con la que se este trabajando
	 * @param cveCdv
	 * @return
	 */
	CdvDatoGeneralVo obtenerDetalleCdv(Long cveCdv);	
	
   /**
    * Permite buscar todas las registros sea por tipo (CDV,PAAV), por mes o no,
    * por anio o no y por estatus o no. Si los parametros vienen con valor cero
    * significa que no filtrara la búsqueda por este y obtendrá todos los registros.
	 * Solo se podrá obtener CDV’s en estado PENDIENTE y LISTO.
    * @param tipo
    * @param mes
    * @param anyo
    * @param estatus
    * @return
    */
	//CONSIDERAR MANEJAR Vo para el manejo a partir de 4 parametros
    List<RegistroCdvPaavVo> obtenListadoRegistroCdvPaav(Integer tipo, Integer mes,
            Integer anyo, Integer estatus, Integer unidad);
    
    /**
     * Permite verificar si se autoriza realizar cambios a una CDV
     * Se verifica basicamente si el estatus que tiene antes de
     * realizar la autorizacion es igual a "Listo"
     * @param tipoTransaccion
     * @return
     */
    //TODO: REVISAR UTILIZACION DE ESTA OPERACION POR EL CONTROLLER.
    @Deprecated
    boolean autorizarTransaccion(Long cveCdv, int tipoTransaccion);
    
  /**
   *Cambia el estatus de la CDV. De Listo a Pendiente
   * @param cveCdv
   * @return
   */
    @Deprecated
    //TODO: REVISAR UTILIZACION DE ESTA OPERACION POR EL CONTROLLER Y CAMBIAR A VOID
    boolean autorizarCambiosCdv(Long cveCdv);
   
   
   /**
    * Guarda en BD la razon y la fecha limite para autorizar cambios. Esta tabla aún no se encuentra en la BD
    * se realizo la petición para que se reaalice esta modificación. 
    * Se valida la accion de autorizar cambios desde el estatus mostrado en la vista, donde el estatus valido
    * para autorizar cambios debe ser "Listo" 
    * @param cveCdv
    * @param razon
    * @param fechaLimite
    */
   void guardarAutorizacionCambios(Long cveCdv, String razon, Date fechaLimite);

}