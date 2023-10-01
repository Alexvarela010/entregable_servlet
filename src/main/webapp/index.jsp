<%
if (session!=null&&session.getAttribute("username")!=null){
  response.sendRedirect(request.getContextPath()+"/jsp/dashboard.jsp");
}else{
  response.sendRedirect(request.getContextPath()+"/jsp/login.jsp");
}
%>