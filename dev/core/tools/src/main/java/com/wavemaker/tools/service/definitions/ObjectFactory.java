/*
 *  Copyright (C) 2009-2011 VMWare, Inc. All rights reserved.
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
// Generated on: 2008.10.23 at 10:17:33 AM PDT 
//

package com.wavemaker.tools.service.definitions;

import javax.xml.bind.annotation.XmlRegistry;

/**
 * This object contains factory methods for each Java content interface and Java element interface generated in the
 * com.wavemaker.tools.service.definitions package.
 * <p>
 * An ObjectFactory allows you to programatically construct new instances of the Java representation for XML content.
 * The Java representation of XML content can consist of schema derived interfaces and classes representing the binding
 * of schema type definitions, element declarations and model groups. Factory methods for each of these are provided in
 * this class.
 */
@XmlRegistry
public class ObjectFactory {

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package:
     * com.wavemaker.tools.service.definitions
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DataObject }
     * 
     */
    public DataObject createDataObject() {
        return new DataObject();
    }

    /**
     * Create an instance of {@link EventNotifier }
     * 
     */
    public EventNotifier createEventNotifier() {
        return new EventNotifier();
    }

    /**
     * Create an instance of {@link DataObject.Element }
     * 
     */
    public DataObject.Element createDataObjectElement() {
        return new DataObject.Element();
    }

    /**
     * Create an instance of {@link Operation.Return }
     * 
     */
    public Operation.Return createOperationReturn() {
        return new Operation.Return();
    }

    /**
     * Create an instance of {@link Service }
     * 
     */
    public Service createService() {
        return new Service();
    }

    /**
     * Create an instance of {@link Operation.Parameter }
     * 
     */
    public Operation.Parameter createOperationParameter() {
        return new Operation.Parameter();
    }

    /**
     * Create an instance of {@link DataObjects }
     * 
     */
    public DataObjects createDataObjects() {
        return new DataObjects();
    }

    /**
     * Create an instance of {@link Operation }
     * 
     */
    public Operation createOperation() {
        return new Operation();
    }

}
