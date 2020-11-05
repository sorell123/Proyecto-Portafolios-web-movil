<%-- 
    Document   : ingresar
    Created on : 16-may-2019, 12:26:48
    Author     : sjore
--%>


<%@page import="Conexion.Conexion"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page session="true"%>

<!DOCTYPE html>
<html lang="zxx" class="no-js">
    <head>
        <!-- Mobile Specific Meta -->
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <!-- Favicon-->
        <link rel="shortcut icon" href="img/fav.png">
        <!-- Author Meta -->
        <meta name="author" content="colorlib">
        <!-- Meta Description -->
        <meta name="description" content="">
        <!-- Meta Keyword -->
        <meta name="keywords" content="">
        <!-- meta character set -->
        <meta charset="UTF-8">
        <!-- Site Title -->
        <title>No mas accidentes</title>

        <link href="https://fonts.googleapis.com/css?family=Poppins:100,200,400,300,500,600,700" rel="stylesheet"> 
        <!--
        CSS
        ============================================= -->
        <link rel="stylesheet" href="css/linearicons.css">
        <link rel="stylesheet" href="css/font-awesome.min.css">
        <link rel="stylesheet" href="css/bootstrap.css">
        <link rel="stylesheet" href="css/magnific-popup.css">
        <link rel="stylesheet" href="css/animate.min.css">
        <link rel="stylesheet" href="css/owl.carousel.css">
        <link rel="stylesheet" href="css/main.css">
    </head>
    <body>

        <!-- start banner Area -->
        <section class="banner-area" id="home">
            <!-- Start Header Area -->
            <header class="default-header">
                <nav class="navbar navbar-expand-lg  navbar-light">
                    <div class="container">
                        <a class="navbar-brand" href="index.jsp">
                            <img src="img/logo.png" alt="" width="140" height="85">
                        </a>
                        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
                            <span class="text-white lnr lnr-menu"></span>
                        </button>

                        <div class="collapse navbar-collapse justify-content-end align-items-center" id="navbarSupportedContent">
                            <ul class="navbar-nav">
                                <li><a href="index.jsp">Inicio</a></li>
                                <li><a href="Ingresar.jsp">Ingresar</a></li>
                                <li><a href="Registrar.jsp">Regristrar</a></li>
                                <!-- Dropdown -->

                            </ul>
                        </div>						
                    </div>
                </nav>
            </header>
            <!-- End Header Area -->				
        </section>

        <section class="default-banner">	
            <div class="item-slider relative" style="background: url(img/slider3.jpg);background-size: cover;">
                <div class="overlay" style="background: rgba(0,0,0,.3)"></div>
                <div class="container">
                    <div class="row fullscreen justify-content-center align-items-center">
                        <div class="col-md-10 col-12">
                            <div class="banner-content text-center">
                                <h4 class="text-white mb-20 text-uppercase">Servicio de Hoteleria Clarita Hotel</h4>
                                <h1 class="text-uppercase text-white">Ingresa Aqui</h1>
                                <p class="text-white"> Si te encuentrar registrado puede ingresar facil mente para disfrutar nuestros veneficios en caso contrario registrate</p>
                                <a href="#Ingre" class="text-uppercase header-btn">Ingresar</a>
                                <a href="Registrar.jsp" class="text-uppercase header-btn">Registrate</a>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </section>

        <!-- Start about Area -->
        <section class="section-gap info-area" id="Ingre">
            <div class="container">
                <div class="row d-flex justify-content-center">
                    <div class="menu-content pb-40 col-lg-8">
                        <div class="title text-center">
                            <h1 class="mb-10">Ingreso de usuario</h1>
                            <p>Ingresa aqui y disfurta de nuestros beneficos</p>
                        </div>

                    </div>
                </div>

                <div class="col-lg-8 col-md-8">
                    <h3 class="mb-30">Ingresar</h3>
                    <form name="datos" action="LoginUsuarios">
                        <center><br>
                            <input type="text" style="width:500px;height:40px" class="form-control" name="txtUsuario" required placeholder="Usuario" onfocus="this.placeholder = ''" onblur="this.placeholder = 'Usuario '"><br>
                            <input type="password" style="width:500px;height:40px" class="form-control" name="txtContrasena" required placeholder="Contraseña " onfocus="this.placeholder = ''" onblur="this.placeholder = 'Contrasena '">
                            <br><input type="submit" name="btnIngresar" value="Ingresar" class="primary-btn text-uppercase"> &nbsp;&nbsp;<input type="reset" value="Otro Ingreso" class="primary-btn text-uppercase">				
                        </center>
                    </form>
                </div>
            </div>
        </section><br>
        <br>
        <br>

        <!-- End about Area -->



        <!-- Start logo Area -->
        <section class="logo-area">
            <div class="container">
                <div class="row">

                </div>
            </div>	
        </section>
        <!-- End logo Area -->


        <!-- start contact Area -->		

        <!-- end contact Area -->		

        <!-- start footer Area -->		
        <footer class="footer-area section-gap">
            <div class="container">
                <div class="row">
                    <div class="col-lg-5 col-md-6 col-sm-6">
                        <div class="single-footer-widget">
                            <h6>Sobre Nosotros</h6>
                            <p>
                                Proyecto pensado para prevenir y disminuir los indices de accidentabilidad en las empresas en el robro indutrial, minera y construccion. este poyecto fue cundado por el ingeniero Carlos Guzman.
                            </p>
                            <!-- Link back to Colorlib can't be removed. Template is licensed under CC BY 3.0. -->
                            <p class="footer-text">Copyright &copy;<script>document.write(new Date().getFullYear());</script> Todos los derechos reservados | Esta sitio está hecha con <i class="fa fa-heart-o" aria-hidden="true"></i> por <a href="" target="_blank">"No mas accidentes"</a></p>
                            <!-- Link back to Colorlib can't be removed. Template is licensed under CC BY 3.0. -->
                        </div>
                    </div>
                    						
                    <div class="col-lg-2 col-md-6 col-sm-6 social-widget">
                        <div class="single-footer-widget">
                            <h6>No mas accidentes</h6>
                            <div class="footer-social d-flex align-items-center">
                                <img src="img/logo.png" alt="" width="200" height="150">
                            </div>
                        </div>
                    </div>							
                </div>
            </div>
        </footer>
        <!-- End footer Area -->			

        <script src="js/vendor/jquery-2.2.4.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.11.0/umd/popper.min.js" integrity="sha384-b/U6ypiBEHpOf/4+1nzFpr53nxSS+GLCkfwBdFNTxtclqqenISfwAzpKaMNFNmj4" crossorigin="anonymous"></script>
        <script src="js/vendor/bootstrap.min.js"></script>
        <script src="js/jquery.ajaxchimp.min.js"></script>
        <script src="js/jquery.magnific-popup.min.js"></script>	
        <script src="js/owl.carousel.min.js"></script>			
        <script src="js/jquery.sticky.js"></script>
        <script src="js/slick.js"></script>
        <script src="js/jquery.counterup.min.js"></script>
        <script src="js/waypoints.min.js"></script>		
        <script src="js/main.js"></script>	
    </body>
</html>