$(document).ready(function() {
    getFears();
    console.log('getting fears')
});


var displayButtons = function(response) {

    console.log(response);
    for (var key in response) {
        $('#myDropdown').append('<a id="btn-' + response[key].name + '" >' + response[key].name + '</a>');
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




