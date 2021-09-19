var ip = "198.168.0.1";
$(document).ready(function(){
    $.get("https://edns.ip-api.com/json", function(data, status){
        ip = data.dns.ip;
        $("#idIp").html(ip);
        console.log(ip);
    });


});

