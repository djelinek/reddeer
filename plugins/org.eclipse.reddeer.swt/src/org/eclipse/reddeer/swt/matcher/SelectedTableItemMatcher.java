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
package org.eclipse.reddeer.swt.matcher;

import org.hamcrest.Description;
import org.hamcrest.TypeSafeMatcher;
import org.eclipse.reddeer.swt.api.TableItem;

/**
 * Checks that the table item is checked.
 *  
 * @author Lucia Jelinkova
 *
 */
public class SelectedTableItemMatcher extends TypeSafeMatcher<TableItem> {

	@Override
	protected boolean matchesSafely(TableItem item) {
		return item.isSelected();
	}

	@Override
	public void describeTo(Description description) {
		description.appendText("table item is not selected");
	}
}
