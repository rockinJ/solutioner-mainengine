package me.rockinj.solutioner.mainengine.model;

import java.util.List;
import java.util.Map;

public class SolutionToCountry {
	public DeliveryCenter[] deliveryCenters;
	public CountryData country;
	
	public SolutionToCountry(CountryData country) {
		this.country = country;
	}
}
