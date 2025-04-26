<%@ Page Title="" Language="C#" MasterPageFile="~/MasterPage.Master" AutoEventWireup="true" CodeBehind="login.aspx.cs" Inherits="Final.login" %>
<asp:Content ID="Content1" ContentPlaceHolderID="head" runat="server">
</asp:Content>
<asp:Content ID="Content2" ContentPlaceHolderID="ContentPlaceHolder1" runat="server">

<form name = "loginFrm" id = "loginFrm" method = "post" runat="server">
    <br /><br />
    <table id = "table1" dir = "rtl" align = "center">
      <tr>
        <td>שם משתמש:</td>
        <td><input type = "text" name = "uName" id = "uName" /></td>
      </tr>
      <tr>
        <td>סיסמה:</td>
        <td><input type = "password" name = "pw" id = "pw" /></td>
      </tr>
      <tr>
        <td colspan = "2" align = "center">
          <input type = "submit" name = "submit" value = "התחבר" />
        </td>
      </tr>
    </table>
</form>
</asp:Content>
