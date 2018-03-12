USE PorVenir
GO

CREATE VIEW VerUsuarios
AS
SELECT nombreUse,aPpUser,aPmUser,tipoUser,telefono,correo,actividad FROM Usuarios
GO
