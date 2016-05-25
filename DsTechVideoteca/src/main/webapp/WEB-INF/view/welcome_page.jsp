<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<meta name="description" content="" />
	<link rel="stylesheet" href="style.css" type="text/css" />
  <title>Videoteca</title>
  <style type="text/css">

	* { box-sizing:border-box; }

	body {
		font-family: Helvetica;
		background: #eee;
	  -webkit-font-smoothing: antialiased;
	}

	hgroup {
		text-align:center;
		margin-top: 4em;
	}

	h1, h3 { font-weight: 300; }

	h1 { color: #636363; }

	h3 { color: #4a89dc; }

	form {
		font-family: Helvetica;
		margin: 4em auto;
		padding: 3em 2em 2em 2em;
		background: #fafafa;
		border: 1px solid #ebebeb;
		box-shadow: rgba(0,0,0,0.14902) 0px 1px 1px 0px,rgba(0,0,0,0.09804) 0px 1px 2px 0px;
	}

			#nav{
				position: relative;
				padding-left: 336px;
			}

			#nav ul li a{
			  display: inline-block;
			  padding: 12px 6px;
			  margin: .3em 0 1em 0;
			  width: 50%;
			  color: #fff;
			  font-size: 16px;
			  line-height: 20px;
			  text-align: center;
			  letter-spacing: 1px;
			  background: transparent;
			  border: 0;
			  border-bottom: 2px solid #3160B6;
			  -webkit-transition:all 0.15s ease;
			  transition: all 0.15s ease;
				background: #4a89dc;
				text-shadow: 1px 1px 0 rgba(39, 110, 204, .5);

			}

			#nav ul{
				list-style-type:none;
			}

				#nav a{
					text-decoration: none;

				}


				#nav ul li a:hover{ background: #357bd8; }


	#content{
		width: 90%;
		height: 100%;

	}

	#content p,h2{
		text-align: center;
	}

	footer { text-align: center; }

	footer p {
		color: #888;
		font-size: 13px;
		letter-spacing: .4px;
	}

	footer a {
		color: #4a89dc;
		text-decoration: none;
		transition: all .2s ease;
	}

	footer a:hover {
		color: #666;
		text-decoration: underline;
	}

	footer img {
		width: 80px;
		transition: all .2s ease;
	}

	footer img:hover { opacity: .83; }

	footer img:focus , footer a:focus { outline: none; }
</style>
</head>
<body>
	<div id="page">
		<div id="logo">
			<hgroup>
		  <h1>Videoteca DsTech</h1>
		  <h3>By Gruppo Alpha</h3>
		</hgroup>
		</div>
		<form id="content">
			<h2>Videoteca</h2>
			<p>
				Benvenuto nella videoteca DsTech
			</p>
			<p>
				In questa pagina puoi effettuare le ricerche dei tuoi film, serie tv e attori preferiti.
			</p>
		</br>
			<div id="nav">
				<ul>
					<li><a href="///////////"><b>Ricerca Serie Tv<b></a></li>
					<li><a href="//////////"><b>Ricerca Serie Film<b></a></li>
					<li><a href="//////////"><b>Ricerca Attore<b></a></li>
				</ul>
			</div>
		</form>
	</br>
	</div>
	<footer><a href="http://www.dstech.it" target="_blank"><img src="http://www.dstech.it/images/27a9525c.logo_white.png"></a>
		<p>You Gotta Love <a href="http://www.dstech.it" target="_blank">DsTech</a></p>
	</footer>
</body>
</html>