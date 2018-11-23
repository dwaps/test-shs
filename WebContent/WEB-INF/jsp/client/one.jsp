<%@ include file="/WEB-INF/jsp/_include/head.jsp" %>

	<body>
	
		<%@ include file="/WEB-INF/jsp/_include/menu.jsp" %>

	<body>
		
		<div class="container jumbotron">
			<h1 class="text-center">D�tail d'un client</h1>
			
			<div class="text-center">
				<s:a action="client-all" cssClass="btn btn-info m-4">Retour � la liste</s:a>
			</div>
			
			<div class="col-sm-6 offset-sm-3 mt-3">
				<p>
					Nom : ${client.lastname.toUpperCase()} ${client.firstname}
					<br />
					Email : ${client.email}
					<br />
					T�l�phone :
					<s:if test="%{!client.tel.isEmpty()}">${client.tel}</s:if>
					<s:else>pas de num�ro</s:else>
				</p>
			</div>
		</div>
		
		<%@ include file="/WEB-INF/jsp/_include/footer.jsp" %>

	</body>
</html>