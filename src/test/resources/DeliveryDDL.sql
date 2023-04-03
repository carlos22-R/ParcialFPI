--
-- PostgreSQL database dump
--

-- Dumped from database version 13.6
-- Dumped by pg_dump version 15.2 (Debian 15.2-2)

--
-- Name: public; Type: SCHEMA; Schema: -; Owner: postgres
--

-- *not* creating schema, since initdb creates it


ALTER SCHEMA public OWNER TO postgres;

SET default_tablespace = '';

SET default_table_access_method = heap;

--
-- Name: cliente; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.cliente (
    id_cliente bigint NOT NULL,
    nombres character varying(155),
    apellidos character varying(155),
    id_direccion_actual bigint,
    fecha_nacimiento date
);


ALTER TABLE public.cliente OWNER TO postgres;

--
-- Name: cliente_id_cliente_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.cliente_id_cliente_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.cliente_id_cliente_seq OWNER TO postgres;

--
-- Name: cliente_id_cliente_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public.cliente_id_cliente_seq OWNED BY public.cliente.id_cliente;


--
-- Name: tipo_comercio; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.tipo_comercio (
    id_tipo_comercio integer NOT NULL,
    id_tipo_comercio_padre integer,
    nombre character varying(155),
    activo boolean,
    comentarios text
);


ALTER TABLE public.tipo_comercio OWNER TO postgres;

--
-- Name: comercio_id_comercio_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.comercio_id_comercio_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    MAXVALUE 2147483647
    CACHE 1;


ALTER TABLE public.comercio_id_comercio_seq OWNER TO postgres;

--
-- Name: comercio_id_comercio_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public.comercio_id_comercio_seq OWNED BY public.tipo_comercio.id_tipo_comercio;


--
-- Name: comercio; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.comercio (
    id_comercio bigint DEFAULT nextval('public.comercio_id_comercio_seq'::regclass) NOT NULL,
    nombre character varying(255),
    activo boolean,
    descripcion text
);


ALTER TABLE public.comercio OWNER TO postgres;

--
-- Name: comercio_tipo_comercio; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.comercio_tipo_comercio (
    id_comercio integer NOT NULL,
    id_tipo_comercio integer NOT NULL,
    activo boolean,
    fecha_creacion date
);


ALTER TABLE public.comercio_tipo_comercio OWNER TO postgres;

--
-- Name: direccion; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.direccion (
    id_direccion bigint NOT NULL,
    id_territorio integer,
    direccion text,
    referencias text,
    longitud numeric(10,5),
    latitud numeric(10,5)
);


ALTER TABLE public.direccion OWNER TO postgres;

--
-- Name: direccion_id_direccion_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.direccion_id_direccion_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.direccion_id_direccion_seq OWNER TO postgres;

--
-- Name: direccion_id_direccion_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public.direccion_id_direccion_seq OWNED BY public.direccion.id_direccion;


--
-- Name: entrega; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.entrega (
    id_entrega bigint NOT NULL,
    id_repartidor bigint,
    id_vehiculo bigint,
    fecha_creacion timestamp with time zone,
    observaciones text,
    id_orden bigint
);


ALTER TABLE public.entrega OWNER TO postgres;

--
-- Name: entrega_historial; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.entrega_historial (
    id_entrega_historial bigint NOT NULL,
    id_entrega bigint,
    estado_entrega character varying(10),
    fecha_alcanzado timestamp with time zone,
    longitud numeric(10,5),
    latitud numeric(10,5),
    observaciones text
);


ALTER TABLE public.entrega_historial OWNER TO postgres;

--
-- Name: entrega_historial_id_entrega_historial_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.entrega_historial_id_entrega_historial_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.entrega_historial_id_entrega_historial_seq OWNER TO postgres;

--
-- Name: entrega_historial_id_entrega_historial_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public.entrega_historial_id_entrega_historial_seq OWNED BY public.entrega_historial.id_entrega_historial;


