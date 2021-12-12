$(document).ready(function () {
    getFears();
    $('#feardarkimg').click(function(e){
        
        
        getStoryByimg('dark');
    });

    $('#feardoctor').click(function(e){
    
        getStoryByimg('doctors');
    });

    $('#fearbugs').click(function(e){
        
        getStoryByimg('bugs');
    });
    $('#fearmonsters').click(function(e){
        
        getStoryByimg('monsters');
    });
    $('#fearalone').click(function(e){
        
        getStoryByimg('alone');
    });
    
    
   
});


var displayOptions = function (response) {
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

function showStory(response) {
    clearBox('#page-body');
    console.log(response);
    $('#page-body').append('<div id="bookPdf" class="ratio ratio-16x9"><iframe src="' + response.path + '" title="Under my bed"></iframe></div>');
}



var getFears = function () {
    $.ajax({
        url: 'http://localhost:8080/legendary/api/fear/',
        type: 'Get',
        async: true,
        success: displayOptions,
        error: errormsg,
    })
}

var getStoryByimg = function (fear) {
    
    console.log(fear);
    $.ajax({
        url: 'http://localhost:8080/legendary/api/story/' + fear,
        type: 'Get',
        async: true,
        success: showStory,
        error: errormsg,
    })
}

var getStory = function (event) {
    
    var id = event.target.id;
    var fear = id.substring(4);
    console.log(fear);
    $.ajax({
        url: 'http://localhost:8080/legendary/api/story/' + fear,
        type: 'Get',
        async: true,
        success: showStory,
        error: errormsg,
    })
}

function myFunction() {
    window.document.getElementById("myDropdown").classList.toggle("show");
}


function clearBox(elementID) {
    $(elementID).empty();
}



window.addEventListener('DOMContentLoaded', event => {

    // Navbar shrink function
    var navbarShrink = function () {
        const navbarCollapsible = document.body.querySelector('#mainNav');
        if (!navbarCollapsible) {
            return;
        }
        if (window.scrollY === 0) {
            navbarCollapsible.classList.remove('navbar-shrink')
        } else {
            navbarCollapsible.classList.add('navbar-shrink')
        }

    };

    // Shrink the navbar 
    navbarShrink();

    // Shrink the navbar when page is scrolled
    document.addEventListener('scroll', navbarShrink);

    // Activate Bootstrap scrollspy on the main nav element
    const mainNav = document.body.querySelector('#mainNav');
    if (mainNav) {
        new bootstrap.ScrollSpy(document.body, {
            target: '#mainNav',
            offset: 72,
        });
    };

    // Collapse responsive navbar when toggler is visible
    const navbarToggler = document.body.querySelector('.navbar-toggler');
    const responsiveNavItems = [].slice.call(
        document.querySelectorAll('#navbarResponsive .nav-link')
    );
    responsiveNavItems.map(function (responsiveNavItem) {
        responsiveNavItem.addEventListener('click', () => {
            if (window.getComputedStyle(navbarToggler).display !== 'none') {
                navbarToggler.click();
            }
        });
    });

});



