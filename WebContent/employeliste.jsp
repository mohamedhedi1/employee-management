<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<title>Employe</title>
<link rel="stylesheet"
	href="https://fonts.googleapis.com/css?family=Roboto|Varela+Round">
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css">
<link rel="stylesheet"
	href="https://fonts.googleapis.com/icon?family=Material+Icons">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
<script src="https://code.jquery.com/jquery-3.5.1.min.js"></script>
<script
	src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js"></script>
<script
	src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js"></script>
<style>

body {
	color: #566787;
	background: #f5f5f5;
	font-family: 'Varela Round', sans-serif;
	font-size: 13px;
}

.table-responsive {
	margin: 30px 0;
}

.table-wrapper {
	background: #fff;
	padding: 20px 25px;
	border-radius: 3px;
	min-width: 1000px;
	box-shadow: 0 1px 1px rgba(0, 0, 0, .05);
}

.table-title {
	padding-bottom: 15px;
	background: #435d7d;
	color: #fff;
	padding: 16px 30px;
	min-width: 100%;
	margin: -20px -25px 10px;
	border-radius: 3px 3px 0 0;
}

.table-title h2 {
	margin: 5px 0 0;
	font-size: 24px;
}

.table-title .btn-group {
	float: right;
}

.table-title .btn {
	color: #fff;
	float: right;
	font-size: 13px;
	border: none;
	min-width: 50px;
	border-radius: 2px;
	border: none;
	outline: none !important;
	margin-left: 10px;
}

.table-title .btn i {
	float: left;
	font-size: 21px;
	margin-right: 5px;
}

.table-title .btn span {
	float: left;
	margin-top: 2px;
}

table.table tr th, table.table tr td {
	border-color: #e9e9e9;
	padding: 12px 15px;
	vertical-align: middle;
}

table.table tr th:first-child {
	width: 60px;
}

table.table tr th:last-child {
	width: 100px;
}

table.table-striped tbody tr:nth-of-type(odd) {
	background-color: #fcfcfc;
}

table.table-striped.table-hover tbody tr:hover {
	background: #f5f5f5;
}

table.table th i {
	font-size: 13px;
	margin: 0 5px;
	cursor: pointer;
}

table.table td:last-child i {
	opacity: 0.9;
	font-size: 22px;
	margin: 0 5px;
}

table.table td a {
	font-weight: bold;
	color: #566787;
	display: inline-block;
	text-decoration: none;
	outline: none !important;
}

table.table td a:hover {
	color: #2196F3;
}

table.table td a.edit {
	color: #FFC107;
}

table.table td a.delete {
	color: #F44336;
}

table.table td i {
	font-size: 19px;
}

table.table .avatar {
	border-radius: 50%;
	vertical-align: middle;
	margin-right: 10px;
}

.pagination {
	float: right;
	margin: 0 0 5px;
}

.pagination li a {
	border: none;
	font-size: 13px;
	min-width: 30px;
	min-height: 30px;
	color: #999;
	margin: 0 2px;
	line-height: 30px;
	border-radius: 2px !important;
	text-align: center;
	padding: 0 6px;
}

.pagination li a:hover {
	color: #666;
}

.pagination li.active a, .pagination li.active a.page-link {
	background: #03A9F4;
}

.pagination li.active a:hover {
	background: #0397d6;
}

.pagination li.disabled i {
	color: #ccc;
}

.pagination li i {
	font-size: 16px;
	padding-top: 6px
}

.hint-text {
	float: left;
	margin-top: 10px;
	font-size: 13px;
}
/* Custom checkbox */
.custom-checkbox {
	position: relative;
}

.custom-checkbox input[type="checkbox"] {
	opacity: 0;
	position: absolute;
	margin: 5px 0 0 3px;
	z-index: 9;
}

.custom-checkbox label:before {
	width: 18px;
	height: 18px;
}

.custom-checkbox label:before {
	content: '';
	margin-right: 10px;
	display: inline-block;
	vertical-align: text-top;
	background: white;
	border: 1px solid #bbb;
	border-radius: 2px;
	box-sizing: border-box;
	z-index: 2;
}

.custom-checkbox input[type="checkbox"]:checked+label:after {
	content: '';
	position: absolute;
	left: 6px;
	top: 3px;
	width: 6px;
	height: 11px;
	border: solid #000;
	border-width: 0 3px 3px 0;
	transform: inherit;
	z-index: 3;
	transform: rotateZ(45deg);
}