--
-- Name: entrega_id_entrega_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.entrega_id_entrega_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.entrega_id_entrega_seq OWNER TO postgres;

--
-- Name: entrega_id_entrega_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public.entrega_id_entrega_seq OWNED BY public.entrega.id_entrega;


--
-- Name: factura; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.factura (
    numero_factura text NOT NULL,
    id_orden bigint,
    fecha_emision timestamp with time zone,
    anulada boolean,
    observaciones text
);


ALTER TABLE public.factura OWNER TO postgres;

--
-- Name: menu_comercio; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.menu_comercio (
    id_menu bigint NOT NULL,
    id_comercio bigint,
    id_producto bigint,
    nombre character varying(255),
    descripcion text,
    precio_base numeric(12,5) DEFAULT 0.0
);


ALTER TABLE public.menu_comercio OWNER TO postgres;

--
-- Name: menu_comercio_id_menu_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.menu_comercio_id_menu_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.menu_comercio_id_menu_seq OWNER TO postgres;

--
-- Name: menu_comercio_id_menu_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public.menu_comercio_id_menu_seq OWNED BY public.menu_comercio.id_menu;


--
-- Name: orden; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.orden (
    id_orden bigint NOT NULL,
    fecha_orden timestamp with time zone,
    id_cliente bigint,
    id_sucursal integer,
    observaciones text,
    id_direccion bigint
);


ALTER TABLE public.orden OWNER TO postgres;

--
-- Name: orden_detalle; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.orden_detalle (
    id_orden bigint NOT NULL,
    id_menu bigint NOT NULL,
    cantidad numeric(12,5),
    precio numeric(12,5),
    observaciones text
);


ALTER TABLE public.orden_detalle OWNER TO postgres;

--
-- Name: orden_estado; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.orden_estado (
    id_orden_estado bigint NOT NULL,
    id_orden bigint,
    estado character varying(10),
    fecha_creacion timestamp with time zone,
    comentarios text
);


ALTER TABLE public.orden_estado OWNER TO postgres;

--
-- Name: orden_estado_id_orden_estado_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.orden_estado_id_orden_estado_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.orden_estado_id_orden_estado_seq OWNER TO postgres;

--
-- Name: orden_estado_id_orden_estado_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public.orden_estado_id_orden_estado_seq OWNED BY public.orden_estado.id_orden_estado;


--
-- Name: orden_id_orden_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.orden_id_orden_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.orden_id_orden_seq OWNER TO postgres;

--
-- Name: orden_id_orden_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public.orden_id_orden_seq OWNED BY public.orden.id_orden;


--
-- Name: pago; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.pago (
    id_pago bigint NOT NULL,
    numero_factura text,
    tipo_pago character varying(10),
    monto numeric(12,5),
    referencia text,
    estado character varying(10)
);


ALTER TABLE public.pago OWNER TO postgres;

--
-- Name: pago_id_pago_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.pago_id_pago_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.pago_id_pago_seq OWNER TO postgres;

--
-- Name: pago_id_pago_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public.pago_id_pago_seq OWNED BY public.pago.id_pago;


--
-- Name: producto; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.producto (
    id_producto integer NOT NULL,
    nombre character varying(255),
    activo boolean,
    descripcion text
);


ALTER TABLE public.producto OWNER TO postgres;

--
-- Name: producto_comercio; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.producto_comercio (
    id_producto integer NOT NULL,
    id_comercio bigint NOT NULL,
    activo boolean,
    fecha_creacion date
);


ALTER TABLE public.producto_comercio OWNER TO postgres;

--
-- Name: producto_id_producto_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.producto_id_producto_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.producto_id_producto_seq OWNER TO postgres;

--
-- Name: producto_id_producto_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public.producto_id_producto_seq OWNED BY public.producto.id_producto;


--
-- Name: producto_tipo_producto; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.producto_tipo_producto (
    id_producto integer NOT NULL,
    id_tipo_producto integer NOT NULL,
    activo boolean,
    fecha_creacion date
);


