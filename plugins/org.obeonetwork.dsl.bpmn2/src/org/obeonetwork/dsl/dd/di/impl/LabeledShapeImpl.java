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
package org.obeonetwork.dsl.dd.di.impl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.obeonetwork.dsl.dd.di.DiPackage;
import org.obeonetwork.dsl.dd.di.Label;
import org.obeonetwork.dsl.dd.di.LabeledShape;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Labeled Shape</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.dd.di.impl.LabeledShapeImpl#getOwnedLabel <em>Owned Label</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class LabeledShapeImpl extends ShapeImpl implements
		LabeledShape {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LabeledShapeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DiPackage.Literals.LABELED_SHAPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Label> getOwnedLabel() {
		return (EList<Label>) eGet(
				DiPackage.Literals.LABELED_SHAPE__OWNED_LABEL, true);
	}

} //LabeledShapeImpl
