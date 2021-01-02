<%@page import="edu.cibertec.examen.entity.FacturaEntity"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
    </head>
    <body>
        <h1>Datos</h1>
        <div class="container">
            <div class="row d-flex justify-content-center mx-auto">
                <div class="col-md-9 col-xs-12 div-style">
                    <form action="grabarFactura.htm" method="post">
                        <div class="row">
                            <div class="col-md-3 col-xs-4">
                                Numero:<input type="text" name="numero" class="form-control text-box">
                            </div>
                            <div class="col-md-3 col-xs-4">
                                Cliente:<input type="text" name="cliente" class="form-control text-box">
                            </div>
                            <div class="col-md-3 col-xs-4">
                                Monto:<input type="number" name="monto" class="form-control text-box">
                            </div>
                        </div>
                        <div class="row">
                            <div class="col-md-3 col-xs-4">
                                Fecha:<input type="date" name="fecha" class="form-control text-box">
                            </div>
                            <div class="col-md-3 col-xs-4">
                                Moneda:<input type="text" name="moneda" class="form-control text-box">
                            </div>
                        </div>
                        <br/>
                        <table class="table table-responsive table-sm table-dark table-striped table-bordered table-hover">
                            <thead>
                                <tr class="info">
                                    <th>Cantidad</th>
                                    <th>Producto</th>
                                    <th>P. Unitario</th>
                                    <th>Parcial</th>
                                </tr>
                            </thead>
                            <tbody>
                                <tr>
                                    <td><input type="number" name="cantidad1" class="form-control text-box"></td>
                                    <td><input type="text" name="producto1" class="form-control text-box"></td>
                                    <td><input type="number" name="precio1" class="form-control text-box"></td>
                                    <td><input type="text" name="parcial1" class="form-control text-box"></td>
                                </tr>
                                <tr>
                                    <td><input type="number" name="cantidad2" class="form-control text-box"></td>
                                    <td><input type="text" name="producto2" class="form-control text-box"></td>
                                    <td><input type="number" name="precio2" class="form-control text-box"></td>
                                    <td><input type="text" name="parcial2" class="form-control text-box"></td>
                                </tr>
                                <tr>
                                    <td><input type="number" name="cantidad3" class="form-control text-box"></td>
                                    <td><input type="text" name="producto3" class="form-control text-box"></td>
                                    <td><input type="number" name="precio3" class="form-control text-box"></td>
                                    <td><input type="text" name="parcial3" class="form-control text-box"></td>
                                </tr>
                                <!--% }%-->
                            </tbody>
                        </table>
                        <br />
                        <div class="form-group justify-content-center d-flex">
                            <input type="submit" value="Grabar" class="btn btn-primary button-submit">
                            <a href="mostrarFactura.htm" class="btn btn-primary">Cancelar</a>
                        </div>
                    </form>
                </div>
            </div>
        </div>
    </body>
</html>