ALTER TABLE public.producto_tipo_producto OWNER TO postgres;

--
-- Name: repartidor; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.repartidor (
    id_repartidor bigint NOT NULL,
    nombres character varying(255),
    apellidos character varying(255),
    tipo_licencia character varying(10),
    fecha_nacimiento date,
    activo boolean,
    observaciones text
);


ALTER TABLE public.repartidor OWNER TO postgres;

--
-- Name: repartidor_id_repartidor_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.repartidor_id_repartidor_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.repartidor_id_repartidor_seq OWNER TO postgres;

--
-- Name: repartidor_id_repartidor_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public.repartidor_id_repartidor_seq OWNED BY public.repartidor.id_repartidor;


--
-- Name: sucursal; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.sucursal (
    id_sucursal integer NOT NULL,
    id_comercio bigint,
    nombre character varying(255) NOT NULL,
    path_logo text,
    id_direccion bigint
);


ALTER TABLE public.sucursal OWNER TO postgres;

--
-- Name: sucursal_id_sucursal_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.sucursal_id_sucursal_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    MAXVALUE 2147483647
    CACHE 1;


ALTER TABLE public.sucursal_id_sucursal_seq OWNER TO postgres;

--
-- Name: sucursal_id_sucursal_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public.sucursal_id_sucursal_seq OWNED BY public.sucursal.id_sucursal;


--
-- Name: territorio; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.territorio (
    id_territorio integer NOT NULL,
    id_territorio_padre integer,
    nombre character varying(255),
    texto_visible character varying(155),
    hijos_obligatorios integer
);


ALTER TABLE public.territorio OWNER TO postgres;

--
-- Name: territorio_id_territorio_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.territorio_id_territorio_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.territorio_id_territorio_seq OWNER TO postgres;

--
-- Name: territorio_id_territorio_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public.territorio_id_territorio_seq OWNED BY public.territorio.id_territorio;


--
-- Name: tipo_comercio_id_tipo_comercio_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.tipo_comercio_id_tipo_comercio_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.tipo_comercio_id_tipo_comercio_seq OWNER TO postgres;

--
-- Name: tipo_comercio_id_tipo_comercio_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public.tipo_comercio_id_tipo_comercio_seq OWNED BY public.tipo_comercio.id_tipo_comercio;


--
-- Name: tipo_producto; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.tipo_producto (
    id_tipo_producto integer NOT NULL,
    id_tipo_producto_padre integer,
    nombre character varying(155),
    activo boolean,
    comentarios text
);


ALTER TABLE public.tipo_producto OWNER TO postgres;

--
-- Name: tipo_producto_id_tipo_producto_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.tipo_producto_id_tipo_producto_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.tipo_producto_id_tipo_producto_seq OWNER TO postgres;

--
-- Name: tipo_producto_id_tipo_producto_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public.tipo_producto_id_tipo_producto_seq OWNED BY public.tipo_producto.id_tipo_producto;


--
-- Name: tipo_producto_tipo_comercio; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.tipo_producto_tipo_comercio (
    id_tipo_producto integer NOT NULL,
    id_tipo_comercio integer NOT NULL,
    activo boolean,
    fecha_creacion date
);


ALTER TABLE public.tipo_producto_tipo_comercio OWNER TO postgres;

--
-- Name: vehiculo; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.vehiculo (
    id_vehiculo bigint NOT NULL,
    tipo_vehiculo character varying(10),
    placa text,
    propietario character varying(255),
    activo boolean,
    comentarios text
);


ALTER TABLE public.vehiculo OWNER TO postgres;

--
-- Name: vehiculo_id_vehiculo_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.vehiculo_id_vehiculo_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.vehiculo_id_vehiculo_seq OWNER TO postgres;

--
-- Name: vehiculo_id_vehiculo_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public.vehiculo_id_vehiculo_seq OWNED BY public.vehiculo.id_vehiculo;


