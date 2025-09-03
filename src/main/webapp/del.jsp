<%@page import="com.entity.PliDtls"%>
<%@page import="com.db.DBConnect"%>
<%@page import="com.DAO.PliDAO"%>
<% request.setAttribute("courseactive", "active"); %>
<% request.setAttribute("title", "Home"); %>
<jsp:include page="format/header.jsp"></jsp:include>


<div class="container">

	<div class="row>">
	
		<div class="col-md-6 offset-md-3">
		
			<div class="card">
			
			
				<div class="card-body">
				
					<div class="card-title text-success display-3 text-center fw-bold">Delete Course Form</div>
					<h4 class="text-danger fw-bold">Are you sure you want to delete</h4>
					<%
					
					  int id = Integer.parseInt(request.getParameter("id"));
					  PliDAO dao = new PliDAO(DBConnect.getConnect());
					  PliDtls  t = dao.getPliById(id);
					  
					%>
					<form method="post" action="del_todo">
						<div class="mb-3">
						   	<input type="hidden"  name="txtid" value="<%= t.getId() %>">
							<label for="txtname" class="form-label">Name</label>
							<input type="text" class="form-control"  placeholder="Enter Your Name Here" id="txtname" name="name"  value="<%= t.getFname() %>"  disabled >
						</div>
						
						<div class="mb-3">
						
							<label for="txtcourse" class="form-label">Course</label>
							<input type="text" class="form-control"  placeholder="Enter Your Name Here" id="txtcourse" name="course"  value="<%= t.getCourse() %>" disabled>
						</div>
						
						<div class="mb-3">
						
							<label for="drpstatus" class="form-label">Status</label> 
							<input class="form-control" list="datalistOptions"
								id="exampleDataList" name="status" placeholder="Type to search..." value="<%= t.getStatus()  %>" disabled >
							<datalist id="datalistOptions">
								<option value="Pending">
								<option value="Complete">
							</datalist>
						</div>
						
						<div class="mb-3">
							<div class="d-grid gap-2">
							 	<button class="btn btn-danger btn-lg" type="submit">Delete</button>
							 </div>
						
						</div>
					
					</form>
				
				</div>
			
			</div>
		
		
		</div>
	
	</div>

</div>


    
 <jsp:include page="format/footer.jsp"></jsp:include>

