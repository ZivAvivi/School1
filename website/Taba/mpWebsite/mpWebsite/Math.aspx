<%@ Page Title="" Language="C#" MasterPageFile="~/Site1.Master" AutoEventWireup="true" CodeBehind="Math.aspx.cs" Inherits="mpWebsite.WebForm2" %>
<asp:Content ID="Content1" ContentPlaceHolderID="head" runat="server">

</asp:Content>
<asp:Content ID="Content2" ContentPlaceHolderID="ContentPlaceHolder1" runat="server">

<center>


    <h1>תרגילי חשבון</h1>
    <br />
    <table style="direction: ltr;">
        <tr>
            <!--Slot 1-->
            <td></td>
            <td style="width: 10px;"><input type="text" id="num1" size="10" disabled /></td>
            <td style="width: 5px; text-align: center;">+</td>
            <td style="width: 10px;"><input type="text" id="num2" size="10" disabled /></td>
            <td style="width: 5px; text-align: center;">=</td>
            <td style="width: 10px;"><input type="text" size="10" id="res1" /></td>
            <td style="text-align: right;"><span id="img1"></span></td>
        </tr>
        <tr>
            <!--Slot 2-->
            <td></td>
            <td style="width: 10px;"><input type="text" id="num3" size="10" disabled /></td>
            <td style="width: 5px; text-align: center;">-</td>
            <td style="width: 10px;"><input type="text" id="num4" size="10" disabled /></td>
            <td style="width: 5px; text-align: center;">=</td>
            <td style="width: 10px;"><input type="text" size="10" id="res2" /></td>
            <td style="text-align: right;"><span id="img2"></span></td>
        </tr>
        <tr>
            <!--Slot 3-->
            <td></td>
            <td style="width: 10px;"><input type="text" id="num5" size="10" disabled /></td>
            <td style="width: 5px; text-align: center;">*</td>
            <td style="width: 10px;"><input type="text" id="num6" size="10" disabled /></td>
            <td style="width: 5px; text-align: center;">=</td>
            <td style="width: 10px;"><input type="text" size="10" id="res3" /></td>
            <td style="text-align: right;"><span id="img3"></span></td>
        </tr>
        <tr>
            <!--Slot 4-->
            <td></td>
            <td style="width: 10px;"><input type="text" id="num7" size="10" disabled /></td>
            <td style="width: 5px; text-align: center;">/</td>
            <td style="width: 10px;"><input type="text" id="num8" size="10" disabled /></td>
            <td style="width: 5px; text-align: center;">=</td>
            <td style="width: 10px;"><input type="text" size="10" id="res4" /></td>
            <td style="text-align: right;"><span id="img4"></span></td>
        </tr>
        <tr>
            <!--Slot 5-->
            <td></td>
            <td style="width: 10px;"><input type="text" id="num9" size="10" disabled /></td>
            <td style="width: 5px; text-align: center;">%</td>
            <td style="width: 10px;"><input type="text" id="num10" size="10" disabled /></td>
            <td style="width: 5px; text-align: center;">=</td>
            <td style="width: 10px;"><input type="text" size="10" id="res5" /></td>
            <td style="text-align: right;"><span id="img5"></span></td>
        </tr>

    </table>

    
    <input type="button" value="בדוק " onclick="check();" style="width:150px;" />
    <p id="Score" style="text-align:right"></p>

</center>

<script>
    function getNum(n) {
        var num
        if (n == 1)
            num = parseInt(Math.random() * 10 + 10);
        else
            num = parseInt(Math.random() * 10 + 1);
        return num;
    }

    var n1 = getNum(1);
    var n2 = getNum(2);

    document.getElementById("num1").value = n1;
    document.getElementById("num2").value = n2;
    document.getElementById("num3").value = n1;
    document.getElementById("num4").value = n2;
    document.getElementById("num5").value = n1;
    document.getElementById("num6").value = n2;
    document.getElementById("num7").value = n1;
    document.getElementById("num8").value = n2;
    document.getElementById("num9").value = n1;
    document.getElementById("num10").value = n2;


    function check() {

        var img1 = "<img src='Pics/checkmark.png'/>"; 
        var img2 = "<img src='Pics/close.png'/>"; 
        var count = 0;

        // 1. Addition
        if (parseInt(document.getElementById("res1").value) === n1 + n2) {
            document.getElementById("img1").innerHTML = img1;
            count += 20;
        } else {
            document.getElementById("img1").innerHTML = img2;
        }

        // 2. Subtraction
        if (parseInt(document.getElementById("res2").value) === n1 - n2) {
            document.getElementById("img2").innerHTML = img1;
            count += 20;
        } else {
            document.getElementById("img2").innerHTML = img2;
        }

        // 3. Multiplication
        if (parseInt(document.getElementById("res3").value) === n1 * n2) {
            document.getElementById("img3").innerHTML = img1;
            count += 20;
        } else {
            document.getElementById("img3").innerHTML = img2;
        }

        // 4. Division
        if (document.getElementById("res4").value == parseInt(n1 / n2)) {
            document.getElementById("img4").innerHTML = img1;
            count += 20;
        } else {
            document.getElementById("img4").innerHTML = img2;
        }

        // 5. Modulus
        if (parseInt(document.getElementById("res5").value) === n1 % n2) {
            document.getElementById("img5").innerHTML = img1;
            count += 20;
        } else {
            document.getElementById("img5").innerHTML = img2;
        }

        // Show the score
        document.getElementById("Score").innerHTML = "Score: " + count + "/100";
    }

</script>

</asp:Content>
