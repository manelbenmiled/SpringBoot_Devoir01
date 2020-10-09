package com.manel.formations.service;

import java.util.List;

import com.manel.formations.entities.Formation;

public interface FormationService 
{
	Formation saveFormation(Formation f);
	Formation updateFormation(Formation f);
	void deleteFormation(Formation f);
	void deleteFormationById(Long id);
	Formation getFormation(Long id);
	List<Formation> getAllFormations();

}
