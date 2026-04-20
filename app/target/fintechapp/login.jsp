

<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

<title>E-Commerce</title>

<style>

body {
  margin: 0;
  font-family: Arial;
  background: linear-gradient(135deg, #0f62fe, #0043ce);
}

/* Navbar */
.navbar {
  display: flex;
  justify-content: space-between;
  padding: 20px 40px;
  color: white;
}

/* Login button top-right */
.navbar button {
  background: white;
  color: #0f62fe;
  padding: 8px 15px;
  border: none;
  border-radius: 5px;
  cursor: pointer;
}

/* Center content */
.container {
  display: flex;
  justify-content: space-between;
  align-items: center;
  height: 80vh;
  padding: 50px;
}

/* Left side (image/text) */
.left {
  color: white;
  max-width: 500px;
}

.left h1 {
  font-size: 40px;
}

/* Right side (login box) */
.card {
  background: white;
  padding: 30px;
  border-radius: 10px;
  width: 300px;
  box-shadow: 0 10px 30px rgba(0,0,0,0.2);
}

input {
  width: 100%;
  padding: 10px;
  margin: 10px 0;
}

.login-btn {
  width: 100%;
  padding: 10px;
  background: #0f62fe;
  color: white;
  border: none;
  border-radius: 5px;
}

</style>

</head>

<body>

<!-- Navbar -->
<div class="navbar">
  <h2>🛒 FinStore</h2>
  <button onclick="showLogin()">Login</button>
</div>

<!-- Main content -->
<div class="container">

  <!-- Left -->
  <div class="left">
    <h1>Welcome to FinStore</h1>
    <p>Your one-stop solution for modern e-commerce.</p>
  </div>

  <!-- Right login -->
  <div class="card" id="loginBox">

    <h3>Login</h3>

    <form action="login" method="post">
      <input type="text" name="username" placeholder="Username" required />
      <input type="password" name="password" placeholder="Password" required />
      <button class="login-btn">Login</button>
    </form>

  </div>

</div>

<script>
function showLogin() {
  document.getElementById("loginBox").scrollIntoView({behavior:"smooth"});
}
</script>

</body>
</html>
