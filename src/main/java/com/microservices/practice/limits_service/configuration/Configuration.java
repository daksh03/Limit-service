package com.microservices.practice.limits_service.configuration;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;

@Component
@Getter
@Setter
@ConfigurationProperties("limits-service")
public class Configuration {
	private int minimum;
	private int maximum;

}
