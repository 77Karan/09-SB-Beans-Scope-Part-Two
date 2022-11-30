package in.ashokit.beans;

import org.springframework.stereotype.Component;

@Component
public class EngineSingleTonScope 
{
	EngineSingleTonScope()
	{
		System.out.println("Creating EngineSingleTonScope Class Object");
	}

}
