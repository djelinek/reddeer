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
package org.eclipse.reddeer.swt.impl.progressbar;

import org.eclipse.swt.SWT;

/**
 * This class represents progress bar with style SWT.VERTICAL
 * 
 * @author rhopp
 *
 */
public class VerticalProgressBar extends DeterminateProgressBar {

	/**
	 * Instantiates vertical progressbar with given index.
	 *
	 * @param index the index
	 */
	public VerticalProgressBar(int index) {
		super(index, SWT.VERTICAL);
	}
	
	/**
	 * Instantiates vertical progressbar.
	 */
	public VerticalProgressBar() {
		super(0, SWT.VERTICAL);
	}

}
