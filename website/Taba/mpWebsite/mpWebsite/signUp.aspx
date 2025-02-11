<%@ Page Title="" Language="C#" MasterPageFile="~/Site1.Master" AutoEventWireup="true" CodeBehind="signUp.aspx.cs" Inherits="mpWebsite.signUp" %>
<asp:Content ID="Content1" ContentPlaceHolderID="head" runat="server">


<script src="Scripts/JsFunctions.js"></script>


</asp:Content>
<asp:Content ID="Content2" ContentPlaceHolderID="ContentPlaceHolder1" runat="server">
    <center>
        <h1>טופס רישום</h1>
        <form method="post" runat="server" onsubmit="return chkForm();" >
            <table>
                <tr>

                    <td>שם משתמש</td>
                    <td><input type="text" name="uName" id="uName" /></td>
                    <td>
                        <input type="text" id="mUName" name="mUName" size="30" style="display:none; background-color: silver; font-weight:bold;" disabled = "disabled"; />
                    </td>
                </tr>
                <tr>
                    <td>שם פרטי</td>
                    <td><input type="text" name="fName" id="fName" /></td>
                    <td>
                        <input type="text" id="mFName" size="30" style="display:none; background-color: silver; font-weight:bold;" disabled = "disabled"; />
                    </td>
                </tr>
            
                <tr>
                    <td>שם משפחה</td>
                    <td><input type="text" name="lName" id="lName" /></td>
                    <td>
                        <input type="text" id="mLName" size="30" style="display:none; background-color: silver; font-weight:bold;" disabled = "disabled"; />
                    </td>
                </tr>
            
                <tr>
                    <td>מייל</td>
                    <td><input type="email" name="email" id="email" /></td>
                    <td>
                        <input type="text" id="mEmail" size="30" style="display:none; background-color: silver; font-weight:bold;" disabled = "disabled"; />
                    </td>
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
