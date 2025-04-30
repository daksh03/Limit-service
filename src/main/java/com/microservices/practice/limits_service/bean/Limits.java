package com.microservices.practice.limits_service.bean;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Limits {

	public Limits(int minimum, int maximum) {
		super();
		this.minimum = minimum;
		this.maximum = maximum;
	}
	private int minimum;
	private int maximum;
}
