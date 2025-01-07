<!DOCTYPE html>
<html>
<head>
    <title>Taxi Booking</title>
</head>
<body>
    <h1>Book Your Taxi</h1>
    <form action="book" method="post">
        <label for="name">Name:</label>
        <input type="text" id="name" name="name" required><br><br>
        <label for="pickup">Pickup Location:</label>
        <input type="text" id="pickup" name="pickup" required><br><br>
        <label for="drop">Drop Location:</label>
        <input type="text" id="drop" name="drop" required><br><br>
        <input type="submit" value="Book Taxi">
    </form>
</body>
</html>

