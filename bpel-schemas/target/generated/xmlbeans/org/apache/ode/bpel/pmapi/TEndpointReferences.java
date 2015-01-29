/*
 * XML Type:  tEndpointReferences
 * Namespace: http://www.apache.org/ode/pmapi/types/2006/08/02/
 * Java type: org.apache.ode.bpel.pmapi.TEndpointReferences
 *
 * Automatically generated - do not modify.
 */
package org.apache.ode.bpel.pmapi;


/**
 * An XML tEndpointReferences(@http://www.apache.org/ode/pmapi/types/2006/08/02/).
 *
 * This is a complex type.
 */
public interface TEndpointReferences extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(TEndpointReferences.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF2239578B6CD4A4C372986FE916CB4E0").resolveHandle("tendpointreferencese750type");
    
    /**
     * Gets a List of "endpoint-ref" elements
     */
    java.util.List<org.apache.ode.bpel.pmapi.TEndpointReferences.EndpointRef> getEndpointRefList();
    
    /**
     * Gets array of all "endpoint-ref" elements
     * @deprecated
     */
    org.apache.ode.bpel.pmapi.TEndpointReferences.EndpointRef[] getEndpointRefArray();
    
    /**
     * Gets ith "endpoint-ref" element
     */
    org.apache.ode.bpel.pmapi.TEndpointReferences.EndpointRef getEndpointRefArray(int i);
    
    /**
     * Returns number of "endpoint-ref" element
     */
    int sizeOfEndpointRefArray();
    
    /**
     * Sets array of all "endpoint-ref" element
     */
    void setEndpointRefArray(org.apache.ode.bpel.pmapi.TEndpointReferences.EndpointRef[] endpointRefArray);
    
    /**
     * Sets ith "endpoint-ref" element
     */
    void setEndpointRefArray(int i, org.apache.ode.bpel.pmapi.TEndpointReferences.EndpointRef endpointRef);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "endpoint-ref" element
     */
    org.apache.ode.bpel.pmapi.TEndpointReferences.EndpointRef insertNewEndpointRef(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "endpoint-ref" element
     */
    org.apache.ode.bpel.pmapi.TEndpointReferences.EndpointRef addNewEndpointRef();
    
    /**
     * Removes the ith "endpoint-ref" element
     */
    void removeEndpointRef(int i);
    
    /**
     * An XML endpoint-ref(@http://www.apache.org/ode/pmapi/types/2006/08/02/).
     *
     * This is a complex type.
     */
    public interface EndpointRef extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(EndpointRef.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF2239578B6CD4A4C372986FE916CB4E0").resolveHandle("endpointref2547elemtype");
        
        /**
         * Gets the "partner-link" attribute
         */
        java.lang.String getPartnerLink();
        
        /**
         * Gets (as xml) the "partner-link" attribute
         */
        org.apache.xmlbeans.XmlString xgetPartnerLink();
        
        /**
         * True if has "partner-link" attribute
         */
        boolean isSetPartnerLink();
        
        /**
         * Sets the "partner-link" attribute
         */
        void setPartnerLink(java.lang.String partnerLink);
        
        /**
         * Sets (as xml) the "partner-link" attribute
         */
        void xsetPartnerLink(org.apache.xmlbeans.XmlString partnerLink);
        
        /**
         * Unsets the "partner-link" attribute
         */
        void unsetPartnerLink();
        
        /**
         * Gets the "partner-role" attribute
         */
        java.lang.String getPartnerRole();
        
        /**
         * Gets (as xml) the "partner-role" attribute
         */
        org.apache.xmlbeans.XmlString xgetPartnerRole();
        
        /**
         * True if has "partner-role" attribute
         */
        boolean isSetPartnerRole();
        
        /**
         * Sets the "partner-role" attribute
         */
        void setPartnerRole(java.lang.String partnerRole);
        
        /**
         * Sets (as xml) the "partner-role" attribute
         */
        void xsetPartnerRole(org.apache.xmlbeans.XmlString partnerRole);
        
        /**
         * Unsets the "partner-role" attribute
         */
        void unsetPartnerRole();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static org.apache.ode.bpel.pmapi.TEndpointReferences.EndpointRef newInstance() {
              return (org.apache.ode.bpel.pmapi.TEndpointReferences.EndpointRef) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.apache.ode.bpel.pmapi.TEndpointReferences.EndpointRef newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.apache.ode.bpel.pmapi.TEndpointReferences.EndpointRef) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.apache.ode.bpel.pmapi.TEndpointReferences newInstance() {
          return (org.apache.ode.bpel.pmapi.TEndpointReferences) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.apache.ode.bpel.pmapi.TEndpointReferences newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.apache.ode.bpel.pmapi.TEndpointReferences) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.apache.ode.bpel.pmapi.TEndpointReferences parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.apache.ode.bpel.pmapi.TEndpointReferences) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.apache.ode.bpel.pmapi.TEndpointReferences parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.apache.ode.bpel.pmapi.TEndpointReferences) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.apache.ode.bpel.pmapi.TEndpointReferences parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.ode.bpel.pmapi.TEndpointReferences) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.apache.ode.bpel.pmapi.TEndpointReferences parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.ode.bpel.pmapi.TEndpointReferences) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.apache.ode.bpel.pmapi.TEndpointReferences parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.ode.bpel.pmapi.TEndpointReferences) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.apache.ode.bpel.pmapi.TEndpointReferences parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.ode.bpel.pmapi.TEndpointReferences) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.apache.ode.bpel.pmapi.TEndpointReferences parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.ode.bpel.pmapi.TEndpointReferences) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.apache.ode.bpel.pmapi.TEndpointReferences parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.ode.bpel.pmapi.TEndpointReferences) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.apache.ode.bpel.pmapi.TEndpointReferences parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.ode.bpel.pmapi.TEndpointReferences) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.apache.ode.bpel.pmapi.TEndpointReferences parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.ode.bpel.pmapi.TEndpointReferences) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.apache.ode.bpel.pmapi.TEndpointReferences parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.apache.ode.bpel.pmapi.TEndpointReferences) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.apache.ode.bpel.pmapi.TEndpointReferences parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.apache.ode.bpel.pmapi.TEndpointReferences) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.apache.ode.bpel.pmapi.TEndpointReferences parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.apache.ode.bpel.pmapi.TEndpointReferences) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.apache.ode.bpel.pmapi.TEndpointReferences parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.apache.ode.bpel.pmapi.TEndpointReferences) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.ode.bpel.pmapi.TEndpointReferences parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.apache.ode.bpel.pmapi.TEndpointReferences) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.ode.bpel.pmapi.TEndpointReferences parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.apache.ode.bpel.pmapi.TEndpointReferences) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}