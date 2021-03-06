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
package org.eclipse.reddeer.core.handler;

import org.eclipse.reddeer.common.util.Display;
import org.eclipse.reddeer.common.util.ResultRunnable;

/**
 * Contains methods for handling UI operations on
 * {@link org.eclipse.swt.widgets.Scale} widgets.
 * 
 * @author Vlado Pakan
 *
 */
public class ScaleHandler extends ControlHandler{
	
	private static ScaleHandler instance;
	
	/**
	 * Gets instance of ScaleHandler.
	 * 
	 * @return instance of ScaleHandler
	 */
	public static ScaleHandler getInstance(){
		if(instance == null){
			instance = new ScaleHandler();
		}
		return instance;
	}

	/**
	 * Gets minimum value of specified {@link org.eclipse.swt.widgets.Scale}.
	 * 
	 * @param scale scale to handle
	 * @return minimum value of specified scale
	 */
	public int getMinimum(final org.eclipse.swt.widgets.Scale scale) {
		return Display.syncExec(new ResultRunnable<Integer>() {
			@Override
			public Integer run() {
				return scale.getMinimum();
			}
		});
	}

	/**
	 * Gets maximum value of specified {@link org.eclipse.swt.widgets.Scale}.
	 * 
	 * @param scale scale to handle
	 * @return maximum value of specified scale
	 */
	public int getMaximum(final org.eclipse.swt.widgets.Scale scale) {
		return Display.syncExec(new ResultRunnable<Integer>() {
			@Override
			public Integer run() {
				return scale.getMaximum();
			}
		});
	}

	/**
	 * Gets current value of specified {@link org.eclipse.swt.widgets.Scale}.
	 * 
	 * @param scale scale to handle
	 * @return current value of specified scale
	 */
	public int getSelection(final org.eclipse.swt.widgets.Scale scale) {
		return Display.syncExec(new ResultRunnable<Integer>() {
			@Override
			public Integer run() {
				return scale.getSelection();
			}
		});
	}

	/**
	 * Sets specified {@link org.eclipse.swt.widgets.Scale} to specified value.
	 * 
	 * @param scale scale to handle
	 * @param value value to set
	 */
	public void setSelection(final org.eclipse.swt.widgets.Scale scale, final int value) {
		Display.syncExec(new Runnable() {
			@Override
			public void run() {
				scale.setSelection(value);
			}
		});
		sendClickNotifications(scale);
	}
}
