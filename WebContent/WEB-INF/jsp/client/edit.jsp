<%@ include file="/WEB-INF/jsp/_include/head.jsp" %>

	<body>
	
		<%@ include file="/WEB-INF/jsp/_include/menu.jsp" %>

	<body>
		
		<div class="container jumbotron">
			<h1 class="text-center">Editer un client</h1>
			
			<div class="text-center">
				<s:a action="client-all" cssClass="btn btn-info m-4">Retour à la liste</s:a>
			</div>
			
			<div class="col-sm-6 offset-sm-3 mt-3">
				<%@ include file="../_include/client/form.jsp" %>
			</div>
		</div>
		
		<%@ include file="/WEB-INF/jsp/_include/footer.jsp" %>

	</body>
</html>