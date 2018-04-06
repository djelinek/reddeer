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
package org.eclipse.redder.codegen.test.builder;

import static org.junit.Assert.assertEquals;

import java.io.IOException;

import org.eclipse.reddeer.codegen.builder.MethodBuilder;
import org.eclipse.reddeer.codegen.test.Utils;
import org.eclipse.reddeer.junit.runner.RedDeerSuite;
import org.eclipse.reddeer.requirements.cleanworkspace.CleanWorkspaceRequirement.CleanWorkspace;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * Test cases for RedDeer CodeGen - MethodBuilder.java
 * 
 * @author djelinek
 */

@CleanWorkspace
@RunWith(RedDeerSuite.class)
public class MethodBuilderTest {

	@Test
	public void testGetMethod() {
		MethodBuilder builder = new MethodBuilder();
		builder.get("Test");
		assertEquals("Method 'GET' was not created properly", "getTest", builder.getName());
	}

	@Test
	public void testSetMethod() {
		MethodBuilder builder = new MethodBuilder();
		builder.set("Test");
		assertEquals("Method 'SET' was not created properly", "setTest", builder.getName());
	}

	@Test
	public void testVisibility() {
		MethodBuilder builder = new MethodBuilder();
		builder.visibility("private");
		assertEquals("Method 'VISIBILITY' was not set properly", "private", builder.getVisibility());
	}

	@Test
	public void testReturnType() {
		MethodBuilder builder = new MethodBuilder();
		builder.returnType("boolean");
		assertEquals("Method 'RETURN TYPE' was not set properly", "boolean", builder.getReturnType());
	}

	@Test
	public void testType() {
		MethodBuilder builder = new MethodBuilder();
		builder.type("Getter");
		assertEquals("Method 'TYPE' was not set properly", "Getter", builder.getMethodType());
	}

	@Test
	public void testRule() {
		MethodBuilder builder = new MethodBuilder();
		builder.rule("BTN");
		assertEquals("Method 'RULE' was not set properly", "BTN", builder.getRule());
	}

	@Test
	public void testConstructor() throws IOException {
		assertEquals("Builder constructor was not created properly", Utils.getFileContent("resources/examples/constructor"),
				MethodBuilder.constructor("TestConstructorName").toString());
	}

	@Test
	public void testFullMethodStructure() throws IOException {
		assertEquals("Method structure was not manufactured properly", Utils.getFileContent("resources/examples/method"),
				MethodBuilder.method().visibility("private").returnType("boolean").name("5Test2 5Method!  ?Structure")
						.parameter("boolean a").parameter("boolean b").returnCommand("b").toString());

	}

}
