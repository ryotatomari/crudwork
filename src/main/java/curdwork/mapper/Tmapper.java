package curdwork.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import curdwork.entity.Tentity;

@Mapper
public interface Tmapper {
	//read
	public List<Tentity> findAll();
	//insert
	public void insert(Tentity tentity);
	//update
	public void update(Tentity tentity);
	//delete
	public void delete(Tentity tentity);
    //read
}
