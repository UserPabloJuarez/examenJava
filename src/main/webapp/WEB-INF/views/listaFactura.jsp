<%@page import="edu.cibertec.examen.entity.FacturaEntity"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Listado de Facturas</h1>
        <br/>
        <% List<FacturaEntity> lista = (List<FacturaEntity>) request.getAttribute("lista"); %>
        <div class="table-responsive">
            <table class="table table-responsive table-sm table-dark table-striped table-bordered table-hover">
                <thead>
                    <tr class="info">
                        <th>Numero</th>
                        <th>Fecha</th>
                        <th>Cliente</th>
                        <th>Moneda</th>
                        <th>Monto</th>
                    </tr>
                </thead>
                <tbody>
                    <% for (FacturaEntity factura: lista) {%>
                    <tr>
                        <td><%= factura.getNumero()%></td>
                        <td><%= factura.getFecha()%></td>
                        <td><%= factura.getNumero()%></td>
                        <td><%= factura.getCliente()%></td>
                        <td><%= factura.getMonto()%></td>
                    </tr>
                    <%}%>
                </tbody>
            </table>
        </div>
        <br/>
        <div class="text-center">
            <a href="insertarFactura.htm" class="btn btn-primary btn-lg active">Insertar</a>
        </div>
    </body>
</html>