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

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import com.intuit.ipp.core.Response;
import com.intuit.sb.cdm.util.v3.DateTimeAdapter;
import org.jvnet.jaxb2_commons.lang.Equals;
import org.jvnet.jaxb2_commons.lang.EqualsStrategy;
import org.jvnet.jaxb2_commons.lang.HashCode;
import org.jvnet.jaxb2_commons.lang.HashCodeStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBEqualsStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBHashCodeStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;
import org.jvnet.jaxb2_commons.locator.util.LocatorUtils;


/**
 * IntuitResponse is a holder of all types of entities that come as part of response
 * 
 * <p>Java class for IntuitResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IntuitResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Warnings" type="{http://schema.intuit.com/finance/v3}Warnings" minOccurs="0"/>
 *         &lt;choice>
 *           &lt;element ref="{http://schema.intuit.com/finance/v3}IntuitObject"/>
 *           &lt;element name="Fault" type="{http://schema.intuit.com/finance/v3}Fault" minOccurs="0"/>
 *           &lt;element name="Report" type="{http://schema.intuit.com/finance/v3}Report" minOccurs="0"/>
 *           &lt;element name="QueryResponse" type="{http://schema.intuit.com/finance/v3}QueryResponse" minOccurs="0"/>
 *           &lt;element name="BatchItemResponse" type="{http://schema.intuit.com/finance/v3}BatchItemResponse" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element name="CDCResponse" type="{http://schema.intuit.com/finance/v3}CDCResponse" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element name="AttachableResponse" type="{http://schema.intuit.com/finance/v3}AttachableResponse" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element name="SyncErrorResponse" type="{http://schema.intuit.com/finance/v3}SyncErrorResponse" minOccurs="0"/>
 *           &lt;element name="OLBTransaction" type="{http://schema.intuit.com/finance/v3}OLBTransaction" minOccurs="0"/>
 *           &lt;element name="OLBStatus" type="{http://schema.intuit.com/finance/v3}OLBStatus" minOccurs="0"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *       &lt;attribute name="requestId" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="time" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="status" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IntuitResponse", propOrder = {
    "warnings",
    "intuitObject",
    "fault",
    "report",
    "queryResponse",
    "batchItemResponse",
    "cdcResponse",
    "attachableResponse",
    "syncErrorResponse",
    "olbTransaction",
    "olbStatus"
})
public class IntuitResponse
    implements Serializable, Response, Equals, HashCode
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "Warnings")
    protected Warnings warnings;
    @XmlElementRef(name = "IntuitObject", namespace = "http://schema.intuit.com/finance/v3", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends IntuitEntity> intuitObject;
    @XmlElement(name = "Fault")
    protected Fault fault;
    @XmlElement(name = "Report")
    protected Report report;
    @XmlElement(name = "QueryResponse")
    protected QueryResponse queryResponse;
    @XmlElement(name = "BatchItemResponse")
    protected List<BatchItemResponse> batchItemResponse;
    @XmlElement(name = "CDCResponse")
    protected List<CDCResponse> cdcResponse;
    @XmlElement(name = "AttachableResponse")
    protected List<AttachableResponse> attachableResponse;
    @XmlElement(name = "SyncErrorResponse")
    protected SyncErrorResponse syncErrorResponse;
    @XmlElement(name = "OLBTransaction")
    protected OLBTransaction olbTransaction;
    @XmlElement(name = "OLBStatus")
    protected OLBStatus olbStatus;
    @XmlAttribute(name = "requestId")
    protected String requestId;
    @XmlAttribute(name = "time")
    @XmlJavaTypeAdapter(DateTimeAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected Date time;
    @XmlAttribute(name = "status")
    protected String status;

    /**
     * Gets the value of the warnings property.
     * 
     * @return
     *     possible object is
     *     {@link Warnings }
     *     
     */
    public Warnings getWarnings() {
        return warnings;
    }

    /**
     * Sets the value of the warnings property.
     * 
     * @param value
     *     allowed object is
     *     {@link Warnings }
     *     
     */
    public void setWarnings(Warnings value) {
        this.warnings = value;
    }

    /**
     * Any IntuitEntity derived entity like Customer, Invoice can be part of response
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Estimate }{@code >}
     *     {@link JAXBElement }{@code <}{@link ReimburseCharge }{@code >}
     *     {@link JAXBElement }{@code <}{@link SyncActivity }{@code >}
     *     {@link JAXBElement }{@code <}{@link TaxService }{@code >}
     *     {@link JAXBElement }{@code <}{@link TaxReturn }{@code >}
     *     {@link JAXBElement }{@code <}{@link TimeActivity }{@code >}
     *     {@link JAXBElement }{@code <}{@link Payment }{@code >}
     *     {@link JAXBElement }{@code <}{@link Task }{@code >}
     *     {@link JAXBElement }{@code <}{@link Preferences }{@code >}
     *     {@link JAXBElement }{@code <}{@link QbdtEntityIdMapping }{@code >}
     *     {@link JAXBElement }{@code <}{@link SalesRep }{@code >}
     *     {@link JAXBElement }{@code <}{@link SalesReceipt }{@code >}
     *     {@link JAXBElement }{@code <}{@link Account }{@code >}
     *     {@link JAXBElement }{@code <}{@link TDSMetadata }{@code >}
     *     {@link JAXBElement }{@code <}{@link Class }{@code >}
     *     {@link JAXBElement }{@code <}{@link VendorCredit }{@code >}
     *     {@link JAXBElement }{@code <}{@link TaxRate }{@code >}
     *     {@link JAXBElement }{@code <}{@link ExchangeRate }{@code >}
     *     {@link JAXBElement }{@code <}{@link Invoice }{@code >}
     *     {@link JAXBElement }{@code <}{@link BillPayment }{@code >}
     *     {@link JAXBElement }{@code <}{@link Customer }{@code >}
     *     {@link JAXBElement }{@code <}{@link ChargeCredit }{@code >}
     *     {@link JAXBElement }{@code <}{@link DateTypeCustomFieldDefinition }{@code >}
     *     {@link JAXBElement }{@code <}{@link Employee }{@code >}
     *     {@link JAXBElement }{@code <}{@link StatementCharge }{@code >}
     *     {@link JAXBElement }{@code <}{@link Item }{@code >}
     *     {@link JAXBElement }{@code <}{@link Company }{@code >}
     *     {@link JAXBElement }{@code <}{@link FixedAsset }{@code >}
     *     {@link JAXBElement }{@code <}{@link MasterAccount }{@code >}
     *     {@link JAXBElement }{@code <}{@link Budget }{@code >}
     *     {@link JAXBElement }{@code <}{@link IntuitEntity }{@code >}
     *     {@link JAXBElement }{@code <}{@link RefundReceipt }{@code >}
     *     {@link JAXBElement }{@code <}{@link Vendor }{@code >}
     *     {@link JAXBElement }{@code <}{@link Bill }{@code >}
     *     {@link JAXBElement }{@code <}{@link UserAlert }{@code >}
     *     {@link JAXBElement }{@code <}{@link CustomerType }{@code >}
     *     {@link JAXBElement }{@code <}{@link CreditMemo }{@code >}
     *     {@link JAXBElement }{@code <}{@link OtherName }{@code >}
     *     {@link JAXBElement }{@code <}{@link VendorType }{@code >}
     *     {@link JAXBElement }{@code <}{@link JournalCode }{@code >}
     *     {@link JAXBElement }{@code <}{@link PriceLevel }{@code >}
     *     {@link JAXBElement }{@code <}{@link PaymentMethod }{@code >}
     *     {@link JAXBElement }{@code <}{@link CompanyInfo }{@code >}
     *     {@link JAXBElement }{@code <}{@link Purchase }{@code >}
     *     {@link JAXBElement }{@code <}{@link EmailDeliveryInfo }{@code >}
     *     {@link JAXBElement }{@code <}{@link Term }{@code >}
     *     {@link JAXBElement }{@code <}{@link Department }{@code >}
     *     {@link JAXBElement }{@code <}{@link CompanyCurrency }{@code >}
     *     {@link JAXBElement }{@code <}{@link Attachable }{@code >}
     *     {@link JAXBElement }{@code <}{@link InventorySite }{@code >}
     *     {@link JAXBElement }{@code <}{@link StringTypeCustomFieldDefinition }{@code >}
     *     {@link JAXBElement }{@code <}{@link Deposit }{@code >}
     *     {@link JAXBElement }{@code <}{@link JournalEntry }{@code >}
     *     {@link JAXBElement }{@code <}{@link BooleanTypeCustomFieldDefinition }{@code >}
     *     {@link JAXBElement }{@code <}{@link NumberTypeCustomFieldDefinition }{@code >}
     *     {@link JAXBElement }{@code <}{@link Status }{@code >}
     *     {@link JAXBElement }{@code <}{@link Transfer }{@code >}
     *     {@link JAXBElement }{@code <}{@link TaxCode }{@code >}
     *     {@link JAXBElement }{@code <}{@link CustomFieldDefinition }{@code >}
     *     {@link JAXBElement }{@code <}{@link PurchaseOrder }{@code >}
     *     {@link JAXBElement }{@code <}{@link TaxAgency }{@code >}
     *     {@link JAXBElement }{@code <}{@link SalesOrder }{@code >}
     *     
     */
    public JAXBElement<? extends IntuitEntity> getIntuitObject() {
        return intuitObject;
    }

    /**
     * Sets the value of the intuitObject property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Estimate }{@code >}
     *     {@link JAXBElement }{@code <}{@link ReimburseCharge }{@code >}
     *     {@link JAXBElement }{@code <}{@link SyncActivity }{@code >}
     *     {@link JAXBElement }{@code <}{@link TaxService }{@code >}
     *     {@link JAXBElement }{@code <}{@link TaxReturn }{@code >}
     *     {@link JAXBElement }{@code <}{@link TimeActivity }{@code >}
     *     {@link JAXBElement }{@code <}{@link Payment }{@code >}
     *     {@link JAXBElement }{@code <}{@link Task }{@code >}
     *     {@link JAXBElement }{@code <}{@link Preferences }{@code >}
     *     {@link JAXBElement }{@code <}{@link QbdtEntityIdMapping }{@code >}
     *     {@link JAXBElement }{@code <}{@link SalesRep }{@code >}
     *     {@link JAXBElement }{@code <}{@link SalesReceipt }{@code >}
     *     {@link JAXBElement }{@code <}{@link Account }{@code >}
     *     {@link JAXBElement }{@code <}{@link TDSMetadata }{@code >}
     *     {@link JAXBElement }{@code <}{@link Class }{@code >}
     *     {@link JAXBElement }{@code <}{@link VendorCredit }{@code >}
     *     {@link JAXBElement }{@code <}{@link TaxRate }{@code >}
     *     {@link JAXBElement }{@code <}{@link ExchangeRate }{@code >}
     *     {@link JAXBElement }{@code <}{@link Invoice }{@code >}
     *     {@link JAXBElement }{@code <}{@link BillPayment }{@code >}
     *     {@link JAXBElement }{@code <}{@link Customer }{@code >}
     *     {@link JAXBElement }{@code <}{@link ChargeCredit }{@code >}
     *     {@link JAXBElement }{@code <}{@link DateTypeCustomFieldDefinition }{@code >}
     *     {@link JAXBElement }{@code <}{@link Employee }{@code >}
     *     {@link JAXBElement }{@code <}{@link StatementCharge }{@code >}
     *     {@link JAXBElement }{@code <}{@link Item }{@code >}
     *     {@link JAXBElement }{@code <}{@link Company }{@code >}
     *     {@link JAXBElement }{@code <}{@link FixedAsset }{@code >}
     *     {@link JAXBElement }{@code <}{@link MasterAccount }{@code >}
     *     {@link JAXBElement }{@code <}{@link Budget }{@code >}
     *     {@link JAXBElement }{@code <}{@link IntuitEntity }{@code >}
     *     {@link JAXBElement }{@code <}{@link RefundReceipt }{@code >}
     *     {@link JAXBElement }{@code <}{@link Vendor }{@code >}
     *     {@link JAXBElement }{@code <}{@link Bill }{@code >}
     *     {@link JAXBElement }{@code <}{@link UserAlert }{@code >}
     *     {@link JAXBElement }{@code <}{@link CustomerType }{@code >}
     *     {@link JAXBElement }{@code <}{@link CreditMemo }{@code >}
     *     {@link JAXBElement }{@code <}{@link OtherName }{@code >}
     *     {@link JAXBElement }{@code <}{@link VendorType }{@code >}
     *     {@link JAXBElement }{@code <}{@link JournalCode }{@code >}
     *     {@link JAXBElement }{@code <}{@link PriceLevel }{@code >}
     *     {@link JAXBElement }{@code <}{@link PaymentMethod }{@code >}
     *     {@link JAXBElement }{@code <}{@link CompanyInfo }{@code >}
     *     {@link JAXBElement }{@code <}{@link Purchase }{@code >}
     *     {@link JAXBElement }{@code <}{@link EmailDeliveryInfo }{@code >}
     *     {@link JAXBElement }{@code <}{@link Term }{@code >}
     *     {@link JAXBElement }{@code <}{@link Department }{@code >}
     *     {@link JAXBElement }{@code <}{@link CompanyCurrency }{@code >}
     *     {@link JAXBElement }{@code <}{@link Attachable }{@code >}
     *     {@link JAXBElement }{@code <}{@link InventorySite }{@code >}
     *     {@link JAXBElement }{@code <}{@link StringTypeCustomFieldDefinition }{@code >}
     *     {@link JAXBElement }{@code <}{@link Deposit }{@code >}
     *     {@link JAXBElement }{@code <}{@link JournalEntry }{@code >}
     *     {@link JAXBElement }{@code <}{@link BooleanTypeCustomFieldDefinition }{@code >}
     *     {@link JAXBElement }{@code <}{@link NumberTypeCustomFieldDefinition }{@code >}
     *     {@link JAXBElement }{@code <}{@link Status }{@code >}
     *     {@link JAXBElement }{@code <}{@link Transfer }{@code >}
     *     {@link JAXBElement }{@code <}{@link TaxCode }{@code >}
     *     {@link JAXBElement }{@code <}{@link CustomFieldDefinition }{@code >}
     *     {@link JAXBElement }{@code <}{@link PurchaseOrder }{@code >}
     *     {@link JAXBElement }{@code <}{@link TaxAgency }{@code >}
     *     {@link JAXBElement }{@code <}{@link SalesOrder }{@code >}
     *     
     */
    public void setIntuitObject(JAXBElement<? extends IntuitEntity> value) {
        this.intuitObject = value;
    }

    /**
     * Gets the value of the fault property.
     * 
     * @return
     *     possible object is
     *     {@link Fault }
     *     
     */
    public Fault getFault() {
        return fault;
    }

    /**
     * Sets the value of the fault property.
     * 
     * @param value
     *     allowed object is
     *     {@link Fault }
     *     
     */
    public void setFault(Fault value) {
        this.fault = value;
    }

    /**
     * Gets the value of the report property.
     * 
     * @return
     *     possible object is
     *     {@link Report }
     *     
     */
    public Report getReport() {
        return report;
    }

    /**
     * Sets the value of the report property.
     * 
     * @param value
     *     allowed object is
     *     {@link Report }
     *     
     */
    public void setReport(Report value) {
        this.report = value;
    }

    /**
     * Gets the value of the queryResponse property.
     * 
     * @return
     *     possible object is
     *     {@link QueryResponse }
     *     
     */
    public QueryResponse getQueryResponse() {
        return queryResponse;
    }

    /**
     * Sets the value of the queryResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryResponse }
     *     
     */
    public void setQueryResponse(QueryResponse value) {
        this.queryResponse = value;
    }

    /**
     * Gets the value of the batchItemResponse property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the batchItemResponse property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBatchItemResponse().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BatchItemResponse }
     * 
     * 
     */
    public List<BatchItemResponse> getBatchItemResponse() {
        if (batchItemResponse == null) {
            batchItemResponse = new ArrayList<BatchItemResponse>();
        }
        return this.batchItemResponse;
    }

    /**
     * Gets the value of the cdcResponse property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cdcResponse property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCDCResponse().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CDCResponse }
     * 
     * 
     */
    public List<CDCResponse> getCDCResponse() {
        if (cdcResponse == null) {
            cdcResponse = new ArrayList<CDCResponse>();
        }
        return this.cdcResponse;
    }

    /**
     * Gets the value of the attachableResponse property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the attachableResponse property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAttachableResponse().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AttachableResponse }
     * 
     * 
     */
    public List<AttachableResponse> getAttachableResponse() {
        if (attachableResponse == null) {
            attachableResponse = new ArrayList<AttachableResponse>();
        }
        return this.attachableResponse;
    }

    /**
     * Gets the value of the syncErrorResponse property.
     * 
     * @return
     *     possible object is
     *     {@link SyncErrorResponse }
     *     
     */
    public SyncErrorResponse getSyncErrorResponse() {
        return syncErrorResponse;
    }

    /**
     * Sets the value of the syncErrorResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link SyncErrorResponse }
     *     
     */
    public void setSyncErrorResponse(SyncErrorResponse value) {
        this.syncErrorResponse = value;
    }

    /**
     * Gets the value of the olbTransaction property.
     * 
     * @return
     *     possible object is
     *     {@link OLBTransaction }
     *     
     */
    public OLBTransaction getOLBTransaction() {
        return olbTransaction;
    }

    /**
     * Sets the value of the olbTransaction property.
     * 
     * @param value
     *     allowed object is
     *     {@link OLBTransaction }
     *     
     */
    public void setOLBTransaction(OLBTransaction value) {
        this.olbTransaction = value;
    }

    /**
     * Gets the value of the olbStatus property.
     * 
     * @return
     *     possible object is
     *     {@link OLBStatus }
     *     
     */
    public OLBStatus getOLBStatus() {
        return olbStatus;
    }

    /**
     * Sets the value of the olbStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link OLBStatus }
     *     
     */
    public void setOLBStatus(OLBStatus value) {
        this.olbStatus = value;
    }

    /**
     * Gets the value of the requestId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestId() {
        return requestId;
    }

    /**
     * Sets the value of the requestId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestId(String value) {
        this.requestId = value;
    }

    /**
     * Gets the value of the time property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Date getTime() {
        return time;
    }

    /**
     * Sets the value of the time property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTime(Date value) {
        this.time = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * Sets the value of the batchItemResponse property.
     * 
     * @param batchItemResponse
     *     allowed object is
     *     {@link BatchItemResponse }
     *     
     */
    public void setBatchItemResponse(List<BatchItemResponse> batchItemResponse) {
        this.batchItemResponse = batchItemResponse;
    }

    /**
     * Sets the value of the cdcResponse property.
     * 
     * @param cdcResponse
     *     allowed object is
     *     {@link CDCResponse }
     *     
     */
    public void setCDCResponse(List<CDCResponse> cdcResponse) {
        this.cdcResponse = cdcResponse;
    }

    /**
     * Sets the value of the attachableResponse property.
     * 
     * @param attachableResponse
     *     allowed object is
     *     {@link AttachableResponse }
     *     
     */
    public void setAttachableResponse(List<AttachableResponse> attachableResponse) {
        this.attachableResponse = attachableResponse;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof IntuitResponse)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final IntuitResponse that = ((IntuitResponse) object);
        {
            Warnings lhsWarnings;
            lhsWarnings = this.getWarnings();
            Warnings rhsWarnings;
            rhsWarnings = that.getWarnings();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "warnings", lhsWarnings), LocatorUtils.property(thatLocator, "warnings", rhsWarnings), lhsWarnings, rhsWarnings)) {
                return false;
            }
        }
        {
            JAXBElement<? extends IntuitEntity> lhsIntuitObject;
            lhsIntuitObject = this.getIntuitObject();
            JAXBElement<? extends IntuitEntity> rhsIntuitObject;
            rhsIntuitObject = that.getIntuitObject();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "intuitObject", lhsIntuitObject), LocatorUtils.property(thatLocator, "intuitObject", rhsIntuitObject), lhsIntuitObject, rhsIntuitObject)) {
                return false;
            }
        }
        {
            Fault lhsFault;
            lhsFault = this.getFault();
            Fault rhsFault;
            rhsFault = that.getFault();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "fault", lhsFault), LocatorUtils.property(thatLocator, "fault", rhsFault), lhsFault, rhsFault)) {
                return false;
            }
        }
        {
            Report lhsReport;
            lhsReport = this.getReport();
            Report rhsReport;
            rhsReport = that.getReport();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "report", lhsReport), LocatorUtils.property(thatLocator, "report", rhsReport), lhsReport, rhsReport)) {
                return false;
            }
        }
        {
            QueryResponse lhsQueryResponse;
            lhsQueryResponse = this.getQueryResponse();
            QueryResponse rhsQueryResponse;
            rhsQueryResponse = that.getQueryResponse();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "queryResponse", lhsQueryResponse), LocatorUtils.property(thatLocator, "queryResponse", rhsQueryResponse), lhsQueryResponse, rhsQueryResponse)) {
                return false;
            }
        }
        {
            List<BatchItemResponse> lhsBatchItemResponse;
            lhsBatchItemResponse = (((this.batchItemResponse!= null)&&(!this.batchItemResponse.isEmpty()))?this.getBatchItemResponse():null);
            List<BatchItemResponse> rhsBatchItemResponse;
            rhsBatchItemResponse = (((that.batchItemResponse!= null)&&(!that.batchItemResponse.isEmpty()))?that.getBatchItemResponse():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "batchItemResponse", lhsBatchItemResponse), LocatorUtils.property(thatLocator, "batchItemResponse", rhsBatchItemResponse), lhsBatchItemResponse, rhsBatchItemResponse)) {
                return false;
            }
        }
        {
            List<CDCResponse> lhsCDCResponse;
            lhsCDCResponse = (((this.cdcResponse!= null)&&(!this.cdcResponse.isEmpty()))?this.getCDCResponse():null);
            List<CDCResponse> rhsCDCResponse;
            rhsCDCResponse = (((that.cdcResponse!= null)&&(!that.cdcResponse.isEmpty()))?that.getCDCResponse():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "cdcResponse", lhsCDCResponse), LocatorUtils.property(thatLocator, "cdcResponse", rhsCDCResponse), lhsCDCResponse, rhsCDCResponse)) {
                return false;
            }
        }
        {
            List<AttachableResponse> lhsAttachableResponse;
            lhsAttachableResponse = (((this.attachableResponse!= null)&&(!this.attachableResponse.isEmpty()))?this.getAttachableResponse():null);
            List<AttachableResponse> rhsAttachableResponse;
            rhsAttachableResponse = (((that.attachableResponse!= null)&&(!that.attachableResponse.isEmpty()))?that.getAttachableResponse():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "attachableResponse", lhsAttachableResponse), LocatorUtils.property(thatLocator, "attachableResponse", rhsAttachableResponse), lhsAttachableResponse, rhsAttachableResponse)) {
                return false;
            }
        }
        {
            SyncErrorResponse lhsSyncErrorResponse;
            lhsSyncErrorResponse = this.getSyncErrorResponse();
            SyncErrorResponse rhsSyncErrorResponse;
            rhsSyncErrorResponse = that.getSyncErrorResponse();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "syncErrorResponse", lhsSyncErrorResponse), LocatorUtils.property(thatLocator, "syncErrorResponse", rhsSyncErrorResponse), lhsSyncErrorResponse, rhsSyncErrorResponse)) {
                return false;
            }
        }
        {
            OLBTransaction lhsOLBTransaction;
            lhsOLBTransaction = this.getOLBTransaction();
            OLBTransaction rhsOLBTransaction;
            rhsOLBTransaction = that.getOLBTransaction();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "olbTransaction", lhsOLBTransaction), LocatorUtils.property(thatLocator, "olbTransaction", rhsOLBTransaction), lhsOLBTransaction, rhsOLBTransaction)) {
                return false;
            }
        }
        {
            OLBStatus lhsOLBStatus;
            lhsOLBStatus = this.getOLBStatus();
            OLBStatus rhsOLBStatus;
            rhsOLBStatus = that.getOLBStatus();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "olbStatus", lhsOLBStatus), LocatorUtils.property(thatLocator, "olbStatus", rhsOLBStatus), lhsOLBStatus, rhsOLBStatus)) {
                return false;
            }
        }
        {
            String lhsRequestId;
            lhsRequestId = this.getRequestId();
            String rhsRequestId;
            rhsRequestId = that.getRequestId();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "requestId", lhsRequestId), LocatorUtils.property(thatLocator, "requestId", rhsRequestId), lhsRequestId, rhsRequestId)) {
                return false;
            }
        }
        {
            Date lhsTime;
            lhsTime = this.getTime();
            Date rhsTime;
            rhsTime = that.getTime();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "time", lhsTime), LocatorUtils.property(thatLocator, "time", rhsTime), lhsTime, rhsTime)) {
                return false;
            }
        }
        {
            String lhsStatus;
            lhsStatus = this.getStatus();
            String rhsStatus;
            rhsStatus = that.getStatus();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "status", lhsStatus), LocatorUtils.property(thatLocator, "status", rhsStatus), lhsStatus, rhsStatus)) {
                return false;
            }
        }
        return true;
    }

    public boolean equals(Object object) {
        final EqualsStrategy strategy = JAXBEqualsStrategy.INSTANCE;
        return equals(null, null, object, strategy);
    }

    public int hashCode(ObjectLocator locator, HashCodeStrategy strategy) {
        int currentHashCode = 1;
        {
            Warnings theWarnings;
            theWarnings = this.getWarnings();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "warnings", theWarnings), currentHashCode, theWarnings);
        }
        {
            JAXBElement<? extends IntuitEntity> theIntuitObject;
            theIntuitObject = this.getIntuitObject();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "intuitObject", theIntuitObject), currentHashCode, theIntuitObject);
        }
        {
            Fault theFault;
            theFault = this.getFault();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "fault", theFault), currentHashCode, theFault);
        }
        {
            Report theReport;
            theReport = this.getReport();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "report", theReport), currentHashCode, theReport);
        }
        {
            QueryResponse theQueryResponse;
            theQueryResponse = this.getQueryResponse();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "queryResponse", theQueryResponse), currentHashCode, theQueryResponse);
        }
        {
            List<BatchItemResponse> theBatchItemResponse;
            theBatchItemResponse = (((this.batchItemResponse!= null)&&(!this.batchItemResponse.isEmpty()))?this.getBatchItemResponse():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "batchItemResponse", theBatchItemResponse), currentHashCode, theBatchItemResponse);
        }
        {
            List<CDCResponse> theCDCResponse;
            theCDCResponse = (((this.cdcResponse!= null)&&(!this.cdcResponse.isEmpty()))?this.getCDCResponse():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "cdcResponse", theCDCResponse), currentHashCode, theCDCResponse);
        }
        {
            List<AttachableResponse> theAttachableResponse;
            theAttachableResponse = (((this.attachableResponse!= null)&&(!this.attachableResponse.isEmpty()))?this.getAttachableResponse():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "attachableResponse", theAttachableResponse), currentHashCode, theAttachableResponse);
        }
        {
            SyncErrorResponse theSyncErrorResponse;
            theSyncErrorResponse = this.getSyncErrorResponse();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "syncErrorResponse", theSyncErrorResponse), currentHashCode, theSyncErrorResponse);
        }
        {
            OLBTransaction theOLBTransaction;
            theOLBTransaction = this.getOLBTransaction();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "olbTransaction", theOLBTransaction), currentHashCode, theOLBTransaction);
        }
        {
            OLBStatus theOLBStatus;
            theOLBStatus = this.getOLBStatus();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "olbStatus", theOLBStatus), currentHashCode, theOLBStatus);
        }
        {
            String theRequestId;
            theRequestId = this.getRequestId();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "requestId", theRequestId), currentHashCode, theRequestId);
        }
        {
            Date theTime;
            theTime = this.getTime();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "time", theTime), currentHashCode, theTime);
        }
        {
            String theStatus;
            theStatus = this.getStatus();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "status", theStatus), currentHashCode, theStatus);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}