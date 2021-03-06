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
package org.eclipse.reddeer.eclipse.condition;

import org.eclipse.reddeer.common.condition.AbstractWaitCondition;
import org.eclipse.reddeer.eclipse.ui.console.ConsoleView;

/**
 * Returns true if console is terminated
 * 
 * @author vlado pakan
 * 
 */
public class ConsoleIsTerminated extends AbstractWaitCondition {

	private ConsoleView consoleView = new ConsoleView();

	/**
	 * Construct the condition.
	 */
	public ConsoleIsTerminated() {
	}

	/* (non-Javadoc)
	 * @see org.eclipse.reddeer.common.condition.WaitCondition#test()
	 */
	@Override
	public boolean test() {
		consoleView.open();
		return consoleView.consoleIsTerminated();
	}

	/* (non-Javadoc)
	 * @see org.eclipse.reddeer.common.condition.AbstractWaitCondition#description()
	 */
	@Override
	public String description() {
		return "console is terminated";
	}

}
