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
package org.eclipse.reddeer.common.condition;

/**
 * Interface WaitCondition offers API for wait conditions. 
 * 
 * @author mlabuda@redhat.com
 * @author jkopriva@redhat.com
 */
public interface WaitCondition {

	/**
	 * Tests whether condition is met or not.
	 * 
	 * @return true if condition is met, false otherwise
	 */
	boolean test();
	
	/**
	 * Returns null if condition is not satisfied or object of type T if test is true 
	 * @return T object of type T
	 */
	<T> T getResult();
	
	/**
	 * Gets description of specific condition. This is 
	 * useful in logging.
	 * 
	 * @return description of specific wait condition
	 */
	String description();
	
	/**
	 * Gets error message if the condition fails in WaitWhile. Should be used when user wants
	 * to distinguish error messages when calling from WaitWhile or WaitUntil.
	 * This is useful in logging.
	 * 
	 * @return description of specific wait condition
	 */
	String errorMessageWhile();

	/**
	 * Gets error message if the condition fails in WaitUntil. Should be used when user wants
	 * to distinguish error messages when calling from WaitWhile or WaitUntil.
	 * This is useful in logging.
	 * 
	 * @return description of specific wait condition
	 */
	String errorMessageUntil();
	
}
