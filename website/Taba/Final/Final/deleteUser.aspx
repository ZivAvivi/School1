<%@ Page Title="" Language="C#" MasterPageFile="~/MasterPage.Master" AutoEventWireup="true" CodeBehind="deleteRecord.aspx.cs" Inherits="Final.deleteRecord" %>
<asp:Content ID="Content1" ContentPlaceHolderID="head" runat="server">
        <style type="text/css">
        h1 {
            color: red; 
            text-align: center;
            }
        h2{
            text-align: center;
            direction: ltr;
        }
        h3{
            text-align: center;
        }

        .tableDB{
            border: 1px solid black;
            margin: 0px auto;
        }
        .tblTH{
            border: 1px solid black;
            text-align: center;
        }
        .tblTD1{
            border: 1px solid black;
            text-align: center;
        }
        .tblTD2{
            border: 1px solid black;
        }
        .tblTD3{
            border: 1px solid black;
            text-align: left;
        }
        th{
            width: 70px;
        }
    </style>
</asp:Content>
<asp:Content ID="Content2" ContentPlaceHolderID="ContentPlaceHolder1" runat="server">
    <center>
        <%=msg %>
        <table style ="border: 1px solid black; margin: 0px auto;">
             <%=st %>
        </table>
    </center>


</asp:Content>
