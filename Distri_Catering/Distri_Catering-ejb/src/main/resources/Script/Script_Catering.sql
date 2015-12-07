/*==============================================================*/
/* DBMS name:      ORACLE Version 10g                           */
/* Created on:     7/12/2015 13:08:19                           */
/*==============================================================*/


alter table DETALLE_ALIMENTACION
   drop constraint FK_DETALLE__PK_ALIMEN_ALIMENTA;

alter table DETALLE_ALIMENTACION
   drop constraint FK_DETALLE__PK_DET_AL_PAQUETE;

alter table DETALLE_FACTURA
   drop constraint FK_DETALLE__PK_DET_FA_PAQUETE;

alter table DETALLE_FACTURA
   drop constraint FK_DETALLE__PK_FACTUR_FACTURA;

alter table DETALLE_MOBILIARIO
   drop constraint FK_DETALLE__PK_MOBILI_MOBILIAR;

alter table DETALLE_MOBILIARIO
   drop constraint FK_DETALLE__PK_PAQUET_PAQUETE;

alter table DETALLE_SERVICIO
   drop constraint FK_DETALLE__PK_DETALL_PAQUETE;

alter table DETALLE_SERVICIO
   drop constraint FK_DETALLE__PK_SERVIC_SERVICIO;

alter table EVENTO
   drop constraint FK_EVENTO_PK_EVENTO_PAQUETE;

alter table EVENTO
   drop constraint FK_EVENTO_PK_TIPO_E_TIPO_EVE;

alter table FACTURA
   drop constraint FK_FACTURA_PK_CLIENT_CLIENTE;

alter table MOBILIARIO
   drop constraint FK_MOBILIAR_PK_TIPO_M_TIPO_MOB;

drop table ALIMENTACION cascade constraints;

drop table CLIENTE cascade constraints;

drop table DETALLE_ALIMENTACION cascade constraints;

drop table DETALLE_FACTURA cascade constraints;

drop table DETALLE_MOBILIARIO cascade constraints;

drop table DETALLE_SERVICIO cascade constraints;

drop table EVENTO cascade constraints;

drop table FACTURA cascade constraints;

drop table MOBILIARIO cascade constraints;

drop table PAQUETE cascade constraints;

drop table SERVICIO cascade constraints;

drop table TIPO_EVENTO cascade constraints;

drop table TIPO_MOBILIARIO cascade constraints;

drop table USUARIO cascade constraints;

drop sequence SEQUENCE_1;

create sequence SEQUENCE_1;

/*==============================================================*/
/* Table: ALIMENTACION                                          */
/*==============================================================*/
create table ALIMENTACION  (
   COD_ALIMENTACION     INTEGER                         not null,
   NOMBRE               VARCHAR2(50)                    not null,
   CATEGORIA            VARCHAR2(200)                   not null,
   VALOR                NUMBER(5,2)                     not null,
   DETALLE              VARCHAR2(200)                   not null,
   constraint PK_ALIMENTACION primary key (COD_ALIMENTACION)
);

/*==============================================================*/
/* Table: CLIENTE                                               */
/*==============================================================*/
create table CLIENTE  (
   CLI_IDENTIFICACION   VARCHAR2(20)                    not null,
   NOMBRE               VARCHAR2(50)                    not null,
   APELLIDO             VARCHAR2(50)                    not null,
   CLI_TELEFONO1        VARCHAR2(15)                    not null,
   CORREO               VARCHAR2(50)                    not null,
   DIRECCION            VARCHAR2(200),
   constraint PK_CLIENTE primary key (CLI_IDENTIFICACION)
);

/*==============================================================*/
/* Table: DETALLE_ALIMENTACION                                  */
/*==============================================================*/
create table DETALLE_ALIMENTACION  (
   COD_PAQUETE          INTEGER                         not null,
   COD_ALIMENTACION     INTEGER                         not null,
   CANTIDAD             INTEGER                         not null,
   VALOR_TOTAL          NUMBER(6,2),
   constraint PK_DETALLE_ALIMENTACION primary key (COD_PAQUETE, COD_ALIMENTACION)
);

