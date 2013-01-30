/**
 * Proyecto: IMSS  - SSDC
 *
 * Archivo: BusquedaServiceImpl.java
 *
 * Creado:  03/11/2011
 *
 * Derechos Reservados de copia (c) - INAP /
 *
 * Instituto Mexicano del Seguro Social - 2011
 */
package mx.gob.imss.cia.ssdc.cdv.servicios.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import javax.annotation.Resource;

import mx.gob.imss.cia.ssdc.cdv.integracion.dao.DelegacionDao;
import mx.gob.imss.cia.ssdc.cdv.integracion.dao.TipoVentanillaDao;
import mx.gob.imss.cia.ssdc.cdv.integracion.dao.TurnoDao;
import mx.gob.imss.cia.ssdc.cdv.integracion.dao.UnidadDao;
import mx.gob.imss.cia.ssdc.cdv.servicios.BusquedaService;
import mx.gob.imss.cia.ssdc.cdv.vo.AnyoVo;
import mx.gob.imss.cia.ssdc.cdv.vo.DelegacionVo;
import mx.gob.imss.cia.ssdc.cdv.vo.EstatusVo;
import mx.gob.imss.cia.ssdc.cdv.vo.MesVo;
import mx.gob.imss.cia.ssdc.cdv.vo.TipoInformeVo;
import mx.gob.imss.cia.ssdc.cdv.vo.TipoRegistroVo;
import mx.gob.imss.cia.ssdc.cdv.vo.TipoVentanillaVo;
import mx.gob.imss.cia.ssdc.cdv.vo.TurnoVo;
import mx.gob.imss.cia.ssdc.cdv.vo.UnidadVo;
import mx.gob.imss.cia.ssdc.commons.Constantes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author FABRICIO-INAP
 * 
 */
@Service
public class BusquedaServiceImpl implements BusquedaService {

	private static final int CLAVE_MES_01 = 1;
	private static final int CLAVE_MES_02 = 2;
	private static final int CLAVE_MES_03 = 3;
	private static final int CLAVE_MES_04 = 4;
	private static final int CLAVE_MES_05 = 5;	
	private static final int CLAVE_MES_06 = 6;
	private static final int CLAVE_MES_07 = 7;
	private static final int CLAVE_MES_08 = 8;
	private static final int CLAVE_MES_09 = 9;
	private static final int CLAVE_MES_10 = 10;
	private static final int CLAVE_MES_11 = 11;
	private static final int CLAVE_MES_12 = 12;
	
	private static final int CLAVE_ANYO_01 = 1;
	private static final int CLAVE_ANYO_02 = 2;
	private static final int CLAVE_ANYO_03 = 3;
	private static final int CLAVE_ANYO_04 = 4;
	private static final int CLAVE_ANYO_05 = 5;
	private static final int CLAVE_ANYO_06 = 6;
	private static final int CLAVE_ANYO_07 = 7;
	private static final int CLAVE_ANYO_08 = 8;	
	private static final int CLAVE_ANYO_09 = 9;
	private static final int CLAVE_ANYO_10 = 10;
	private static final int CLAVE_ANYO_11 = 11;
	private static final int CLAVE_ANYO_12 = 12;
	private static final int CLAVE_ANYO_13 = 13;
	private static final int CLAVE_ANYO_14 = 14;
	private static final int CLAVE_ANYO_15 = 15;

	@Autowired
	private DelegacionDao delegacionDao;

	@Autowired
	private UnidadDao unidadDao;
	
	@Autowired
	private TurnoDao turnoDao;
	
	@Autowired
	private TipoVentanillaDao tipoVentanillaDao;

	@Resource(name = "messages")
	private Properties messages;


	@Override
	public List<DelegacionVo> obtieneListadoDelegacion() {
		return delegacionDao.obtenerListadoDelegacionVo(Constantes.ENABLE);
	}

	@Override
	public List<UnidadVo> obtieneListadoUnidad() {
		return unidadDao.obtenerListadoUnidadVo(Constantes.ENABLE);
	}

	@Override
	public List<TipoRegistroVo> obtieneListadoTipo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<MesVo> obtieneListadoMes() {

		List<MesVo> listadoMes = new ArrayList<MesVo>();

		String enero = messages.getProperty("enero");
		String febrero = messages.getProperty("febrero");
		String marzo = messages.getProperty("marzo");
		String abril = messages.getProperty("abril");
		String mayo = messages.getProperty("mayo");
		String junio = messages.getProperty("junio");
		String julio = messages.getProperty("julio");
		String agosto = messages.getProperty("agosto");
		String septiembre = messages.getProperty("septiembre");
		String octubre = messages.getProperty("octubre");
		String noviembre = messages.getProperty("noviembre");
		String diciembre = messages.getProperty("diciembre");

		MesVo eneroVo = new MesVo(CLAVE_MES_01, enero);
		MesVo febreroVo = new MesVo(CLAVE_MES_02, febrero);
		MesVo marzoVo = new MesVo(CLAVE_MES_03, marzo);
		MesVo abrilVo = new MesVo(CLAVE_MES_04, abril);
		MesVo mayoVo = new MesVo(CLAVE_MES_05, mayo);
		MesVo junioVo = new MesVo(CLAVE_MES_06, junio);
		MesVo julioVo = new MesVo(CLAVE_MES_07, julio);
		MesVo agostoVo = new MesVo(CLAVE_MES_08, agosto);
		MesVo septiembreVo = new MesVo(CLAVE_MES_09, septiembre);
		MesVo octubreVo = new MesVo(CLAVE_MES_10, octubre);
		MesVo noviembreVo = new MesVo(CLAVE_MES_11, noviembre);
		MesVo diciembreVo = new MesVo(CLAVE_MES_12, diciembre);
		
		listadoMes.add(eneroVo);
		listadoMes.add(febreroVo);
		listadoMes.add(marzoVo);
		listadoMes.add(abrilVo);
		listadoMes.add(mayoVo);
		listadoMes.add(junioVo);
		listadoMes.add(julioVo);
		listadoMes.add(agostoVo);
		listadoMes.add(septiembreVo);
		listadoMes.add(octubreVo);
		listadoMes.add(noviembreVo);
		listadoMes.add(diciembreVo);

		return listadoMes;
	}

