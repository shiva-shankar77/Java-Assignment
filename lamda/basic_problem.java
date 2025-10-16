package lamda;

import java.util.Arrays;
import java.util.List;

interface smartlight{
	void execute();
}
public class basic_problem {
public static void main(String[] args)	{
	smartlight motion = ()-> System.out.println("Light On (motion detect)");
	smartlight timeofday =() -> System.out.println("light become dim at evening");
	smartlight voice=() -> System.out.println("light off");
	List<smartlight> trigger = Arrays.asList(motion,timeofday,voice);
	 trigger.forEach(smartlight::execute);
	
}
}
