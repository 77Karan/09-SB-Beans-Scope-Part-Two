package in.ashokit.beans;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class EnginePrototypeScope 
{
	public EnginePrototypeScope() 
	{
		System.out.println("Calling EnginePrototypeScope Cons");
	}

}