.custom-checkbox input[type="checkbox"]:checked+label:before {
	border-color: #03A9F4;
	background: #03A9F4;
}

.custom-checkbox input[type="checkbox"]:checked+label:after {
	border-color: #fff;
}

.custom-checkbox input[type="checkbox"]:disabled+label:before {
	color: #b8b8b8;
	cursor: auto;
	box-shadow: none;
	background: #ddd;
}
/* Modal styles */
.modal .modal-dialog {
	max-width: 400px;
}

.modal .modal-header, .modal .modal-body, .modal .modal-footer {
	padding: 20px 30px;
}

.modal .modal-content {
	border-radius: 3px;
	font-size: 14px;
}

.modal .modal-footer {
	background: #ecf0f1;
	border-radius: 0 0 3px 3px;
}

.modal .modal-title {
	display: inline-block;
}

.modal .form-control {
	border-radius: 2px;
	box-shadow: none;
	border-color: #dddddd;
}

.modal textarea.form-control {
	resize: vertical;
}

.modal .btn {
	border-radius: 2px;
	min-width: 100px;
}

.modal form label {
	font-weight: normal;
}
</style>

</head>
<body>
<jsp:include page="navbaradmin.jsp" />  
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
	<div class="container-xl">
		<div class="table-responsive">
			<div class="table-wrapper">
				<div class="table-title">
					<div class="row">
						<div class="col-sm-6">
							<h2>
								Gérer <b>les employés</b>
							</h2>
						</div>
						<div class="col-sm-6">
							<a href="#addEmployeeModal" class="btn btn-success"
								data-toggle="modal"><i class="material-icons">&#xE147;</i> <span>Ajouter
									un nouveau employé</span></a> 
									<form method="get" action="CongéServlet">
								<input type="submit" class="btn btn-info"
							value="Congés">
								</form>
								<form method="get" action="AvanceServlet">
								<input type="submit" class="btn btn-info"
							value="Avances">
								</form>
						</div>
					</div>
				</div>
				<table class="table table-striped table-hover">
					<thead>
						<tr>

							<th>Nom</th>
							<th>Prenom</th>
							<th>Position</th>
							<th>Departement</th>
							<th>Tel</th>
							<th>Email</th>
							<th>Cin</th>
							<th>Status</th>
							<th>Action</th>

						</tr>
					</thead>
					<tbody>
						<c:forEach var="emp" items="${listemploye}">

							<tr>

								<td><c:out value="${emp.getNome()}" /></td>
								<td><c:out value="${emp.getPrenome()}" /></td>
								<td><c:out value="${emp.getPositione()}" /></td>
								<td><c:out value="${emp.getNumd()}" /></td>
								<td><c:out value="${emp.getTele()}" /></td>
								<td><c:out value="${emp.getEmail()}" /></td>
								<td><c:out value="${emp.getCine()}" /></td>
								<td><c:out value="${emp.getStatus()}" /></td>
								<td>
								
							
										<a href="#e${emp.getNume()}" class="edit"
									data-toggle="modal"><i class="material-icons"
										data-toggle="tooltip" title="Edit">&#xE254;</i></a>
										 
										 <a
										href="#c${emp.getNume()}" class="delete" data-toggle="modal"><i
										class="material-icons" data-toggle="tooltip" title="Delete">&#xE872;</i></a>
										
								</td>
							</tr>
						</c:forEach>
					</tbody>
				</table>

			</div>
		</div>
	</div>
	<!-- Add EMPLOYE Modal HTML -->
	<!-- The Modal -->
	<div id="addEmployeeModal" class="modal fade">
		<div class="modal-dialog modal-xl">
			<div class="modal-content">
				<form method="post" action="AddEmployeServlet">
					<!-- Modal Header -->
					<div class="modal-header">
						<h4 class="modal-title">Ajouter un employé</h4>
						<button type="button" class="close" data-dismiss="modal"
							aria-hidden="true">&times;</button>
					</div>
					<!-- Modal body -->
					<div class="modal-body">
						<div class="row">
							<div class="col-md-6 ml-auto">
								<input type="text" class="form-control" placeholder="Nom"
									name="nome" required>
							</div>
							<div class="col-md-6 ml-auto">
								<input type="text" class="form-control" placeholder="Prénom"
									name="prenome" required>
							</div>
						</div>
						<br>
						<div class="row">
							<div class="col-md-6 ml-auto">
								<div class="form-check">
									<input class="form-check-input" type="radio" value="Homme" name="sexe"
										id="homme"> <label class="form-check-label"
										for="homme"> Homme </label>
								</div>
							</div>

							<div class="col-md-6 ml-auto">
								<div class="form-check">

									<input class="form-check-input" type="radio" value="Femme" name="sexe"
										id="femme"> <label class="form-check-label"
										for="femme"> Femme </label>
								</div>
							</div>
						</div>
						<br>
						<div class="row">
							<div class="col-md-6 ml-auto">
								<input type="text" class="form-control" placeholder="Cin"
									name="cine" required>
							</div>
							<div class="col-md-6 ml-auto">
								<input type="text" class="form-control" placeholder="Adresse"
									name="adre" required>
							</div>
						</div>
						<br>
						<div class="row">
							<div class="col-md-6 ml-auto">
								<input type="text" class="form-control" placeholder="Age"
									name="age" required>
							</div>
							<div class="col-md-6 ml-auto">
								<input type="text" class="form-control" placeholder="Salaire"
									name="salaire" required>
							</div>
						</div>
						<br>
						<div class="row">
							<div class="col-md-6 ml-auto">
								<input type="text" class="form-control"
									placeholder="Nom du banque" name="nomb" required>
							</div>
							<div class="col-md-6 ml-auto">
								<input type="text" class="form-control"
									placeholder="Num du compte" name="iban" required>
							</div>
						</div>
						<br>
						<div class="row">
							<div class="col-md-6 ml-auto">
								<input type="date" class="form-control"
									placeholder="Date du début" name="dated" required>
							</div>
							<div class="col-md-6 ml-auto">
								<input type="date" class="form-control"
									placeholder="Date du fin" name="datef" required>
							</div>
						</div>
						<br>
						<div class="row">
							<div class="col-md-6 ml-auto">
								<input type="text" class="form-control" placeholder="Position"
									name="positione" required>
							</div>
							<div class="col-md-6 ml-auto">
								<input type="text" class="form-control" placeholder="Status"
									name="status" required>
							</div>
						</div>
						<br> <select class="custom-select" required name="numd">
						<option selected>Département</option>
						<c:forEach var="dep" items="${listdepartement}">
							
							<option value="${dep.getNumd()}"><c:out value="${dep.getNomd()}" /></option>
							
						</c:forEach>
						</select> <br> <br>
						<div class="row">
							<div class="col-md-6 ml-auto">
								<input type="text" class="form-control" placeholder="Email"
									name="email" required>
							</div>
							<div class="col-md-6 ml-auto">
								<input type="password" class="form-control"
									placeholder="Mot de passe" name="motpasse" required>
							</div>
						</div>
						<br>
					
							<div class="form-group">
								<input type="text" class="form-control" placeholder="Tel"
									name="tele" required>
							</div>
							
					





					</div>
					<!-- Modal footer -->
					<div class="modal-footer">
						<input type="button" class="btn btn-default" data-dismiss="modal"
							value="Annuler"> <input type="submit"
							class="btn btn-success" value="Ajouter">
					</div>
				</form>
			</div>
		</div>
	</div>
	<!-- Edit Modal HTML -->
	<c:forEach var="emp" items="${listemploye}">
	<div id="e${emp.getNume()}" class="modal fade">
		<div class="modal-dialog">
			<div class="modal-content">
				<form  method="post" action="EditEmploye">
					<div class="modal-header">
						<h4 class="modal-title">Modifier l'employé</h4>
						<button type="button" class="close" data-dismiss="modal"
							aria-hidden="true">&times;</button>
					</div>
							<div class="modal-body">
						<div class="row">
							<div class="col-md-6 ml-auto">
							<input type="hidden" value="${emp.getNume()}" name="numd">
								<input type="text" class="form-control" placeholder="Nom"
									name="nome" value="${emp.getNome()}" required>
							</div>
							<div class="col-md-6 ml-auto">
								<input type="text" class="form-control" placeholder="Prénom"
									name="prenome" value="${emp.getPrenome()}" required>
							</div>
						</div>
						<br>
						<div class="row">
							<div class="col-md-6 ml-auto">
								<div class="form-check">
									<input class="form-check-input" type="radio" value="Homme" name="sexe"
										id="homme"> <label class="form-check-label"
										for="homme"> Homme </label>
								</div>
							</div>

							<div class="col-md-6 ml-auto">
								<div class="form-check">

									<input class="form-check-input" type="radio" value="Femme" name="sexe"
										id="femme"> <label class="form-check-label"
										for="femme"> Femme </label>
								</div>
							</div>
						</div>
						<br>
						<div class="row">
							<div class="col-md-6 ml-auto">
								<input type="text" class="form-control" placeholder="Cin"
									name="cine" value="${emp.getCine()}" required>
							</div>
							<div class="col-md-6 ml-auto">
								<input type="text" class="form-control" placeholder="Adresse"
									name="adre" value="${emp.getAdre()}" required>
							</div>
						</div>
						<br>
						<div class="row">
							<div class="col-md-6 ml-auto">
								<input type="text" class="form-control" placeholder="Age"
									name="age" value="${emp.getAge()}" required>
							</div>
							<div class="col-md-6 ml-auto">
								<input type="text" class="form-control" placeholder="Salaire"
									name="salaire" value="${emp.getSalaire()}" required>
							</div>
						</div>
						<br>
						<div class="row">
							<div class="col-md-6 ml-auto">
								<input type="text" class="form-control"
									placeholder="Nom du banque" name="nomb" value="${emp.getNomb()}"  required>
							</div>
							<div class="col-md-6 ml-auto">
								<input type="text" class="form-control"
									placeholder="Num du compte" name="iban" value="${emp.getIban()}" required>
							</div>
						</div>
						<br>
						<div class="row">
							<div class="col-md-6 ml-auto">
								<input type="date" class="form-control"
									placeholder="Date du début" name="dated" value="${emp.getDated()}" required>
							</div>
							<div class="col-md-6 ml-auto">
								<input type="date" class="form-control"
									placeholder="Date du fin" name="datef" value="${emp.getDatef()}" required>
							</div>
						</div>
						<br>
						<div class="row">
							<div class="col-md-6 ml-auto">
								<input type="text" class="form-control" placeholder="Position"
									name="positione" value="${emp.getPositione()}" required>
							</div>
							<div class="col-md-6 ml-auto">
								<input type="text" class="form-control" placeholder="Status"
									name="status" value="${emp.getStatus()}" required>
							</div>
						</div>
						<br> <select class="custom-select" required name="numd">
						<option selected>Département</option>
						<c:forEach var="dep" items="${listdepartement}">
							
							<option value="${dep.getNumd()}"><c:out value="${dep.getNomd()}" /></option>
							
						</c:forEach>
						</select> <br> <br>
						<div class="row">
							<div class="col-md-6 ml-auto">
								<input type="text" class="form-control" placeholder="Email"
									name="email" value="${emp.getEmail()}" required>
							</div>
							<div class="col-md-6 ml-auto">
								<input type="password" class="form-control"
									placeholder="Mot de passe" name="motpasse" value="${emp.getMotpasse()}" required>
							</div>
						</div>
						<br>
					
							<div class="form-group">
								<input type="text" class="form-control" placeholder="Tel"
									name="tele" value="${emp.getTele()}" required>
							</div>
							
					





					</div>
					<div class="modal-footer">
						<input type="button" class="btn btn-default" data-dismiss="modal"
							value="Annuler"> <input type="submit" class="btn btn-info"
							value="Sauvegarder">
					</div>
				</form>
			</div>
		</div>
	</div>
	</c:forEach>
	<!-- Delete Modal HTML -->
					<c:forEach var="emp" items="${listemploye}">
	<div id="c${emp.getNume()}" class="modal fade">
		<div class="modal-dialog">
			<div class="modal-content">
				<form method="post" action="DeleteEmploye">
					<div class="modal-header">
					<input type="hidden" value="${emp.getNume()}" name="numd">
						<h4 class="modal-title">Supprimer l'employé</h4>
						<button type="button" class="close" data-dismiss="modal"
							aria-hidden="true">&times;</button>
					</div>
					<div class="modal-body">
					<input type="hidden" value="${emp.getNumd()}" name="numd">
						<p>Êtes-vous sûr de vouloir supprimer ces enregistrements ?</p>
						<p class="text-warning">
							<small>Cette action ne peut pas être annulée.</small>
						</p>
					</div>
					<div class="modal-footer">
						<input type="button" class="btn btn-default" data-dismiss="modal"
							value="Annuler"> <input type="submit"
							class="btn btn-danger" value="Supprimer">
					</div>
				</form>
			</div>
		</div>
	</div>
		</c:forEach>
	
	
	
</body>
</html>