/*
 * XML Type:  ISBN-10__SimpleType
 * Namespace: https://www.openaire.eu/cerif-profile/1.1/
 * Java type: eu.openaire.cerifProfile.x11.ISBN10SimpleType
 *
 * Automatically generated - do not modify.
 */
package eu.openaire.cerifProfile.x11.impl;
/**
 * An XML ISBN-10__SimpleType(@https://www.openaire.eu/cerif-profile/1.1/).
 *
 * This is a union type. Instances are of one of the following types:
 *     eu.openaire.cerifProfile.x11.ISBN10SimpleType$Member
 *     eu.openaire.cerifProfile.x11.ISBN10SimpleType$Member2
 */
public class ISBN10SimpleTypeImpl extends org.apache.xmlbeans.impl.values.XmlUnionImpl implements eu.openaire.cerifProfile.x11.ISBN10SimpleType, eu.openaire.cerifProfile.x11.ISBN10SimpleType.Member, eu.openaire.cerifProfile.x11.ISBN10SimpleType.Member2
{
    private static final long serialVersionUID = 1L;
    
    public ISBN10SimpleTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType, false);
    }
    
    protected ISBN10SimpleTypeImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
    {
        super(sType, b);
    }
    /**
     * An anonymous inner XML type.
     *
     * This is an atomic type that is a restriction of eu.openaire.cerifProfile.x11.ISBN10SimpleType$Member.
     */
    public static class MemberImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements eu.openaire.cerifProfile.x11.ISBN10SimpleType.Member
    {
        private static final long serialVersionUID = 1L;
        
        public MemberImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }
        
        protected MemberImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
    /**
     * An anonymous inner XML type.
     *
     * This is an atomic type that is a restriction of eu.openaire.cerifProfile.x11.ISBN10SimpleType$Member2.
     */
    public static class MemberImpl2 extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements eu.openaire.cerifProfile.x11.ISBN10SimpleType.Member2
    {
        private static final long serialVersionUID = 1L;
        
        public MemberImpl2(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }
        
        protected MemberImpl2(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
}
