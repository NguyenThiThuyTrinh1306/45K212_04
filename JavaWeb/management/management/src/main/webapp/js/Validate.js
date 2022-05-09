
var Validate = function(){
    var valid = true;
    valid = kiemTraRong("customerName","errorName") & kiemTraRong("customerPhone","errorPhone") & kiemTraRong("customerId","errorId") & kiemTraRong("customerAddress","errorAddress");
    valid &= kiemTraTatCaLaChu('#customerName', '#errorName_all_leter');
    valid &= kiemTraTatCaLaSo('#customerPhone', '#error_phone');

    if (!valid) {
        return false;
    }
    return true;
}

var kiemTraRong = function (idValue, idError) {

    var inputText = document.getElementById(idValue);

    if (inputText.value.trim() === '') {
        document.getElementById(idError).innerHTML = inputText.name + ' không được bỏ trống !';
        document.getElementById(idError).style.display = 'block';

        return false;
    } else {
        document.getElementById(idError).innerHTML = '';
        document.getElementById(idError).style.display = 'none';
        return true;
    }

}
var kiemTraTatCaLaChu = function (selectorValue, selectorError) {
    //Lấy giá trị người dùng nhập vào từ selector
    var inputText = document.querySelector(selectorValue);
    var regexChu = /^[A-Za-z ]+$/;
    if (regexChu.test(inputText.value)) {
        //Hợp lệ 
        document.querySelector(selectorError).innerHTML = '';
        document.querySelector(selectorError).style.display = 'none';
        return true;
    } else {
        //Không hợp lệ
        document.querySelector(selectorError).innerHTML = inputText.name + ' phải là chữ !';
        document.querySelector(selectorError).style.display = 'block';
        return false;
    }
}
var kiemTraTatCaLaSo = function (selectorValue, selectorError) {
    var inputText = document.querySelector(selectorValue);
    var regexNumber = /^[0-9]+$/;
    if (regexNumber.test(inputText.value)) {
        //Hợp lệ 
        document.querySelector(selectorError).innerHTML = '';
        document.querySelector(selectorError).style.display = 'none';
        return true;
    } else {
        document.querySelector(selectorError).innerHTML = inputText.name + ' yêu cầu nhập số !';
        document.querySelector(selectorError).style.display = 'block';
        return false;
    }
}

document.getElementById("customerName").onblur = Validate;
document.getElementById("customerPhone").onblur = Validate;
document.getElementById("customerAddress").onblur = Validate;
document.getElementById("customerId").onblur = Validate;
document.getElementById("btnPayment").onclick = Validate;