--
-- Name: cliente id_cliente; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.cliente ALTER COLUMN id_cliente SET DEFAULT nextval('public.cliente_id_cliente_seq'::regclass);


--
-- Name: direccion id_direccion; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.direccion ALTER COLUMN id_direccion SET DEFAULT nextval('public.direccion_id_direccion_seq'::regclass);


--
-- Name: entrega id_entrega; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.entrega ALTER COLUMN id_entrega SET DEFAULT nextval('public.entrega_id_entrega_seq'::regclass);


--
-- Name: entrega_historial id_entrega_historial; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.entrega_historial ALTER COLUMN id_entrega_historial SET DEFAULT nextval('public.entrega_historial_id_entrega_historial_seq'::regclass);


--
-- Name: menu_comercio id_menu; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.menu_comercio ALTER COLUMN id_menu SET DEFAULT nextval('public.menu_comercio_id_menu_seq'::regclass);


--
-- Name: orden id_orden; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.orden ALTER COLUMN id_orden SET DEFAULT nextval('public.orden_id_orden_seq'::regclass);


--
-- Name: orden_estado id_orden_estado; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.orden_estado ALTER COLUMN id_orden_estado SET DEFAULT nextval('public.orden_estado_id_orden_estado_seq'::regclass);


--
-- Name: pago id_pago; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.pago ALTER COLUMN id_pago SET DEFAULT nextval('public.pago_id_pago_seq'::regclass);


--
-- Name: producto id_producto; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.producto ALTER COLUMN id_producto SET DEFAULT nextval('public.producto_id_producto_seq'::regclass);


--
-- Name: repartidor id_repartidor; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.repartidor ALTER COLUMN id_repartidor SET DEFAULT nextval('public.repartidor_id_repartidor_seq'::regclass);


--
-- Name: sucursal id_sucursal; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.sucursal ALTER COLUMN id_sucursal SET DEFAULT nextval('public.sucursal_id_sucursal_seq'::regclass);


--
-- Name: territorio id_territorio; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.territorio ALTER COLUMN id_territorio SET DEFAULT nextval('public.territorio_id_territorio_seq'::regclass);


--
-- Name: tipo_comercio id_tipo_comercio; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.tipo_comercio ALTER COLUMN id_tipo_comercio SET DEFAULT nextval('public.tipo_comercio_id_tipo_comercio_seq'::regclass);


--
-- Name: tipo_producto id_tipo_producto; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.tipo_producto ALTER COLUMN id_tipo_producto SET DEFAULT nextval('public.tipo_producto_id_tipo_producto_seq'::regclass);


--
-- Name: vehiculo id_vehiculo; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.vehiculo ALTER COLUMN id_vehiculo SET DEFAULT nextval('public.vehiculo_id_vehiculo_seq'::regclass);


--
-- Name: comercio comercio_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.comercio
    ADD CONSTRAINT comercio_pkey PRIMARY KEY (id_comercio);


--
-- Name: direccion direccion_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.direccion
    ADD CONSTRAINT direccion_pkey PRIMARY KEY (id_direccion);


--
-- Name: cliente pk_cliente; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.cliente
    ADD CONSTRAINT pk_cliente PRIMARY KEY (id_cliente);


--
-- Name: comercio_tipo_comercio pk_comercio_tipo_comercio; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.comercio_tipo_comercio
    ADD CONSTRAINT pk_comercio_tipo_comercio PRIMARY KEY (id_comercio, id_tipo_comercio);


--
-- Name: entrega pk_entrega; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.entrega
    ADD CONSTRAINT pk_entrega PRIMARY KEY (id_entrega);


--
-- Name: entrega_historial pk_entrega_historial; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.entrega_historial
    ADD CONSTRAINT pk_entrega_historial PRIMARY KEY (id_entrega_historial);


--
-- Name: factura pk_factura; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.factura
    ADD CONSTRAINT pk_factura PRIMARY KEY (numero_factura);


