import java.util.ArrayList;
import java.util.List;

public class Statement {
	private Event event;
	private List<EcContext> ecContextsList;
	private List<ExpContext> expContextsList;
	
	public Statement(){
		String eventName = "EVENTNAME";
		List<String> eventFeatureList = new ArrayList<String>();
		//ciclo for
			eventFeatureList.add("FEATURE_I");	
			
		event.setEventFeatureList(eventFeatureList);
	}
}