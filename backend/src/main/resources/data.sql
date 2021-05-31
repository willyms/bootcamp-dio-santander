CREATE SEQUENCE HIBERNATE_SEQUENCE START WITH 7 INCREMENT BY 1;

CREATE TABLE public.tb_stock (
    id numeric(9) NOT NULL,
    name varchar(100) NOT NULL,
    dt_publication date NOT NULL,
    price numeric(8,2) NOT NULL,
    variation numeric(5,2) NOT NULL,
    CONSTRAINT tb_stock_pkey PRIMARY KEY (id)
);

INSERT INTO public.tb_stock (id, name, dt_publication, price, variation) VALUES (1, 'Magazine Luiza', NOW(), 200, 10);
INSERT INTO public.tb_stock (id, name, dt_publication, price, variation) VALUES (2, 'Ponto Frio', NOW(), 500, 10);
INSERT INTO public.tb_stock (id, name, dt_publication, price, variation) VALUES (4, 'SANB4', NOW(), 28.1, -10.5);
INSERT INTO public.tb_stock (id, name, dt_publication, price, variation) VALUES (5, 'SANB11', NOW(), 38.18, 0.03);
INSERT INTO public.tb_stock (id, name, dt_publication, price, variation) VALUES (6, 'ITUB4', NOW(), 300, 20);
