/**
 * <copyright>
 * 
 * Copyright (c) 2011-2013 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *    Obeo - initial API and implementation
 * 
 * </copyright>
 */
package org.obeonetwork.dsl.bpmn2.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.obeonetwork.dsl.bpmn2.Bpmn2Package;
import org.obeonetwork.dsl.bpmn2.TextAnnotation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Text Annotation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.impl.TextAnnotationImpl#getText <em>Text</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.impl.TextAnnotationImpl#getTextFormat <em>Text Format</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TextAnnotationImpl extends ArtifactImpl implements TextAnnotation {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TextAnnotationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Bpmn2Package.Literals.TEXT_ANNOTATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getText() {
		return (String) eGet(Bpmn2Package.Literals.TEXT_ANNOTATION__TEXT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setText(String newText) {
		eSet(Bpmn2Package.Literals.TEXT_ANNOTATION__TEXT, newText);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTextFormat() {
		return (String) eGet(
				Bpmn2Package.Literals.TEXT_ANNOTATION__TEXT_FORMAT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTextFormat(String newTextFormat) {
		eSet(Bpmn2Package.Literals.TEXT_ANNOTATION__TEXT_FORMAT, newTextFormat);
	}

} //TextAnnotationImpl
