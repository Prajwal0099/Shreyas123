package com.shreyas.dto;

import java.time.LocalTime;

public class AltaregionDTO {
	
	private String altaRegionName;

	private double altaRegionScore;

	private LocalTime altaRegionScoreLastCalculatedTime;

	public AltaregionDTO(String altaRegionName, double altaRegionScore, LocalTime altaRegionScoreLastCalculatedTime) {
		super();
		this.altaRegionName = altaRegionName;
		this.altaRegionScore = altaRegionScore;
		this.altaRegionScoreLastCalculatedTime = altaRegionScoreLastCalculatedTime;
	}
	
	public AltaregionDTO() {
		// TODO Auto-generated constructor stub
	}

	public String getAltaRegionName() {
		return altaRegionName;
	}

	public void setAltaRegionName(String altaRegionName) {
		this.altaRegionName = altaRegionName;
	}

	public double getAltaRegionScore() {
		return altaRegionScore;
	}

	public void setAltaRegionScore(double altaRegionScore) {
		this.altaRegionScore = altaRegionScore;
	}

	public LocalTime getAltaRegionScoreLastCalculatedTime() {
		return altaRegionScoreLastCalculatedTime;
	}

	public void setAltaRegionScoreLastCalculatedTime(LocalTime altaRegionScoreLastCalculatedTime) {
		this.altaRegionScoreLastCalculatedTime = altaRegionScoreLastCalculatedTime;
	}
	
	

}
