/** 
 *  Generated by OpenJPA MetaModel Generator Tool.
**/

package org.apache.ode.dao.jpa;

import javax.persistence.metamodel.SingularAttribute;

@javax.persistence.metamodel.StaticMetamodel
(value=org.apache.ode.dao.jpa.MessageDAOImpl.class)
@javax.annotation.Generated
(value="org.apache.openjpa.persistence.meta.AnnotationProcessor6",date="Thu Jan 29 09:37:29 IST 2015")
public class MessageDAOImpl_ {
    public static volatile SingularAttribute<MessageDAOImpl,String> _data;
    public static volatile SingularAttribute<MessageDAOImpl,String> _header;
    public static volatile SingularAttribute<MessageDAOImpl,Long> _id;
    public static volatile SingularAttribute<MessageDAOImpl,MessageExchangeDAOImpl> _messageExchange;
    public static volatile SingularAttribute<MessageDAOImpl,String> _type;
}