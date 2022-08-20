<!DOCTYPE  html>
<html lang="en">
<head>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
</head>
<body>

<form action="" name="inputform">
<div class="container-fluid">
        <h1 class="h3 mb-0 text-gray-800">List Category</h1>
        <input type="button" value="Create" onclick="openPage('create')">
        <div class="table-responsive-sm" style="height: 700px;overflow: scroll;">
            <table class="table table-bordered table-striped mb-0">
                <thead class="thead-dark">
                <tr>
                    <th scope="col">ID</th>
                    <th scope="col">Code</th>
                    <th scope="col">Name</th>
                    <th scope="col">Discription</th>
                    <th scope="col">Create Date</th>
                    <th scope="col">Modify Date</th>
                    <th scope="col">Modify Date</th>
                </tr>
                </thead>
                <tbody>
                <c:choose>
                    <c:when test="${not empty listofcategory}">
                        <c:forEach items="${listofcategory}" var="lists">
                            <tr>
                                <th scope="row"> ${lists.id} </th>
                                <td>        ${lists.categoryCode}</td>
                                <td>        ${lists.categoryName}</td>
                                <td>        ${lists.categoryDescription}</td>
                                <td>        ${lists.createDate}</td>
                                <td>        ${lists.modifyDate}</td>
                                <td>	<input type="button" value="Update" onclick="openPage('category/update/${list.id}')">
                                		<input type="button" value="Delete" onclick="confirmDelete('delete', ${lists.id} );">
                                </td>
                            </tr>
                        </c:forEach>
                    </c:when>
                    <c:otherwise>
                       No data in table
                        <br />
                    </c:otherwise>
                </c:choose>
                </tbody>
            </table>
        </div>
    </div>
</form>
<script src="js/common.js"></script>
</body>
</html>