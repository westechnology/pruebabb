# pruebabb
Prueba tecnica

clonar el proyecto de gitHub https://github.com/westechnology/pruebabb.git
Crear base de datos pruebasbb o cambiar el nombre de la DB en el archivo application.properties
tambien el usuario y la clave
Crear la tabla persona con el siguiente script

-- Table: public.persona

-- DROP TABLE public.persona;

CREATE TABLE public.persona
(
    numero_ide character varying(15) COLLATE pg_catalog."default" NOT NULL,
    tipo_ide character varying(2) COLLATE pg_catalog."default" NOT NULL,
    primer_nombre character varying(30) COLLATE pg_catalog."default",
    segundo_nombre character varying(30) COLLATE pg_catalog."default" NOT NULL,
    primer_apellido character varying(30) COLLATE pg_catalog."default",
    segundo_apellido character varying(30) COLLATE pg_catalog."default" NOT NULL,
    rol "char",
    CONSTRAINT persona_pkey PRIMARY KEY (numero_ide, tipo_ide)
)
WITH (
    OIDS = FALSE
)
TABLESPACE pg_default;

ALTER TABLE public.persona
    OWNER to postgres;

se configura el puerto del servidor a 8090 para no tener conflictos con aplicaciones que corren sobre el puerto 8080



