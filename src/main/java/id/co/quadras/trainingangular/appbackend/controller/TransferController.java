package id.co.quadras.trainingangular.appbackend.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import id.co.quadras.trainingangular.appbackend.dao.TransferDao;
import id.co.quadras.trainingangular.appbackend.entity.Transfer;

@RestController
public class TransferController {
	@Autowired
	TransferDao transferDoa;
	
	@RequestMapping(value="/transfer/", method=RequestMethod.POST)
	@ResponseStatus(HttpStatus.CREATED)
	public void simpanTransfer(@RequestBody @Valid Transfer transfer){
		transferDoa.save(transfer);
	}
	
	@RequestMapping(value ="/transfer/", method= RequestMethod.GET)
	public Iterable<Transfer>semuaTransfer(){
		return transferDoa.findAll();
	}

}
