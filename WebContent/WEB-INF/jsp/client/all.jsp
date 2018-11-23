<%@ include file="/WEB-INF/jsp/_include/head.jsp" %>

	<body>
	
		<%@ include file="/WEB-INF/jsp/_include/menu.jsp" %>
		
		<div class="container text-center jumbotron">
			<h1>Liste des clients</h1>
			
			<s:a action="client-new" cssClass="btn btn-info m-4">Ajouter un client</s:a>
			
			<s:if test="%{clients.isEmpty()}">
				<p>Il n'y a pas de clients pour le moment.</p>
			</s:if>
			
			<s:else>
			<table class="table table-striped">
				<thead>
					<tr>
						<th>Nom du client</th>
						<th>Email</th>
						<th>Action</th>
					</tr>
				</thead>
				<tbody>
					<s:iterator value="clients">
					<tr>
						<td>${lastname.toUpperCase()} ${firstname}</td>
						<td>${email}</td>
						<td>
							<s:a action="client-one" cssClass="p-1">
							<s:param name="clientId">${id}</s:param>
							<i class="fa fa-eye text-info"></i></s:a>
							
							<s:a action="client-edit" cssClass="p-1">
							<s:param name="idClient">${id}</s:param>
							<i class="fa fa-edit text-info"></i></s:a>
							
							<s:a action="client-delete" cssClass="p-1">
							<s:param name="clientId">${id}</s:param>
							<i class="fa fa-trash text-info"></i></s:a>
						</td>
					</tr>
					</s:iterator>
				</tbody>
			</table>
			</s:else>
		</div>
		
		<%@ include file="/WEB-INF/jsp/_include/footer.jsp" %>

	</body>
</html>