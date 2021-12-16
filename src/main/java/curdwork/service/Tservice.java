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
	//全件取得
	public List<Tentity> searchAll() {

		return tmapper.findAll();
	}
	//登録
	public void insert(Tentity tentity) {
        tmapper.insert(tentity);
	}
	

}
