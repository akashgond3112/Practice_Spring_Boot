<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Add Product</title>
    <link rel="stylesheet" href="/css/main.css">
    <link rel="stylesheet" href="/css/product.css">
</head>

<body>
    <main>
        <h1>processFormVersionTwo</h1>
        <form class="product-form" action="processFormVersionTwo" method="GET">
            <div class="form-control">
                <label for="title">Student name</label>
                <input type="text" name="studentName" id="title" placeholder="What's your name?">
            </div>

            <button type="submit">Add name</button>
        </form>

        <h1>processFormVersionThree</h1>
        <form class="product-form" action="processFormVersionThree" method="GET">
            <div class="form-control">
                <label for="title">Student name</label>
                <input type="text" name="studentName" id="titleNew" placeholder="What's your name?">
            </div>

            <button type="submit">Add name</button>
        </form>
    </main>
</body>

</html>