<% request.setAttribute("courseactive", "active"); %>
<% request.setAttribute("title", "Home"); %>
<jsp:include page="format/header.jsp"></jsp:include>


<div class="container">

	<div class="row>">
	
		<div class="col-md-6 offset-md-3">
		
			<div class="card">
			
			
				<div class="card-body">
				
					<div class="card-title text-success display-3 text-center fw-bold">Course Form</div>
					<form method="post" action="add_todo">
						<div class="mb-3">
						
							<label for="txtname" class="form-label">Name</label>
							<input type="text" class="form-control"  placeholder="Enter Your Name Here" id="txtname" name="name" required>
						</div>
						
						<div class="mb-3">
						
							<label for="txtcourse" class="form-label">Course</label>
							<input type="text" class="form-control"  placeholder="Enter Your Name Here" id="txtcourse" name="course" required>
						</div>
						
						<div class="mb-3">
						
							<label for="drpstatus" class="form-label">Status</label> 
							<input class="form-control" list="datalistOptions"
								id="exampleDataList" name="status" placeholder="Type to search..." required>
							<datalist id="datalistOptions">
								<option value="Pending">
								<option value="Complete">
							</datalist>
						</div>
						
						<div class="mb-3">
							<div class="d-grid gap-2">
							 	<button class="btn btn-danger btn-lg" type="submit">Submit</button>
							 </div>
						
						</div>
					
					</form>
				
				</div>
			
			</div>
		
		
		</div>
	
	</div>

</div>


    
 <jsp:include page="format/footer.jsp"></jsp:include>

