package com.example.demo.services;

import java.util.List;

import com.example.demo.Models.TurnModel;
import com.example.demo.dto.TurnDto;

public interface ITurnService {
    public TurnModel findId(String organization);
	
	public List<TurnModel> findAll();
	public TurnDto save(TurnDto turnDto);
	public TurnDto update(TurnDto turnDto);
}
