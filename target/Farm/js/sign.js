/**
 * 处理登录、注册请求的js代码
 *
 * Created by 关文聪 on 2017/2/5.
 */
$(document).ready(function () {

    $('#signInForm').bootstrapValidator({
        feedbackIcons: {
            valid: 'glyphicon glyphicon-ok',
            invalid: 'glyphicon glyphicon-remove',
            validating: 'glyphicon glyphicon-refresh'
        },
        fields: {
            'userName': {
                validators: {
                    notEmpty: {
                        message: '用户名不能为空'
                    },
                    stringLength: {
                        min: 3,
                        max: 20,
                        message: '长度必须在3-20之间'
                    },
                    regexp: {
                        regexp: /^[a-zA-Z0-9_]+$/,
                        message: '只能使用大小写字母、数字、下划线'
                    }
                }
            },
            userPass: {
                validators: {
                    notEmpty: {
                        message: '密码不能为空'
                    },
                    stringLength: {
                        min: 6,
                        max: 16,
                        message: '长度必须在6-16之间'
                    }
                }
            },
            code: {
                validators: {
                    notEmpty: {
                        message: '验证码不能为空'
                    },
                    regexp: {
                        regexp: /^[a-zA-Z0-9]+$/,
                        message: '只能使用大小写字母、数字'
                    }
                }
            }

        }
    }).on("success.form.bv", function (e) {
        e.preventDefault();
        var $form = $(e.target);
        var validator = $form.data('bootstrapValidator');
        var user = {
            userName: validator.getFieldElements('userName').val(),
            userPass: validator.getFieldElements('userPass').val(),
            code: validator.getFieldElements('code').val()
            //    获取验证码
        };
        console.info(user);
        $.ajax({
            type: "POST",
            url: "user/signIn",
            data: user,
            success: function (responseData) {
                console.log(responseData);
                if (!responseData.success) {
                    alert(responseData.errorMsg);
                    $("#signInBtn").removeAttr("disabled");
                    //点击确定以后刷新页面
                    // alert("window.history.go(-1)");
                    // window.history.go(-1);
                    // location.reload()
                    // showUserName(document.getElementsByName("userName"))
                    //要进行回显
                    // huixian()
                    // var formObj = document.getElementById('signInForm')
                    // getPOSTValue(formObj)
                    // submit(formObj)
                    // sessionStorage.getItem()
                } else {
                    location.href = "/views/management.jsp"
                }
            }
        });
    });

    $('#signUpForm').bootstrapValidator({
        feedbackIcons: {
            valid: 'glyphicon glyphicon-ok',
            invalid: 'glyphicon glyphicon-remove',
            validating: 'glyphicon glyphicon-refresh'
        },
        fields: {
            'userName': {
                validators: {
                    notEmpty: {
                        message: '用户名不能为空'
                    },
                    stringLength: {
                        min: 3,
                        max: 20,
                        message: '长度必须在3-20之间'
                    },
                    regexp: {
                        regexp: /^[a-zA-Z0-9_]+$/,
                        message: '只能使用大小写字母、数字、下划线'
                    }
                }
            },
            userEmail: {
                validators: {
                    notEmpty: {
                        message: '邮箱不能为空'
                    },
                    emailAddress: {
                        message: '格式不正确'
                    },
                    stringLength: {
                        min: 1,
                        max: 20,
                        message: '长度必须在1-20之间'
                    }
                }
            },
            userPass: {
                validators: {
                    notEmpty: {
                        message: '密码不能为空'
                    },
                    stringLength: {
                        min: 6,
                        max: 16,
                        message: '长度必须在6-16之间'
                    }
                }
            },
            userConfirmPass: {
                validators: {
                    notEmpty: {
                        message: '密码不能为空'
                    },
                    identical: {
                        field: 'userPass',
                        message: '两次密码不一致'
                    },
                    stringLength: {
                        min: 6,
                        max: 16,
                        message: '长度必须在6-16之间'
                    }
                }
            },
            code: {
                validators: {
                    notEmpty: {
                        message: '验证码不能为空'
                    },
                    regexp: {
                        regexp: /^[a-zA-Z0-9]+$/,
                        message: '只能使用大小写字母、数字'
                    }
                }
            }

        }
    }).on("success.form.bv", function (e) {
        e.preventDefault();
        var $form = $(e.target);
        var validator = $form.data('bootstrapValidator');
        var user = {
            userName: validator.getFieldElements('userName').val(),
            userPass: validator.getFieldElements('userPass').val(),
            userEmail: validator.getFieldElements('userEmail').val(),
            //获取验证码
            code: validator.getFieldElements('code').val()
        };
        console.info(user);
        $.ajax({
            type: "POST",
            url: "user/signUp",
            data: user,
            success: function (responseData) {
                console.log(responseData);
                if (!responseData.success) {
                    alert(responseData.errorMsg);
                    //点击确定以后刷新页面
                    // location.reload()
                    // window.history.go(-1);
                    $("#signUpBtn").removeAttr("disabled");

                } else {
                    location.href = "sign-in.jsp"
                }
            }
        });
    });
});

function sign_out() {
    $.ajax({
        type: "GET",
        url: "../user/signOut",
        success: function () {
            alert("注销成功！")
            location.href = "index.jsp"
        }

    })
}


