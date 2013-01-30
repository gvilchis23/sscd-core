/**
 * Proyecto: IMSS  - SSDC
 *
 * Archivo: PersonalRelPerfil.java
 *
 * Creado:  13/10/2011
 *
 * Derechos Reservados de copia (c) - INAP /
 *
 * Instituto Mexicano del Seguro Social - 2011
 */

package mx.gob.imss.cia.ssdc.cdv.integracion.entity;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "SST_PERSONAL_PERFIL_PERSONAL")
public class PersonalRelPerfilEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    private LlaveCompuestaUsuarios llaveCompuesta;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "cve_unidad")
    private UnidadEntity unidad;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "cve_delegacion")
    private DelegacionEntity delegacion;

    @Column(name = "status")
    private int status;

    /**
     * @return the llaveCompuesta
     */
    public LlaveCompuestaUsuarios getLlaveCompuesta() {
        return llaveCompuesta;
    }

    /**
     * @param llaveCompuesta
     *            the llaveCompuesta to set
     */
    public void setLlaveCompuesta(LlaveCompuestaUsuarios llaveCompuesta) {
        this.llaveCompuesta = llaveCompuesta;
    }

    /**
     * @return the unidad
     */
    public UnidadEntity getUnidad() {
        return unidad;
    }

    /**
     * @param unidad
     *            the unidad to set
     */
    public void setUnidad(UnidadEntity unidad) {
        this.unidad = unidad;
    }

    /**
     * @return the delegacion
     */
    public DelegacionEntity getDelegacion() {
        return delegacion;
    }

    /**
     * @param delegacion
     *            the delegacion to set
     */
    public void setDelegacion(DelegacionEntity delegacion) {
        this.delegacion = delegacion;
    }

    /**
     * @return the status
     */
    public int getStatus() {
        return status;
    }

    /**
     * @param status
     *            the status to set
     */
    public void setStatus(int status) {
        this.status = status;
    }

}