/*==============================================================*/
/* Table: DETALLE_FACTURA                                       */
/*==============================================================*/
create table DETALLE_FACTURA  (
   COD_FACTURA          INTEGER                         not null,
   COD_PAQUETE          INTEGER                         not null,
   PRECIO               NUMBER(12,2)                    not null,
   TOTAL                NUMBER(12,2)                    not null,
   constraint PK_DETALLE_FACTURA primary key (COD_FACTURA, COD_PAQUETE)
);

/*==============================================================*/
/* Table: DETALLE_MOBILIARIO                                    */
/*==============================================================*/
create table DETALLE_MOBILIARIO  (
   COD_PAQUETE          INTEGER                         not null,
   COD_MOBILIARIO       INTEGER                         not null,
   CANTIDAD             INTEGER,
   VALOR_TOTAL          NUMBER(6,2),
   constraint PK_DETALLE_MOBILIARIO primary key (COD_PAQUETE, COD_MOBILIARIO)
);

/*==============================================================*/
/* Table: DETALLE_SERVICIO                                      */
/*==============================================================*/
create table DETALLE_SERVICIO  (
   SERV_COD_SERVICIO    INTEGER                         not null,
   COD_PAQUETE          INTEGER                         not null,
   CANTIDAD             INTEGER                         not null,
   VALOR_TOTAL          NUMBER(5,2)                     not null,
   constraint PK_DETALLE_SERVICIO primary key (SERV_COD_SERVICIO, COD_PAQUETE)
);

/*==============================================================*/
/* Table: EVENTO                                                */
/*==============================================================*/
create table EVENTO  (
   COD_EVENTO           INTEGER                         not null,
   COD_TIPO_EVENTO      INTEGER                         not null,
   COD_PAQUETE          INTEGER                         not null,
   FECHA_EVENTO         TIMESTAMP,
   ASISTENTES           INTEGER,
   DIRECCION            VARCHAR2(200),
   TELEFONO             VARCHAR2(15),
   constraint PK_EVENTO primary key (COD_EVENTO)
);

/*==============================================================*/
/* Table: FACTURA                                               */
/*==============================================================*/
create table FACTURA  (
   COD_FACTURA          INTEGER                         not null,
   CLI_IDENTIFICACION   VARCHAR2(20)                    not null,
   FECHA                TIMESTAMP,
   constraint PK_FACTURA primary key (COD_FACTURA)
);

/*==============================================================*/
/* Table: MOBILIARIO                                            */
/*==============================================================*/
create table MOBILIARIO  (
   COD_MOBILIARIO       INTEGER                         not null,
   COD_TIPO_MOBILIARIO  INTEGER                         not null,
   NOMBRE               VARCHAR2(20),
   EXISTENCIA           INTEGER,
   VALOR                NUMBER(6,2),
   constraint PK_MOBILIARIO primary key (COD_MOBILIARIO)
);

/*==============================================================*/
/* Table: PAQUETE                                               */
/*==============================================================*/
create table PAQUETE  (
   COD_PAQUETE          INTEGER                         not null,
   NOMBRE               VARCHAR2(20)                    not null,
   ACTIVO               SMALLINT,
   PRECIO_FINAL         NUMBER(6,2),
   ITEMS                INTEGER,
   constraint PK_PAQUETE primary key (COD_PAQUETE)
);

/*==============================================================*/
/* Table: SERVICIO                                              */
/*==============================================================*/
create table SERVICIO  (
   SERV_COD_SERVICIO    INTEGER                         not null,
   TIPO_SERVICIO        VARCHAR2(20),
   VALOR                NUMBER(5,2),
   constraint PK_SERVICIO primary key (SERV_COD_SERVICIO)
);

