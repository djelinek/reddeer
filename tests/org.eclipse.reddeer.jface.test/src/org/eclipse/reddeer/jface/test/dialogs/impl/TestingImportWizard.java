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
package org.eclipse.reddeer.jface.test.dialogs.impl;

import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;

public class TestingImportWizard extends Wizard implements INewWizard {

	public static final String CATEGORY = "Testing import category";
	
	public static final String NAME = "Testing import wizard";

	public TestingImportWizard() {
		setWindowTitle(NAME);
	}
	
	@Override
	public void init(IWorkbench arg0, IStructuredSelection arg1) {
	}
	
	@Override
	public void addPages() {
		addPage(new TestingImportWizardPage());
	}

	@Override
	public boolean performFinish() {
		return false;
	}
	
	public static class TestingImportWizardPage extends WizardPage {

		public static final String PAGE_NAME = "Testing import wizard page";
		
		protected TestingImportWizardPage() {
			super(PAGE_NAME);
			setTitle(PAGE_NAME);
		}

		@Override
		public void createControl(Composite parent) {
			setControl(parent);
		}
	}
}