--
-- Name: menu_comercio pk_menu; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.menu_comercio
    ADD CONSTRAINT pk_menu PRIMARY KEY (id_menu);


--
-- Name: orden pk_orden; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.orden
    ADD CONSTRAINT pk_orden PRIMARY KEY (id_orden);


--
-- Name: orden_detalle pk_orden_detalle; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.orden_detalle
    ADD CONSTRAINT pk_orden_detalle PRIMARY KEY (id_orden, id_menu);


--
-- Name: orden_estado pk_orden_estado; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.orden_estado
    ADD CONSTRAINT pk_orden_estado PRIMARY KEY (id_orden_estado);


--
-- Name: pago pk_pago; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.pago
    ADD CONSTRAINT pk_pago PRIMARY KEY (id_pago);


--
-- Name: producto_comercio pk_producto_comercio; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.producto_comercio
    ADD CONSTRAINT pk_producto_comercio PRIMARY KEY (id_producto, id_comercio);


--
-- Name: repartidor pk_repartidor; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.repartidor
    ADD CONSTRAINT pk_repartidor PRIMARY KEY (id_repartidor);


--
-- Name: sucursal pk_sucursal; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.sucursal
    ADD CONSTRAINT pk_sucursal PRIMARY KEY (id_sucursal);


--
-- Name: territorio pk_territorio; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.territorio
    ADD CONSTRAINT pk_territorio PRIMARY KEY (id_territorio);


--
-- Name: tipo_producto_tipo_comercio pk_tipo_producto_tipo_comercio; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.tipo_producto_tipo_comercio
    ADD CONSTRAINT pk_tipo_producto_tipo_comercio PRIMARY KEY (id_tipo_producto, id_tipo_comercio);


--
-- Name: vehiculo pk_vehiculo; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.vehiculo
    ADD CONSTRAINT pk_vehiculo PRIMARY KEY (id_vehiculo);


--
-- Name: producto producto_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.producto
    ADD CONSTRAINT producto_pkey PRIMARY KEY (id_producto);


--
-- Name: producto_tipo_producto producto_tipo_producto_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.producto_tipo_producto
    ADD CONSTRAINT producto_tipo_producto_pkey PRIMARY KEY (id_producto, id_tipo_producto);


--
-- Name: tipo_comercio tipo_comercio_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.tipo_comercio
    ADD CONSTRAINT tipo_comercio_pkey PRIMARY KEY (id_tipo_comercio);


--
-- Name: tipo_producto tipo_producto_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.tipo_producto
    ADD CONSTRAINT tipo_producto_pkey PRIMARY KEY (id_tipo_producto);


--
-- Name: fki_fk_direccion_territorio; Type: INDEX; Schema: public; Owner: postgres
--

CREATE INDEX fki_fk_direccion_territorio ON public.direccion USING btree (id_territorio);


--
-- Name: fki_fk_factura_orden; Type: INDEX; Schema: public; Owner: postgres
--

CREATE INDEX fki_fk_factura_orden ON public.factura USING btree (id_orden);


--
-- Name: fki_fk_territorio_territorio; Type: INDEX; Schema: public; Owner: postgres
--

CREATE INDEX fki_fk_territorio_territorio ON public.territorio USING btree (id_territorio_padre);


--
-- Name: fki_fk_tipo_comercio_tipo_comercio; Type: INDEX; Schema: public; Owner: postgres
--

CREATE INDEX fki_fk_tipo_comercio_tipo_comercio ON public.tipo_comercio USING btree (id_tipo_comercio_padre);


--
-- Name: fki_fk_tipo_producto_tipo_producto; Type: INDEX; Schema: public; Owner: postgres
--

CREATE INDEX fki_fk_tipo_producto_tipo_producto ON public.tipo_producto USING btree (id_tipo_producto_padre);


--
-- Name: comercio_tipo_comercio fk_comercio_tipo_comercio_comercio; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.comercio_tipo_comercio
    ADD CONSTRAINT fk_comercio_tipo_comercio_comercio FOREIGN KEY (id_comercio) REFERENCES public.comercio(id_comercio) ON UPDATE CASCADE ON DELETE RESTRICT;


