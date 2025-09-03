
<%@page import="com.entity.PliDtls"%>
<%@page import="java.util.List"%>
<%@page import="com.db.DBConnect"%>
<%@page import="com.DAO.PliDAO"%>
<% request.setAttribute("homeactive", "active"); %>
<% request.setAttribute("title", "Home"); %>
<jsp:include page="format/header.jsp"></jsp:include>



<div class="container bg-light">
<h3 class="text-success bg-light p-2 fw-bold text-center display-4">PLI APP</h3>

<%
	String sucMsg = (String)session.getAttribute("sucMsg");
	if(sucMsg != null) {
%>
<div class="alert alert-success" role="alert">
  <%= sucMsg %>
</div>

<%
session.removeAttribute("sucMsg");
} %>

<!-- -----failed Message----- -->


<%
	String failMsg = (String)session.getAttribute("failMsg");
	if(failMsg != null) {
%>
<div class="alert alert-danger" role="alert">
  <%= failMsg %>
</div>

<%
session.removeAttribute("failMsg");
} %>

<table class="table table-striped table-bordered table-hover">
  <thead class="bg-primary text-white text-center p-2 fs-5">
    <tr>
      <th scope="col">ID</th>
      <th scope="col">Name</th>
      <th scope="col">Course</th>
      <th scope="col">Status</th>
      <th scope="col">Action</th>
    </tr>
  </thead>
  <tbody>
  <%
   PliDAO dao = new PliDAO(DBConnect.getConnect());
   List<PliDtls> t = dao.getPli();
   for(PliDtls pd : t)
   { %>
   <tr class="text-center">
      <th scope="row"><%= pd.getId() %></th>
      <td><%= pd.getFname() %></td>
      <td><%= pd.getCourse() %></td>
      <td><%= pd.getStatus() %></td>
      <td class="text-center">
      		<a href="edit.jsp?id=<%= pd.getId() %>" class="btn btn-success me-2">Edit</a>
      		<a href="del.jsp?id=<%=  pd.getId() %>" class="btn btn-danger">Delete</a>
      </td>
    </tr>
  <% } %>
  
  </tbody>
</table>
<br>
</div>
 <jsp:include page="format/footer.jsp"></jsp:include>

