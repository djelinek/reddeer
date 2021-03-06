/*******************************************************************************
 * Copyright (c) 2017 Red Hat, Inc and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Red Hat Inc. - initial API and implementation
 *******************************************************************************/
package org.eclipse.reddeer.junit.requirement.configuration;

/**
 * Missing requirement configuration is used for runner builder to notify that 
 * there should be a configuration for tests, but there is none.
 * 
 * @author mlabuda@redhat.com
 *
 */
public class MissingRequirementConfiguration implements RequirementConfiguration {

	@Override
	public String getId() {
		return "missing-configuration";
	}

	@Override
	public boolean equals(Object o) {
		if (o == null) {
			return false;
		}
		if (o.getClass().isAssignableFrom(MissingRequirementConfiguration.class)) {
			return true;
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		return 5;
	}
}
