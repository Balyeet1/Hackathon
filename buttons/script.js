$(document).ready(function () {
    displayButtons();

});


var displayButtons = function () {
    console.log('asdas')
    fears.forEach(element => {
        $('#buttons').append('<button role="button" tabindex="0" style="--buttonColor: #000000">' + element.fearName + '<span></span><span></span><span></span><b aria-hidden="true">' + element.fearName + '</b><b aria-hidden="true">' + element.fearName + '</b><b aria-hidden="true">' + element.fearName + '</b><b aria-hidden="true">' + element.fearName + '</b></button>');
        console.log(element.fearName);
    });
}


var fears = [
    fear1 = {
        id: 1,
        fearName: 'Fear of the dark',
    },
    fear2 = {
        id: 2,
        fearName: 'Fear of bugs'
    },
    fear3 = {
        id: 3,
        fearName: 'Fear of being alone'
    },
    fear4 = {
        id: 4,
        fearName: 'Fear of heights'
    },
    fear5 = {
        id: 5,
        fearName: 'Fear of monsters'
    }
]


var getFear = function (id) {
    fears.forEach(element => {
        if (element.id === id) {
            return fearName;
        }
    });
}


