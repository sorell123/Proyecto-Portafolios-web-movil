<%-- 
    Document   : Registrar
    Created on : 21-may-2019, 13:25:16
    Author     : sjore
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="zxx" class="no-js">
    <head>
        <!-- Mobile Specific Meta -->
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <!-- Favicon-->
        <link rel="shortcut icon" href="img/elements/fav.png">
        <!-- Author Meta -->
        <meta name="author" content="CodePixar">
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
        <link rel="stylesheet" href="css/owl.carousel.css">
        <link rel="stylesheet" href="css/font-awesome.min.css">
        <link rel="stylesheet" href="css/nice-select.css">			
        <link rel="stylesheet" href="css/magnific-popup.css">
        <link rel="stylesheet" href="css/bootstrap.css">
        <link rel="stylesheet" href="css/main.css">
    </head>
    <body>
        <!-- Start banner Area -->
        <section class="generic-banner relative">
            <!-- Start Header Area -->
          <header class="default-header">
                <nav class="navbar navbar-expand-lg  navbar-light">
                    <div class="container">
                        <a class="navbar-brand" href="index.jsp">
                            <img src="img/logo.png" alt="" width="140" height="80">
                        </a>
                        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
                            <span class="text-white lnr lnr-menu"></span>
                        </button>

                        <div class="collapse navbar-collapse justify-content-end align-items-center" id="navbarSupportedContent">
                            <ul class="navbar-nav">
                                <li><a href="loginCliente.jsp">Inicio</a></li>
                                <li><a href="MostrarHabitacionCli.jsp">Tickets</a></li>
                                <li><a href="HabitacionCli.jsp">Ingresar Ticket</a></li>
                                <!-- Dropdown -->

                            </ul>
                        </div>						
                    </div>
                </nav>
            </header>
            <!-- End Header Area -->				
            <div class="container">
                <div class="row height align-items-center justify-content-center">
                    <div class="col-lg-10">
                        <div class="generic-banner-content">
                            <img src="img/Hotel.png" width="900" height="450">
                            <h3 class="text-white">Intrega tu ticket registrando tu incidente</h3>
                            <a class="navbar-brand" href="#registro"><img src="img/flecha.png" width="70" height="30" ></a>

                        </div>							
                    </div>
                </div>
            </div>
        </section>		
        <!-- End banner Area -->

        <!-- About Generic Start -->
        <div class="main-wrapper" id="registro">

            <!-- Start feature Area --><br><br><br><br>
            <br><center><h1>Ingresa aqui indicente</h1></center><br>

            <div> <center><form action="AgregarHabitacion" id="registro" method="post">
                        <input type="text" style="width : 500px; heigth : 500px" name="txtSituacion" placeholder="Descripción" onfocus="this.placeholder = ''" onblur="this.placeholder = 'Descripción'" required class="single-input">
                        <br>
                        <input type="text" style="width : 500px; heigth : 500px" name="txtTipoCama" placeholder="Profesional" onfocus="this.placeholder = ''" onblur="this.placeholder = 'Profesional'" required class="single-input">
                        <br>
                        <input type="text" style="width : 500px; heigth : 500px" name="txtAccesorio" placeholder="Nivel(alta, media, baja)" onfocus="this.placeholder = ''" onblur="this.placeholder = 'Nivel(alta, media, baja)'" required class="single-input">
                        <br>
                        <input type="text" style="width : 500px; heigth : 500px" name="txtPrecio" placeholder="Cantidad Horas(Numero)" onfocus="this.placeholder = ''" onblur="this.placeholder = 'Cantidad Horas(Numero)'" required class="single-input">
                        <br>
                        <input type="submit" name="btnIngresar" value="Registrar" class="primary-btn text-uppercase"> &nbsp;&nbsp;<input type="reset" value="Otro Ingreso" class="primary-btn text-uppercase">
                    </form></center></div> 
            <br><br><br><br><br><br><br><br><br><br><br><br>
            <!-- End feature Area -->

            <!-- Start Generic Area -->

            <!-- End Generic Start -->		

            <!-- start footer Area -->		
            <footer class="footer-area section-gap">
                <div class="container">
                    <div class="row">
                        <div class="col-lg-5 col-md-6 col-sm-6">
                            <div class="single-footer-widget">
                                <h6>Sobre Nosotros</h6>
                                <p>
                                    Pequeña pime expenta en hoteleria a baja escala Fundada por la señora Clarita y bautizada con el nombre de "Clarita Hotel".
                                </p>
                                <!-- Link back to Colorlib can't be removed. Template is licensed under CC BY 3.0. -->
                                <p class="footer-text">Copyright &copy;<script>document.write(new Date().getFullYear());</script> Todos los derechos reservados | Esta plantilla está hecha con <i class="fa fa-heart-o" aria-hidden="true"></i> por <a href="" target="_blank">Maxvarell</a></p>
                                <!-- Link back to Colorlib can't be removed. Template is licensed under CC BY 3.0. -->
                            </div>
                        </div>

                        <div class="col-lg-2 col-md-6 col-sm-6 social-widget">
                            <div class="single-footer-widget">
                                <h6>Clarita Hotel</h6>
                                <div class="footer-social d-flex align-items-center">
                                    <img src="img/logo.png" alt="" width="200" height="150">
                                </div>
                            </div>
                        </div>							
                    </div>
                </div>
            </footer>	
            <!-- End footer Area -->		

        </div>
        <script src="js/vendor/jquery-2.2.4.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.11.0/umd/popper.min.js" integrity="sha384-b/U6ypiBEHpOf/4+1nzFpr53nxSS+GLCkfwBdFNTxtclqqenISfwAzpKaMNFNmj4" crossorigin="anonymous"></script>
        <script src="js/vendor/bootstrap.min.js"></script>
        <script src="js/jquery.ajaxchimp.min.js"></script>
        <script src="js/jquery.sticky.js"></script>
        <script src="js/owl.carousel.min.js"></script>
        <script src="js/jquery.nice-select.min.js"></script>
        <script src="js/jquery.magnific-popup.min.js"></script>
        <script src="js/main.js"></script>
    </body>
</html>