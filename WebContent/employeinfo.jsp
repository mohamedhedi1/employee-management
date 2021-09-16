<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="//netdna.bootstrapcdn.com/bootstrap/3.0.0/js/bootstrap.min.js"></script>
<script src="//code.jquery.com/jquery-1.11.1.min.js"></script>
<style>
   .details li {
      list-style: none;
    }
    li {
        margin-bottom:10px;
    }
   .tital{
       text-align:right;
   }
   .contant_i{
        color: #631e1e;
        border-bottom: 1px solid #cea7a7;
   }
</style>
</head>
<body>
	<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
	<%@ page import="java.io.*"%>
	<%@ page import="javax.servlet.ServletException"%>
	<%@ page import="javax.servlet.annotation.WebServlet"%>
	<%@ page import="javax.servlet.http.HttpServlet"%>
	<%@ page import="javax.servlet.http.HttpServletRequest"%>
	<%@ page import="javax.servlet.http.HttpServletResponse"%>
	<%@ page import="javax.servlet.http.HttpSession"%>
	<%@ page import="dao.EmployeDaoImp"%>
	<%@ page import="entities.Employe"%>

	<%@ page import="java.util.List"%>
	
	<br><br><br>
  <div class="container">    
                <div class="jumbotron">
                    
                    
                    
                  <div class="row">
                      <div class="col-md-3 col-xs-12 col-sm-6 col-lg-3">
                        <div class="thumbnail text-center photo_view_postion_b" >
                          <img src="img/p1.jpg" alt="stack photo" class="img">
                        </div>
                      </div>
                      <div class="col-md-9 col-xs-12 col-sm-6 col-lg-9">
                          <div class="" style="border-bottom:1px solid black">
                            <h2><c:out value="${user0.getPrenome()} "/><c:out value="${user0.getNome()}"/></h2>
                          </div>
                            <hr>
                          <div class="col-md-8">  
                          <ul class=" details">
                            <li><p><span class="glyphicon glyphicon-earphone one" style="width:50px;"></span><c:out value="${user0.getTele()}"/></p></li>
                            <li><p><span class="glyphicon glyphicon-envelope one" style="width:50px;"></span><c:out value="${user0.getEmail()}"/></p></li>
                            <li><p><span class="glyphicon glyphicon-map-marker one" style="width:50px;"></span><c:out value="${user0.getAdre()}"/></p></li>
                            <li><p><span class="glyphicon glyphicon-credit-card one" style="width:50px;"></span><c:out value="${user0.getIban()}"/></p></li>
                          </ul>
                          </div>
                          <div class="col-md-4">  
                            <div class="col-sm-5 col-xs-6 tital " >Cin:</div><div class="col-sm-7 col-xs-6 "><c:out value="${user0.getCine()}"/></div>
                            <div class="clearfix"></div><div class="bot-border"></div>
                            <div class="col-sm-5 col-xs-6 tital " >Sexe:</div><div class="col-sm-7 col-xs-6 "><c:out value="${user0.getSexe()}"/></div>
                            <div class="clearfix"></div><div class="bot-border"></div>
                            <div class="col-sm-5 col-xs-6 tital " >Poste:</div><div class="col-sm-7 col-xs-6 "><c:out value="${user0.getPositione()}"/></div>
                            <div class="clearfix"></div><div class="bot-border"></div>
                            <div class="col-sm-5 col-xs-6 tital " >Banque:</div><div class="col-sm-7 col-xs-6 "><c:out value="${user0.getNomb()}"/></div>
                          <div class="clearfix"></div><div class="bot-border"></div>
                          </div>
                      </div>
                    </div>
                    <div class="row">
                      <div class="form-group row">
                        <div class="col-md-12">
                        <div class="form-group" style="border-bottom:1px solid black">
                            <h2>AUTRE INFORMATIONS</h2>
                        </div>
                        </div>
                      </div>
                    </div>
                    <div class="row"> 
                     <div class="col-md-4">
                        <div class="col-sm-6 col-xs-6 tital " >Département:</div><div class="col-sm-6 col-xs-6 contant_i"><c:out value="${user0.getNumd()}"/></div>
                        <div class="clearfix"></div><div class="bot-border"></div>
                        <div class="col-sm-6 col-xs-6 tital " >Age:</div><div class="col-sm-6 col-xs-6 contant_i"><c:out value="${user0.getAge()}"/></div>
                        <div class="clearfix"></div><div class="bot-border"></div>
                       
                        <div class="clearfix"></div><div class="bot-border"></div>
                     </div>
                     <div class="col-md-4">
                        <div class="col-sm-6 col-xs-6 tital " >Début:</div><div class="col-sm-6 col-xs-6 contant_i"><c:out value="${user0.getDated()}"/></div>
                        <div class="clearfix"></div><div class="bot-border"></div>
                        <div class="col-sm-6 col-xs-6 tital " >Fin:</div><div class="col-sm-6 col-xs-6 contant_i"><c:out value="${user0.getDatef()}"/></div>
                        <div class="clearfix"></div><div class="bot-border"></div>
                       
                        <div class="clearfix"></div><div class="bot-border"></div>
                     </div>
                     <div class="col-md-4">
                        <div class="col-sm-6 col-xs-6 tital " >Salaire:</div><div class="col-sm-6 col-xs-6 contant_i"><c:out value="${user0.getSalaire()}"/></div>
                        <div class="clearfix"></div><div class="bot-border"></div>
                        <div class="col-sm-6 col-xs-6 tital " >Status:</div><div class="col-sm-6 col-xs-6 contant_i"><c:out value="${user0.getStatus()}"/></div>
                        <div class="clearfix"></div><div class="bot-border"></div>
                     
                        <div class="clearfix"></div><div class="bot-border"></div>
                     </div>
                    </div>
                    
                  
                    
                    
                    
                    
                    
                </div>
            </div></body>

</html>