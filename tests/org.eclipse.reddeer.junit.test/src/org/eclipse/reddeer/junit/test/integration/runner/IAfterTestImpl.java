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
package org.eclipse.reddeer.junit.test.integration.runner;

import org.eclipse.reddeer.junit.extensionpoint.IAfterTest;
import org.eclipse.reddeer.junit.test.integration.runner.order.TestSequence;
import org.junit.runners.model.FrameworkMethod;
import org.junit.runners.model.TestClass;

public class IAfterTestImpl implements IAfterTest {

	@Override
	public void runAfterTestClass(String config, TestClass testClass) {
		TestSequence.addIAftersClass(IAfterTestImpl.class);
	}
	
	@Override
	public void runAfterTest(String config, Object target, FrameworkMethod method) {
		TestSequence.addIAfters(IAfterTestImpl.class);
	}

	@Override
	public boolean hasToRun() {
		return true;
	}

	@Override
	public long getPriority() {
		return 0;
	}
}
