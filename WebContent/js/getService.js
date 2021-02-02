$.getJSON("data.json")
    .done(function (data, textStatus, jqXHR) {
        for (var i in data) {
            $('#area').append('<li>' + data[i] + '</li>');
        }
        $('#load').hide();
    })
    .fail(function (jqXHR, textStatus, errorThrown) {
    })