--
-- Name: comercio_tipo_comercio fk_comercio_tipo_comercio_tipo_comercio; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.comercio_tipo_comercio
    ADD CONSTRAINT fk_comercio_tipo_comercio_tipo_comercio FOREIGN KEY (id_tipo_comercio) REFERENCES public.tipo_comercio(id_tipo_comercio) ON UPDATE CASCADE ON DELETE RESTRICT;


--
-- Name: direccion fk_direccion_territorio; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.direccion
    ADD CONSTRAINT fk_direccion_territorio FOREIGN KEY (id_territorio) REFERENCES public.territorio(id_territorio) ON UPDATE CASCADE ON DELETE RESTRICT;


--
-- Name: entrega_historial fk_entrega_historial; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.entrega_historial
    ADD CONSTRAINT fk_entrega_historial FOREIGN KEY (id_entrega) REFERENCES public.entrega(id_entrega) ON UPDATE CASCADE ON DELETE RESTRICT;


--
-- Name: entrega fk_entrega_orden; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.entrega
    ADD CONSTRAINT fk_entrega_orden FOREIGN KEY (id_orden) REFERENCES public.orden(id_orden) ON UPDATE CASCADE ON DELETE RESTRICT;


--
-- Name: entrega fk_entrega_repartidor; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.entrega
    ADD CONSTRAINT fk_entrega_repartidor FOREIGN KEY (id_repartidor) REFERENCES public.repartidor(id_repartidor) ON UPDATE CASCADE ON DELETE RESTRICT;


--
-- Name: entrega fk_entrega_vehiculo; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.entrega
    ADD CONSTRAINT fk_entrega_vehiculo FOREIGN KEY (id_vehiculo) REFERENCES public.vehiculo(id_vehiculo) ON UPDATE CASCADE ON DELETE RESTRICT;


--
-- Name: factura fk_factura_orden; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.factura
    ADD CONSTRAINT fk_factura_orden FOREIGN KEY (id_orden) REFERENCES public.orden(id_orden) ON UPDATE CASCADE ON DELETE RESTRICT NOT VALID;


--
-- Name: menu_comercio fk_menu_producto_comercio; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.menu_comercio
    ADD CONSTRAINT fk_menu_producto_comercio FOREIGN KEY (id_comercio, id_producto) REFERENCES public.producto_comercio(id_comercio, id_producto) ON UPDATE CASCADE ON DELETE RESTRICT;


--
-- Name: orden fk_orden_cliente; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.orden
    ADD CONSTRAINT fk_orden_cliente FOREIGN KEY (id_cliente) REFERENCES public.cliente(id_cliente) ON UPDATE CASCADE ON DELETE RESTRICT;


--
-- Name: orden_detalle fk_orden_detalle_orden; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.orden_detalle
    ADD CONSTRAINT fk_orden_detalle_orden FOREIGN KEY (id_orden) REFERENCES public.orden(id_orden);


--
-- Name: orden_estado fk_orden_estado_orden; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.orden_estado
    ADD CONSTRAINT fk_orden_estado_orden FOREIGN KEY (id_orden) REFERENCES public.orden(id_orden) ON UPDATE CASCADE ON DELETE RESTRICT;


--
-- Name: orden_detalle fk_orden_menu_comercio; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.orden_detalle
    ADD CONSTRAINT fk_orden_menu_comercio FOREIGN KEY (id_menu) REFERENCES public.menu_comercio(id_menu) ON UPDATE CASCADE ON DELETE RESTRICT;


--
-- Name: orden fk_orden_sucursal; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.orden
    ADD CONSTRAINT fk_orden_sucursal FOREIGN KEY (id_sucursal) REFERENCES public.sucursal(id_sucursal) ON UPDATE CASCADE ON DELETE RESTRICT;


