<%--
  Created by IntelliJ IDEA.
  User: 郑晓辉
  Date: 2016/7/20
  Time: 14:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>UpLoadFile</title>
    <link href="../../css/bootstrap.min.css?v=3.3.6" rel="stylesheet">
    <link href="../../css/font-awesome.css?v=4.4.0" rel="stylesheet">
    <link href="../../css/plugins/iCheck/custom.css" rel="stylesheet">
    <link href="../../css/plugins/steps/jquery.steps.css" rel="stylesheet">
    <link href="../../css/animate.css" rel="stylesheet">
    <link href="../../css/style.css?v=4.1.0" rel="stylesheet">
</head>
<body>
<form id="form" action="upLoad.action" class="wizard-big" method="post" enctype="multipart/form-data">
    <h1>账户</h1>
    <fieldset>
        <h2>账户信息</h2>
        <div class="row">
            <div class="col-sm-8">
                <div class="form-group">
                    <label>用户名 *</label>
                    <input id="userName" name="userName" type="text" class="form-control required">
                </div>
                <div class="form-group">
                    <label>密码 *</label>
                    <input id="password" name="password" type="text" class="form-control required">
                </div>
                <div class="form-group">
                    <label>确认密码 *</label>
                    <input id="confirm" name="confirm" type="text" class="form-control required">
                </div>
            </div>
            <div class="col-sm-4">
                <div class="text-center">
                    <div style="margin-top: 20px">
                        <i class="fa fa-sign-in" style="font-size: 180px;color: #e5e5e5 "></i>
                    </div>
                </div>
            </div>
        </div>

    </fieldset>
    <h1>个人资料</h1>
    <fieldset>
        <h2>个人资料信息</h2>
        <div class="row">
            <div class="col-sm-6">
                <div class="form-group">
                    <label>姓名 *</label>
                    <input id="name" name="name" type="text" class="form-control required">
                </div>
            </div>
            <div class="col-sm-6">
                <div class="form-group">
                    <label>Email *</label>
                    <input id="email" name="email" type="text" class="form-control required email">
                </div>
                <div class="form-group">
                    <label>地址 *</label>
                    <input id="address" name="address" type="text" class="form-control">
                </div>
            </div>
        </div>
    </fieldset>

    <h1>警告</h1>
    <fieldset>
        <div class="text-center" style="margin-top: 120px">
            <h2>你是火星人 :-)</h2>
        </div>
    </fieldset>

    <h1>完成</h1>
    <fieldset>
        <h2>条款</h2>
        <input id="acceptTerms" name="acceptTerms" type="checkbox" class="required">
        <label for="acceptTerms">我同意注册条款</label>
    </fieldset>
</form>

<!-- 全局js -->
<script src="js/jquery.min.js?v=2.1.4"></script>
<script src="js/bootstrap.min.js?v=3.3.6"></script>



<!-- 自定义js -->
<script src="../../js/content.js?v=1.0.0"></script>


<!-- Steps -->
<script src="../../js/plugins/staps/jquery.steps.min.js"></script>

<!-- Jquery Validate -->
<script src="../../js/plugins/validate/jquery.validate.min.js"></script>
<script src="../../js/plugins/validate/messages_zh.min.js"></script>


<script>
    $(document).ready(function () {
        $("#wizard").steps();
        $("#form").steps({
            bodyTag: "fieldset",
            onStepChanging: function (event, currentIndex, newIndex) {
                // Always allow going backward even if the current step contains invalid fields!
                if (currentIndex > newIndex) {
                    return true;
                }

                // Forbid suppressing "Warning" step if the user is to young
                if (newIndex === 3 && Number($("#age").val()) < 18) {
                    return false;
                }

                var form = $(this);

                // Clean up if user went backward before
                if (currentIndex < newIndex) {
                    // To remove error styles
                    $(".body:eq(" + newIndex + ") label.error", form).remove();
                    $(".body:eq(" + newIndex + ") .error", form).removeClass("error");
                }

                // Disable validation on fields that are disabled or hidden.
                form.validate().settings.ignore = ":disabled,:hidden";

                // Start validation; Prevent going forward if false
                return form.valid();
            },
            onStepChanged: function (event, currentIndex, priorIndex) {
                // Suppress (skip) "Warning" step if the user is old enough.
                if (currentIndex === 2 && Number($("#age").val()) >= 18) {
                    $(this).steps("next");
                }

                // Suppress (skip) "Warning" step if the user is old enough and wants to the previous step.
                if (currentIndex === 2 && priorIndex === 3) {
                    $(this).steps("previous");
                }
            },
            onFinishing: function (event, currentIndex) {
                var form = $(this);

                // Disable validation on fields that are disabled.
                // At this point it's recommended to do an overall check (mean ignoring only disabled fields)
                form.validate().settings.ignore = ":disabled";

                // Start validation; Prevent form submission if false
                return form.valid();
            },
            onFinished: function (event, currentIndex) {
                var form = $(this);

                // Submit form input
                form.submit();
            }
        }).validate({
            errorPlacement: function (error, element) {
                element.before(error);
            },
            rules: {
                confirm: {
                    equalTo: "#password"
                }
            }
        });
    });
</script>
</body>
</html>
