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
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.eclipse.reddeer.codegen.builder.ClassBuilder;
import org.eclipse.reddeer.junit.runner.RedDeerSuite;
import org.eclipse.reddeer.requirements.cleanworkspace.CleanWorkspaceRequirement.CleanWorkspace;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * Test cases for RedDeer CodeGen - ClassBuilder.java
 * 
 * @author djelinek
 */

@CleanWorkspace
@RunWith(RedDeerSuite.class)
public class ClassBuilderTest {
	
	private final static String IMPORT = "org.eclipse.reddeer.codegen.builder.test.builder"; 
	
	@Test
	public void testBuilderConstructor() {
		ClassBuilder builder = new ClassBuilder("TestClassName", "org.eclipse.reddeer.codegen.test");
		assertEquals("TestClassName", builder.getClassName());
		assertEquals("org.eclipse.reddeer.codegen.test", builder.getPackageName());
	}
	
	@Test
	public void testClassName() {
		ClassBuilder builder = new ClassBuilder();
		builder.setClassName("TestClassName");
		assertEquals("TestClassName", builder.getClassName());
	}
	
	@Test
	public void testPackageName() {
		ClassBuilder builder = new ClassBuilder();
		builder.setPackage("org.eclipse.reddeer.codegen.test");
		assertEquals("org.eclipse.reddeer.codegen.test", builder.getPackageName());
	}
	
	@Test
	public void testExtendedClassName() {
		ClassBuilder builder = new ClassBuilder();
		builder.setExtendedClass("FooTestClassName");
		assertEquals("FooTestClassName", builder.getExtendedClass());
	}
	
	@Test
	public void testAddImport() {
		ClassBuilder builder = new ClassBuilder();
		builder.addImport(IMPORT);
		assertTrue("Import 'IMPORT' was not added to builder imports list", builder.constainsImport(IMPORT));
	}
	
	@Test
	public void testRemoveImport() {
		ClassBuilder builder = new ClassBuilder();
		builder.addImport(IMPORT);
		assertTrue("Import 'IMPORT' was not added to builder imports list", builder.constainsImport(IMPORT));
		builder.removeImport(IMPORT);
		assertFalse("Import 'IMPORT' was not deleted from builder imports list", builder.constainsImport(IMPORT));
	}

}
