CREATE DATABASE PorVenir;
USE PorVenir;

CREATE TABLE TipoTelefono(
	ID_Telefono INT PRIMARY KEY NOT NULL IDENTITY,
	descripcion INT NOT NULL CHECK(descripcion >= 1 AND descripcion <= 2)
	/*1 = Fijo ; 2 = celular*/ 
);

CREATE TABLE Telefono(
	ID_Tel INT PRIMARY KEY NOT NULL IDENTITY,
	telefono VARCHAR(10) NOT NULL,
	ID_Telefono INT REFERENCES TipoTelefono(ID_Telefono)
);

CREATE TABLE TipoUser(
	ID_Tipo INT PRIMARY KEY NOT NULL IDENTITY,
	descripcion INT NOT NULL CHECK(descripcion = 1 OR descripcion = 2 OR descripcion = 3) 
);

CREATE TABLE Compañia(
	ID_Compania INT PRIMARY KEY NOT NULL IDENTITY,
	descripcion VARCHAR(100) NOT NULL
);

CREATE TABLE Unidad(
	ID_Unidad INT PRIMARY KEY NOT NULL IDENTITY,
	tipo_Unidad VARCHAR(10) NOT NULL 
);

CREATE TABLE Contenido(
	ID_Contenido INT PRIMARY KEY NOT NULL IDENTITY,
	cantidad FLOAT NOT NULL
);

CREATE TABLE TipoProducto(
	ID_TipoP INT PRIMARY KEY NOT NULL IDENTITY,
	descripcion CHAR(1) CHECK(descripcion = 'A' OR descripcion = 'E')
	/*A = Agramel ; E = Epaquetado*/
);

CREATE TABLE Proveedor(
	ID_Proveedor INT PRIMARY KEY NOT NULL IDENTITY,
	descripcion VARCHAR(100) NOT NULL,
	telefono VARCHAR(10) NOT NULL,
	ID_Compañia INT REFERENCES Compañia(ID_Compania)
);

CREATE TABLE Producto(
	codigo_Prod CHAR(100) PRIMARY KEY NOT NULL,
	nombre_Prod VARCHAR(100) NOT NULL,
	fecha_Caduc DATETIME NOT NULL,
	ID_Tipo INT REFERENCES TipoProducto(ID_TipoP),
	ID_Peso INT REFERENCES Contenido(ID_Contenido),
	ID_Unidad INT REFERENCES Unidad(ID_Unidad)
);

CREATE TABLE Almacen(
	ID_Almacen INT PRIMARY KEY NOT NULL IDENTITY,
	cantidad_A INT NOT NULL,
	cantidad_Min INT NOT NULL,
	cantidad_Max INT NOT NULL
);

CREATE TABLE ProductoAlma(
	ID_Almacen INT REFERENCES Almacen(ID_Almacen),
	codigo_Prod CHAR(100),
	CONSTRAINT fk_Prod FOREIGN KEY (codigo_Prod) REFERENCES Producto(codigo_Prod)
);

CREATE TABLE Usuarios(
	ID_Usuario INT PRIMARY KEY NOT NULL IDENTITY,
	nombre_Use VARCHAR(45) NOT NULL,
	aPp_User   VARCHAR(45) NOT NULL,
	aPm_User   VARCHAR(45) NOT NULL,
	fecha_Na   DATETIME NOT NULL,
	genero CHAR(1) CHECK(genero = 'F' OR genero = 'M'),
	ID_Tipo INT REFERENCES TipoUser(ID_Tipo),
	ID_Tel INT REFERENCES Telefono(ID_Tel),
	actividad INT CHECK(actividad >= 1 AND actividad <= 2) DEFAULT 1
	/*1 = activo ; 2 = Inactivo */
);

CREATE TABLE Caja(
	n_Caja INT PRIMARY KEY NOT NULL IDENTITY,
	monto_Iniciar MONEY NOT NULL,
	monto_Final MONEY NOT NULL,
	hora_Corte DATETIME NOT NULL
);

CREATE TABLE Nota(
	n_Nota INT PRIMARY KEY NOT NULL IDENTITY,
	n_Caja INT REFERENCES Caja(n_Caja),
	cantidad_Vendida MONEY NOT NULL
);

CREATE TABLE Venta(
	n_Venta INT PRIMARY KEY NOT NULL IDENTITY,
	fecha_Venta DATETIME NOT NULL,
	total_Venta MONEY NOT NULL,
	ID_Usuario INT REFERENCES Usuarios(ID_Usuario),
	n_Caja INT REFERENCES Caja(n_Caja)
);

CREATE TABLE Stok(
	ID_Stock INT PRIMARY KEY NOT NULL IDENTITY,
	cant_Stock INT NOT NULL,
	cant_Min INT NOT NULL,
	cant_MaX INT NOT NULL,
	precio_Veta MONEY NOT NULL,
	ID_Almacen INT REFERENCES Almacen(ID_Almacen)
);
