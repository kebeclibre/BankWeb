<jsp:include page="includes/header.jsp"/>
<div class="container">


<div class="row">
  <div class="col-md-4"></div>
  <div class="col-md-4">
  
  ${accountState}
  <form action="sendCreateAccount.do" method="POST">
   <p>Numéro : <input type="text" name="numero"/></p>
  <p>Nom : <input type="text" name="nom"/></p>
  <p>Prenom : <input type="text" name="prenom"/></p>
  <p>Solde Initial :<input type="text" name="balance"/></p>
  <p>Credit Autorisé : <input type="text" name="allowedCredit"/></p>
  <p><input type="submit" value="Envoyer"/></p>
  </form>

  
  </div>
  <div class="col-md-4">
  
  </div>
</div>



</div>
<jsp:include page="includes/footer.jsp"/>