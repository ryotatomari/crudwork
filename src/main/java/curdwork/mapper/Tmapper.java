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
	
	//read1件取得 https://qiita.com/fftcy-sttkm/items/57e8596820cff28ec682
	public Tentity findById(int id);
	
	//update
	public void update(Tentity tentity);
	//delete
	public void delete(Tentity tentity);


	
}
