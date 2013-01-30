/**
 * Proyecto: IMSS  - SSDC
 *
 * Archivo: TipoUsuarioEntity.java
 *
 * Creado:  13/10/2011
 *
 * Derechos Reservados de copia (c) - INAP /
 *
 * Instituto Mexicano del Seguro Social - 2011
 */

package mx.gob.imss.cia.ssdc.cdv.integracion.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import mx.gob.imss.cia.ssdc.commons.ResultadoDinamico;

@Entity
//@Table(name = "ssc_tipo_usuario", schema = "SSDC_DS")
@Table(name = "ssc_tipo_usuario")
public class TipoUsuarioEntity extends Entidad implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "cve_tipo_usuario")
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long cveTipoUsuario;

    @Column(name = "nom_tipo_usuario")
    private String tipoUsuario;

    /**
     * @return the cveTipoUsuario
     */
    @ResultadoDinamico
    public Long getCveTipoUsuario() {
        return cveTipoUsuario;
    }

    /**
     * @param cveTipoUsuario
     *            the cveTipoUsuario to set
     */
    public void setCveTipoUsuario(Long cveTipoUsuario) {
        this.cveTipoUsuario = cveTipoUsuario;
    }

    /**
     * @return the cveServicio
     */
    @ResultadoDinamico
    public String getTipoUsuario() {
        return tipoUsuario;
    }

    /**
     * @param tipoUsuario
     *            the tipoUsuario to set
     */
    public void setTipoUsuario(String tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }

}
