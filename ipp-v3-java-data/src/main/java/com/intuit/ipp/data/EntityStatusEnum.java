/*******************************************************************************
 * Copyright (c) 2017 Intuit
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * 	http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *******************************************************************************/
//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.11.14 at 04:24:27 PM PST 
//


package com.intuit.ipp.data;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EntityStatusEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="EntityStatusEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Deleted"/>
 *     &lt;enumeration value="Voided"/>
 *     &lt;enumeration value="Draft"/>
 *     &lt;enumeration value="Pending"/>
 *     &lt;enumeration value="InTransit"/>
 *     &lt;enumeration value="Synchronized"/>
 *     &lt;enumeration value="SyncError"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "EntityStatusEnum")
@XmlEnum
public enum EntityStatusEnum {


    /**
     * Object has been deleted but not yet purged from database
     * 
     */
    @XmlEnumValue("Deleted")
    DELETED("Deleted"),

    /**
     * Object has been voided from an accounting perspective
     * 
     */
    @XmlEnumValue("Voided")
    VOIDED("Voided"),

    /**
     * Object has been voided from an accounting perspective
     * 
     */
    @XmlEnumValue("Draft")
    DRAFT("Draft"),

    /**
     * Object has been written to the cloud but is pending sync to QuickBooks Desktop
     * 
     */
    @XmlEnumValue("Pending")
    PENDING("Pending"),

    /**
     * Object is currently being written to QuickBooks during an active synchronization, cloud will not permit writes to the entity
     * 
     */
    @XmlEnumValue("InTransit")
    IN_TRANSIT("InTransit"),

    /**
     * Object is synchronized with QuickBooks data, this is the normal state in QBO as there is no synchronization needed in QBO
     * 
     */
    @XmlEnumValue("Synchronized")
    SYNCHRONIZED("Synchronized"),

    /**
     * Object failed to sync to QuickBooks
     * 
     */
    @XmlEnumValue("SyncError")
    SYNC_ERROR("SyncError");
    private final String value;

    EntityStatusEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EntityStatusEnum fromValue(String v) {
        for (EntityStatusEnum c: EntityStatusEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}