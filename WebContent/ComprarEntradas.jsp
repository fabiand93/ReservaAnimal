<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
	<title>Proyecto Info 3 - Comprar Entradas</title>
	<meta charset="utf-8" />
	<meta name="viewport" content="width=device-width, initial-scale=1" />
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<link rel="stylesheet" href="assets/css/main.css" />
</head>

<body class="no-sidebar">
	<div id="page-wrapper">

		<!-- Header -->
		<div id="header">

			<!-- Inner -->
			<div class="inner">
				<header>
					<h1><a href="index.html" id="logo">Reserva Animal</a></h1>
				</header>
			</div>

								<!-- Nav -->
			<nav id="nav">
				<ul>
					<li><a href="index.html">Inicio</a></li>
					<li>
						<a href="#">Sobre Nosotros</a>
						<ul>
							<li><a href="mision.html">Misión</a></li>
							<li><a href="vision.html">Visión</a></li>
							<!--
							Submenú <li>
								<a href="#">And a submenu &hellip;</a>
								<ul>
									<li><a href="#">Lorem ipsum dolor</a></li>
									<li><a href="#">Phasellus consequat</a></li>
									<li><a href="#">Magna phasellus</a></li>
									<li><a href="#">Etiam dolore nisl</a></li>
								</ul>
							</li>
							 -->
						</ul>
					</li>
					<li><a href="ComprarEntradas.jsp">Comprar Entradas</a></li>
					<li><a href="donaciones.html">Donaciones</a></li>
					<li><a href="login.jsp">Login</a>
				</ul>
			</nav>

		</div>
		<!-- Main -->
		<div class="wrapper style1">

			<div class="container">
				<article id="main" class="special">
					<header>
						<h2><a href="#">Comprar Entradas</a></h2>
					</header>

					<!-- login form -->
					<section>
						<div class="Login">
							<div id="check-accordion" class="ui-accordion ui-widget ui-helper-reset" role="tablist">
								<div class="clearfix ui-accordion-content ui-helper-reset ui-widget-content ui-corner-bottom ui-accordion-content-active" id="ui-accordion-check-accordion-panel-0" aria-labelledby="ui-accordion-check-accordion-header-0" role="tabpanel" aria-expanded="true"
								aria-hidden="false" style="display: block; height: 605px;">
									<div class="span6 cheakout clearfix register">
										<h6>
											<p>Estas Registrado con nosotros?</p> &nbsp
											<span>Por favor completa el siguiente formulario</span>
										</h6>
										<form class="clearfix" action="Logincontroller" method="post">
											<label>Usuario</label>
											<input type="text" name="username"> <BR>
											<label>Contraseña</label>
											<input type="password" name="password"> <BR>
											<input type="submit" value="Login">
										</form>
									</div>
								</div>
							</div>
						</div>
					</section>
				</article>
				<div class="row">
				</div>
			</div>

		</div>

		<!-- Footer -->
		<div id="footer">
			<div class="container">
				<div class="row">


				</div>
				<hr />
				<div class="row">
					<div class="12u">

						<!-- Contact -->
						<section class="contact">
							<header>
								<h3>Ponte en contacto con nosotros</h3>
							</header>
							<p>Siguenos en nuestras redes sociales para que siempre estes al dia de nuestras acciones.</p>
							<ul class="icons">
								<li>
									<a href="#" class="icon fa-twitter">
										<span class="label">Twitter</span>
									</a>
								</li>
								<li>
									<a href="#" class="icon fa-facebook">
										<span class="label">Facebook</span>
									</a>
								</li>
								<li>
									<a href="#" class="icon fa-instagram">
										<span class="label">Instagram</span>
									</a>
								</li>
							</ul>
						</section>

						<!-- Copyright -->
						<div class="copyright">
							<ul class="menu">
								<li>Design: <a>Fabian Diaz</a></li>
							</ul>
						</div>

					</div>

				</div>
			</div>
		</div>

	</div>

	<!-- Scripts -->
	<script src="assets/js/jquery.min.js"></script>
	<script src="assets/js/jquery.dropotron.min.js"></script>
	<script src="assets/js/jquery.scrolly.min.js"></script>
	<script src="assets/js/jquery.onvisible.min.js"></script>
	<script src="assets/js/skel.min.js"></script>
	<script src="assets/js/util.js"></script>
	<script src="assets/js/main.js"></script>

</body>

</html>
