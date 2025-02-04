<%@ Page Title="" Language="C#" MasterPageFile="~/Site1.Master" AutoEventWireup="true" CodeBehind="signUp.aspx.cs" Inherits="mpWebsite.signUp" %>
<asp:Content ID="Content1" ContentPlaceHolderID="head" runat="server">

</asp:Content>
<asp:Content ID="Content2" ContentPlaceHolderID="ContentPlaceHolder1" runat="server">
    <center>
        <h1>טופס רישום</h1>
        <form method="post" runat="server">
            <table>
                <tr>
                    <td>שם משתמש</td>
                    <td><input type="text" name="uName" id="uName" /></td>
                </tr>
                <tr>
                    <td>שם פרטי</td>
                    <td><input type="text" name="fName" id="fName" /></td>
                </tr>
            
                <tr>
                    <td>שם משפחה</td>
                    <td><input type="text" name="lName" id="lName" /></td>
                </tr>
            
                <tr>
                    <td>מייל</td>
                    <td><input type="text" name="email" id="email" /></td>
                </tr>
                <tr>
                    <td colspan ="2" style="text-align: center;">
                    <td><input type="submit" name="submit" value=" שלח " /></td>
                </tr>
            </table>
        </form>

        <%=st %>
    </center>

</asp:Content>
