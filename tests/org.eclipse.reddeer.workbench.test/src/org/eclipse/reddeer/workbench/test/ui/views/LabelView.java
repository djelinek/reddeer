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
package org.eclipse.reddeer.workbench.test.ui.views;

import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.ui.part.ViewPart;
import org.eclipse.reddeer.workbench.test.Activator;

public class LabelView extends ViewPart {
	private Label label;
	
	public static final String TOOLTIP="View Tooltip";

	public LabelView() {
		super();
	}

	public void setFocus() {
		label.setFocus();
	}

	public void createPartControl(Composite parent) {
		label = new Label(parent, 0);
		label.setText("Workbench Test View");
	}
	
	@Override
	public Image getTitleImage() {
		return Activator.getDefault().getImageRegistry().get(Activator.REDDEER_ICON);
	}
	
	@Override
	public String getTitleToolTip() {
		return TOOLTIP;
	}

}
