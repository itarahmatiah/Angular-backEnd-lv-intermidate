package id.co.quadras.trainingangular.appbackend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import id.co.quadras.trainingangular.appbackend.dao.RekeningDao;
import id.co.quadras.trainingangular.appbackend.entity.Rekening;

@RestController
public class RekeningController {
	@Autowired
	private RekeningDao rekeningDao;
	
	@RequestMapping("/rekening")
	public Iterable<Rekening> semuaRekening(){
		return rekeningDao.findAll();
	}

}
