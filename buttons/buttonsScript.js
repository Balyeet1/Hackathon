$(document).ready(function() {
    getFears();
    console.log('getting fears')
});


var displayButtons = function(response) {
    console.log(response);
    response.forEach(element => {
        $('#buttons').append('<button id="btn-' + element.id + ' role="button" tabindex="0" style="--buttonColor: #000000">' + element.name + '<span></span><span></span><span></span><b aria-hidden="true">' + element.name + '</b><b aria-hidden="true">' + element.name + '</b><b aria-hidden="true">' + element.name + '</b><b aria-hidden="true">' + element.name + '</b></button>');
        console.log(element.name);
    });
}

function errormsg(request, status, error) {
    console.log(request);
    console.log(error);
}


var getFears = function() {
    $.ajax({
        url: 'http://localhost:8080/legendary/api/fear/',
        type: 'Get',
        async: true,
        success: displayButtons,
        error: errormsg,
    })
}


var getFear = function (id) {
    fears.forEach(element => {
        if (element.id === id) {
            return fearName;
        }
    });
}


