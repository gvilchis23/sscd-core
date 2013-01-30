/**
 * Proyecto: IMSS  - SSDC
 *
 * Archivo: PduServiceImpl.java
 *
 * Creado:  13/10/2011
 *
 * Derechos Reservados de copia (c) - INAP /
 *
 * Instituto Mexicano del Seguro Social - 2011
 */

package mx.gob.imss.cia.ssdc.cdv.servicios.impl;

import java.util.List;

import mx.gob.imss.cia.ssdc.cdv.servicios.PduService;
import mx.gob.imss.cia.ssdc.cdv.vo.ProcesoDeCargaVo;
import mx.gob.imss.cia.ssdc.cdv.vo.RegistroCdvPaavVo;

import org.springframework.stereotype.Service;

/**
 * 
 */
@Service("pduService")
public class PduServiceImpl implements PduService {

    @Override
    public List<RegistroCdvPaavVo> obtenListadoRegistroCdvPaav() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List<RegistroCdvPaavVo> obtenListadoRegistroCdvPaav(int tipo,
            int mes, int anyo, int estatus) {
        // TODO Auto-generated method stub
        return null;
    }

   @Override
    public void crearCdv(Long cveDelegacion, Long cveUnidad,
            Long cveTipoVentanilla, Long cveTurno) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void enviarCdv(Long cveCdv) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void eliminarCdv(Long cveCdv) {
        // TODO Auto-generated method stub
        
    }

	@Override
	public boolean autorizarTransaccion(Long cveCdv, int tipoTransaccion) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<ProcesoDeCargaVo> obtenerListadoPdc(int anyo) {
		// TODO Auto-generated method stub
		return null;
	}
}
