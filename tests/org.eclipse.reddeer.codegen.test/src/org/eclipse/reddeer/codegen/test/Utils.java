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
package org.eclipse.reddeer.codegen.test;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

/**
 * Useful utils used in RedDeer CodeGen Tests
 * 
 * @author djelinek
 */

public class Utils {
	
	/**
	 * Retrieve content of a given file
	 * 
	 * @param path
	 *            Absolute path to the file
	 * @return Content of the file
	 * @throws IOException
	 *             Something went wrong
	 */
	public static String getFileContent(String path) throws IOException {
		return new String(Files.readAllBytes(new File(path).toPath()));
	}

}
