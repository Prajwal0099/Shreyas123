package com.shreyas.entity;

import java.time.LocalTime;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Altaregion {
	
	@Id
	private String altaRegionName;
	
	private double altaRegionScore;
	
	private LocalTime altaRegionScoreLastCalculatedTime;
	
	
	//Constructor
	public Altaregion() {
		// TODO Auto-generated constructor stub
	}

	//arg Constructor
	public Altaregion(String altaRegionName, double altaRegionScore, LocalTime altaRegionScoreLastCalculatedTime) {
		super();
		this.altaRegionName = altaRegionName;
		this.altaRegionScore = altaRegionScore;
		this.altaRegionScoreLastCalculatedTime = altaRegionScoreLastCalculatedTime;
	}

	//Getters and Setters
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
