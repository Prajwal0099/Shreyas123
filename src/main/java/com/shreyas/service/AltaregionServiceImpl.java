package com.shreyas.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shreyas.dao.AltaregionDAO;
import com.shreyas.dto.AltaregionDTO;
import com.shreyas.entity.Altaregion;
import com.shreyas.mapper.AltaregionMapper;

@Service
public class AltaregionServiceImpl implements AltaregionService{
	
	@Autowired
	private AltaregionDAO altaregionDAO;
	
	@Autowired
	private AltaregionMapper altaregionMapper;

	@Override
	public AltaregionDTO addAltaregion(AltaregionDTO altaregionDTO) {
		Altaregion altaregion = altaregionMapper.mapToEntity(altaregionDTO);
		Altaregion savedAltaregion = altaregionDAO.save(altaregion);
		
		AltaregionDTO savedAltaregionDTO = altaregionMapper.mapToDTO(savedAltaregion);
		return savedAltaregionDTO;
	}

	@Override
	public AltaregionDTO getAltaregionByName(String name) {
		Altaregion requiredAltaregion = altaregionDAO.findById(name).get();
		return altaregionMapper.mapToDTO(requiredAltaregion);
	}

	@Override
	public List<AltaregionDTO> getAllAltaregions() {
		List<Altaregion> altaregions = altaregionDAO.findAll();
		
		List<AltaregionDTO> altaregionDTOs = null;
		
		
		return altaregionDTOs ;
	}

}
