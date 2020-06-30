package com.blabz.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.blabz.model.LMSModel;

@Repository
public interface LMSRepo extends JpaRepository<LMSModel, Integer> {

}
