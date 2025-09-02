<%@ Page Title="" Language="C#" MasterPageFile="~/Site1.Master" AutoEventWireup="true" CodeBehind="Baloon.aspx.cs" Inherits="mpWebsite.Baloon" %>
<asp:Content ID="Content1" ContentPlaceHolderID="head" runat="server">

    <script>

        var ballA = "Pics/balloon.png";
        var ballB = "Pics/balloonPop.png";
        var ballc = "Pics/balloon2.png";
        var picSrc = ballA;
        var picSrc2 = ballc;

        var size = 200;
        var newSize = size;

        var audio = new Audio('pics/BalloonPopping.mp3'); // יוצר אודיו חדש

        function show(id, picSrc, newSize)
        {
            id.src = picSrc
            id.width = newSize
        }

        var n = prompt("how many times untill the ballon pops? ", 10)
        var i = 1;
        setInterval("changImg()", 200);
        function changImg() {
            var j = i % n;
            if (j == 0) {
                audio.play()
                picSrc = ballB;
                picSrc2 = ballB;
                newSize = size;
            }
            else {
                picSrc = ballA;
                picSrc2 = ballc;
                newSize += 10;
            }
            show(ball, picSrc, newSize)
            show(ball2, picSrc2, newSize)
            i++;
        }

     

    </script>

</asp:Content>
<asp:Content ID="Content2" ContentPlaceHolderID="ContentPlaceHolder1" runat="server">
    


    <center>

        <img src="Pics/balloon.png" alt="balloon" id="ball" />
        <img src="Pics/balloon2.png" alt="balloon" id="ball2" />

    </center>

</asp:Content>
