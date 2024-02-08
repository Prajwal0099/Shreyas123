package com.shreyas.mapper;

import org.springframework.stereotype.Component;

import com.shreyas.dto.AltaregionDTO;
import com.shreyas.entity.Altaregion;


@Component
public class AltaregionMapper {
	
	
	    
	    public AltaregionDTO mapToDTO(Altaregion altaregion) {
	    	AltaregionDTO dto = new AltaregionDTO();
	       dto.setAltaRegionName(altaregion.getAltaRegionName());
	       dto.setAltaRegionScore(altaregion.getAltaRegionScore());
	       dto.setAltaRegionScoreLastCalculatedTime(altaregion.getAltaRegionScoreLastCalculatedTime());
	       return dto;
	    }
	    
	    public Altaregion mapToEntity(AltaregionDTO altaregionDTO) {
	    	Altaregion entity = new Altaregion();
	        entity.setAltaRegionName(altaregionDTO.getAltaRegionName());
	        entity.setAltaRegionScore(altaregionDTO.getAltaRegionScore());
	        entity.setAltaRegionScoreLastCalculatedTime(altaregionDTO.getAltaRegionScoreLastCalculatedTime());;
	        return entity;
	    }

}
