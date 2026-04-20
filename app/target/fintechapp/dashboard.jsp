<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

<style>
body { font-family: Arial; margin:0; background:#f4f6f9; }

.navbar {
  background:#0f62fe;
  color:white;
  padding:15px;
  font-size:20px;
}

.container { padding:20px; }

.card {
  background:white;
  padding:20px;
  margin:15px 0;
  border-radius:10px;
  box-shadow:0 5px 15px rgba(0,0,0,0.1);
}

input {
  padding:8px;
  margin:5px;
}

button {
  background:#0f62fe;
  color:white;
  padding:8px 15px;
  border:none;
  border-radius:5px;
}

a {
  text-decoration:none;
  font-size:16px;
}
</style>

</head>

<body>

<div class="navbar">🛒 Dashboard</div>

<div class="container">

<div class="card">
<h3>Add Product</h3>

<form action="addProduct" method="post">
  Name: <input name="name"/>
  Price: <input name="price"/>
  <button>Add</button>
</form>
</div>

<div class="card">
<a href="viewProducts">🛍️ View Products</a>
</div>

</div>

</body>
</html>
