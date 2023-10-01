<%@page contentType="text/html" pageEncoding="UTF-8" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <!-- Font Awesome -->
        <link href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0/css/all.min.css" rel="stylesheet"/>
        <!-- Google Fonts -->
        <link href="https://fonts.googleapis.com/css?family=Roboto:300,400,500,700&display=swap" rel="stylesheet"/>
        <!-- MDB -->
        <link href="https://cdnjs.cloudflare.com/ajax/libs/mdb-ui-kit/6.4.0/mdb.min.css" rel="stylesheet"/>
    </head>
    <body>
        <!-- Header -->
        <header>
            <!-- Navbar -->
            <nav id="main-navbar" class="navbar navbar-expand-lg navbar-light bg-white">
                <!-- Container wrapper -->
                <div class="container-fluid">
                    <!-- Toggle button -->
                    <button class="navbar-toggler" type="button" data-mdb-toggle="collapse" data-mdb-target="#sidebarMenu"
                            aria-controls="sidebarMenu" aria-expanded="false" aria-label="Toggle navigation">
                        <i class="fas fa-bars"></i>
                    </button>

                    <!-- Brand -->
                    <a class="navbar-brand" href="${pageContext.request.contextPath}/jsp/dashboard.jsp ">
                        <img src="https://mdbootstrap.com/img/logo/mdb-transaprent-noshadows.png" height="25" alt="" loading="lazy" />
                    </a>

                    <!-- Right links -->
                    <ul class="navbar-nav ms-auto d-flex flex-row">
                        <!-- Avatar -->
                        <li class="nav-item dropdown">
                            <a class="nav-link dropdown-toggle hidden-arrow d-flex align-items-center" href="#"
                               id="navbarDropdownMenuLink" role="button" data-mdb-toggle="dropdown" aria-expanded="false">
                                <img src="https://mdbootstrap.com/img/Photos/Avatars/img (31).jpg" class="rounded-circle" height="22"
                                     alt="" loading="lazy" />
                            </a>
                            <ul class="dropdown-menu dropdown-menu-end" aria-labelledby="navbarDropdownMenuLink">
                                <li><a class="dropdown-item" href="#">My profile</a></li>
                                <li><a class="dropdown-item" href="#">Settings</a></li>
                                <li><a class="dropdown-item" href="${pageContext.request.contextPath}/jsp/login.jsp">Logout</a></li>
                            </ul>
                        </li>
                    </ul>
                </div>
                <!-- Container wrapper -->
            </nav>
            <!-- Navbar -->
        </header>