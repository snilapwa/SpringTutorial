<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>
 
<html>
<body>
<h2>Hello World!</h2>
 
I am feeling: ${ mood.feeling }.

<P>
<a href="reason/${ mood.feeling }"> Do you want to know reason?</a>


</body>
</html>