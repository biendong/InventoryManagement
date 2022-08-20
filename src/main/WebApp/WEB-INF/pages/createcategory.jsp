<!DOCTYPE html>
<html lang="en">
<head>
    <%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
    <sec:authentication var="principal" property="principal" />
    <meta charset='utf-8'>
    <link href='https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css' rel='stylesheet'>
    <script type='text/javascript' src='https://cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js'></script>
    </head>
<body class='snippet-body'>
<div class="container rounded bg-white mt-5 mb-5">
<form action="/create" class="col-md-8 " method = "POST" id="edituser">
            <div class="p-3 py-5">
                <div class="d-flex justify-content-between align-items-center mb-3">
                    <h4 class="text-right">Create category</h4>
                </div>
             <div class="form-group">
                <input type="text" class="form-control form-control-user" name="categoryCode"
                                           placeholder="Enter category code">
             </div>
                 <div class="form-group">
                   <input type="text" class="form-control form-control-user" name="categoryName"
                      placeholder="Enter category name">
             </div>
             <div class="form-group">
                 <input type="text" class="form-control form-control-user" name="categoryDescription"
                     placeholder="Enter description">
                            </div>

                <div class="mt-5 text-center">
                <button class="btn btn-primary profile-button"
                        type="submit">
                    Create</button>
            </div>
            </div>
        </form>

    </div>
</div>
</div>
</div>
<script type='text/javascript' src='https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.bundle.min.js'></script>

</body>
</html>"
