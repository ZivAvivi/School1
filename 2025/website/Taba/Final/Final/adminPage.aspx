<%@ Page Title="" Language="C#" MasterPageFile="~/MasterPage.Master" AutoEventWireup="true" CodeBehind="adminPage.aspx.cs" Inherits="Final.adminPage" %>
<asp:Content ID="Content1" ContentPlaceHolderID="head" runat="server">
    <style>
        .link{
            text-decoration: none;
            color: var(--primary-color);
            transition: all 0.3s ease;
            padding: 6px 12px;
            border-radius: 15px;
        }
        .link:hover{
            background-color: var(--hover-color);
            color: white;
        }
    </style>
</asp:Content>
<asp:Content ID="Content2" ContentPlaceHolderID="ContentPlaceHolder1" runat="server">
    
    <%=msg %>
</asp:Content>
