<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form>
  Username:<br>
  <input type="text" name="username"><br>
  Password:<br>
  <input type="text" name="password">
  <input type="submit" value="Submit">
</form>
<?php
//$servername = "localhost";
$username = "username";
$password = "password";
$dbname = "myDB";

// Create connection
$conn = new mysqli($servername, $username, $password, $dbname);
// Check connection
if ($conn->connect_error) {
    die("Connection failed: " . $conn->connect_error);
} 

//insert the new user into the users table
$sql = "INSERT INTO Users (username, password)
VALUES ('$_POST[username]','$_POST[password]')";

if ($conn->query($sql) === TRUE) {
    echo "New User created successfully";
} else {
    echo "Error: " . $sql . "<br>" . $conn->error;
}

$conn->close();
?>
</body>
</html>