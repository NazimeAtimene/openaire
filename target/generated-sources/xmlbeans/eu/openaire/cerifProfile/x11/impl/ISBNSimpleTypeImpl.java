/*
 * XML Type:  ISBN__SimpleType
 * Namespace: https://www.openaire.eu/cerif-profile/1.1/
 * Java type: eu.openaire.cerifProfile.x11.ISBNSimpleType
 *
 * Automatically generated - do not modify.
 */
package eu.openaire.cerifProfile.x11.impl;
/**
 * An XML ISBN__SimpleType(@https://www.openaire.eu/cerif-profile/1.1/).
 *
 * This is a union type. Instances are of one of the following types:
 *     eu.openaire.cerifProfile.x11.ISBN13SimpleType$Member
 *     eu.openaire.cerifProfile.x11.ISBN13SimpleType$Member2
 *     eu.openaire.cerifProfile.x11.ISBN10SimpleType$Member
 *     eu.openaire.cerifProfile.x11.ISBN10SimpleType$Member2
 */
public class ISBNSimpleTypeImpl extends org.apache.xmlbeans.impl.values.XmlUnionImpl implements eu.openaire.cerifProfile.x11.ISBNSimpleType, eu.openaire.cerifProfile.x11.ISBN13SimpleType, eu.openaire.cerifProfile.x11.ISBN10SimpleType
{
    private static final long serialVersionUID = 1L;
    
    public ISBNSimpleTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType, false);
    }
    
    protected ISBNSimpleTypeImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
    {
        super(sType, b);
    }
}
