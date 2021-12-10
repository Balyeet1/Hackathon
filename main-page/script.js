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
        fearName: 'Dark',
    },
    fear2 = {
        id: 2,
        fearName: 'Bugs'
    },
    fear3 = {
        id: 3,
        fearName: 'Being Alone'
    },
    fear4 = {
        id: 4,
        fearName: 'Heights'
    },
    fear5 = {
        id: 5,
        fearName: 'Monsters'
    }
]


var getFear = function (id) {
    fears.forEach(element => {
        if (element.id === id) {
            return fearName;
        }
    });
}


