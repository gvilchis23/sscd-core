/**
 * Proyecto: IMSS  - SSDC
 *
 * Archivo: PadService.java
 *
 * Creado:  13/10/2011
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

/**
 * Servicio responsable de administrar todo lo relacionado al Panel de Administrador
 * con los registros de la CDV. Se encarga de registrar las actualizaciones de
 * cambios de los CDVs y avisar de estos a las areas correspondientes, modificar
 * las plantillas para las notificaciones.
 *
 * @author Equipo de Desarrollo
 *
 */
public interface PadService extends PanelService {

    /**
     * Permite buscar todos los registros sea por tipo (CDV), por mes o no,
     * por anio o no, por estatus o no, por unidad o no, por delegacion o no. Si
     * los parametros vienen con valor cero significa que no filtrara la
     * busqueda por este y obtendra todos los registros. Solo se podra obtener
     * CDVs en estado PENDIENTE y LISTO.
     *
     * @param tipo de cedula
     * @param mes mes
     * @param anyo anio
     * @param estatus de la cedula
     * @param unidad unidad delegacional
     * @param delegacion delegacion
     * @return Lista de RegistroCvdPaavVo
     */
	//CONSIDERAR MANEJAR Vo para el manejo a partir de 4 parametros
    List<RegistroCdvPaavVo> obtenListadoRegistroCdvPaav(int tipo, int mes,
            int anyo, int estatus, int unidad, int delegacion);

    /**
     * Permite obtener el detalle de datos generales de una CDV.
     *
     * @param cveCdv clave de cvd
     * @return CdvDatoGeneralVO
     */
    CdvDatoGeneralVo obtenerDetalleCdv(Long cveCdv);

    /**
     * Permite verificar si se autoriza realizar a una CDV una transaccion o
     * proceso en especifico(Actualizacion de cambios). Se verifica basicamente
     * si el estatus que tiene antes de realizar la transaccion es valido.
     * tipoTransaccion = 2 --> Act. de Cambios --> Estatus actual debe ser
     * "Listo". Solo se actualiza cambios a CDVs.
     *
     * @param cveCdv clave de cvd
     * @param tipoTransaccion tipo de transaccion o proceso a verificar
     * @return si tiene o no autorizacion
     */
    //TODO: REVISAR UTILIZACION DE ESTA OPERACION POR EL CONTROLLER.
    @Deprecated
    boolean autorizarTransaccion(Long cveCdv, int tipoTransaccion);

    /**
     * Permite registrar la autorizacion del cambio para que la ACT realize los
     * cambios en la CDV, para los cuales guarda la razon del cambio y la fecha
     * limite para este en la entidad de Act. de Cambios. La CDV cambia de
     * estatus "Listo" a "Pendiente" y se almacena la fecha y hora en la que se
     * autorizo los cambios. Despues del registro de la autorizacion se envia un
     * correo, el tipo de notificacion que se envia es: Notificacion del CCN
     * para autorizar cambios.
     * Se valida la accion de autorizar cambios desde el estatus mostrado en la vista, donde el estatus valido
    * para autorizar cambios debe ser "Listo" 
     *
     * @param cveCdv clave de cvd
     * @param razon de la act. de cambio
     * @param fechaLimite para hacer el cambio
     */
    void guardarAutorizacionCambios(Long cveCdv,
                     String razon, Date fechaLimite);

    /** ---Falta la elaboracion de la entity de tipo Notificacion -- **/
    /** ---Metodo potencialmente removido a un servicio comun de listas-- **/
    /**
     * Permite obtener un listado de tipos de notificacion.
     *
     * @return lista de TipoNotificacionEntity
     */
    // List<TipoNotificacionEntity> obtenerListadoTipoNotificacion();

    /** ---Falta la elaboracion de la entity de tipo Notificacion --- **/
    /**
     * Permite obtener los datos de un tipo de notificacion.
     *
     * @param cveTipoNotificacion clave del tipo de notificacion
     * @return la entidad de TipoNotificacionEntity
     */
    // TipoNotificacionEntity obtenerDetalleTipoNotificacion(
    //                           Long cveTipoNotificacion);

    /**
     * Permite actualizar el texto del cuerpo de la plantilla para un tipo de
     * notificacion en especifico que luego sera enviada via correo electronico.
     * Siempre sera una actualizacion en la entidad de Tipo de Notificacion,
     * por que ya estan precargados estos registros.
     *
     * @param cveTipoNotitificacion clave del tipo de notificacion
     * @param cuerpo o texto del tipo de notificacion
     */
    void guardarTipoNotificacion(Long cveTipoNotitificacion, String cuerpo);

}