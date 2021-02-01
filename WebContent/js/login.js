$(function () {
    var $name = $('#name');
    var $pass = $('#pass');
    if ($name.val() == "" && $pass.val() == "") {
        $('#sub').attr("disabled", true);
    }
    $name.on('input', function (event) {
        if ($name.val() != "") {
            $('#sub').attr("disabled", false);
        }
        if ($name.val() == "") {
            $('#sub').attr("disabled", true);
        }
    });

    $pass.on('input', function (event) {
        if ($pass.val() != "") {
            $('#sub').attr("disabled", false);
        }
        if ($pass.val() == "") {
            $('#sub').attr("disabled", true);
        }
    });
});