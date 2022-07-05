
CREATE SCHEMA IF NOT EXISTS Tienda DEFAULT CHARACTER SET utf8 ;
USE Tienda ;

-- -----------------------------------------------------
-- Table Vendedor
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS Vendedor (
  id_Vendedor INT NOT NULL AUTO_INCREMENT,
  nombre_vendedor VARCHAR(30) NOT NULL,
  tipo_documento VARCHAR(5) NOT NULL,
  numero_documento VARCHAR(13) NOT NULL,
  PRIMARY KEY (id_Vendedor),
  UNIQUE INDEX id_Vendedor_UNIQUE (id_Vendedor ASC) VISIBLE)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table Producto
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS Producto (
  id_Producto INT NOT NULL AUTO_INCREMENT,
  Nombre_producto VARCHAR(15) NOT NULL,
  PRIMARY KEY (id_Producto))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table Proveedor
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS Proveedor(
  id_Proveedor INT NOT NULL AUTO_INCREMENT,
  nombre_proveedor VARCHAR(15) NOT NULL,
  Producto_id_Producto INT NOT NULL,
  PRIMARY KEY (id_Proveedor),
  INDEX fk_Proveedor_Producto_idx (Producto_id_Producto ASC) INVISIBLE,
  CONSTRAINT fk_Proveedor_Producto
    FOREIGN KEY (Producto_id_Producto)
    REFERENCES Producto (id_Producto)
    ON DELETE RESTRICT
    ON UPDATE CASCADE
)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table Cliente
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS Cliente (
  id_Cliente INT NOT NULL AUTO_INCREMENT,
  numero_documento VARCHAR(13) NOT NULL,
  Vendedor_id_Vendedor INT NOT NULL,
  PRIMARY KEY (id_Cliente),
  INDEX fk_Cliente_Vendedor1_idx (Vendedor_id_Vendedor ASC) VISIBLE,
  CONSTRAINT fk_Cliente_Vendedor1
    FOREIGN KEY (Vendedor_id_Vendedor)
    REFERENCES Vendedor (id_Vendedor)
    ON DELETE RESTRICT
    ON UPDATE CASCADE
)
ENGINE = InnoDB;

/* VENDEDOR */
INSERT INTO vendedor(nombre_vendedor, tipo_documento, numero_documento)
VALUES ('JUAN','CC','1037650333');

/* PRODUCTOS */
INSERT INTO producto(Nombre_producto)
VALUES ('MILK');

INSERT INTO producto(Nombre_producto)
VALUES ('COFFEE');

INSERT INTO producto(Nombre_producto)
VALUES ('RICE');

INSERT INTO producto(Nombre_producto)
VALUES ('TOMATOES');

/* VENTAS, CLIENTES */

INSERT INTO cliente(numero_documento, Vendedor_id_Vendedor)
VALUES ('155',1);

INSERT INTO cliente(numero_documento, Vendedor_id_Vendedor)
VALUES ('236',1);

INSERT INTO cliente(numero_documento, Vendedor_id_Vendedor)
VALUES ('255',1);

INSERT INTO cliente(numero_documento, Vendedor_id_Vendedor)
VALUES ('369',1);

/* PROVEEDORES */

INSERT INTO proveedor(nombre_proveedor, Producto_id_Producto)
VALUES ('PEDRO', 1);

INSERT INTO proveedor(nombre_proveedor, Producto_id_Producto)
VALUES ('PEDRO', 2);

INSERT INTO proveedor(nombre_proveedor, Producto_id_Producto)
VALUES ('CARLOS', 3);


/* ACTUALIZAR CLIENTES */
UPDATE cliente
SET numero_documento = '666'
WHERE id_Cliente = 2;

UPDATE cliente
SET numero_documento = '111'
WHERE id_Cliente = 1;

/* ACTUALIZAR PRODUCTOS */

UPDATE producto
SET Nombre_producto = 'FOOD'
WHERE id_Producto = 1;

UPDATE producto
SET Nombre_producto = 'FOOD 2'
WHERE id_Producto = 2;

UPDATE producto
SET Nombre_producto = 'FOOD 3'
WHERE id_Producto = 3;

/* ACTUALIZAR PROVEEDORES */
UPDATE proveedor
SET nombre_proveedor = 'NAME '
WHERE id_Proveedor = 1;

UPDATE proveedor
SET nombre_proveedor = 'NAME 2'
WHERE id_Proveedor = 2;

UPDATE proveedor
SET nombre_proveedor = 'NAME 3'
WHERE id_Proveedor = 3;
