package me.rockinj.solutioner.mainengine.model;

public class Currency {
	public float spotRate;
	public float planRate;
	public static enum Type {
		SPOT,
		PLAN
	}
	public float getRate(Type type) {
		return type == Type.SPOT ? spotRate : planRate;
	}
}
