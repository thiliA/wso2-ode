create table ODE_SCHEMA_VERSION(VERSION integer);
insert into ODE_SCHEMA_VERSION values (6);
-- Apache ODE - SimpleScheduler Database Schema
--
-- Apache Derby scripts by Maciej Szefler.
--
--

CREATE TABLE ode_job (
  jobid CHAR(64)  NOT NULL DEFAULT '',
  ts BIGINT  NOT NULL DEFAULT 0,
  nodeid char(64),
  scheduled int  NOT NULL DEFAULT 0,
  transacted int  NOT NULL DEFAULT 0,

  instanceId BIGINT,
  mexId varchar(255),
  processId varchar(255),
  type varchar(255),
  channel varchar(255),
  correlatorId varchar(255),
  correlationKeySet varchar(255),
  retryCount int,
  inMem int,
  detailsExt blob(4096),

  PRIMARY KEY(jobid));

CREATE INDEX IDX_ODE_JOB_TS ON ode_job(ts);
CREATE INDEX IDX_ODE_JOB_NODEID ON ode_job(nodeid);


create table BPEL_ACTIVITY_RECOVERY (ID numeric(18,0) not null, PIID numeric(18,0), AID numeric(18,0), CHANNEL varchar(255), REASON varchar(255), DATE_TIME timestamp, DETAILS blob(2G), ACTIONS varchar(255), RETRIES integer, INSERT_TIME timestamp, MLOCK integer not null, primary key (ID));
create table BPEL_CORRELATION_PROP (ID numeric(18,0) not null, NAME varchar(255), NAMESPACE varchar(255), VALUE varchar(255), CORR_SET_ID numeric(18,0), INSERT_TIME timestamp, MLOCK integer not null, primary key (ID));
create table BPEL_CORRELATION_SET (ID numeric(18,0) not null, VALUE varchar(255), CORR_SET_NAME varchar(255), SCOPE_ID numeric(18,0), PIID numeric(18,0), PROCESS_ID numeric(18,0), INSERT_TIME timestamp, MLOCK integer not null, primary key (ID));
create table BPEL_CORRELATOR (ID numeric(18,0) not null, CID varchar(255), PROCESS_ID numeric(18,0), INSERT_TIME timestamp, MLOCK integer not null, primary key (ID));
create table BPEL_CORRELATOR_MESSAGE_CKEY (ID numeric(18,0) not null, CKEY varchar(255), CORRELATOR_MESSAGE_ID numeric(18,0), INSERT_TIME timestamp, MLOCK integer not null, primary key (ID));
create table BPEL_EVENT (ID numeric(18,0) not null, IID numeric(18,0), PID numeric(18,0), TSTAMP timestamp, TYPE varchar(255), DETAIL blob sub_type 1, DATA blob(2G), SID numeric(18,0), INSERT_TIME timestamp, MLOCK integer not null, primary key (ID));
create table BPEL_FAULT (ID numeric(18,0) not null, FAULTNAME varchar(255), DATA blob(2G), EXPLANATION varchar(4000), LINE_NUM integer, AID integer, INSERT_TIME timestamp, MLOCK integer not null, primary key (ID));
create table BPEL_INSTANCE (ID numeric(18,0) not null, INSTANTIATING_CORRELATOR numeric(18,0), FAULT numeric(18,0), JACOB_STATE_DATA blob(2G), PREVIOUS_STATE smallint, PROCESS_ID numeric(18,0), STATE smallint, LAST_ACTIVE_DT timestamp, SEQUENCE numeric(18,0), FAILURE_COUNT integer, FAILURE_DT timestamp, INSERT_TIME timestamp, MLOCK integer not null, primary key (ID));
create table BPEL_MESSAGE (ID numeric(18,0) not null, MEX numeric(18,0), TYPE varchar(255), MESSAGE_DATA blob(2G), MESSAGE_HEADER blob(2G), INSERT_TIME timestamp, MLOCK integer not null, primary key (ID));
create table BPEL_MESSAGE_EXCHANGE (ID numeric(18,0) not null, PORT_TYPE varchar(255), CHANNEL_NAME varchar(255), CLIENTKEY varchar(255), ENDPOINT blob(2G), CALLBACK_ENDPOINT blob(2G), REQUEST numeric(18,0), RESPONSE numeric(18,0), INSERT_DT timestamp, OPERATION varchar(255), STATE varchar(255), PROCESS numeric(18,0), PIID numeric(18,0), DIR char(1), PLINK_MODELID integer, PATTERN varchar(255), CORR_STATUS varchar(255), FAULT_TYPE varchar(255), FAULT_EXPL varchar(255), CALLEE varchar(255), PARTNERLINK numeric(18,0), PIPED_ID varchar(255), SUBSCRIBER_COUNT integer, INSERT_TIME timestamp, MLOCK integer not null, primary key (ID));
create table BPEL_MEX_PROPS (MEX numeric(18,0) not null, VALUE varchar(8000), NAME varchar(255) not null, primary key (MEX, NAME));
create table BPEL_PLINK_VAL (ID numeric(18,0) not null, PARTNER_LINK varchar(100) not null, PARTNERROLE varchar(100), MYROLE_EPR_DATA blob(2G), PARTNERROLE_EPR_DATA blob(2G), PROCESS numeric(18,0), SCOPE numeric(18,0), SVCNAME varchar(255), MYROLE varchar(100), MODELID integer, MYSESSIONID varchar(255), PARTNERSESSIONID varchar(255), INSERT_TIME timestamp, MLOCK integer not null, primary key (ID));
create table BPEL_PROCESS (ID numeric(18,0) not null, PROCID varchar(255) not null unique, deployer varchar(255), deploydate timestamp, type_name varchar(255), type_ns varchar(255), version numeric(18,0), ACTIVE_ smallint, guid varchar(255), INSERT_TIME timestamp, MLOCK integer not null, primary key (ID));
create table BPEL_SCOPE (ID numeric(18,0) not null, PIID numeric(18,0), PARENT_SCOPE_ID numeric(18,0), STATE varchar(255) not null, NAME varchar(255) not null, MODELID integer, INSERT_TIME timestamp, MLOCK integer not null, primary key (ID));
create table BPEL_SELECTORS (ID numeric(18,0) not null, PIID numeric(18,0) not null, SELGRPID varchar(255) not null, IDX integer not null, CORRELATION_KEY varchar(255) not null, PROC_TYPE varchar(255) not null, ROUTE_POLICY varchar(255), CORRELATOR numeric(18,0) not null, INSERT_TIME timestamp, MLOCK integer not null, primary key (ID), unique (CORRELATION_KEY, CORRELATOR));
create table BPEL_UNMATCHED (ID numeric(18,0) not null, MEX numeric(18,0), CORRELATION_KEY varchar(255), CORRELATOR numeric(18,0) not null, INSERT_TIME timestamp, MLOCK integer not null, primary key (ID));
create table BPEL_XML_DATA (ID numeric(18,0) not null, DATA blob(2G), NAME varchar(255) not null, SIMPLE_VALUE varchar(255), SCOPE_ID numeric(18,0), PIID numeric(18,0), IS_SIMPLE_TYPE smallint, INSERT_TIME timestamp, MLOCK integer not null, primary key (ID));
create table STORE_DU (NAME varchar(255) not null, deployer varchar(255), DEPLOYDT timestamp, DIR varchar(255), primary key (NAME));
create table STORE_PROCESS (PID varchar(255) not null, DU varchar(255), TYPE varchar(255), version numeric(18,0), STATE varchar(255), primary key (PID));
create table STORE_PROCESS_PROP (propId varchar(255) not null, value varchar(2048), name varchar(255) not null, primary key (propId, name));
create table STORE_VERSIONS (ID integer not null, VERSION numeric(18,0), primary key (ID));
create table TASK_ATTACHMENT (ID numeric(18,0) not null, ATTACHMENT_ID numeric(18,0), MESSAGE_EXCHANGE_ID numeric(18,0), INSERT_TIME timestamp, MLOCK integer not null, primary key (ID));
create table VAR_PROPERTY (ID numeric(18,0) not null, XML_DATA_ID numeric(18,0), PROP_VALUE varchar(255), PROP_NAME varchar(255) not null, INSERT_TIME timestamp, MLOCK integer not null, primary key (ID));
create index IDX_CORRELATOR_CID on BPEL_CORRELATOR (CID);
create index IDX_BPEL_CORRELATOR_MESSAGE_CKEY on BPEL_CORRELATOR_MESSAGE_CKEY (CKEY);
create index IDX_SELECTOR_SELGRPID on BPEL_SELECTORS (SELGRPID);
create index IDX_SELECTOR_CKEY on BPEL_SELECTORS (CORRELATION_KEY);
create index IDX_SELECTOR_CORRELATOR on BPEL_SELECTORS (CORRELATOR);
create index IDX_UNMATCHED_CORRELATOR on BPEL_UNMATCHED (CORRELATOR);
create index IDX_UNMATCHED_CKEY on BPEL_UNMATCHED (CORRELATION_KEY);
create generator hibernate_seqhilo;
