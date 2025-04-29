<%@ Page Title="" Language="C#" MasterPageFile="~/MasterPage.Master" AutoEventWireup="true" CodeBehind="loginAdmin.aspx.cs" Inherits="Final.loginAdmin" %>
<asp:Content ID="Content1" ContentPlaceHolderID="head" runat="server">
</asp:Content>
<asp:Content ID="Content2" ContentPlaceHolderID="ContentPlaceHolder1" runat="server">

    <form method="post" runat="server">

        <center>
            <h1>התחבר מנהל</h1>
        </center>

            <table id="table1" dir="rtl" align="center">
          <tr>
            <td>שם משתמש:</td>
            <td><input type="text" name="mName" id="mName" /></td>
          </tr>
          <tr>
            <td>סיסמה:</td>
            <td><input type="password" name="pw" id="pw" /></td>
          </tr>
          <tr>
            <td colspan="2" align="center">
              <input type="submit" name="submit" value=" התחבר" />
            </td>
          </tr>

        </table>
        <center><%=msg %></center>
    </form>


</asp:Content>