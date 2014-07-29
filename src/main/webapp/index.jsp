<html>
    <script src="http://code.jquery.com/jquery-2.1.1.js"></script>


    <script> 
    function getJson(){
        $.ajax({
            type: 'GET',
            url: "webresources/persone/getP",
            dataType: 'json',
            error: function (jqXHR, textStatus, errorThrown) {
                            $("#outGetJson").html("error: " + textStatus + " \n "+ errorThrown);
                        },
            success: function (data,textStatus,jqXHR){
                KEY  = "name";
                var outData = "GET" + KEY + ": " + data[KEY];
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

<div>
<input type="submit" value="GetJson" name="GetJson" onclick="getJson()" />
<a id="outGetJson"> </a>
</div>

    

</body>
</html>
