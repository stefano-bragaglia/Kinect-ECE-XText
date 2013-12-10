/**
 * 
 */
package rec.reasoner;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * @author stefano
 * 
 */
public class Config {

	public static final ConfigClock DEFAULT_CONFIG_CLOCK = ConfigClock.REAL_TIME;

	public static final ConfigMode DEFAULT_CONFIG_MODE = ConfigMode.LITE;

	public static Config newConfig() {
		return new Config();
	}

	private Map<Class<? extends IConfigOption>, IConfigOption> options;

	private Config() {
		this.options = new HashMap<Class<? extends IConfigOption>, IConfigOption>();
		assert invariant() : "Illegal state in Config()";
	}

	protected ConfigClock getClock() {
		ConfigClock clock = (ConfigClock) options.get(ConfigClock.class);
		if (clock == null)
			clock = DEFAULT_CONFIG_CLOCK;
		assert invariant() : "Illegal state in Config.getClock()";
		return clock;
	}

	protected ConfigMode getMode() {
		ConfigMode mode = (ConfigMode) options.get(ConfigMode.class);
		if (mode == null)
			mode = DEFAULT_CONFIG_MODE;
		assert invariant() : "Illegal state in Config.getMode()";
		return mode;
	}

	protected Collection<IConfigOption> getOptions() {
		return options.values();
	}

	private boolean invariant() {
		return (options != null);
	}

	public void setOption(IConfigOption option) {
		if (option == null)
			throw new IllegalArgumentException(
					"Illegal 'option' argument in Config.setOption(IConfigOption): "
							+ option);
		options.put(option.getClass(), option);
		assert invariant() : "Illegal state in Config.setOption(IConfigOption)";
	}

}
