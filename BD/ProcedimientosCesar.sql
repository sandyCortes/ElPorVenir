USE PorVenir
GO

CREATE PROCEDURE AgregarUsuario
@nombreUse      VARCHAR(50),
@aPpUser        VARCHAR(50),
@aPmUser        VARCHAR(45),
@fechaNa        DATETIME,
@genero         VARCHAR(2),
@tipo           INT,
@telefono       VARCHAR(15),
@correo         VARCHAR(20),
@contrasena     VARCHAR(15),
@respuesta      VARCHAR(20) OUTPUT
AS
IF NOT EXISTS(SELECT * FROM Usuarios 
WHERE nombreUse = @nombreUse AND aPpUser = @aPpUser
AND aPmUser = @aPmUser) 
BEGIN
    INSERT INTO Usuarios VALUES(@nombreUse,@aPpUser,@aPmUser
    ,@fechaNa,@genero,@tipo,@telefono,@correo,1,@contrasena)
    SET @respuesta = 'El usuario fue agregado correctamente'
END
ELSE
BEGIN
    SET @respuesta = 'El usuario ya existe'
END
GO








exec AgregarUsuario 'CESAR','MUÑOZ','ocampo','1994/09/27'
,'M',1,'0445533','cesar_dantexD','dantexD123',''