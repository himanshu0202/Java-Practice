<!DOCTYPE html>

<%@page import="com.uic.se.stockapp.dbcon.DatabaseCon"%>
<%@page import="yahoofinance.YahooFinance"%>
<html>
<head>
<link href="css/metro.css" rel="stylesheet">
<link href="css/metro-icons.css" rel="stylesheet">
<link href="css/metro-responsive.css" rel="stylesheet">
<link rel="stylesheet" type="text/css"
	href="https://cdn.datatables.net/r/dt/dt-1.10.9/datatables.min.css" />

<script src="js/jquery.min.js"></script>
<script src=".js/datatables.js"></script>

<script src="js/metro.js"></script>
<script type="text/javascript"
	src="https://cdn.datatables.net/r/dt/dt-1.10.9/datatables.min.js"></script>
<script>
	<script>
	$(function() {
		//$('#example_table').dataTable();
	});
</script>
<style>
html, body {
	height: 100%;
}

body {
	
}

.page-content {
	padding-top: 3.125rem;
	min-height: 100%;
	height: 100%;
}

.table .input-control.checkbox {
	line-height: 1;
	min-height: 0;
	height: auto;
}

@media screen and (max-width: 800px) {
	#cell-sidebar {
		flex-basis: 52px;
	}
	#cell-content {
		flex-basis: calc(100% - 52px);
	}
}
</style>

<script>
	function pushMessage(t) {
		var mes = 'Info|Implement independently';
		$.Notify({
			caption : mes.split("|")[0],
			content : mes.split("|")[1],
			type : t
		});
	}

	$(function() {
		$('.sidebar').on('click', 'li', function() {
			if (!$(this).hasClass('active')) {
				$('.sidebar li').removeClass('active');
				$(this).addClass('active');
			}
		})
	})
</script>
<style type="text/css"></style>
</head>
<body class="bg-steel">
	<div class="app-bar fixed-top darcula" data-role="appbar">
		<ul class="app-bar-menu">
			<li data-flexorderorigin="0" data-flexorder="1"><a
				href="dashboard.jsp">Home</a></li>
			<li data-flexorderorigin="2" data-flexorder="3"><a
				href="Aboutus.html">About</a></li>
			<li data-flexorderorigin="3" data-flexorder="4"><a
				href="Contactus.html">Contact</a></li>
		</ul>

		<div class="app-bar-element place-right">
			<span class="mif-cog"><a href="index.jsp"><font color="white">Logout</font></a></span>
			<div
				class="app-bar-drop-container padding10 place-right no-margin-top block-shadow fg-dark"
				data-role="dropdown" data-no-close="true" style="width: 220px">
			</div>
		</div>
		<div class="app-bar-pullbutton automatic" style="display: none;"></div>
		<div class="clearfix" style="width: 0;"></div>
		<nav class="app-bar-pullmenu hidden flexstyle-app-bar-menu"
			style="display: none;">
			<ul class="app-bar-pullmenubar hidden app-bar-menu"></ul>
		</nav>
	</div>

	<div class="page-content">
		<div class="flex-grid no-responsive-future" style="height: 100%;">
			<div class="row" style="height: 100%">
				<div class="cell size-x200" id="cell-sidebar"
					style="background-color: #71b1d1; height: 100%">
					<ul class="sidebar">
						<li><a href="dashboard.jsp"> <span class="title">Dashboard</span>
						</a></li>
						<li><a href="UserProfile.jsp"> <span class="title">Profile</span>
						</a></li>
						<li class="active"><a href="dashboard.jsp"> <span
								class="title">Portfolio</span>
						</a></li>
						<li><a href="watchlist.jsp"> <span class="title">Watchlist</span>
						</a></li>
						<li><a href="dashboard.jsp"> <span class="title">Buy</span>
						</a></li>
						<li><a href="dashboard.jsp"><span class="title">Sell</span> </a></li>
					</ul>
				</div>
				<div class="cell auto-size padding20 bg-white" id="cell-content">
					<h1 class="text-light">Portfolio</h1>

					<hr class="thin bg-grayLighter">
					<div class="example">
						<table id="example_table"
							class="dataTable striped border bordered" data-role="datatable"
							data-searching="true">
							<thead>
								<tr>
									<th>Company/Sector</th>
									<th>Live Price</th>
									<th>Change</th>
									<th>Quantity</th>
									<th>Inv. Price</th>
									<th>Day's High</th>
									<th>Day's Low</th>
									<th>Overall Gain</th>
									<th>Overall Gain%</th>
									<th>Latest Value</th>
								</tr>
							</thead>

							<tfoot>
								<tr>
									<th>Company/Sector</th>
									<th>Live Price</th>
									<th>Change%</th>
									<th>Quantity</th>
									<th>Inv. Price</th>
									<th>Day's High</th>
									<th>Day's Low</th>
									<th>Overall Gain</th>
									<th>Overall Gain%</th>
									<th>Latest Value</th>
								</tr>
							</tfoot>

							<tbody>
								<%
									for (String stock : DatabaseCon
											.getStockCodesFromUserID((Integer) config.getServletContext().getAttribute("USER_ID"))) {
								%>
								<tr>
									<td><a target="_blank"
										href="http://chart.finance.yahoo.com/z?s=<%=stock%>&t=6m&q=l&l=on&z=l&p=m50,e200,v&a=p12,p"><%=YahooFinance.get(stock).getName()%></a></td>
									<td><%=YahooFinance.get(stock).getQuote().getPrice()%></td>
									<td><%=YahooFinance.get(stock).getQuote().getChangeInPercent()%>
									</td>
									<td>
										<%
											int quantity = DatabaseCon.getQuantityByUserIdAndStockId(
														(Integer) config.getServletContext().getAttribute("USER_ID"), stock);
										%> <%=quantity%>
									</td>
									<td>
										<%
											int invPrice = DatabaseCon.getInvPriceByUserIdAndStockId(
														(Integer) config.getServletContext().getAttribute("USER_ID"), stock);
										%> <%=invPrice%>
									</td>
									<td><%=YahooFinance.get(stock).getQuote().getDayHigh()%></td>
									<td><%=YahooFinance.get(stock).getQuote().getDayLow()%></td>
									<td>
										<%
											double overallGain = ((((YahooFinance.get(stock).getQuote().getPrice().doubleValue()) * quantity))
														- (invPrice * quantity));
										%> <%=String.format("%.2f", overallGain)%></td>
									<td>
										<%
											double gainPerc = ((overallGain / (invPrice * quantity)) * 100);
										%> <%=String.format("%.2f", gainPerc)%>
									</td>
									<td>
										<%
											double latestValue = ((YahooFinance.get(stock).getQuote().getPrice().doubleValue()) * quantity);
										%> <%=String.format("%.2f", latestValue)%>
									</td>
								</tr>
								<%
									}
								%>
							</tbody>
						</table>
					</div>
				</div>
			</div>
		</div>
	</div>

</body>
</html>