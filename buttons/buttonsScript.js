$(document).ready(function() {
    getFears();
    console.log('getting fears')
});


var displayButtons = function(response) {

    console.log(response);
    for (var key in response) {
        $('#buttons').append('<button id="btn-' + key + '" role="button" tabindex="0" style="--buttonColor: #000000">' + response[key].name + '<span></span><span></span><span></span><b aria-hidden="true">' + response[key].name + '</b><b aria-hidden="true">' + response[key].name + '</b><b aria-hidden="true">' + response[key].name+ '</b><b aria-hidden="true">' + response[key].name + '</b></button>');
        console.log(response[key].name);
        
    };
    $('[id*=btn-]').click(getStory);
}

function errormsg(request, status, error) {
    console.log(request);
    console.log(error);
}

function showStory(response){
    console.log(response);
    $('#omg').append('<a>' + response.path +'</a>');
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

var getStory = function(event){
    var str = event.target.id;
    var id = str.substring(4);
    console.log(id);
    $.ajax({
        url: 'http://localhost:8080/legendary/api/story/bugs',
        type: 'Get',
        async: true,
        success: showStory,
        error: errormsg,
    }) 
}




