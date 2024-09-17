<?php

$sql = "SELECT * FROM `Agent`";
$result = $conn->query($sql);
?>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.1.3/dist/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">

    <title>Document</title>
</head>
<body>
   
    <div class="container mt-5">
        
        <table class="table">
            <thead class="thead-dark">
                <tr>
                <th scope="col">Agent ID</th>
                <th scope="col">Agent Name</th>
                <th scope="col">Phone</th>
                <th scope="col">Email </th>
                <th scope="col">Agent Role</th>
                </tr>
            </thead>
            <tbody>
            <?php

                if ($result->num_rows > 0) {
                    
                    while($row = $result->fetch_assoc()) { ?>
                    <tr>
                        <td scope="row"><?php echo $row["Agent_ID"]; ?></td>
                        <td><?php echo $row["Agent_Name"]; ?></td>
                        <td><?php echo $row["Phone"]; ?></td>
                        <td><?php echo $row["Email"]; ?></td>
                        <td><?php echo $row["Agent_Role"]; ?></td>
                    </tr>
                    <?php }
                } else {
                    echo "0 results";
                }
                ?>
                
            </tbody>
        </table>

    </div>
</body>
</html>