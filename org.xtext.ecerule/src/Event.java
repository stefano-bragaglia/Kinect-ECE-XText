import java.util.List;

public class Event {
		private String eventName;
		private List<String> eventFeatureList;

		public Event(String eventName, List<String> eventFeatureList) {
			super();
			this.eventName = eventName;
			this.eventFeatureList = eventFeatureList;
		}

		public String getEventName() {
			return eventName;
		}

		public void setEventName(String eventName) {
			this.eventName = eventName;
		}

		public List<String> getEventFeatureList() {
			return eventFeatureList;
		}

		public void setEventFeatureList(List<String> eventFeatureList) {
			this.eventFeatureList = eventFeatureList;
		}
	}
