<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">

/* Navigation Bar */

header {
  background-color: #333;
  color: #fff;
  padding: 1rem;
}

nav ul {
  display: flex;
  justify-content: space-between;
  align-items: center;
  list-style: none;
  margin: 0;
  padding: 0;
}

nav li {
  margin: 0 0.5rem;
}

nav a {
  color: #fff;
  text-decoration: none;
  font-weight: bold;
  transition: color 0.15s ease-in-out;
}

nav a:hover {
  color: #007bff;
}

/* Form */

main {
  max-width: 800px;
  margin: 0 auto;
  padding: 2rem;
}

.form-group {
  display: flex;
  flex-direction: column;
  margin-bottom: 1.5rem;
}

label {
  margin-bottom: 0.5rem;
  font-weight: bold;
}

input[type="text"],
input[type="number"],
textarea {
  padding: 0.75rem;
  border: 1px solid #ccc;
  border-radius: 0.25rem;
  font-size: 1rem;
  line-height: 1.5;
  transition: border-color 0.15s ease-in-out, box-shadow 0.15s ease-in-out;
}

input[type="file"] {
  display: none;
}

.file-input {
  position: relative;
}

.file-input label {
  display: inline-block;
  padding: 0.75rem;
  background-color: #007bff;
  color: #fff;
  border-radius: 0.25rem;
  cursor: pointer;
  transition: background-color 0.15s ease-in-out;
}

.file-input input[type="file"]:not(:focus) + label {
  opacity: 0.5;
}

textarea {
  resize: vertical;
}

.input-group {
  display: flex;
  align-items: center;
}

.input-group-addon {
  padding: 0.75rem;
  background-color: #ccc;



</style>
</head>
<body>
<header>
  <nav>
    <ul>
      <li><a href="#">Home</a></li>
      <li><a href="#">Products</a></li>
      <li><a href="#">About Us</a></li>
      <li><a href="#">Contact Us</a></li>
    </ul>
  </nav>
</header>

<main>
  <form action="StoreData">
    <div class="form-group">
      <label for="id">ID:</label>
      <input type="text" id="id" name="id">
    </div>
    <div class="form-group">
      <label for="image">Image:</label>
      <div class="file-input">
        <input type="text" id="image" name="image">
        
      </div>
    </div>
    <div class="form-group">
      <label for="desc">Description:</label>
      <textarea id="desc" name="desc"></textarea>
    </div>
    <div class="form-group">
      <label for="price">Price:</label>
      <div class="input-group">
        <span class="input-group-addon">$</span>
        <input type="number" id="price" name="price">
      </div>
    </div>
    <button type="submit">Submit</button>
  </form>
</main>


</body>
</html>