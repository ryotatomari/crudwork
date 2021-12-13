package curdwork.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import curdwork.entity.Tentity;
import curdwork.mapper.Tmapper;

@Service
public class Tservice {
	@Autowired
	//private
	Tmapper tmapper;
	public List<Tentity> searchAll() {

		return tmapper.find();
	}

}
