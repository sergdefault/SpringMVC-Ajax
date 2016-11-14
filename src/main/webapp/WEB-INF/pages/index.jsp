<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
<script src="http://code.jquery.com/jquery-1.10.2.min.js" type="text/javascript" ></script>
<script type="text/javascript">
    $(document).ready(function() {
        $("#test1").click(function(){
            $.get("/ajaxtest1",function(data,status){
                alert("Data: " + data + "\nStatus: " + status);
            });
        });
    });
</script>

<script type="text/javascript">
    $(document).ready(function() {
        $("#test2").click(function(){
            $.get("/ajaxtest2",function(data,status){
                alert("Data: " + data + "\nStatus: " + status);
            });
        });
    });
</script>

<button id="test1">Load1</button>
<button id="test2">Load2</button>
</body>
</html>