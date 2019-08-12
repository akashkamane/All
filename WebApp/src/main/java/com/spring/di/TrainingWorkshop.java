package com.spring.di;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value="prototype")
public class TrainingWorkshop implements Workshop {
	@Autowired
	TrainingCompany trainingCompany;
	

	public TrainingWorkshop() {
	
	}

	public TrainingWorkshop(TrainingCompany trainingCompany) {
		
		this.trainingCompany = trainingCompany;
	}

	public TrainingCompany getTrainingCompany() {
		return trainingCompany;
	}

	public void settrainingCompany(TrainingCompany trainingCompany) {
		this.trainingCompany = trainingCompany;
	}

	@Override
	
	public void conductWorkshop() {
		System.out.println(trainingCompany);
		
		trainingCompany.conductTraining();
	}
	
	

}
