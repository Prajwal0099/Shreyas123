package com.shreyas.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.shreyas.entity.Altaregion;

@Repository
public interface AltaregionDAO extends JpaRepository<Altaregion, String>{

}
