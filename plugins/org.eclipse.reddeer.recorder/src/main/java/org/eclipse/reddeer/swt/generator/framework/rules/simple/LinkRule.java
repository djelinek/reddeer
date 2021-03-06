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
package org.eclipse.reddeer.swt.generator.framework.rules.simple;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Link;
import org.eclipse.swtbot.generator.framework.WidgetUtils;
import org.eclipse.reddeer.swt.generator.framework.referencedComposite.ReferencedComposite;
import org.eclipse.reddeer.swt.generator.framework.rules.RedDeerUtils;

public class LinkRule extends AbstractSimpleRedDeerRule {
	
	private String text;
	private int index;
	private List<ReferencedComposite> composites;

	@Override
	public boolean appliesTo(Event event) {
		 return event.widget instanceof Link && event.type == SWT.MouseDown;
	}

	@Override
	public void initializeForEvent(Event event) {
		Link link = (Link)event.widget;
		this.widget = link;
		this.setIndex(WidgetUtils.getIndex(link));
		if(link.getText() != null){
			String[] split1 = link.getText().split(".*<[aA]>");
			String[] split2 = split1[split1.length-1].split("</[aA]>.*");
			this.setText(split2[0]);
		}
		setComposites(RedDeerUtils.getComposites(link));
	}

	@Override
	public List<String> getActions() {
		java.util.List<String> toReturn = new java.util.ArrayList<String>();
		StringBuilder list = new StringBuilder();
		list.append("new DefaultLink(");
		list.append(RedDeerUtils.getReferencedCompositeString(composites));
		if(text != null){
			list.append("\""+text+"\"");
		} else {
			list.append(index);
		}
		list.append(").click()");
		toReturn.add(list.toString());
		return toReturn;
	}

	@Override
	public List<String> getImports() {
		java.util.List<String> toReturn = new ArrayList<String>();
		toReturn.add("org.eclipse.reddeer.swt.impl.link.DefaultLink");
		for(ReferencedComposite r: composites){
			toReturn.add(r.getImport());
		}
		return toReturn;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}

	public List<ReferencedComposite> getComposites() {
		return composites;
	}

	public void setComposites(List<ReferencedComposite> composites) {
		this.composites = composites;
	}

}
