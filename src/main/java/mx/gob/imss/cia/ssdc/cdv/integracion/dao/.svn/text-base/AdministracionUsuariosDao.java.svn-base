/**
 * Proyecto: IMSS  - SSDC
 *
 * Archivo: AdministracionUsuariosDao.java
 *
 * Creado:  12/10/2011
 *
 * Derechos Reservados de copia (c) - INAP /
 *
 * Instituto Mexicano del Seguro Social - 2011
 */

package mx.gob.imss.cia.ssdc.cdv.integracion.dao;

import java.util.List;

import mx.gob.imss.cia.ssdc.cdv.integracion.entity.LlaveCompuestaUsuarios;
import mx.gob.imss.cia.ssdc.cdv.integracion.entity.PersonalRelPerfilEntity;

/**
 * 
 * @author Equipo de Desarrolllo
 * 
 */
public interface AdministracionUsuariosDao extends
        PersistenceDao<PersonalRelPerfilEntity, LlaveCompuestaUsuarios> {

    List<PersonalRelPerfilEntity> filtraPersonalPorTipo(Long tipoUsuario);

    PersonalRelPerfilEntity recuperarRelacionPerfilPersona(Long cvePersonal,
            Long cvePerfil);

    List<PersonalRelPerfilEntity> filtraPersonalPorStatus(int status);
}