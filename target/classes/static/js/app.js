$(document).ready(function(){
    $.get("/api/country/", function(data, status){
        data.forEach(country => {

        $('#countries').append($('<option>', {
            value: country.name,
            text: country.countryName
        }));
        })
    });
});