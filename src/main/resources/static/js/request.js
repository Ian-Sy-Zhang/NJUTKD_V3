function getRequest(url, onSuccess, onError) {
    $.ajax({
        type: 'GET',
        url: url,
        async: true,
        success: onSuccess,
        error: onError
    });
}

function postRequest(url, data, onSuccess, onError) {
    $.ajax({
        type: 'POST',
        url: url,
        async: true,
        data: JSON.stringify(data),
        contentType: 'application/json',
        processData: false,
        success: onSuccess,
        error: onError
    });
}

$(document).ready(function () {

    //全局事件
    document.addEventListener("error", function (e) {
        var elem = e.target;
        if (elem.tagName.toLowerCase() == 'img') {
            elem.src = "https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1553356290635&di=cdb69a78db5e09ccef02a56fc4973e30&imgtype=0&src=http%3A%2F%2Fatt2.citysbs.com%2Fhangzhou%2F2012%2F06%2F07%2F15%2Fmiddle_151704_kmmuadil_37e045321c34acd13b3b68f3ccff04c5.jpg";
        }
    }, true);

    $('.avatar-lg').attr('title','退出登录');
    $('.avatar-sm').attr('title','退出登录');

    $('.avatar-lg').click(function () {
        confirm('确认要退出登录吗？') && postRequest('/logout',null,function (res) {
            window.location.href='/index';
        });
    });

    $('.avatar-sm').click(function () {
        confirm('确认要退出登录吗？') && postRequest('/logout',null,function (res) {
             window.location.href='/index';
        });
    });
});
