/*
 *  Copyright (C) 2008-2011 VMWare, Inc. All rights reserved.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *     http://www.apache.org/licenses/LICENSE-2.0
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.1.4-10/02/2007 10:39 AM(ffu)-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2007.12.20 at 10:31:30 AM PST 
//

package com.wavemaker.tools.webapp.schema;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * 
 * 
 * The security-constraintType is used to associate security constraints with one or more web resource collections
 * 
 * Used in: web-app
 * 
 * 
 * 
 * <p>
 * Java class for security-constraintType complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="security-constraintType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="display-name" type="{http://java.sun.com/xml/ns/j2ee}display-nameType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="web-resource-collection" type="{http://java.sun.com/xml/ns/j2ee}web-resource-collectionType" maxOccurs="unbounded"/>
 *         &lt;element name="auth-constraint" type="{http://java.sun.com/xml/ns/j2ee}auth-constraintType" minOccurs="0"/>
 *         &lt;element name="user-data-constraint" type="{http://java.sun.com/xml/ns/j2ee}user-data-constraintType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}ID" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "security-constraintType", propOrder = { "displayName", "webResourceCollection", "authConstraint", "userDataConstraint" })
public class SecurityConstraintType {

    @XmlElement(name = "display-name")
    protected List<DisplayNameType> displayName;

    @XmlElement(name = "web-resource-collection", required = true)
    protected List<WebResourceCollectionType> webResourceCollection;

    @XmlElement(name = "auth-constraint")
    protected AuthConstraintType authConstraint;

    @XmlElement(name = "user-data-constraint")
    protected UserDataConstraintType userDataConstraint;

    @XmlAttribute
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected java.lang.String id;

    /**
     * Gets the value of the displayName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to
     * the returned list will be present inside the JAXB object. This is why there is not a <CODE>set</CODE> method for
     * the displayName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * 
     * <pre>
     * getDisplayName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list {@link DisplayNameType }
     * 
     * 
     */
    public List<DisplayNameType> getDisplayName() {
        if (this.displayName == null) {
            this.displayName = new ArrayList<DisplayNameType>();
        }
        return this.displayName;
    }

    /**
     * Gets the value of the webResourceCollection property.
     * 
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to
     * the returned list will be present inside the JAXB object. This is why there is not a <CODE>set</CODE> method for
     * the webResourceCollection property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * 
     * <pre>
     * getWebResourceCollection().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list {@link WebResourceCollectionType }
     * 
     * 
     */
    public List<WebResourceCollectionType> getWebResourceCollection() {
        if (this.webResourceCollection == null) {
            this.webResourceCollection = new ArrayList<WebResourceCollectionType>();
        }
        return this.webResourceCollection;
    }

    /**
     * Gets the value of the authConstraint property.
     * 
     * @return possible object is {@link AuthConstraintType }
     * 
     */
    public AuthConstraintType getAuthConstraint() {
        return this.authConstraint;
    }

    /**
     * Sets the value of the authConstraint property.
     * 
     * @param value allowed object is {@link AuthConstraintType }
     * 
     */
    public void setAuthConstraint(AuthConstraintType value) {
        this.authConstraint = value;
    }

    /**
     * Gets the value of the userDataConstraint property.
     * 
     * @return possible object is {@link UserDataConstraintType }
     * 
     */
    public UserDataConstraintType getUserDataConstraint() {
        return this.userDataConstraint;
    }

    /**
     * Sets the value of the userDataConstraint property.
     * 
     * @param value allowed object is {@link UserDataConstraintType }
     * 
     */
    public void setUserDataConstraint(UserDataConstraintType value) {
        this.userDataConstraint = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return possible object is {@link java.lang.String }
     * 
     */
    public java.lang.String getId() {
        return this.id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value allowed object is {@link java.lang.String }
     * 
     */
    public void setId(java.lang.String value) {
        this.id = value;
    }

}
