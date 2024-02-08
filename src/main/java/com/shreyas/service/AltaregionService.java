package com.shreyas.service;

import java.util.List;

import com.shreyas.dto.AltaregionDTO;

public interface AltaregionService {

	AltaregionDTO addAltaregion(AltaregionDTO altaregionDTO);
	
	AltaregionDTO getAltaregionByName(String name);
	
	List<AltaregionDTO> getAllAltaregions();
	
}
