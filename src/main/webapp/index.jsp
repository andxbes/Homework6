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
    };
    </script>
    <script>
        function postJson(){
        var dataSend = $("#inputData").html();
        $.ajax({
            type:'POST',
            url:'webresources/persone/savePerson',
            dataType: 'html',
            headers: {'Content-Type': 'application/json'},
            data : dataSend,
            error: function (jqXHR,textStatus,errorThrown){
                alert("error : " + textStatus);
            },
            success: function (data,textStatus,jqXHR){
                $("#outPostJson").html(data);
            }
            
        });
    };
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


<div>
<p id="inputData"> {"name":"Andrey"}</p>
<input type="submit" value="PostJson" name="PostJson" onclick="postJson()" />
<p id="outPostJson"> </p>
</div>
    

</body>
</html>
