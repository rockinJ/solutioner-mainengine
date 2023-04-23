package me.rockinj.solutioner.mainengine.model;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;

import org.bson.codecs.pojo.annotations.BsonProperty;

import lombok.Getter;

public class Solution implements Deliverable{
	public int startYear;
	public int startMonth;
	public int duration;
	public Map<String, Map<String, Deliverable>> components;
	public SolutionPropertes properties;
	public String solutionID;
	public int currentID = -1;
	public String solutionName;
}
