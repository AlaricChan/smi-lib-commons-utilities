/**
 * Copyright � 2017 DELL Inc. or its subsidiaries.  All Rights Reserved.
 */
//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2016.03.04 at 01:18:28 PM CST
//

package com.dell.isg.smi.commons.utilities.command;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * The Class CommandResponse.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CommandResponse", propOrder = { "returnCode", "returnMessage" })
public class CommandResponse {

    protected String returnCode;
    protected String returnMessage;


    /**
     * Gets the value of the returnCode property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getReturnCode() {
        return returnCode;
    }


    /**
     * Sets the value of the returnCode property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setReturnCode(String value) {
        this.returnCode = value;
    }


    /**
     * Gets the value of the returnMessage property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getReturnMessage() {
        return returnMessage;
    }


    /**
     * Sets the value of the returnMessage property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setReturnMessage(String value) {
        this.returnMessage = value;
    }

}
