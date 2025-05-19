<%@ Page Title="" Language="C#" MasterPageFile="~/MasterPage.Master" AutoEventWireup="true" CodeBehind="updateUser.aspx.cs" Inherits="Final.updateUser" %>
<asp:Content ID="Content1" ContentPlaceHolderID="head" runat="server">
    <style>
        h1 { text-align: center; }
        h2 { text-align: center; direction: ltr; }
        h3 { text-align: center; direction: ltr; }
        td { width: 150px; }
        th { color: red; font-family: 'Guttman Yad-Brush'; }
        table { margin: 0px auto; }
        .cdHob { width: 100px; }
    </style>
    <script src="Scripts/JsFunctions.js"></script>

</asp:Content>
<asp:Content ID="Content2" ContentPlaceHolderID="ContentPlaceHolder1" runat="server">

<h1>עדכון פרטים אישיים</h1>
<form method="post" runat="server" onsubmit="return chkForm();">
  <table>
   <tr>
    <td>שם משתמש</td>
      <td>
        <input type="text" name="uName" id="uName" disabled="disabled" value="<%= uName %>" />
      </td>
      <td>
        <input type="text" id="mUName" size="30"
               style="display: none; background-color: var(--light-bg); font-weight:bold;"
               disabled="disabled" />
      </td>
    </tr>
    <tr>
      <td>שם פרטי</td>
      <td>
        <input type="text" id="fName" name="fName" value="<%= fName %>" />
      </td>
      <td>
        <input type="text" id="mFName" size="30"
               style="display: none; background-color: var(--light-bg); font-weight:bold;"
               disabled = "disabled" />
      </td>
    </tr>
    <tr>
      <td>שם משפחה</td>
      <td>
        <input type="text" id="lName" name="lName" value="<%= lName %>" />
      </td>
      <td>
        <input type="text" id="mLName" size="30"
               style="display: none; background-color:var(--light-bg); font-weight:bold;"
               disabled = "disabled" />
      </td>
    </tr>
      <tr>
      <td>כתובת דוא"ל</td>
      <td>
        <input type="email" id="email" name="email" value="<%= email %>" maxlength="30" />
      </td>
      <td>
        <input type="text" id="mEmail" size="30"
               style="display: none; background-color:var(--light-bg); font-weight:bold;"
               disabled = "disabled" />
      </td>
    </tr>
    <tr>
      <td>מגדר</td>
      <td>
        <% if (gender == "male") { %>
          <input type="radio" name="gender" value="male" checked /> זכר
          <input type="radio" name="gender" value="female" /> נקבה
        <% } else { %>
          <input type="radio" name="gender" value="male" /> זכר
          <input type="radio" name="gender" value="female" checked /> נקבה
        <% } %>
      </td>
      <td></td>
    </tr>

    <tr>
      <td>שנת לידה:</td>
      <td>
        <select name="yearBorn" id="yearBorn">
          <%= yrBorn %>
        </select>
      </td>
      <td></td>
    </tr>

    <tr>
      <td>יישוב מגורים:</td> 
      <td>
        <select name="city" id="city">
          <% if (city == "חיפה") { %>
            <option value="חיפה" selected>חיפה</option>
          <% } else { %>
            <option value="חיפה">חיפה</option>
          <% } %>
          <% if (city == "תל-אביב") { %>
            <option value="תל-אביב" selected>תל-אביב</option>
          <% } else { %>
            <option value="תל-אביב">תל-אביב</option>
          <% } %>
          <% if (city == "ירושלים") { %>
            <option value="ירושלים" selected>ירושלים</option>
          <% } else { %>
            <option value="ירושלים">ירושלים</option>
          <% } %>
          <% if (city == "מודיעין") { %>
            <option value="מודיעין" selected>מודיעין</option>
          <% } else { %>
            <option value="מודיעין">מודיעין</option>
          <% } %>
          <% if (city == "באר-שבע") { %>
            <option value="באר-שבע" selected>באר-שבע</option>
          <% } else { %>
            <option value="באר-שבע">באר-שבע</option>
          <% } %>
          <% if (city == "מטולה") { %>
            <option value="מטולה" selected>מטולה</option>
          <% } else { %>
            <option value="מטולה">מטולה</option>
          <% } %>
          <% if (city == "צפון") { %>
            <option value="צפון" selected>צפון</option>
          <% } else { %>
            <option value="צפון">צפון</option>
          <% } %>
          <% if (city == "מרכז") { %>
            <option value="מרכז" selected>מרכז</option>
          <% } else { %>
            <option value="מרכז">מרכז</option>
          <% } %>
          <% if (city == "דרום") { %>
            <option value="דרום" selected>דרום</option>
          <% } else { %>
            <option value="דרום">דרום</option>
          <% } %>
        </select>
      </td>
      <td></td>
    </tr>
      <tr>
      <td>טלפון:</td>
      <td>
        <input type="text" name="phone" id="phoneNum" size="7" value="<%= phone %>" /> -
        <select name="prefix" id="prefix">
          <% if (prefix == "02") { %>
            <option value="02" selected>02</option>
          <% } else { %>
            <option value="02">02</option>
          <% } %>
          <% if (prefix == "03") { %>
            <option value="03" selected>03</option>
          <% } else { %>
            <option value="03">03</option>
          <% } %>
          <% if (prefix == "04") { %>
            <option value="04" selected>04</option>
          <% } else { %>
            <option value="04">04</option>
          <% } %>
          <% if (prefix == "08") { %>
            <option value="08" selected>08</option>
          <% } else { %>
            <option value="08">08</option>
          <% } %>
          <% if (prefix == "09") { %>
            <option value="09" selected>09</option>
          <% } else { %>
            <option value="09">09</option>
          <% } %>
          <% if (prefix == "050") { %>
            <option value="050" selected>050</option>
          <% } else { %>
            <option value="050">050</option>
          <% } %>
          <% if (prefix == "052") { %>
            <option value="052" selected>052</option>
          <% } else { %>
            <option value="052">052</option>
          <% } %>
          <% if (prefix == "053") { %>
            <option value="053" selected>053</option>
          <% } else { %>
            <option value="053">053</option>
          <% } %>
          <% if (prefix == "054") { %>
            <option value="054" selected>054</option>
          <% } else { %>
            <option value="054">054</option>
          <% } %>
          <% if (prefix == "055") { %>
            <option value="055" selected>055</option>
          <% } else { %>
            <option value="055">055</option>
          <% } %>
          <% if (prefix == "057") { %>
            <option value="057" selected>057</option>
          <% } else { %>
            <option value="057">057</option>
          <% } %>
          <% if (prefix == "058") { %>
            <option value="058" selected>058</option>
          <% } else { %>
            <option value="058">058</option>
          <% } %>
          <% if (prefix == "077") { %>
            <option value="077" selected>077</option>
          <% } else { %>
            <option value="077">077</option>
          <% } %>
       </select>
      </td>
      <td>
        <input type="text" name="mPhone" id="mPhone" size="30" style="display:none; background-color:var(--light-bg); font-weight:bold;" disabled="disabled" />
      </td>
    </tr>
      <tr>
      <td>תחביבים</td>
      <td>
        <table style="width: 550px;">
          <tr>
            <td class="cdHob">
              <% if (hob1 == "T") { %>
                <input type="checkbox" name="Hobies" value="1" checked="checked" />
              <% } else { %>
                <input type="checkbox" name="Hobies" value="1" />
              <% } %>
              מחשבים
            </td>
            <td class="cdHob">
              <% if (hob2 == "T") { %>
                <input type="checkbox" name="Hobies" value="2" checked="checked" />
              <% } else { %>
                <input type="checkbox" name="Hobies" value="2" />
              <% } %>
              מוזיקה
            </td>
            <td class="cdHob">
              <% if (hob3 == "T") { %>
                <input type="checkbox" name="Hobies" value="3" checked="checked" />
              <% } else { %>
                <input type="checkbox" name="Hobies" value="3" />
              <% } %>
              סרטים
            </td>
            <td class="cdHob">
              <% if (hob4 == "T") { %>
                <input type="checkbox" name="Hobies" value="4" checked="checked" />
              <% } else { %>
                <input type="checkbox" name="Hobies" value="4" />
              <% } %>
              טלווזיה
            </td>
            <td class="cdHob">
              <% if (hob5 == "T") { %>
                <input type="checkbox" name="Hobies" value="5" checked="checked" />
              <% } else { %>
                <input type="checkbox" name="Hobies" value="5" />
              <% } %>
              סוסים
            </td>
            <td>
              <input type="text" name="mHobies" id="mHobies" style="display:none; background-color:var(--light-bg); font-weight:bold;" disabled="disabled" />
            </td>
          </tr>
        </table>
      </td>
        <td></td>
    </tr>
      <tr>
      <td>סיסמא:</td>
      <td>
        <input type="password" name="pw" id="pw" size="10" value="<%= pw %>"
               maxlength="10" />
        <span style="color: red;">*תווים 10 עד 6</span>
      </td>
      <td>
        <input type="text" name="mPw" id="mPw" size="30" style="display:none;
               background-color:var(--light-bg); font-weight:bold;" disabled="disabled" />
      </td>
    </tr>
    <tr>
      <td>אימות סיסמא:</td>
      <td>
        <input type="password" name="conPw" id="conPw" size="10" value="<%= pw %>"
               maxlength="10" />
      </td>
      <td>
        <input type="text" name="mCpw" id="mCpw" size="30" style="display:none;
               background-color:var(--light-bg); font-weight:bold;" disabled="disabled" />
      </td>
    </tr>
    <tr>
      <td colspan="2" style="text-align: center;">
        <input type="submit" name="submit" value="עדכן" />
      </td>
    </tr>
  </table>
</form>
    <center>
        <h2><%=msg %></h2>
        <h3 style="direction:ltr"><%=sqlSelect %></h3>
        <h3 style="direction:ltr"><%=sqlUpdate %></h3>
    </center>

</asp:Content>
