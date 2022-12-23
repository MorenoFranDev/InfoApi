package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Models.TurnModel;

public interface ITurnDao extends JpaRepository<TurnModel,Long>{
    
}
