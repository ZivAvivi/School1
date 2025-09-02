<%@ Page Title="" Language="C#" MasterPageFile="~/Site1.Master" AutoEventWireup="true" CodeBehind="galeary.aspx.cs" Inherits="mpWebsite.galeary" %>
<asp:Content ID="Content1" ContentPlaceHolderID="head" runat="server">

<style type="text/css">
    .h1Gal {
        color: mediumblue;
        text-align: center;
        font-family: 'Guttman Yad-Brush';
        margin-top: 5px;
    }

    .imgCell { width: 120px; height: 80px; border: 1px solid gray; }
    .bigPicImg { width: 250px; height: 170px; border: 1px solid gray; }
</style>

    <script language="javascript">
        function picShow(pic) {
            bigPic.src = pic;

        }
    </script>

</asp:Content>
<asp:Content ID="Content2" ContentPlaceHolderID="ContentPlaceHolder1" runat="server">
    <h1 class="h1Gal">גלריית תמונות</h1>

<table style="margin: 0px auto;">
    <tr>
        <td><img class="imgCell" src="Pics/p11.jpg" onMouseover="picShow('Pics/p11.jpg')" /></td>
        <td><img class="imgCell" src="Pics/p12.jpg" onMouseover="picShow('Pics/p12.jpg')" /></td>
        <td><img class="imgCell" src="Pics/p13.jpg" onMouseover="picShow('Pics/p13.jpg')" /></td>
        <td><img class="imgCell" src="Pics/p14.jpg" onMouseover="picShow('Pics/p14.jpg')" /></td>
    </tr>
    <tr>
      <td><img class="imgCell" src="Pics/p21.jpg" onMouseover="picShow('Pics/p21.jpg')" /></td>
      <td rowspan="2" colspan="2">
        <img class="bigPicImg" id="bigPic" src="pics/p11.jpg" />
      </td>
      <td><img class="imgCell" src="Pics/p24.jpg" onMouseover="picShow('Pics/p24.jpg')" /></td>
    </tr>
    <tr>
      <td><img class="imgCell" src="Pics/p31.jpg" onMouseover="picShow('Pics/p31.jpg')" /></td>
      <td><img class="imgCell" src="Pics/p34.jpg" onMouseover="picShow('Pics/p34.jpg')" /></td>
    </tr>
    <tr>
        <td><img class="imgCell" src="Pics/p41.jpg" onMouseover="picShow('Pics/p41.jpg')" /></td>
        <td><img class="imgCell" src="Pics/p42.jpg" onMouseover="picShow('Pics/p42.jpg')" /></td>
        <td><img class="imgCell" src="Pics/p43.jpg" onMouseover="picShow('Pics/p43.jpg')" /></td>
        <td><img class="imgCell" src="Pics/p44.jpg" onMouseover="picShow('Pics/p44.jpg')" /></td>
  </tr>
</table>

</asp:Content>
