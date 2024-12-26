<%@ Page Title="" Language="C#" MasterPageFile="~/Site1.Master" AutoEventWireup="true" CodeBehind="WebForm1.aspx.cs" Inherits="mpWebsite.WebForm1" %>
<asp:Content ID="Content1" ContentPlaceHolderID="head" runat="server">

    <script>
        var spin0 = "Pics/spinNG.png";
        var spin1 = "Pics/spinGH.png";
        var spin2 = "Pics/spinHP.png";
        var spin3 = "Pics/spinPN.png";

        setInterval("start()", 500);

        

        function show(str)
        {
            pic.src = str;
        }

        var i = 1;
        function start()
        {
            j = i % 4;

            switch (j)
            {
                case 0: show(spin0); break;
                case 1: show(spin1); break;
                case 2: show(spin2); break;
                case 3: show(spin3); break;
            }

            i++;

        }

    </script>

</asp:Content>
<asp:Content ID="Content2" ContentPlaceHolderID="ContentPlaceHolder1" runat="server">

<br /><br /><br />
<center>
    <img src = "Pics/spinNG.png" id = "pic" alt = "spinner" />
</center>

</asp:Content>
