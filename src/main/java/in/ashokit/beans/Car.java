package in.ashokit.beans;

import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;

@Component
public class Car 
{
	@Autowired
	private EngineSingleTonScope eng1;
	@Autowired
	private EngineSingleTonScope eng2;
	
	@Autowired
	private EnginePrototypeScope eng3;

	@Autowired
	private EnginePrototypeScope eng4;

	
	public Car()
	{
		System.out.println("Calling Car Class cons ");
	}

}
