    <%@ Page Title="" Language="C#" MasterPageFile="~/MasterPage.Master" AutoEventWireup="true" CodeBehind="gallery.aspx.cs" Inherits="Final.gallery" %>
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
        <td><img class="imgCell" src="Pics/p1.jpg" onMouseover="picShow('Pics/p1.jpg')" /></td>
        <td><img class="imgCell" src="Pics/p2.jpg" onMouseover="picShow('Pics/p2.jpg')" /></td>
        <td><img class="imgCell" src="Pics/p3.jpg" onMouseover="picShow('Pics/p3.jpg')" /></td>
        <td><img class="imgCell" src="Pics/p4.jpg" onMouseover="picShow('Pics/p4.jpg')" /></td>
    </tr>
    <tr>
      <td><img class="imgCell" src="Pics/p5.jpg" onMouseover="picShow('Pics/p5.jpg')" /></td>
      <td rowspan="2" colspan="2">
        <img class="bigPicImg" id="bigPic" src="pics/p11.jpg" />
      </td>
      <td><img class="imgCell" src="Pics/p6.jpg" onMouseover="picShow('Pics/p6.jpg')" /></td>
    </tr>
    <tr>
      <td><img class="imgCell" src="Pics/p7.jpg" onMouseover="picShow('Pics/p7.jpg')" /></td>
      <td><img class="imgCell" src="Pics/p8.jpg" onMouseover="picShow('Pics/p8.jpg')" /></td>
    </tr>
    <tr>
        <td><img class="imgCell" src="Pics/p9.jpg" onMouseover="picShow('Pics/p9.jpg')" /></td>
        <td><img class="imgCell" src="Pics/p10.jpg" onMouseover="picShow('Pics/p10.jpg')" /></td>
        <td><img class="imgCell" src="Pics/p11.jpg" onMouseover="picShow('Pics/p11.jpg')" /></td>
        <td><img class="imgCell" src="Pics/p12.jpg" onMouseover="picShow('Pics/p12.jpg')" /></td>
  </tr>
</table>
</asp:Content>
