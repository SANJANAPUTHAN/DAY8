package Employee;

import Development.Development;
import Development.Worker;
import Training.SalesTerritory;
import Training.TrainerPerson;
import Training.Training;
import Training.TrainingManager;
public class Employee {
public static void main(String[] args) {
	Training train=new TrainerPerson();
	train.salaryAllocated();
	Training trainee=new TrainingManager();
	trainee.salaryAllocated();
	Training trainee1=new SalesTerritory();
	trainee1.salaryAllocated();
	Training trainee3=new TrainerPerson();
	trainee3.salaryAllocated();
	Development d=new Worker();
	d.salaryAllowance();
	
}
}
