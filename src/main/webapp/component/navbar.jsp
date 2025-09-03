<nav class="navbar navbar-expand-lg navbar-light" style="background-color:#F2EEED;">
  <div class="container-fluid">
    <a class="navbar-brand" href="#">
    <img alt="" src="https://yt3.googleusercontent.com/bKIL8gQQ1mvDu4CKThkPlZQH00rCUP5Lho3XoOtaBJP7TBzqxj9dCxmWQ-a-NRF94i7txwe31A=s900-c-k-c0x00ffffff-no-rj" width="40" height="40">
    PLI-APP
    
    </a>
    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
      <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="navbarNav">
      <ul class="navbar-nav">
        <li class="nav-item">
          <a class="nav-link <%=request.getAttribute("homeactive")%>" aria-current="page" href="homepage.jsp">Home</a>
        </li>
        <li class="nav-item">
          <a class="nav-link <%=request.getAttribute("courseactive")%>" href="course.jsp">Course</a>
        </li>
      </ul>
    </div>
  </div>
</nav>