<html>
    <script src="http://code.jquery.com/jquery-2.1.1.js"></script>


    <script> 
    function getJson(){
        $.ajax({
            type: 'GET',
            url: "webresources/persone/getP",
            dataType: 'json',
            error: function (jqXHR, textStatus, errorThrown) {
                            $("#outGetJson").html("error: " + textStatus + " <br> "+ errorThrown);
                        },
            success: function (data,textStatus,jqXHR){
                    var key = ["name", "address", "phone"];
                    var outData ="";
                    for (var k in key){
                        outData += "GET " + key[k] + ": " + data[key[k]] + "</br>";
                    }
                    $("#outGetJson").html(outData);
            }
        });
    }
    
    </script>
    
<body>
<h2>Jersey RESTful Web Application!</h2>


<p><a href="webresources/myresource">Jersey resource</a></p>
<p><a href="webresources/persone/show">Persone resource "persone/show"</a></p>
<p><a href="webresources/persone">Persone resource (to default)</a></p>
<p><a href="webresources/persone/getP">getP (Person Object)</a></p>
<p><a href="webresources/persone/getArray">getArray (String array)</a></p>

<div>
<input type="submit" value="GetJson" name="GetJson" onclick="getJson()" />
<p id="outGetJson"> </p>
</div>

    

</body>
</html>
