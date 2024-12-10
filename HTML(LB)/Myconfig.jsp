<%   
out.print("Welcome "+request.getParameter("login"));  
String c_name=config.getInitParameter("College");  
out.print("<p>College name is="+c_name+"</p>");  
%>