--
-- Name: pago fk_pago_factura; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.pago
    ADD CONSTRAINT fk_pago_factura FOREIGN KEY (numero_factura) REFERENCES public.factura(numero_factura) ON UPDATE CASCADE ON DELETE RESTRICT;


--
-- Name: producto_comercio fk_producto_comercio_comercio; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.producto_comercio
    ADD CONSTRAINT fk_producto_comercio_comercio FOREIGN KEY (id_comercio) REFERENCES public.comercio(id_comercio) ON UPDATE CASCADE ON DELETE RESTRICT;


--
-- Name: producto_comercio fk_producto_comercio_producto; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.producto_comercio
    ADD CONSTRAINT fk_producto_comercio_producto FOREIGN KEY (id_producto) REFERENCES public.producto(id_producto) ON UPDATE CASCADE ON DELETE RESTRICT;


--
-- Name: producto_tipo_producto fk_producto_tipo_producto_producto; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.producto_tipo_producto
    ADD CONSTRAINT fk_producto_tipo_producto_producto FOREIGN KEY (id_producto) REFERENCES public.producto(id_producto) ON UPDATE CASCADE ON DELETE RESTRICT;


--
-- Name: producto_tipo_producto fk_producto_tipo_producto_tipo_producto; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.producto_tipo_producto
    ADD CONSTRAINT fk_producto_tipo_producto_tipo_producto FOREIGN KEY (id_tipo_producto) REFERENCES public.tipo_producto(id_tipo_producto) ON UPDATE CASCADE ON DELETE RESTRICT;


--
-- Name: sucursal fk_sucursal_comercio; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.sucursal
    ADD CONSTRAINT fk_sucursal_comercio FOREIGN KEY (id_comercio) REFERENCES public.comercio(id_comercio) ON UPDATE CASCADE ON DELETE RESTRICT;


--
-- Name: territorio fk_territorio_territorio; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.territorio
    ADD CONSTRAINT fk_territorio_territorio FOREIGN KEY (id_territorio_padre) REFERENCES public.territorio(id_territorio) ON UPDATE CASCADE ON DELETE RESTRICT;


--
-- Name: tipo_comercio fk_tipo_comercio_tipo_comercio; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.tipo_comercio
    ADD CONSTRAINT fk_tipo_comercio_tipo_comercio FOREIGN KEY (id_tipo_comercio_padre) REFERENCES public.tipo_comercio(id_tipo_comercio) ON UPDATE CASCADE ON DELETE RESTRICT;


--
-- Name: tipo_producto_tipo_comercio fk_tipo_producto_tipo_comercio_tipo_comercio; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.tipo_producto_tipo_comercio
    ADD CONSTRAINT fk_tipo_producto_tipo_comercio_tipo_comercio FOREIGN KEY (id_tipo_comercio) REFERENCES public.tipo_comercio(id_tipo_comercio) ON UPDATE CASCADE ON DELETE RESTRICT;


--
-- Name: tipo_producto_tipo_comercio fk_tipo_producto_tipo_comercio_tipo_producto; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.tipo_producto_tipo_comercio
    ADD CONSTRAINT fk_tipo_producto_tipo_comercio_tipo_producto FOREIGN KEY (id_tipo_producto) REFERENCES public.tipo_producto(id_tipo_producto) ON UPDATE CASCADE ON DELETE RESTRICT;


--
-- Name: tipo_producto fk_tipo_producto_tipo_producto; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.tipo_producto
    ADD CONSTRAINT fk_tipo_producto_tipo_producto FOREIGN KEY (id_tipo_producto_padre) REFERENCES public.tipo_producto(id_tipo_producto) ON UPDATE CASCADE ON DELETE RESTRICT;


--
-- Name: SCHEMA public; Type: ACL; Schema: -; Owner: postgres
--

REVOKE USAGE ON SCHEMA public FROM PUBLIC;
GRANT ALL ON SCHEMA public TO PUBLIC;


--
-- PostgreSQL database dump complete
--


