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
 * 
 * The resource-refType contains a declaration of a Deployment Component's reference to an external resource. It
 * consists of an optional description, the resource manager connection factory reference name, the indication of the
 * resource manager connection factory type expected by the Deployment Component code, the type of authentication
 * (Application or Container), and an optional specification of the shareability of connections obtained from the
 * resource (Shareable or Unshareable).
 * 
 * Example:
 * 
 * <resource-ref> <res-ref-name>jdbc/EmployeeAppDB</res-ref-name> <res-type>javax.sql.DataSource</res-type>
 * <res-auth>Container</res-auth> <res-sharing-scope>Shareable</res-sharing-scope> </resource-ref>
 * 
 * 
 * 
 * 
 * <p>
 * Java class for resource-refType complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="resource-refType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="description" type="{http://java.sun.com/xml/ns/j2ee}descriptionType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="res-ref-name" type="{http://java.sun.com/xml/ns/j2ee}jndi-nameType"/>
 *         &lt;element name="res-type" type="{http://java.sun.com/xml/ns/j2ee}fully-qualified-classType"/>
 *         &lt;element name="res-auth" type="{http://java.sun.com/xml/ns/j2ee}res-authType"/>
 *         &lt;element name="res-sharing-scope" type="{http://java.sun.com/xml/ns/j2ee}res-sharing-scopeType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}ID" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "resource-refType", propOrder = { "description", "resRefName", "resType", "resAuth", "resSharingScope" })
public class ResourceRefType {

    protected List<DescriptionType> description;

    @XmlElement(name = "res-ref-name", required = true)
    protected JndiNameType resRefName;

    @XmlElement(name = "res-type", required = true)
    protected FullyQualifiedClassType resType;

    @XmlElement(name = "res-auth", required = true)
    protected ResAuthType resAuth;

    @XmlElement(name = "res-sharing-scope")
    protected ResSharingScopeType resSharingScope;

    @XmlAttribute
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected java.lang.String id;

    /**
     * Gets the value of the description property.
     * 
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to
     * the returned list will be present inside the JAXB object. This is why there is not a <CODE>set</CODE> method for
     * the description property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * 
     * <pre>
     * getDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list {@link DescriptionType }
     * 
     * 
     */
    public List<DescriptionType> getDescription() {
        if (this.description == null) {
            this.description = new ArrayList<DescriptionType>();
        }
        return this.description;
    }

    /**
     * Gets the value of the resRefName property.
     * 
     * @return possible object is {@link JndiNameType }
     * 
     */
    public JndiNameType getResRefName() {
        return this.resRefName;
    }

    /**
     * Sets the value of the resRefName property.
     * 
     * @param value allowed object is {@link JndiNameType }
     * 
     */
    public void setResRefName(JndiNameType value) {
        this.resRefName = value;
    }

    /**
     * Gets the value of the resType property.
     * 
     * @return possible object is {@link FullyQualifiedClassType }
     * 
     */
    public FullyQualifiedClassType getResType() {
        return this.resType;
    }

    /**
     * Sets the value of the resType property.
     * 
     * @param value allowed object is {@link FullyQualifiedClassType }
     * 
     */
    public void setResType(FullyQualifiedClassType value) {
        this.resType = value;
    }

    /**
     * Gets the value of the resAuth property.
     * 
     * @return possible object is {@link ResAuthType }
     * 
     */
    public ResAuthType getResAuth() {
        return this.resAuth;
    }

    /**
     * Sets the value of the resAuth property.
     * 
     * @param value allowed object is {@link ResAuthType }
     * 
     */
    public void setResAuth(ResAuthType value) {
        this.resAuth = value;
    }

    /**
     * Gets the value of the resSharingScope property.
     * 
     * @return possible object is {@link ResSharingScopeType }
     * 
     */
    public ResSharingScopeType getResSharingScope() {
        return this.resSharingScope;
    }

    /**
     * Sets the value of the resSharingScope property.
     * 
     * @param value allowed object is {@link ResSharingScopeType }
     * 
     */
    public void setResSharingScope(ResSharingScopeType value) {
        this.resSharingScope = value;
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
