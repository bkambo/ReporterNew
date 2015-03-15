<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<title>Mo money mo problems</title>
<body>
    <table>
        <ul>

        <c:forEach var="item" items="${listToOutput}" >
            <tr>
                <td><c:out value="${item}" /></td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>