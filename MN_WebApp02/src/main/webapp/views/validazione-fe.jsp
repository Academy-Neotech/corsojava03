<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>AdminLTE 3 | Blank Page</title>

<!-- Google Font: Source Sans Pro -->
<link rel="stylesheet"
	href="https://fonts.googleapis.com/css?family=Source+Sans+Pro:300,400,400i,700&amp;display=fallback">
<!-- Font Awesome -->
<link rel="stylesheet"
	href="./static/plugins/fontawesome-free/css/all.min.css">
<!-- Theme style -->
<link rel="stylesheet" href="./static/css/adminlte.min.css">
</head>
<body class="hold-transition sidebar-mini">
	<!-- Site wrapper -->
	<div class="wrapper">
		<!-- Navbar -->
		<nav
			class="main-header navbar navbar-expand navbar-white navbar-light">
			<!-- Left navbar links -->
			<ul class="navbar-nav">
				<li class="nav-item"><a class="nav-link" data-widget="pushmenu"
					href="#" role="button"><i class="fas fa-bars"></i></a></li>
				<li class="nav-item d-none d-sm-inline-block"><a
					href="../../index3.html" class="nav-link">Home</a></li>
			</ul>

			<!-- Right navbar links -->
			<ul class="navbar-nav ml-auto">
				<!-- Navbar Search RIMOSSA!!!-->


				<!-- Messages Dropdown Menu RIMOSSA!!!-->

				<!-- Notifications Dropdown Menu RIMOSSA-->


				<li class="nav-item"><a class="nav-link"
					data-widget="control-sidebar" data-slide="true" href="#"
					role="button"> <i class="fas fa-th-large"></i>
				</a></li>
			</ul>
		</nav>
		<!-- /.navbar -->

		<!-- Main Sidebar Container -->
		<aside class="main-sidebar sidebar-dark-primary elevation-4">
			<!-- Brand Logo -->
			<a href="../../index3.html" class="brand-link"> <img
				src="./static/img/AdminLTELogo.png" alt="AdminLTE Logo"
				class="brand-image img-circle elevation-3" style="opacity: .8">
				<span class="brand-text font-weight-light">Noetech</span>
			</a>

			<!-- Sidebar -->
			<div class="sidebar">
				<!-- Sidebar user (optional) RIMOSSA-->



				<!-- SidebarSearch Form RIMOSSA-->


				<!-- Sidebar Menu -->
				<nav class="mt-2">
					<ul class="nav nav-pills nav-sidebar flex-column"
						data-widget="treeview" role="menu" data-accordion="false">
						<!-- Add icons to the links using the .nav-icon class
               with font-awesome or any other icon font library -->
						<li class="nav-item"><a href="#" class="nav-link"> <i
								class="nav-icon fas fa-tachometer-alt"></i>
								<p>Dashboard</p>
						</a></li>
						<li class="nav-item"><a href="#" class="nav-link"> <i
								class="nav-icon fas fa-tachometer-alt"></i>
								<p>Validazioni</p> <i class="right fas fa-angle-left"></i>
								<ul class="nav nav-treeview">
									<li class="nav-item"><a href="validazione-fe"
										class="nav-link"> <i class="far fa-circle nav-icon"></i>
											<p>FrontEnd</p>
									</a></li>
									<li class="nav-item"><a href="validazione-be"
										class="nav-link"> <i class="far fa-circle nav-icon"></i>
											<p>BackEnd</p>
									</a></li>
								</ul>
						</a></li>
					</ul>
				</nav>
				<!-- /.sidebar-menu -->
			</div>
			<!-- /.sidebar -->
		</aside>

		<!-- Content Wrapper. Contains page content -->
		<div class="content-wrapper">
			<!-- Content Header (Page header) -->
			<section class="content-header">
				<div class="container-fluid">
					<div class="row mb-2">
						<div class="col-sm-6">
							<h1>Blank Page</h1>
						</div>
						<div class="col-sm-6">
							<ol class="breadcrumb float-sm-right">
								<li class="breadcrumb-item"><a href="#">Home</a></li>
								<li class="breadcrumb-item active">Blank Page</li>
							</ol>
						</div>
					</div>
				</div>
				<!-- /.container-fluid -->
			</section>

			<!-- Main content -->
			<section class="content">

				<!-- Default box -->
									<!-- inizio form -->
				<form id="form_validazione_fe">
				<div class="card">
					<div class="card-header">
						<h3 class="card-title">Form Validation</h3>
						<div class="card-tools">
							<button type="button" class="btn btn-tool"
								data-card-widget="collapse" title="Collapse">
								<i class="fas fa-minus"></i>
							</button>
							<button type="button" class="btn btn-tool"
								data-card-widget="remove" title="Remove">
								<i class="fas fa-times"></i>
							</button>
						</div>
					</div>
					<div class="card-body">
						<div class="form-group">
							<label for="exampleInputEmail1">Email address</label>
							<input type="email" name="email" class="form-control" id="exampleInputEmail1" placeholder="Enter email"/>
							
						</div>
						<div class="form-group">
							<label for="exampleInputPassword1">Password</label>
							<input type="password" name="password" class="form-control" id="exampleInputPassword1" placeholder="Password"/>
						</div>
						<div class="form-group mb-0">
							<div class="custom-control custom-checkbox">
								<input type="checkbox" name="terms" class="custom-control-input" id="exampleCheck1">
								<label class="custom-control-label" for="exampleCheck1">I
									agree to the <a href="#">terms of service</a>.
								</label>
							</div>
							<span id="terms-error" class="error invalid-feedback"
								style="display: inline;">Please accept our terms</span>
						</div>
				
					</div>
					<!-- /.card-body -->
					<div class="card-footer">
                  <button type="submit" class="btn btn-primary">Submit</button>
                </div>
					<!-- /.card-footer-->
				</div>
				<!-- fine form -->
				</form>	
				<!-- /.card -->

				<div class="card">
					<div class="card-header">
						<h3 class="card-title">AJAX Validation</h3>

						<div class="card-tools">
							<button type="button" class="btn btn-tool"
								data-card-widget="collapse" title="Collapse">
								<i class="fas fa-minus"></i>
							</button>
							<button type="button" class="btn btn-tool"
								data-card-widget="remove" title="Remove">
								<i class="fas fa-times"></i>
							</button>
						</div>
					</div>
					<div class="card-body">Start creating your amazingapplication!</div>
					<!-- /.card-body -->
					<div class="card-footer">Footer</div>
					<!-- /.card-footer-->
				</div>
				<!-- /.card -->


			</section>
			<!-- /.content -->
		</div>
		<!-- /.content-wrapper -->

		<footer class="main-footer">
			<div class="float-right d-none d-sm-block">
				<b>Version</b> 3.2.0
			</div>
		</footer>

		<!-- Control Sidebar -->
		<aside class="control-sidebar control-sidebar-dark">
			<!-- Control sidebar content goes here -->
		</aside>
		<!-- /.control-sidebar -->
	</div>
	<!-- ./wrapper -->

	<!-- jQuery -->
	<script src="./static/plugins/jquery/jquery.min.js"
		type="text/javascript"></script>
	<!-- Bootstrap 4 -->
	<script src="./static/plugins/bootstrap/js/bootstrap.bundle.min.js"
		type="text/javascript"></script>
	<!-- AdminLTE App -->
	<script src="./static/js/adminlte.min.js" type="text/javascript"></script>
	<!-- AdminLTE for demo purposes -->
	<script src="./static/js/demo.js" type="text/javascript"></script>
	
<script>
$( document ).ready(function() {
	
	
  //registrazione alla validazione del form	
  $('#form_validazione_fe').validate({
    rules: {
      email: {
        required: true,
        email: true,
      },
      password: {
        required: true,
        minlength: 5
      },
      terms: {
        required: true
      },
    },
    messages: {
      email: {
        required: "Please enter a email address",
        email: "Please enter a valid email address"
      },
      password: {
        required: "Please provide a password",
        minlength: "Your password must be at least 5 characters long"
      },
      terms: "Please accept our terms"
    },
    errorElement: 'span',
    errorPlacement: function (error, element) {
      error.addClass('invalid-feedback');
      element.closest('.form-group').append(error);
    },
    highlight: function (element, errorClass, validClass) {
      $(element).addClass('is-invalid');
    },
    unhighlight: function (element, errorClass, validClass) {
      $(element).removeClass('is-invalid');
    }
  });
});
</script>	
</body>
</html>
