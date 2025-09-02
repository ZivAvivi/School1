<%@ Page Title="" Language="C#" MasterPageFile="~/MasterPage.Master" AutoEventWireup="true" CodeBehind="seker.aspx.cs" Inherits="Final.seker" %>
<asp:Content ID="Content1" ContentPlaceHolderID="head" runat="server">
        <style>
            .td {text-align:center;}
        </style>
</asp:Content>
<asp:Content ID="Content2" ContentPlaceHolderID="ContentPlaceHolder1" runat="server">
<center>
    <table border ="0">
        <tr>
            <td>
                <form id="form1" runat="server">
                    <% if (Session["uName"].ToString() != "אורח")
                        { %>
                    <TABLE border = "1" align = "center" cellpadding = "10">
                        <tr><th colspan = "2" align = "center"> איזה גלידה אתם הכי אוהבים </th></tr>
                        <tr>
                            <td width = "100px" align="center">שוקולד</td>
                            <td><input type = "radio" name = "surv" id = "survay1" value = "1" checked />
                            </td>
                        </tr>
                        <tr>
                            <td align="center">תות </td>
                            <td><input type = "radio" name = "surv" id = "survay2" value="2">
                            </td>
                        </tr>
                        <tr>
                            <td align="center">ווניל </td>
                            <td><input type = "radio" name = "surv" id = "survay3" value="3">
                            </td>
                        </tr>
                        <tr>
                            <td align="center">עוגיות </td>
                            <td><input type = "radio" name = "surv" id = "survay4" value="4">
                            </td>
                        </tr>
                        <tr>
                            <td colspan = 3 align = "center">
                                <input type = "submit" name = "send" value = "הצג" />
                            </td>
                        </tr>
                    </TABLE>
                        <% } %>
                </form>
            </td>
            <center>
                <%= msg %>
                <td width = "600" align = "center"><%= str %></td>
                <%=survey %>
            </center>
        </tr>
    </table>
</center>
</asp:Content>
