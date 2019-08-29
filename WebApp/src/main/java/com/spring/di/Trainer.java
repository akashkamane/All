package com.spring.di;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
@Component
@Scope(value="prototype")
public interface Trainer {
	@Autowired
	public void train();
	public Set<String> getSpecialties();

}
