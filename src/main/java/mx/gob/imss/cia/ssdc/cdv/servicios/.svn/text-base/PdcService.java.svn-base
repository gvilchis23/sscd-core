/**
 * Proyecto: IMSS  - SSDC
 *
 * Archivo: PdcService.java
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
import java.util.Map;

import mx.gob.imss.cia.ssdc.cdv.vo.RegistroCdvPaavVo;


/**
 * Interface de Procesos de Carga para ser implementada, extiende la clase
 * PanelService.
 *
 * @author leandro.ortiz
 *
 */
public interface PdcService extends PanelService {

    /**
     * Variable local para guardar el Id del proceso de carga.
     */
    String ID = "id";

    /**
     * Variable local para guardar el Id de la fecha festiva.
     */
    String IDFECHAINHAB = "idFechaInhab";

    /**
     * Variable local para guardar el nombre o descripcion del proceso de carga.
     */
    String NOMBRE = "nombre";

    /**
     * Variable local para guardar el tipo de carga.
     */
    String TIPO = "tipo";

    /**
     * Variable local para guardar la fecha proceso de carga.
     */
    String FECHA = "fecha";

    /**
     * Variable local para guardar el estatus del proceso de carga.
     */
    String ESTATUS = "estatus";

    /**
     * Variable local para guardar el nombre de la propiedad la cual sera llave
     * para un combo.
     */
    String LLAVE = "llave";


    /**
     * Variable local para guardar el nombre de la propiedad la cual sera el
     * valor que mostrara el combo.
     */
    String VALOR = "valor";

    /**
     * Metodo abstracto que permite obtener la lista de procesos de carga segun
     * filtros de busqueda.
     *
     * @param intTipo tipo de carga
     * @param intAnio anio
     * @param intMes mes
     * @param intEstatus estatus
     * @return Retorna una lista.
     *
     **/
    List<RegistroCdvPaavVo> getRegistroList(int intTipo, int intAnio,
            int intMes, int intEstatus);

    /**
     * Metodo abstracto que permite obtener la lista de dias
     * inhabiles de un anio.
     * @param intAnio recibe el anio del cual se obtendra los dias inhabiles
     * @return retorna la lista de dias inhabiles
     */
    List<Map<String, String>> getDiasInhabiles(int intAnio);

    /**
     * Metodo abstracto que permite obtener la lista de dias
     * inhabiles de un rango de fechas.
     * @param datFecInicial recibe la fecha inicial del rango
     * @param datFecFinal recibe la fecha final del rango
     * @return Retorna la lista de dias inhabiles del periodo
     */
    List<Map<String, String>> getDiasInhabiles(
                    Date datFecInicial, Date datFecFinal);

    /**
     * Metodo abstracto que permite obtener la lista de CDVs
     * que estan por evaluarse en el a�o.
     * @param intAnio recibe el anio para buscar las CDVs a evaluar
     * @return retorna la lista de CDVs que faltan evaluarse ese anio.
     */
   // List<SelectItem> getCDVsPorEvaluar(int intAnio);

}
