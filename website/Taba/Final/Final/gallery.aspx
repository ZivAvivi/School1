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
        <td><img class="imgCell" src="Pics/pic1.jpg" onMouseover="picShow('Pics/pic1.jpg')" /></td>
        <td><img class="imgCell" src="Pics/pic2.jpg" onMouseover="picShow('Pics/pic2.jpg')" /></td>
        <td><img class="imgCell" src="Pics/pic3.jpg" onMouseover="picShow('Pics/pic3.jpg')" /></td>
        <td><img class="imgCell" src="Pics/pic4.jpg" onMouseover="picShow('Pics/pic4.jpg')" /></td>
    </tr>
    <tr>
      <td><img class="imgCell" src="Pics/pic5.jpg" onMouseover="picShow('Pics/pic5.jpg')" /></td>
      <td rowspan="2" colspan="2">
        <img class="bigPicImg" id="bigPic" src="pics/pic11.jpg" />
      </td>
      <td><img class="imgCell" src="Pics/pic6.jpg" onMouseover="picShow('Pics/pic6.jpg')" /></td>
    </tr>
    <tr>
      <td><img class="imgCell" src="Pics/pic7.jpg" onMouseover="picShow('Pics/pic7.jpg')" /></td>
      <td><img class="imgCell" src="Pics/pic8.jpg" onMouseover="picShow('Pics/pic8.jpg')" /></td>
    </tr>
    <tr>
        <td><img class="imgCell" src="Pics/pic9.jpg" onMouseover="picShow('Pics/pic9.jpg')" /></td>
        <td><img class="imgCell" src="Pics/pic10.jpg" onMouseover="picShow('Pics/pic10.jpg')" /></td>
        <td><img class="imgCell" src="Pics/pic11.jpg" onMouseover="picShow('Pics/pic11.jpg')" /></td>
        <td><img class="imgCell" src="Pics/pic12.jpg" onMouseover="picShow('Pics/pic12.jpg')" /></td>
  </tr>
</table>
</asp:Content>
