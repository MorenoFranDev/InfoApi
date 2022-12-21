package com.example.demo.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Models.TurnModel;
import com.example.demo.dto.TurnDto;

public interface ITurnDao extends JpaRepository<TurnModel,Long>{
    public TurnModel findId(String organization);
	public List<TurnModel> findAll();
	public TurnDto save(TurnDto turnDto);
	public TurnDto update(TurnDto turnDto);
}
