<header>
    <a href="landingPage.jsp"><img class="LogoTitulo" src="Css/recursos/LogoHeader.svg"></a>

    <input type="checkbox" id="menu-bar">
    <label for="menu-bar" class="fas fa-bars"></label>

    <nav class="navbar">
        <a href="RegistrarEmpleado.jsp">Registrar Empleado</a>
        <a href="ListarSolicitudes.jsp">Lista de reparaciones</a>
        <a href="consultarEmpleado.jsp">Actualizar empleado </a>
        <a href="RegistrarReparacion.jsp">Registrar solicitud</a>
        <a class="active" href="../iniciarSesion.jsp">Iniciar Sesión</a>
        <form method="post" action="Sesiones">
            <div>
                <input  type="submit" value="Cerrar Sesion">
            </div>
        </form>
    </nav>

</header>
