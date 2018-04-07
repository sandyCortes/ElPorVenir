DROP DATABASE PorVenir
GO

CREATE DATABASE PorVenir
GO


USE PorVenir
GO

CREATE TABLE Compania(
	idCompania INT PRIMARY KEY NOT NULL IDENTITY,
	descripcion VARCHAR(100) NOT NULL
)
GO

CREATE TABLE Unidad(
	idUnidad INT PRIMARY KEY NOT NULL IDENTITY,
	tipoUnidad VARCHAR(10) NOT NULL 
)
GO

CREATE TABLE Contenido(
	idContenido INT PRIMARY KEY NOT NULL IDENTITY,
	cantidad FLOAT NOT NULL
)
GO

CREATE TABLE TipoProducto(
	idTipoP INT PRIMARY KEY NOT NULL IDENTITY,
	descripcion CHAR(1) CHECK(descripcion = 'A' OR descripcion = 'E')
	/*A = Agramel ; E = Epaquetado*/
)
GO

CREATE TABLE Proveedor(
	idProveedor INT PRIMARY KEY NOT NULL IDENTITY,
	descripcion VARCHAR(100) NOT NULL,
	telefono VARCHAR(10) NOT NULL,
	idCompania INT REFERENCES Compania(idCompania)
)
GO

CREATE TABLE Producto(
	codigoProd CHAR(100) PRIMARY KEY NOT NULL,
	nombreProd VARCHAR(100) NOT NULL,
	fechaCaduc DATETIME NOT NULL,
	idTipo INT REFERENCES TipoProducto(idTipoP),
	idPeso INT REFERENCES Contenido(idContenido),
	idUnidad INT REFERENCES Unidad(idUnidad)
)
GO

CREATE TABLE SurteProducto(
	idProveedor INT REFERENCES Proveedor(idProveedor),
	codigoProd CHAR(100) REFERENCES Producto(codigoProd),
	precioCompra MONEY NOT NULL
)
GO

CREATE TABLE Almacen(
	idAlmacen INT PRIMARY KEY NOT NULL IDENTITY,
	cantidadAlm INT NOT NULL,
	cantidadMin INT NOT NULL,
	cantidadMax INT NOT NULL
)
GO

CREATE TABLE Pedido(
	nPedido INT NOT NULL PRIMARY KEY IDENTITY,
	fechaGenera DATETIME NOT NULL,
	fechaSurte DATETIME NOT NULL,
	nAlmacen INT REFERENCES Almacen(idAlmacen)
);

CREATE TABLE DetallePedido(
	nPedido INT REFERENCES Pedido(nPedido),
	codigoProd CHAR(100) REFERENCES Producto(codigoProd),
	cantidadPedido INT
);
GO

CREATE TABLE ProductoAlma(
	idAlmacen INT REFERENCES Almacen(IDAlmacen),
	codigoProd CHAR(100),
	CONSTRAINT fk_Prod FOREIGN KEY (codigoProd) REFERENCES Producto(codigoProd)
)
GO

CREATE TABLE Usuarios(
	idUsuario INT PRIMARY KEY NOT NULL IDENTITY,
	nombreUse VARCHAR(45) NOT NULL,
	aPpUser   VARCHAR(45) NOT NULL,
	aPmUser   VARCHAR(45) NOT NULL,
	fechaNa   DATETIME NOT NULL,
	genero CHAR(1) CHECK(genero = 'F' OR genero = 'M'),
	tipoUser INT NOT NULL CHECK(tipoUser = 1 OR tipoUser = 2 OR tipoUser = 3),
	telefono VARCHAR(15) NOT NULL,
	correo VARCHAR(50),
	actividad INT CHECK(actividad >= 1 AND actividad <= 2) DEFAULT 1,
	/*1 = activo ; 2 = Inactivo */
	contrasena VARCHAR(100) NOT NULL
)
GO

INSERT INTO Usuarios VALUES('Sandra','F','Cortes','1997/10/10','F',1,'55565758','hakufu@hotmail.com',
	1,'123');


CREATE TABLE Caja(
	nCaja INT PRIMARY KEY NOT NULL IDENTITY,
	montoIniciar MONEY NOT NULL,
	montoFinal MONEY NOT NULL,
	horaCorte DATETIME NOT NULL
)
GO

CREATE TABLE Nota(
	nNota INT PRIMARY KEY NOT NULL IDENTITY,
	nCaja INT REFERENCES Caja(nCaja),
	cantidadVendida MONEY NOT NULL
)
GO

CREATE TABLE Venta(
	nVenta INT PRIMARY KEY NOT NULL IDENTITY,
	fechaVenta DATETIME NOT NULL,
	totalVenta MONEY NOT NULL,
	idUsuario INT REFERENCES Usuarios(IDUsuario),
	nCaja INT REFERENCES Caja(nCaja)
)
GO

CREATE TABLE Stok(
	idStock INT PRIMARY KEY NOT NULL IDENTITY,
	cantStock INT NOT NULL,
	cantMin INT NOT NULL,
	cantMaX INT NOT NULL,
	precioVeta MONEY NOT NULL,
	idAlmacen INT REFERENCES Almacen(idAlmacen)
)
GO
