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
package org.eclipse.reddeer.junit.test.integration.runner.injection;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import org.eclipse.reddeer.junit.requirement.Requirement;
import org.eclipse.reddeer.junit.test.integration.runner.injection.RunnerIntegrationRequirement2.RequirementAAnnotation2;
import org.eclipse.reddeer.junit.test.integration.runner.order.TestSequence;

public class RunnerIntegrationRequirement2  implements Requirement<RequirementAAnnotation2>{
	
	@Retention(RetentionPolicy.RUNTIME)
	@Target(ElementType.TYPE)
	public @interface RequirementAAnnotation2 {
		
	}

	public boolean canFulfill() {
		return true;
	}

	public void fulfill() {
		TestSequence.addFulfill(RunnerIntegrationRequirement.class);
	}

	@Override
	public void setDeclaration(RequirementAAnnotation2 declaration) {
		TestSequence.addSetDeclaration(RunnerIntegrationRequirement2.class);
	}

	@Override
	public void cleanUp() {
		TestSequence.addCleanup(RunnerIntegrationRequirement2.class);
	}

	@Override
	public RequirementAAnnotation2 getDeclaration() {
		return null;
	}
}
