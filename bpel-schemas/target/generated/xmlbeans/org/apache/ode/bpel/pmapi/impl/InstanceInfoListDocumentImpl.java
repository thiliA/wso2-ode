/*
 * An XML document type.
 * Localname: instance-info-list
 * Namespace: http://www.apache.org/ode/pmapi/types/2006/08/02/
 * Java type: org.apache.ode.bpel.pmapi.InstanceInfoListDocument
 *
 * Automatically generated - do not modify.
 */
package org.apache.ode.bpel.pmapi.impl;
/**
 * A document containing one instance-info-list(@http://www.apache.org/ode/pmapi/types/2006/08/02/) element.
 *
 * This is a complex type.
 */
public class InstanceInfoListDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.apache.ode.bpel.pmapi.InstanceInfoListDocument
{
    
    public InstanceInfoListDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName INSTANCEINFOLIST$0 = 
        new javax.xml.namespace.QName("http://www.apache.org/ode/pmapi/types/2006/08/02/", "instance-info-list");
    
    
    /**
     * Gets the "instance-info-list" element
     */
    public org.apache.ode.bpel.pmapi.TInstanceInfoList getInstanceInfoList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ode.bpel.pmapi.TInstanceInfoList target = null;
            target = (org.apache.ode.bpel.pmapi.TInstanceInfoList)get_store().find_element_user(INSTANCEINFOLIST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "instance-info-list" element
     */
    public void setInstanceInfoList(org.apache.ode.bpel.pmapi.TInstanceInfoList instanceInfoList)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ode.bpel.pmapi.TInstanceInfoList target = null;
            target = (org.apache.ode.bpel.pmapi.TInstanceInfoList)get_store().find_element_user(INSTANCEINFOLIST$0, 0);
            if (target == null)
            {
                target = (org.apache.ode.bpel.pmapi.TInstanceInfoList)get_store().add_element_user(INSTANCEINFOLIST$0);
            }
            target.set(instanceInfoList);
        }
    }
    
    /**
     * Appends and returns a new empty "instance-info-list" element
     */
    public org.apache.ode.bpel.pmapi.TInstanceInfoList addNewInstanceInfoList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ode.bpel.pmapi.TInstanceInfoList target = null;
            target = (org.apache.ode.bpel.pmapi.TInstanceInfoList)get_store().add_element_user(INSTANCEINFOLIST$0);
            return target;
        }
    }
}
