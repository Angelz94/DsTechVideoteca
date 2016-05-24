<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>main</title>
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css" integrity="sha384-1q8mTJOASx8j1Au+a5WDVnPi2lkFfwwEAa8hDDdjZlpLegxhjVME1fgjWPGmkzs7">
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap-theme.min.css" integrity="sha384-fLW2N01lMqjakBkx3l/M9EahuwpSfeNvV63J5ezn3uZzapT0u7EYsXMjQV+0En5r" >
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js" integrity="sha384-0mSbJDEHialfmuBBQP6A4Qrprq5OVfW37PRR3j5ELqxss1yVqOtnepnHVP9aJ7xS"></script>
</head>
<body>
	<div class="jumbotron">
	  	<div class="container">
	    	<h1 style="text-align: center;">-- VIDEOTECA DsTeCh --</h1>
	  	</div>
	</div>
	<div class="container">
		<div class="row">
			<div class="col-md-9">
				<h3 style="text-align: center;">
					-- Benvenuto nella Videoteca DsTech --
				</h3>
				<br>
				<form action="guest/welcome_page" method="POST">
					  <div class="form-group">
					    <label for="exampleInputEmail1">Email</label>
					    <input type="email" class="form-control" id="exampleInputEmail1" placeholder="Email" name="ssoId">
					  </div>
					  <div class="form-group">
					    <label for="exampleInputPassword1">Password</label>
					    <input type="password" class="form-control" id="exampleInputPassword1" placeholder="Password" name="password">
					  </div>
					  <button type="submit" class="btn btn-primary btn-lg btn-block">Login</button>
					</form>
			</div>
			<div class="col-md-3">
				<div class="panel panel-primary">
				  	<div class="panel-heading">
				    	<h3 class="panel-title" style="text-align: center;">-- Menu --</h3>
				  	</div>
				  	<div class="panel-body">
						<p><a class="btn btn-primary btn-lg btn-block" href="#" role="button" style="text-aling: center;">Lista Film</a></p>
						<p><a class="btn btn-primary btn-lg btn-block" href="#" role="button" style="text-aling: center;">Lista SerieTv</a></p>
						<p><a class="btn btn-primary btn-lg btn-block" href="#" role="button" style="text-aling: center;">Lista Attori</a></p>
						<p><a class="btn btn-primary btn-lg btn-block" href="#" role="button" style="text-aling: center;">Lista Categorie</a></p>
					</div>
				</div>
			</div>
		</div>
	</div>
</body>
</html>