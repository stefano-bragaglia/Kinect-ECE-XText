/**
 * 
 */
package org.rec.reasoner;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

/**
 * @author stefano
 * 
 */
public class Model {

	public static Model newModel(Config config) {
		return new Model(config);
	}

	private Config config;

	private Set<String> resources;

	private Model(Config config) {
		if (config == null)
			throw new IllegalArgumentException(
					"Illegal 'config' argument in Model(Config): " + config);
		this.config = config;
		this.resources = new HashSet<String>();
		assert invariant() : "Illegal state in Model(Config)";
	}

	public void addResource(String resource) {
		if (resource == null || resource.isEmpty())
			throw new IllegalArgumentException(
					"Illegal 'resource' argument in Model.addResource(String): "
							+ resource);
		resources.add(resource);
		assert invariant() : "Illegal state in Model.addResource(String)";
	}

	protected Config getConfig() {
		return config;
	}

	public Collection<String> getResources() {
		return resources;
	}

	private boolean invariant() {
		return (config != null && resources != null);
	}

	public boolean isConsistent() {
		return true;
	}

}
