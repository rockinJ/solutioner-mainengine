package me.rockinj.solutioner.mainengine.util;

import java.util.concurrent.atomic.AtomicInteger;

public class IDGenerator {
	private AtomicInteger current = new AtomicInteger(-1);
	public int next() {
		return current.incrementAndGet();
	}
}
