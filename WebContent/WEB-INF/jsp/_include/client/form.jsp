<s:form action="client-new">
	<input type="hidden" name="client.id" value="${client.id}" />
	<div class="form-group">
		Nom
		<input type="text"
			name="client.lastname"
			class="form-control"
			value="${client.lastname}" />
	</div>
	<div class="form-group">
		Prénom
		<input type="text"
			name="client.firstname"
			class="form-control"
			value="${client.firstname}" />
	</div>
	<div class="form-group">
		Email
		<input type="text"
			name="client.email"
			class="form-control"
			value="${client.email}" />
	</div>
	<div class="form-group">
		Téléphone
		<input type="tel"
			name="client.tel"
			class="form-control"
			value="${client.tel}" />
	</div>
	<button type="submit" class="btn btn-info">Valider</button>
</s:form>