	@Override
	public List<AnyoVo> obtieneListadoAnyo() {

		List<AnyoVo> listadoAnyo = new ArrayList<AnyoVo>();

		String anyo01 = messages.getProperty("anyo01");
		String anyo02 = messages.getProperty("anyo02");
		String anyo03 = messages.getProperty("anyo03");
		String anyo04 = messages.getProperty("anyo04");
		String anyo05 = messages.getProperty("anyo05");
		String anyo06 = messages.getProperty("anyo06");
		String anyo07 = messages.getProperty("anyo07");
		String anyo08 = messages.getProperty("anyo08");
		String anyo09 = messages.getProperty("anyo09");
		String anyo10 = messages.getProperty("anyo10");
		String anyo11 = messages.getProperty("anyo11");
		String anyo12 = messages.getProperty("anyo12");
		String anyo13 = messages.getProperty("anyo13");
		String anyo14 = messages.getProperty("anyo14");
		String anyo15 = messages.getProperty("anyo15");

		AnyoVo anyo01Vo = new AnyoVo(CLAVE_ANYO_01, anyo01);
		AnyoVo anyo02Vo = new AnyoVo(CLAVE_ANYO_02, anyo02);
		AnyoVo anyo03Vo = new AnyoVo(CLAVE_ANYO_03, anyo03);
		AnyoVo anyo04Vo = new AnyoVo(CLAVE_ANYO_04, anyo04);
		AnyoVo anyo05Vo = new AnyoVo(CLAVE_ANYO_05, anyo05);
		AnyoVo anyo06Vo = new AnyoVo(CLAVE_ANYO_06, anyo06);
		AnyoVo anyo07Vo = new AnyoVo(CLAVE_ANYO_07, anyo07);
		AnyoVo anyo08Vo = new AnyoVo(CLAVE_ANYO_08, anyo08);
		AnyoVo anyo09Vo = new AnyoVo(CLAVE_ANYO_09, anyo09);
		AnyoVo anyo10Vo = new AnyoVo(CLAVE_ANYO_10, anyo10);
		AnyoVo anyo11Vo = new AnyoVo(CLAVE_ANYO_11, anyo11);
		AnyoVo anyo12Vo = new AnyoVo(CLAVE_ANYO_12, anyo12);
		AnyoVo anyo13Vo = new AnyoVo(CLAVE_ANYO_13, anyo13);
		AnyoVo anyo14Vo = new AnyoVo(CLAVE_ANYO_14, anyo14);
		AnyoVo anyo15Vo = new AnyoVo(CLAVE_ANYO_15, anyo15);

		listadoAnyo.add(anyo01Vo);
		listadoAnyo.add(anyo02Vo);
		listadoAnyo.add(anyo03Vo);
		listadoAnyo.add(anyo04Vo);
		listadoAnyo.add(anyo05Vo);
		listadoAnyo.add(anyo06Vo);
		listadoAnyo.add(anyo07Vo);
		listadoAnyo.add(anyo08Vo);
		listadoAnyo.add(anyo09Vo);
		listadoAnyo.add(anyo10Vo);
		listadoAnyo.add(anyo11Vo);
		listadoAnyo.add(anyo12Vo);
		listadoAnyo.add(anyo13Vo);
		listadoAnyo.add(anyo14Vo);
		listadoAnyo.add(anyo15Vo);

		return listadoAnyo;
	}

	@Override
	public List<EstatusVo> obtieneListadoEstatus() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<TurnoVo> obtieneListadoTurno() {
		return turnoDao.obtenerListadoTurnoVo(Constantes.ENABLE);
	}

	@Override
	public List<TipoVentanillaVo> obtieneListadoTipoVentanilla() {			
		return tipoVentanillaDao
				.obtenerListadoTipoVentanillaVo(Constantes.ENABLE);
	}

	@Override
	public List<TipoInformeVo> obtieneListadoTipoInforme() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<EstatusVo> obtieneListadoEstatusPorTipoRegistro(
			Long idTipoRegistro) {
		// TODO Auto-generated method stub
		return null;
	}

}
