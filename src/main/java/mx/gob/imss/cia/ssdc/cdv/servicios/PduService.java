/**
 * Proyecto: IMSS  - SSDC
 *
 * Archivo: PduService.java
 *
 * Creado:  13/10/2011
 *
 * Derechos Reservados de copia (c) - INAP /
 *
 * Instituto Mexicano del Seguro Social - 2011
 */

package mx.gob.imss.cia.ssdc.cdv.servicios;

import java.util.List;

import mx.gob.imss.cia.ssdc.cdv.vo.ProcesoDeCargaVo;
import mx.gob.imss.cia.ssdc.cdv.vo.RegistroCdvPaavVo;

/**
 * Servicio responsable de administrar todo lo relacionado al Panel de Unidad
 * con los registros de la CDV. Se encarga de crear los CDVs, enviar el CDV
 * a revision con el CCN y eliminar un CDV.
 *
 * @author Equipo de desarrollo
 *
 */
public interface PduService extends PanelService {

    /**
     * Permite buscar todas las registros sea por tipo (CDV,PAAV), por mes o no,
     * por anio o no y por estatus o no. Si los parametros vienen con valor cero
     * significa que no filtrara la busqueda por este y obtendra todos los registros.
	 * Solo se podra obtener CDVs en estado PENDIENTE y LISTO.
	 *
     * @param tipo de cedula
     * @param mes mes
     * @param anyo anio
     * @param estatus de la cedula
     * @return lista de RegistroCdvPaavVo
     */
    List<RegistroCdvPaavVo> obtenListadoRegistroCdvPaav(int tipo, int mes,
            int anyo, int estatus);

     /**
     * Permite realizar la creacion de una CDV en su respectiva entidad para ello
     * necesita la delegacion, la unidad, el tipo de ventanilla y el turno.
     * Por defecto se guardara la fecha de creacion con la del sistema.
     * Al crear una CDV el estatus por default es PENDIENTE.
     *
     * @param cveDelegacion clave de delegacion
     * @param cveUnidad clave de unidad
     * @param cveTipoVentanilla clave de tipo de ventanilla
     * @param cveTurno clave de turno
     */
    void crearCdv(Long cveDelegacion, Long cveUnidad, Long cveTipoVentanilla,
            Long cveTurno);


    /**
     * Permite verificar si se autoriza realizar a una CDV una
     * transaccion o proceso en especifico(Enviar,Eliminar).
     * Se verifica basicamente si el estatus que tiene antes de
     * realizar la transaccion es valido.
     *   tipoTransaccion = 0--> Enviar CDV --> Estatus actual debe
     *                                         ser "Pendiente".
     *                   = 1--> Eliminar   --> ** por definir la restriccion **
     * @param cveCdv clave de cdv
     * @param tipoTransaccion tipo de transaccion o proceso a verificar
     * @return si tiene o no autorizacion
     */
    //TODO: REVISAR UTILIZACION DE ESTA OPERACION POR EL CONTROLLER.
    boolean autorizarTransaccion(Long cveCdv, int tipoTransaccion);

    /**
     * Permite enviar una CDV a revision cambiando el estatus a "Listo".
     * El estatus previo que debe tener la CDV para ser enviado debe
     * ser "Pendiente".
     * @see autorizarTransaccion
     * @param cveCdv clave de cdv
     * 
     */
    void enviarCdv(Long cveCdv);

    /**
     * Permite eliminar una CDV.
     * @param cveCdv clave de cdv
     */
    void eliminarCdv(Long cveCdv);

    /*** ---------Metodo potencialmente removido a un servicio
     *            comun --------- ***
     * Obtiene el Listado de los procesos de carga correspondientes
     * a un anyo en especifico.
     * @param anyo anio
     * @return lista de ProcesoDeCargaVo
     */
    List<ProcesoDeCargaVo>obtenerListadoPdc(int anyo);
}
