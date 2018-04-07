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
GO


CREATE PROCEDURE EliminarUsuario
@nombre varchar(20),
@apPaterno varchar(20),
@apMaterno varchar(20),
@correo varchar(20),
@respuesta varchar(20) output
AS
if exists(Select * from Usuarios 
where nombreUse = @nombre and aPpUser = @apPaterno and aPmUser = @apMaterno and correo = @correo)
begin 

update Usuarios set actividad = 0 where nombreUse = @nombre 
and aPpUser = @apPaterno and aPmUser = @apMaterno and correo = @correo 
    set @respuesta = 'El usuario ha sido dado de baja'
end 
else 
begin 
    set @respuesta = 'Usuario no detectado'
end
GO

CREATE PROCEDURE ModificarDatos
@idUsuario int,
@nombre varchar(20),
@apPaterno varchar(20),
@apMaterno varchar(20),
@tipoUsuario int,
@telefono varchar(13),
@correo varchar(20),
@respuesta varchar(20) output

AS
update Usuarios set nombreUse = @nombre, aPpUser = @apPaterno, aPmUser = @apMaterno, 
telefono = @telefono, correo = @correo where idUsuario = @idUsuario

set @respuesta = 'Usuario modificado'

GO
