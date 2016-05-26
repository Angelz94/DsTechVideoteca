<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
	<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta charset="UTF-8">
    <title>Lista Film</title>
    <style type "text/css">
      Inspired by the dribble shot http://dribbble.com/shots/1285240-Freebie-Flat-Pricing-Table?list=tags&tag=pricing_table

      @import url(http://fonts.googleapis.com/css?family=Droid+Sans);
      @import url(http://weloveiconfonts.com/api/?family=fontawesome);

      [class*="fontawesome-"]:before {
        font-family: 'FontAwesome', sans-serif;
      }
     {
          margin: 0;
          padding: 0;
          border: 0;
          font-size: 100%;
          font: inherit;
          vertical-align: baseline;
          -webkit-box-sizing: border-box;
          -moz-box-sizing: border-box;
          box-sizing: border-box;

      }

      .fl{ float:center; }

      .group:before,
      .group:after {
          content: "";
          display: table;
      }
      .group:after {
          clear: both;
      }
      .group {
          zoom: 1;
      }

      body {
          background: #eee;
          line-height: 1;
          font-size: 26px;
      }

      .pricing-table {
          width: 80%;
          margin: 50px auto;
          text-align: center;
          padding: 10px;
          padding-right: 0;
      }
      .pricing-table .heading{
          color: #636363;
          text-transform: uppercase;
          font-size: 3.5rem;
          margin-bottom: 4rem;
          text-align:center;

        }
      }
      .block{
          width: 50%;
          margin: 0 15px;
          overflow: hidden;
          -webkit-border-radius: 5px;
          -moz-border-radius: 5px;
      }

      .title{
          color: #FEFEFE;
          text-transform: capitalize;
          line-height: 2.5;
          position: relative;
      }
      .content{
          position: relative;
          color: #FEFEFE;
          padding: 50px 0 50px 0;
      }

      .content:after, .content:before{
      	top: 100%;
      	left: 100%;
      	border: solid transparent;
      	content: " ";
      	height: 0;
      	width: 0;
      	position: absolute;
      	pointer-events: none;

      }

      .content:after{
      	border-color: rgba(136, 183, 213, 0);
      	border-width: 5px;
      	margin-left: -5px;
      }

      .price{
          position: relative;
          display: inline-block;
          margin-bottom: 0.625rem;
      }
      .price span{
          font-size: 6rem;
          letter-spacing: 8px;
          font-weight: bold;
      }
      .price sup{
          font-size: 1.5rem;
          position: absolute;
          top: 12px;
          left: -12px;
      }
      .hint{
          font-style: italic;
          font-size: 0.9rem;
      }
      .features{
          list-style-type: none;
          background: #FFFFFF;
          text-align: left;
          color: #9C9C9C;
          padding:30px 22%;
          font-size: 0.9rem;
      }
      .features li{
          padding:15px 0;
          width: 100%;
          text-align: center;
      }
      .features li span{
         padding-right: 0.4rem;
      }


      .personal .title{
          background: #4a89dc;
          font-family: Helvetica;
      }
      .personal .content{
          background: #4a89dc;
      }
      .personal .content:after{
      	border-top-color: #82DACA;
      }


      #tfheader{
      		background-color:#4a89dc;
      	}
      	#tfnewsearch{
      		float:center;
      		padding:20px;
      	}
      	.tftextinput{
      		margin: 0;
      		padding: 20px 30px;
      		font-family: Arial, Helvetica, sans-serif;
      		font-size:14px;
      		border:2px solid #4a89dc; border-right:0px;
      		border-top-left-radius: 5px 5px;
      		border-bottom-left-radius: 5px 5px;
      	}
      	.tfbutton {
      		margin: 0;
      		padding: 20px 15px;
      		font-family: Arial, Helvetica, sans-serif;
      		font-size:14px;
      		outline: none;
      		cursor: pointer;
      		text-align: center;
      		text-decoration: none;
      		color: #ffffff;
      		border: solid 1px #0076a3; border-right:0px;
      		background: #0095cd;
      		background: -webkit-gradient(linear, left top, left bottom, from(#00adee), to(#0078a5));
      		background: -moz-linear-gradient(top,  #00adee,  #0078a5);
      		border-top-right-radius: 5px 5px;
      		border-bottom-right-radius: 5px 5px;
      	}
      	.tfbutton:hover {
      		text-decoration: none;
      		background: #007ead;
      		background: -webkit-gradient(linear, left top, left bottom, from(#0095cc), to(#00678e));
      		background: -moz-linear-gradient(top,  #0095cc,  #00678e);
      	}
      	/* Fixes submit button height problem in Firefox */
      	.tfbutton::-moz-focus-inner {
      	  border: 0;
      	}
      	.tfclear{
      		clear:both;
      	}


        /* Button */

        .button {
          position: relative;
          display: inline-block;
          padding: 12px 24px;
          margin: .3em 0 1em 0;
          width: 20%;
          vertical-align: middle;
          color: #fff;
          font-size: 16px;
          line-height: 20px;
          -webkit-font-smoothing: antialiased;
          text-align: center;
          letter-spacing: 1px;
          background: transparent;
          border: 0;
          border-bottom: 2px solid #3160B6;
          cursor: pointer;
          transition: all 0.15s ease;
        }
        .button:focus { outline: 0; }


        /* Button modifiers */

        .buttonBlue {
          background: #4a89dc;
          text-shadow: 1px 1px 0 rgba(39, 110, 204, .5);
        }

        .buttonBlue:hover { background: #357bd8; }

        .flex {max-width: 25%}


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
<div class="wrapper">
        <!-- PRICING-TABLE CONTAINER -->
        <div class="pricing-table group">
            <h1 class="heading">
                Lista Film
            </h1>
            <!-- HTML for SEARCH BAR -->
	<div id="tfheader">
		<form id="tfnewsearch" method="get" action="http://www.google.com">
		        <input type="text" class="tftextinput" name="q" size="30" maxlength="120"><input type="submit" value="search" class="tfbutton">
		</form>
	<div class="tfclear"></div>
	</div>
            <!-- PERSONAL -->
            <div class="block personal fl">
                <h2 class="title">Nome Film</h2>
                <!-- CONTENT -->
                <div class="content">
                  <p class="hint">Nome</p>
                    <p class="hint">Genere</p>
                    <p class="hint">Durata</p>
                </div>
                <!-- /CONTENT -->
                <!-- FEATURES -->
                <ul class="features">
                    <li><span class="fontawesome-cog"></span>Attore 1</li>
                    <li><span class="fontawesome-star"></span>Attore 2</li>
                    <li><span class="fontawesome-dashboard"></span>Attore 3</li>
                    <li><span class="fontawesome-cloud"></span>Attore 4</li>
                </ul>
                <!-- /FEATURES -->
                <!-- PT-FOOTER -->
                <div class="pt-footer">
                  <button type="button" class="button buttonBlue" onclick="window.open('///////////////');">Home Page
                    <div class="ripples buttonRipples"><span class="ripplesCircle"></span></div>
                  </button>
                </div>
                <!-- /PT-FOOTER -->
            </div>
          </div>
    <footer><a href="http://www.dstech.it" target="_blank"><img src="http://www.dstech.it/images/27a9525c.logo_white.png"></a>
  		<p>You Gotta Love <a href="http://www.dstech.it" target="_blank">DsTech</a></p>
  	</footer>
</body>
</html>