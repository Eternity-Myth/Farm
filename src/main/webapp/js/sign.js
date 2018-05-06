/**
 * Created by fo on 2017/2/5.
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
            }

        }
    }).on("success.form.bv", function (e) {
        e.preventDefault();
        var $form = $(e.target);
        var validator = $form.data('bootstrapValidator');
        var user = {
            userName: validator.getFieldElements('userName').val(),
            userPass: validator.getFieldElements('userPass').val()
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
                } else {
                    location.href = "views/index.html"
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
            }

        }
    }).on("success.form.bv", function (e) {
        e.preventDefault();
        var $form = $(e.target);
        var validator = $form.data('bootstrapValidator');
        var user = {
            userName: validator.getFieldElements('userName').val(),
            userPass: validator.getFieldElements('userPass').val(),
            userEmail: validator.getFieldElements('userEmail').val()
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
                } else {
                    location.href = "sign-in.html"
                }
            }
        });
    });

});
