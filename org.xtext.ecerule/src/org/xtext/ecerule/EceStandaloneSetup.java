/*
* generated by Xtext
*/
package org.xtext.ecerule;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class EceStandaloneSetup extends EceStandaloneSetupGenerated{

	public static void doSetup() {
		new EceStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