/*==============================================================*/
/* Table: TIPO_EVENTO                                           */
/*==============================================================*/
create table TIPO_EVENTO  (
   COD_TIPO_EVENTO      INTEGER                         not null,
   NOMBRE               VARCHAR2(20),
   DETALLE              VARCHAR2(200),
   constraint PK_TIPO_EVENTO primary key (COD_TIPO_EVENTO)
);

/*==============================================================*/
/* Table: TIPO_MOBILIARIO                                       */
/*==============================================================*/
create table TIPO_MOBILIARIO  (
   COD_TIPO_MOBILIARIO  INTEGER                         not null,
   NOMBRE               VARCHAR2(20),
   DESCRIPCION          VARCHAR2(200),
   constraint PK_TIPO_MOBILIARIO primary key (COD_TIPO_MOBILIARIO)
);

/*==============================================================*/
/* Table: USUARIO                                               */
/*==============================================================*/
create table USUARIO  (
   COD_USUARIO          INTEGER                         not null,
   NOMBRE               VARCHAR2(20),
   CONTRASENIA          VARCHAR2(20),
   ESTADO               VARCHAR2(3),
   CORREO               VARCHAR2(50),
   constraint PK_USUARIO primary key (COD_USUARIO)
);

alter table DETALLE_ALIMENTACION
   add constraint FK_DETALLE__PK_ALIMEN_ALIMENTA foreign key (COD_ALIMENTACION)
      references ALIMENTACION (COD_ALIMENTACION);

alter table DETALLE_ALIMENTACION
   add constraint FK_DETALLE__PK_DET_AL_PAQUETE foreign key (COD_PAQUETE)
      references PAQUETE (COD_PAQUETE);

alter table DETALLE_FACTURA
   add constraint FK_DETALLE__PK_DET_FA_PAQUETE foreign key (COD_PAQUETE)
      references PAQUETE (COD_PAQUETE);

alter table DETALLE_FACTURA
   add constraint FK_DETALLE__PK_FACTUR_FACTURA foreign key (COD_FACTURA)
      references FACTURA (COD_FACTURA);

alter table DETALLE_MOBILIARIO
   add constraint FK_DETALLE__PK_MOBILI_MOBILIAR foreign key (COD_MOBILIARIO)
      references MOBILIARIO (COD_MOBILIARIO);

alter table DETALLE_MOBILIARIO
   add constraint FK_DETALLE__PK_PAQUET_PAQUETE foreign key (COD_PAQUETE)
      references PAQUETE (COD_PAQUETE);

alter table DETALLE_SERVICIO
   add constraint FK_DETALLE__PK_DETALL_PAQUETE foreign key (COD_PAQUETE)
      references PAQUETE (COD_PAQUETE);

alter table DETALLE_SERVICIO
   add constraint FK_DETALLE__PK_SERVIC_SERVICIO foreign key (SERV_COD_SERVICIO)
      references SERVICIO (SERV_COD_SERVICIO);

alter table EVENTO
   add constraint FK_EVENTO_PK_EVENTO_PAQUETE foreign key (COD_PAQUETE)
      references PAQUETE (COD_PAQUETE);

alter table EVENTO
   add constraint FK_EVENTO_PK_TIPO_E_TIPO_EVE foreign key (COD_TIPO_EVENTO)
      references TIPO_EVENTO (COD_TIPO_EVENTO);

alter table FACTURA
   add constraint FK_FACTURA_PK_CLIENT_CLIENTE foreign key (CLI_IDENTIFICACION)
      references CLIENTE (CLI_IDENTIFICACION);

alter table MOBILIARIO
   add constraint FK_MOBILIAR_PK_TIPO_M_TIPO_MOB foreign key (COD_TIPO_MOBILIARIO)
      references TIPO_MOBILIARIO (COD_TIPO_MOBILIARIO);

