/*
 * XML Type:  cfLink__BaseType
 * Namespace: https://www.openaire.eu/cerif-profile/vocab/COAR_Patent_Types
 * Java type: eu.openaire.cerifProfile.vocab.coarPatentTypes.CfLinkBaseType
 *
 * Automatically generated - do not modify.
 */
package eu.openaire.cerifProfile.vocab.coarPatentTypes.impl;
/**
 * An XML cfLink__BaseType(@https://www.openaire.eu/cerif-profile/vocab/COAR_Patent_Types).
 *
 * This is a complex type.
 */
public class CfLinkBaseTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements eu.openaire.cerifProfile.vocab.coarPatentTypes.CfLinkBaseType
{
    private static final long serialVersionUID = 1L;
    
    public CfLinkBaseTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName STARTDATE$0 = 
        new javax.xml.namespace.QName("", "startDate");
    private static final javax.xml.namespace.QName ENDDATE$2 = 
        new javax.xml.namespace.QName("", "endDate");
    
    
    /**
     * Gets the "startDate" attribute
     */
    public java.util.Calendar getStartDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STARTDATE$0);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "startDate" attribute
     */
    public eu.openaire.cerifProfile.vocab.coarPatentTypes.CfGenericDateTimeSimpleType xgetStartDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.openaire.cerifProfile.vocab.coarPatentTypes.CfGenericDateTimeSimpleType target = null;
            target = (eu.openaire.cerifProfile.vocab.coarPatentTypes.CfGenericDateTimeSimpleType)get_store().find_attribute_user(STARTDATE$0);
            return target;
        }
    }
    
    /**
     * True if has "startDate" attribute
     */
    public boolean isSetStartDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(STARTDATE$0) != null;
        }
    }
    
    /**
     * Sets the "startDate" attribute
     */
    public void setStartDate(java.util.Calendar startDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STARTDATE$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(STARTDATE$0);
            }
            target.setCalendarValue(startDate);
        }
    }
    
    /**
     * Sets (as xml) the "startDate" attribute
     */
    public void xsetStartDate(eu.openaire.cerifProfile.vocab.coarPatentTypes.CfGenericDateTimeSimpleType startDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.openaire.cerifProfile.vocab.coarPatentTypes.CfGenericDateTimeSimpleType target = null;
            target = (eu.openaire.cerifProfile.vocab.coarPatentTypes.CfGenericDateTimeSimpleType)get_store().find_attribute_user(STARTDATE$0);
            if (target == null)
            {
                target = (eu.openaire.cerifProfile.vocab.coarPatentTypes.CfGenericDateTimeSimpleType)get_store().add_attribute_user(STARTDATE$0);
            }
            target.set(startDate);
        }
    }
    
    /**
     * Unsets the "startDate" attribute
     */
    public void unsetStartDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(STARTDATE$0);
        }
    }
    
    /**
     * Gets the "endDate" attribute
     */
    public java.util.Calendar getEndDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ENDDATE$2);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "endDate" attribute
     */
    public eu.openaire.cerifProfile.vocab.coarPatentTypes.CfGenericDateTimeSimpleType xgetEndDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.openaire.cerifProfile.vocab.coarPatentTypes.CfGenericDateTimeSimpleType target = null;
            target = (eu.openaire.cerifProfile.vocab.coarPatentTypes.CfGenericDateTimeSimpleType)get_store().find_attribute_user(ENDDATE$2);
            return target;
        }
    }
    
    /**
     * True if has "endDate" attribute
     */
    public boolean isSetEndDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ENDDATE$2) != null;
        }
    }
    
    /**
     * Sets the "endDate" attribute
     */
    public void setEndDate(java.util.Calendar endDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ENDDATE$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ENDDATE$2);
            }
            target.setCalendarValue(endDate);
        }
    }
    
    /**
     * Sets (as xml) the "endDate" attribute
     */
    public void xsetEndDate(eu.openaire.cerifProfile.vocab.coarPatentTypes.CfGenericDateTimeSimpleType endDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.openaire.cerifProfile.vocab.coarPatentTypes.CfGenericDateTimeSimpleType target = null;
            target = (eu.openaire.cerifProfile.vocab.coarPatentTypes.CfGenericDateTimeSimpleType)get_store().find_attribute_user(ENDDATE$2);
            if (target == null)
            {
                target = (eu.openaire.cerifProfile.vocab.coarPatentTypes.CfGenericDateTimeSimpleType)get_store().add_attribute_user(ENDDATE$2);
            }
            target.set(endDate);
        }
    }
    
    /**
     * Unsets the "endDate" attribute
     */
    public void unsetEndDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ENDDATE$2);
        }
    }
}
